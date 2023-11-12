package br.com.fag.cassino.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fag.cassino.domain.entities.ContaBO;

public interface IContaRepository extends JpaRepository<ContaBO, Long>{
  
}
