package br.com.fag.cassino.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
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

  @ManyToOne
  @PrimaryKeyJoinColumn()
  private ContaBO idConta;

  @ManyToOne
  @PrimaryKeyJoinColumn()
  private FichaBO idFicha;

  @NotNull
  @NotEmpty
  private Integer quantidadeDeFichas;
}
