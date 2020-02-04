package com.github.theholywaffle.teamspeak3.commands.parameter;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class KeyValueParamDiffblueTest {
  @Test
  public void constructorTest4() {
    // Arrange, Act and Assert
    assertEquals("=1", (new KeyValueParam("", 1)).toString());
  }

  @Test
  public void constructorTest3() {
    // Arrange, Act and Assert
    assertEquals("=1", (new KeyValueParam("", true)).toString());
  }

  @Test
  public void constructorTest2() {
    // Arrange, Act and Assert
    assertEquals("=1", (new KeyValueParam("", 1L)).toString());
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("=", (new KeyValueParam("", "")).toString());
  }
}

