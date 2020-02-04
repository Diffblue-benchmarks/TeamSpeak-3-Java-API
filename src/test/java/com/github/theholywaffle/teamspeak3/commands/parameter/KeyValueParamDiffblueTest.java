package com.github.theholywaffle.teamspeak3.commands.parameter;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class KeyValueParamDiffblueTest {
  @Test
  public void constructorTest4() {
    // Arrange, Act and Assert
    assertEquals("foo=42", (new KeyValueParam("foo", 42)).toString());
  }

  @Test
  public void constructorTest3() {
    // Arrange, Act and Assert
    assertEquals("foo=1", (new KeyValueParam("foo", true)).toString());
  }

  @Test
  public void constructorTest2() {
    // Arrange, Act and Assert
    assertEquals("foo=42", (new KeyValueParam("foo", 42L)).toString());
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("foo=value", (new KeyValueParam("foo", "value")).toString());
  }
}

