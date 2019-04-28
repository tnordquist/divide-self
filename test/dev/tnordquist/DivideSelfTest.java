package dev.tnordquist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class DivideSelfTest {

  private static Object[][] dividesSelf() {
    return new Object[][]{

        {true, 128},
        {false, 32}
    };
  }

  @ParameterizedTest
  @MethodSource
  void dividesSelf(boolean expected, int input) {

    boolean actual = DivideSelf.dividesSelf(input);
    assertEquals(expected,actual);
  }
}