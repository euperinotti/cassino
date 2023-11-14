package br.com.fag.cassino.domain.usecases;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegistrarJogo {
  @NotEmpty
  private Long idUsuario;

  @NotEmpty
  private Long idCarta;
}
