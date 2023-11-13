package br.com.fag.cassino.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
  private Long id;
  private String nome;
  private ContaDTO conta;

  public UserDTO(String nome, ContaDTO conta) {
    this.nome = nome;
    this.conta = conta;
  }
}
