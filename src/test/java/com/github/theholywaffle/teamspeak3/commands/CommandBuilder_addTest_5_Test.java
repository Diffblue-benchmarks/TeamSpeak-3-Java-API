package com.github.theholywaffle.teamspeak3.commands;

import com.github.theholywaffle.teamspeak3.commands.CommandBuilder;
import com.github.theholywaffle.teamspeak3.commands.parameter.ArrayParameter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CommandBuilder_addTest_5_Test {
  @Test
  public void addTest() throws Exception {
    // Arrange
    CommandBuilder commandBuilder = new CommandBuilder("aaaaa");
    ArrayParameter arrayParameter = new ArrayParameter(1);

    // Act
    CommandBuilder actual = commandBuilder.add(arrayParameter);

    // Assert
    Assert.assertSame(commandBuilder, actual);
    Assert.assertNotNull(actual.toString());
    Assert.assertEquals("", arrayParameter.toString());
    Assert.assertSame(actual, commandBuilder);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
