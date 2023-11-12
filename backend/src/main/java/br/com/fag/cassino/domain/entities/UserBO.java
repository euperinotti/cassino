package br.com.fag.cassino.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SecondaryTable;
import jakarta.persistence.SecondaryTables;
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
@Table(name = "user")
@SecondaryTables({
    @SecondaryTable(name = "conta")
})
public class UserBO {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @NotBlank
  private Long Id;

  @NotBlank
  @Column(length = 255)
  private String nome;

  @NotBlank
  @Column(table = "conta")
  private ContaBO conta;
}
