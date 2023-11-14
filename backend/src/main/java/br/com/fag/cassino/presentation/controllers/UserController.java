package br.com.fag.cassino.presentation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fag.cassino.domain.dto.UserDTO;
import br.com.fag.cassino.domain.entities.UserBO;
import br.com.fag.cassino.domain.mappers.UserMapper;
import br.com.fag.cassino.domain.repository.IUserRepository;

@RestController
@RequestMapping("user")
public class UserController {

  @Autowired
  IUserRepository repository;

  @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Object> cadastrar(@RequestBody UserDTO entity) {
    UserBO user = repository.save(UserMapper.toBO(entity));
    return ResponseEntity.ok(user);
  }

  @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Object> buscarTodos() {
    List<UserBO> users = repository.findAll();
    return ResponseEntity.ok(users);
  }

  @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, path = "/{id}")
  public ResponseEntity<Object> buscarPorId(@PathVariable(value = "id") Long id) {
    UserDTO user = UserMapper.toDTO(repository.findById(id));
    return ResponseEntity.ok(user);
  }

  @DeleteMapping(produces = MediaType.APPLICATION_JSON_VALUE, path = "/{id}")
  public ResponseEntity<Object> deletar(@PathVariable(value = "id") Long id) {
    repository.deleteById(id);
    return ResponseEntity.ok("Usuário deletado");
  }
}
