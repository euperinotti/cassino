package br.com.fag.cassino.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.fag.cassino.domain.entities.UserBO;

@Repository
public interface IUserRepository extends JpaRepository<UserBO, Long> {
  @Query(value = "SELECT * FROM usuario WHERE nome = :nome LIMIT 1", nativeQuery = true)
  public UserBO findByNome(@Param("nome") String nome);
}
