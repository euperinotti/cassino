package br.com.fag.cassino.domain.dto;

public class UserDTO {
  private String nome;
  private ContaDTO conta;
  private Integer quantidadeDeFichas;

  public UserDTO() {
  }

  public UserDTO(String nome, ContaDTO conta, Integer quantidadeDeFichas) {
    this.nome = nome;
    this.conta = conta;
    this.quantidadeDeFichas = quantidadeDeFichas;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public ContaDTO getConta() {
    return this.conta;
  }

  public void setConta(ContaDTO conta) {
    this.conta = conta;
  }

  public Integer getQuantidadeDeFichas() {
    return this.quantidadeDeFichas;
  }

  public void setQuantidadeDeFichas(Integer quantidadeDeFichas) {
    this.quantidadeDeFichas = quantidadeDeFichas;
  }

}

