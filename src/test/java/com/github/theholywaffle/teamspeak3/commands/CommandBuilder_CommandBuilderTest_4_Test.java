package com.github.theholywaffle.teamspeak3.commands;

import com.github.theholywaffle.teamspeak3.commands.CommandBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CommandBuilder_CommandBuilderTest_4_Test {
  @Test
  public void CommandBuilderTest() throws Exception {
    // Arrange
    String commandName = "aaaaa";
    int expectedParamCount = 1;

    // Act
    CommandBuilder commandBuilder = new CommandBuilder(commandName, expectedParamCount);

    // Assert
    Assert.assertNotNull(commandBuilder.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
