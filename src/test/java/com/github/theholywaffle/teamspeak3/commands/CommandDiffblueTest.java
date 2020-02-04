package com.github.theholywaffle.teamspeak3.commands;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class CommandDiffblueTest {
  @Test
  public void getNameTest() {
    // Arrange, Act and Assert
    assertEquals("aaaaa", (new Command("aaaaa", null)).getName());
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    Command actualCommand = new Command("aaaaa", null);

    // Assert
    String actualName = actualCommand.getName();
    assertEquals("aaaaa", actualName);
    assertFalse(actualCommand.getFuture().isDone());
  }
}

