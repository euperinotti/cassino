package br.com.fag.cassino.presentation.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class CassinoController {
  
  @GetMapping(value = "hello")
  public String getMethodName() {
      return "world";
  }
  
}
