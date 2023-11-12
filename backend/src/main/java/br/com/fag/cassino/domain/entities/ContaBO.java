package br.com.fag.cassino.domain.entities;

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
  private Long Id;
  private Double valorGasto;
  private Double valorAdquirido;
  private Double retornoFinal;
  private Integer quantidadeDeFichas;

}
