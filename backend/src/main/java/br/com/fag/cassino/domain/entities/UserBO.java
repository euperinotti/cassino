package br.com.fag.cassino.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
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
@Table(name = "usuario")
public class UserBO {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @NotBlank
  private Long Id;

  @NotBlank
  @Column(length = 255)
  private String nome;

  @NotBlank
  @OneToOne
  @PrimaryKeyJoinColumn()
  private ContaBO conta;
}
