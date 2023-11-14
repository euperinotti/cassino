package br.com.fag.cassino.presentation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fag.cassino.domain.dto.CartaDTO;
import br.com.fag.cassino.domain.dto.UserDTO;
import br.com.fag.cassino.domain.entities.JogoBO;
import br.com.fag.cassino.domain.mappers.CartaMapper;
import br.com.fag.cassino.domain.mappers.UserMapper;
import br.com.fag.cassino.domain.repository.ICartaRepository;
import br.com.fag.cassino.domain.repository.IJogoRepository;
import br.com.fag.cassino.domain.repository.IUserRepository;
import br.com.fag.cassino.domain.usecases.RegistrarJogo;

@RestController
@RequestMapping("jogo")
public class JogoController {
  @Autowired
  IJogoRepository repository;

  @Autowired
  ICartaRepository cartaRepository;

  @Autowired
  IUserRepository userRepository;

  @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Object> registrar(@RequestBody RegistrarJogo entity) {
    UserDTO usuario = UserMapper.toDTO(userRepository.findById(entity.getIdUsuario()).get());
    CartaDTO carta = CartaMapper.toDTO(cartaRepository.findById(entity.getIdCarta()).get());
    
    if (carta.getTipo()) {
      usuario.getConta().ganhouDinheiro(carta.getValor());
      usuario.getConta().subtrairFicha();
    } else {
      usuario.getConta().perdeuDinheiro(carta.getValor());
      usuario.getConta().subtrairFicha();
    }

    userRepository.save(UserMapper.toBO(usuario));

    return ResponseEntity.ok(repository.save(new JogoBO(null, UserMapper.toBO(usuario), CartaMapper.toBO(carta))));
  }

  @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Object> buscarTodos() {
    List<JogoBO> users = repository.findAll();
    return ResponseEntity.ok(users);
  }

}
