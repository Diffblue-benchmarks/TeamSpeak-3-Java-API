package com.github.theholywaffle.teamspeak3.api;

import com.github.theholywaffle.teamspeak3.api.CommandFuture;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CommandFuture_isCancelledTest_12_Test {
  @Test
  public void isCancelledTest() throws Exception {
    // Arrange
    CommandFuture<Object> commandFuture = new CommandFuture<Object>();

    // Act
    boolean actual = commandFuture.isCancelled();

    // Assert
    Assert.assertFalse(actual);
    boolean isDoneResult = commandFuture.isDone();
    boolean isSuccessfulResult = commandFuture.isSuccessful();
    boolean hasFailedResult = commandFuture.hasFailed();
    String toStringResult = commandFuture.toString();
    Assert.assertFalse(isDoneResult);
    Assert.assertFalse(commandFuture.isCancelled());
    Assert.assertNotNull(toStringResult);
    Assert.assertFalse(hasFailedResult);
    Assert.assertFalse(isSuccessfulResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
