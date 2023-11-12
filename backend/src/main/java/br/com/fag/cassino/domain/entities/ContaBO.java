package br.com.fag.cassino.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
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
  @NotBlank
  @Column(name = "id")
  private Long Id;
  
  @NotBlank
  private Double saldoDePerda;
  
  @NotBlank
  private Double saldoDeGanho;

  @NotBlank
  private Integer quantidadeDeFichas;

}
