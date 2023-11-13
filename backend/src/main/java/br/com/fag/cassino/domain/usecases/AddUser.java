package br.com.fag.cassino.domain.usecases;

import br.com.fag.cassino.domain.dto.UserDTO;
import br.com.fag.cassino.domain.entities.UserBO;
import br.com.fag.cassino.domain.mappers.ContaMapper;

public class AddUser {

  public UserBO execute(UserDTO dto) {
    return new UserBO(dto.getNome(), ContaMapper.toBO(dto.getConta()));
  }
  
}
