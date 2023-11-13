package br.com.fag.cassino.domain.mappers;

import br.com.fag.cassino.domain.dto.CartaDTO;
import br.com.fag.cassino.domain.entities.CartaBO;

public class CartaMapper {
  public static CartaBO toBO(CartaDTO dto) {
    return new CartaBO(dto.getId(), dto.getTipo(), dto.getValor());
  }

  public static CartaDTO toDTO(CartaBO bo) {
    return new CartaDTO(bo.getId(), bo.getTipo(), bo.getValor());
  }
}
