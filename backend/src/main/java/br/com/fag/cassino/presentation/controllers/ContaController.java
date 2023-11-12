package br.com.fag.cassino.presentation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fag.cassino.domain.dto.ContaDTO;
import br.com.fag.cassino.domain.mappers.ContaMapper;
import br.com.fag.cassino.domain.repository.IContaRepository;

@RestController
@RequestMapping("conta")
public class ContaController {

  @Autowired
  IContaRepository repository;

  @PostMapping
  public void cadastrar(@RequestBody ContaDTO entity) {
    repository.save(ContaMapper.toBO(entity));
    System.out.println(entity);
  }

}
