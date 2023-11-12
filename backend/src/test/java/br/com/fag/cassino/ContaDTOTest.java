package br.com.fag.cassino;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import br.com.fag.cassino.domain.dto.ContaDTO;

public class ContaDTOTest {

  @Test
  void shouldIncrementValueSpent() {
    ContaDTO sut = new ContaDTO();
    sut.setSaldoDePerda(5d);

    assertEquals(5f, sut.getSaldoDePerda());
  }

  @Test
  void shouldThrowAnErrorIfANegativeNumberIsPassed() {
    ContaDTO sut = new ContaDTO();

    assertThrows(ArithmeticException.class, () -> {
      sut.setSaldoDePerda(-5d);
    });
  }
}
