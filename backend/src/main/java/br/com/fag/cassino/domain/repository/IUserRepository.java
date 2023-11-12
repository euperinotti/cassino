package br.com.fag.cassino.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fag.cassino.domain.entities.UserBO;

public interface IUserRepository extends JpaRepository<UserBO, Long> {
  
}
