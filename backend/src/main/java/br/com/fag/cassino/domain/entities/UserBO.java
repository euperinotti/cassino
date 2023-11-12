package br.com.fag.cassino.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "user")
public class UserBO {

  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long Id;

  private String nome;

  private ContaBO conta;
}
