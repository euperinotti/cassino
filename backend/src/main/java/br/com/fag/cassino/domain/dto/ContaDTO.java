package br.com.fag.cassino.domain.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ContaDTO {
  
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private Double saldoDePerda;
  private Double saldoDeGanho;
  private Integer quantidadeDeFichas;

  public ContaDTO(Double saldoDePerda, Double saldoDeGanho, Integer quantidadeDeFichas) {
    this.saldoDePerda = saldoDePerda;
    this.saldoDeGanho = saldoDeGanho;
    this.quantidadeDeFichas = quantidadeDeFichas;
  }

  public void adicionarFicha(Integer quantidade) {
    this.quantidadeDeFichas += quantidade;
    this.saldoDePerda += quantidade * 5d;
  }

  public void subtrairFicha() {
    this.quantidadeDeFichas--;
  }

  public void ganhouDinheiro(Double quantidade) {
    this.saldoDeGanho += quantidade;
  }

  public void perdeuDinheiro(Double quantidade) {
    this.saldoDePerda += quantidade;
  }

}
