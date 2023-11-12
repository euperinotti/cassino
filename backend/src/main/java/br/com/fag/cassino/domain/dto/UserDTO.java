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
public class UserDTO {
  @NotBlank
  private Long Id;

  @NotBlank
  private String nome;

  @NotBlank
  private ContaDTO conta;
}
