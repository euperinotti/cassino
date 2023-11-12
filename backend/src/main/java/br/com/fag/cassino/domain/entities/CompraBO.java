package br.com.fag.cassino.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "compra")
public class CompraBO {

  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  @NotBlank
  private Long Id;
  private Long idConta;
  private Long idFicha;
  private Integer quantidadeDeFichas;
}
