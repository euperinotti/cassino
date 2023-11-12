package br.com.fag.cassino.domain.dto;

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
public class JogoDTO {
  private Long Id;
  private UserDTO usuario;
  private CartaDTO carta;
}
