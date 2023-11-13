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

}
