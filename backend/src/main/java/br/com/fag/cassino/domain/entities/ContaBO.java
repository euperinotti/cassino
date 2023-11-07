package br.com.fag.cassino.domain.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContaBO {
  private Float valorGasto;
  private Float valorAdquirido;
  private Float retornoFinal;
  private Integer quantidadeDeFichas;

  public ContaBO() {
  }

  public ContaBO(Float valorGasto, Float valorAdquirido, Float retornoFinal, Integer quantidadeDeFichas) {
    this.valorGasto = valorGasto;
    this.valorAdquirido = valorAdquirido;
    this.retornoFinal = retornoFinal;
    this.quantidadeDeFichas = quantidadeDeFichas;
  }

}
