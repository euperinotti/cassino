package br.com.fag.cassino.presentation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fag.cassino.domain.dto.ContaDTO;
import br.com.fag.cassino.domain.dto.FichaDTO;
import br.com.fag.cassino.domain.mappers.ContaMapper;
import br.com.fag.cassino.domain.repository.IContaRepository;
import br.com.fag.cassino.domain.usecases.ComprarFicha;

@RestController
@RequestMapping("ficha")
public class FichaController {
  @Autowired
  IContaRepository repository;

  @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Object> comprar(@RequestBody ComprarFicha entity) {
    ContaDTO conta = ContaMapper.toDTO(repository.getReferenceById(entity.getIdConta()));
    conta.setQuantidadeDeFichas(entity.getQuantidade());
    conta.setSaldoDePerda(entity.getQuantidade() * new FichaDTO().getValor());
    ContaDTO response = ContaMapper.toDTO(repository.save(ContaMapper.toBO(conta)));

    return ResponseEntity.ok(response);
  }
}
