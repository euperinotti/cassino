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

import br.com.fag.cassino.domain.entities.CartaBO;
import br.com.fag.cassino.domain.entities.JogoBO;
import br.com.fag.cassino.domain.entities.UserBO;
import br.com.fag.cassino.domain.repository.IJogoRepository;
import br.com.fag.cassino.domain.usecases.RegistrarJogo;

@RestController
@RequestMapping("jogo")
public class JogoController {
  @Autowired
  IJogoRepository repository;

  @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Object> registrar(@RequestBody RegistrarJogo entity) {
    UserBO usuario = new UserBO();
    CartaBO carta = new CartaBO();
    usuario.setId(entity.getIdUsuario());
    carta.setId(entity.getIdCarta());
    return ResponseEntity.ok(repository.save(new JogoBO(null, usuario, carta)));
  }

  @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Object> buscarTodos() {
    List<JogoBO> users = repository.findAll();
    return ResponseEntity.ok(users);
  }

}
