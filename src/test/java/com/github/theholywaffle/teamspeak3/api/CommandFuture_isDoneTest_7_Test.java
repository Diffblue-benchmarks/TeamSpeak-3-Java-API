package com.github.theholywaffle.teamspeak3.api;

import com.github.theholywaffle.teamspeak3.api.CommandFuture;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CommandFuture_isDoneTest_7_Test {
  @Test
  public void isDoneTest() throws Exception {
    // Arrange
    CommandFuture<Object> commandFuture = new CommandFuture<Object>();

    // Act
    boolean actual = commandFuture.isDone();

    // Assert
    Assert.assertFalse(actual);
    boolean isSuccessfulResult = commandFuture.isSuccessful();
    boolean hasFailedResult = commandFuture.hasFailed();
    String toStringResult = commandFuture.toString();
    Assert.assertFalse(isSuccessfulResult);
    Assert.assertFalse(commandFuture.isCancelled());
    Assert.assertNotNull(toStringResult);
    Assert.assertFalse(hasFailedResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
