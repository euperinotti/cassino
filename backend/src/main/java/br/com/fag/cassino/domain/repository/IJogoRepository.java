package br.com.fag.cassino.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fag.cassino.domain.entities.JogoBO;

public interface IJogoRepository extends JpaRepository<JogoBO, Long> {
  
}
