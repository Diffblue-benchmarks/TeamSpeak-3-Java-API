package com.github.theholywaffle.teamspeak3.commands.parameter;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ValueParamDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("value", (new ValueParam("value")).toString());
  }
}

