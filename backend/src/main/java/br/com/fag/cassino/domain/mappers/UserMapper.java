package br.com.fag.cassino.domain.mappers;

import java.util.Optional;

import br.com.fag.cassino.domain.dto.UserDTO;
import br.com.fag.cassino.domain.entities.UserBO;

public class UserMapper {
  public static UserBO toBO(UserDTO dto) {
    return new UserBO(dto.getId(), dto.getNome(), ContaMapper.toBO(dto.getConta()));
  }

  public static UserDTO toDTO(UserBO bo) {
    return new UserDTO(bo.getId(), bo.getNome(), ContaMapper.toDTO(bo.getConta()));
  }

  public static UserDTO toDTO(Optional<UserBO> bo) {
    return new UserDTO(bo.get().getId(), bo.get().getNome(), ContaMapper.toDTO(bo.get().getConta()));
  }
}
