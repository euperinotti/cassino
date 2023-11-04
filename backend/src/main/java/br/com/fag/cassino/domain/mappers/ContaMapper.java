package br.com.fag.cassino.domain.mappers;

import br.com.fag.cassino.domain.dto.ContaDTO;
import br.com.fag.cassino.domain.entities.ContaBO;

public class ContaMapper {
  public static ContaBO toBO(ContaDTO dto) {
    return new ContaBO(dto.getValorGasto(), dto.getValorAdquirido(), dto.getRetornoFinal());
  }

  public static ContaDTO toDTO(ContaBO bo) {
    return new ContaDTO(bo.getValorGasto(), bo.getValorAdquirido(), bo.getRetornoFinal());
  }
}
