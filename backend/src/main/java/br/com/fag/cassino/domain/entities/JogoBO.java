package br.com.fag.cassino.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
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
@Table(name = "jogo")
@SecondaryTables({
    @SecondaryTable(name = "usuario"),
    @SecondaryTable(name = "carta")
})
public class JogoBO {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long Id;

  @NotBlank
  @ManyToOne
  @PrimaryKeyJoinColumn()
  private UserBO usuario;

  @NotBlank
  @ManyToOne
  @PrimaryKeyJoinColumn()
  private CartaBO carta;
}
