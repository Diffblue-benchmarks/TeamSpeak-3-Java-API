package com.github.theholywaffle.teamspeak3.commands;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class CommandDiffblueTest {
  @Test
  public void getNameTest() {
    // Arrange, Act and Assert
    assertEquals("name", (new Command("name", null)).getName());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    Command actualCommand = new Command("name", null);

    // Assert
    String actualName = actualCommand.getName();
    assertEquals("name", actualName);
    assertFalse(actualCommand.getFuture().isDone());
  }
}

