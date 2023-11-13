package br.com.fag.cassino.domain.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CompraDTO {

  @NotBlank
  private Long id;
  private Long idConta;
  private Long idFicha;
  private Integer quantidadeDeFichas;
}
