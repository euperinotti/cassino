package br.com.fag.cassino.domain.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
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
  @NotBlank
  private Long Id;
  
  @NotBlank
  private Double saldoDePerda;
  
  @NotBlank
  private Double saldoDeGanho;

  @NotBlank
  private Integer quantidadeDeFichas;

}
