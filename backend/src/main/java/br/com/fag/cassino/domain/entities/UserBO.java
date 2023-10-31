package br.com.fag.cassino.domain.entities;

public class UserBO {
  private String nome;
  private ContaBO conta;
  private Integer quantidadeDeFichas;

  public UserBO() {
  }

  public UserBO(String nome, ContaBO conta, Integer quantidadeDeFichas) {
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

  public ContaBO getConta() {
    return this.conta;
  }

  public void setConta(ContaBO conta) {
    this.conta = conta;
  }

  public Integer getQuantidadeDeFichas() {
    return this.quantidadeDeFichas;
  }

  public void setQuantidadeDeFichas(Integer quantidadeDeFichas) {
    this.quantidadeDeFichas = quantidadeDeFichas;
  }

}
