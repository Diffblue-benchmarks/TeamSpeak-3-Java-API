package com.github.theholywaffle.teamspeak3.commands.parameter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class ArrayParameterDiffblueTest {
  @Test
  public void constructorTest2() {
    // Arrange, Act and Assert
    assertEquals("", (new ArrayParameter(10, 1)).toString());
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("", (new ArrayParameter(10)).toString());
  }

  @Test
  public void addTest() {
    // Arrange
    ArrayParameter arrayParameter = new ArrayParameter(10);

    // Act and Assert
    assertSame(arrayParameter, arrayParameter.add(new ArrayParameter(10)));
  }
}

