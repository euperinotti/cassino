package br.com.fag.cassino.services;

import org.springframework.web.bind.annotation.RequestBody;

public class CassinoService {
  public void apostar(@RequestBody String text) {
    System.out.println(text);
  }
}
