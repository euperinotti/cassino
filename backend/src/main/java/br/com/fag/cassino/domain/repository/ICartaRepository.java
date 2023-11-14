package br.com.fag.cassino.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fag.cassino.domain.entities.CartaBO;

public interface ICartaRepository extends JpaRepository<CartaBO, Long>{
  
}
