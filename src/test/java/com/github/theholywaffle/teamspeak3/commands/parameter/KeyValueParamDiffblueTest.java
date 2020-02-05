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
    // Arrange
    KeyValueParam keyValueParam = new KeyValueParam("foo", true);

    // Act
    KeyValueParam actualKeyValueParam = new KeyValueParam("foo", false);

    // Assert
    assertEquals("foo=1", keyValueParam.toString());
    assertEquals("foo=0", actualKeyValueParam.toString());
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

