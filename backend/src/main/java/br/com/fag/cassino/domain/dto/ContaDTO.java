package br.com.fag.cassino.domain.dto;

import lombok.Setter;
import lombok.ToString;
import lombok.Getter;

@Getter
@Setter
@ToString
public class ContaDTO {
  private Float valorGasto;
  private Float valorAdquirido;
  private Float retornoFinal;
  private Integer quantidadeDeFichas;

  public ContaDTO() {
    this.valorGasto = 0f;
    this.valorAdquirido = 0f;
    this.retornoFinal = 0f;
    this.quantidadeDeFichas = 0;
  }

  public ContaDTO(Float valorGasto, Float valorAdquirido, Float retornoFinal, Integer quantidadeDeFichas) {
    this.valorGasto = valorGasto;
    this.valorAdquirido = valorAdquirido;
    this.retornoFinal = retornoFinal;
    this.quantidadeDeFichas = quantidadeDeFichas;
  }

  public void setValorGasto(Float valorGasto) {
    this.valorGasto += valorGasto;
  }
}

