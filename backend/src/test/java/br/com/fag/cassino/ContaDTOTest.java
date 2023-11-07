package br.com.fag.cassino;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import br.com.fag.cassino.domain.dto.ContaDTO;

public class ContaDTOTest {

  @Test
  void shouldIncrementValueSpent() {
    ContaDTO sut = new ContaDTO();
    sut.setValorGasto(5f);

    assertEquals(5f, sut.getValorGasto());
  }

  @Test
  void shouldThrowAnErrorIfANegativeNumberIsPassed() {
    ContaDTO sut = new ContaDTO();

    assertThrows(ArithmeticException.class, () -> {
      sut.setValorGasto(-5f);
    });
  }
}
