package br.com.fag.cassino.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "conta")
public class ContaBO {
  
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long Id;
  private Double saldoDePerda;
  private Double saldoDeGanho;
  private Integer quantidadeDeFichas;

  public ContaBO(Double saldoDePerda, Double saldoDeGanho, Integer quantidadeDeFichas) {
    this.saldoDePerda = saldoDePerda;
    this.saldoDeGanho = saldoDeGanho;
    this.quantidadeDeFichas = quantidadeDeFichas;
  }

}
