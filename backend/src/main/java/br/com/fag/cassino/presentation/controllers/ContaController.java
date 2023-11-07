package br.com.fag.cassino.presentation.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fag.cassino.domain.dto.ContaDTO;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("conta")
public class ContaController {

  @PostMapping
  public void cadastrar(@RequestBody ContaDTO entity) {
    System.out.println(entity);
  }

}
