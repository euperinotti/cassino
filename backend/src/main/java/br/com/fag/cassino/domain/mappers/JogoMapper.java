package br.com.fag.cassino.domain.mappers;

import br.com.fag.cassino.domain.dto.JogoDTO;
import br.com.fag.cassino.domain.entities.JogoBO;

public class JogoMapper {
  public static JogoBO toBO(JogoDTO dto) {
    return new JogoBO(dto.getId(), UserMapper.toBO(dto.getUsuario()), CartaMapper.toBO(dto.getCarta()));
  }

  public static JogoDTO toDTO(JogoBO bo) {
    return new JogoDTO(bo.getId(), UserMapper.toDTO(bo.getUsuario()), CartaMapper.toDTO(bo.getCarta()));
  }
}
