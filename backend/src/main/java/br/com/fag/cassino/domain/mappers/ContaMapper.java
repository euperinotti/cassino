package br.com.fag.cassino.domain.mappers;

import br.com.fag.cassino.domain.dto.ContaDTO;
import br.com.fag.cassino.domain.entities.ContaBO;

public class ContaMapper {
  public static ContaBO toBO(ContaDTO dto) {
    return new ContaBO(dto.getId(), dto.getSaldoDePerda(), dto.getSaldoDeGanho(),
        dto.getQuantidadeDeFichas());
  }

  public static ContaDTO toDTO(ContaBO bo) {
    return new ContaDTO(bo.getId(), bo.getSaldoDePerda(), bo.getSaldoDeGanho(),
        bo.getQuantidadeDeFichas());
  }
}
