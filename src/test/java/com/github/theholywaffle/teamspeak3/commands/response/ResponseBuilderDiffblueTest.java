package com.github.theholywaffle.teamspeak3.commands.response;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ResponseBuilderDiffblueTest {
  @Test
  public void getCommandTest() {
    // Arrange, Act and Assert
    assertNull((new ResponseBuilder(null)).getCommand());
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new ResponseBuilder(null)).getCommand());
  }
}

