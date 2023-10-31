package br.com.fag.cassino.domain.entities;

public class ContaBO {
  private Float valorGasto;
  private Float valorAdquirido;
  private Float retornoFinal;

  public ContaBO() {
  }

  public ContaBO(Float valorGasto, Float valorAdquirido, Float retornoFinal) {
    this.valorGasto = valorGasto;
    this.valorAdquirido = valorAdquirido;
    this.retornoFinal = retornoFinal;
  }

  public Float getValorGasto() {
    return this.valorGasto;
  }

  public void setValorGasto(Float valorGasto) {
    this.valorGasto = valorGasto;
  }

  public Float getValorAdquirido() {
    return this.valorAdquirido;
  }

  public void setValorAdquirido(Float valorAdquirido) {
    this.valorAdquirido = valorAdquirido;
  }

  public Float getRetornoFinal() {
    return this.retornoFinal;
  }

  public void setRetornoFinal(Float retornoFinal) {
    this.retornoFinal = retornoFinal;
  }

}
