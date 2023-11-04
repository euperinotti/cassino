package br.com.fag.cassino.domain.mappers;

import br.com.fag.cassino.domain.dto.UserDTO;
import br.com.fag.cassino.domain.entities.UserBO;

public class UserMapper {
  public static UserBO toBO(UserDTO dto) {
    return new UserBO(dto.getNome(), ContaMapper.toBO(dto.getConta()), dto.getQuantidadeDeFichas());
  }
}
