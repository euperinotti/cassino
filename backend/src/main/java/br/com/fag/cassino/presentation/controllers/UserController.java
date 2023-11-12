package br.com.fag.cassino.presentation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fag.cassino.domain.dto.UserDTO;
import br.com.fag.cassino.domain.mappers.UserMapper;
import br.com.fag.cassino.domain.repository.IUserRepository;

@RestController
@RequestMapping("user")
public class UserController {

  @Autowired
  IUserRepository repository;

  @PostMapping
  public void cadastrar(@RequestBody UserDTO entity) {
    repository.save(UserMapper.toBO(entity));
    System.out.println(entity);
  }
}
