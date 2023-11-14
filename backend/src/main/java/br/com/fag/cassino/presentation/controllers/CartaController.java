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
import br.com.fag.cassino.domain.entities.CartaBO;
import br.com.fag.cassino.domain.mappers.CartaMapper;
import br.com.fag.cassino.domain.repository.ICartaRepository;

@RestController
@RequestMapping("carta")
public class CartaController {
  @Autowired
  ICartaRepository repository;

  @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Object> cadastrar(@RequestBody CartaDTO entity) {
    return ResponseEntity.ok(repository.save(CartaMapper.toBO(entity)));
  }

  @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Object> buscarTodos() {
    List<CartaBO> cartas = repository.findAll();
    return ResponseEntity.ok(cartas);
  }
  
}
