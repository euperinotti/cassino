package br.com.fag.cassino.domain.dto;

import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
public class ContaDTO {
  private Float valorGasto;
  private Float valorAdquirido;
  private Float retornoFinal;
  private Integer quantidadeDeFichas;

  public ContaDTO() {
  }

  public ContaDTO(Float valorGasto, Float valorAdquirido, Float retornoFinal, Integer quantidadeDeFichas) {
    this.valorGasto = valorGasto;
    this.valorAdquirido = valorAdquirido;
    this.retornoFinal = retornoFinal;
    this.quantidadeDeFichas = quantidadeDeFichas;
  }
}

