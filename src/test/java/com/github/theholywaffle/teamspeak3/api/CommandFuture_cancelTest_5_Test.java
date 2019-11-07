package com.github.theholywaffle.teamspeak3.api;

import com.github.theholywaffle.teamspeak3.api.CommandFuture;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CommandFuture_cancelTest_5_Test {
  @Test
  public void cancelTest() throws Exception {
    // Arrange
    CommandFuture<Object> commandFuture = new CommandFuture<Object>();
    boolean mayInterruptIfRunning = true;

    // Act
    boolean actual = commandFuture.cancel(mayInterruptIfRunning);

    // Assert
    Assert.assertTrue(actual);
    boolean isDoneResult = commandFuture.isDone();
    boolean isSuccessfulResult = commandFuture.isSuccessful();
    boolean hasFailedResult = commandFuture.hasFailed();
    String toStringResult = commandFuture.toString();
    Assert.assertTrue(isDoneResult);
    Assert.assertTrue(commandFuture.isCancelled());
    Assert.assertNotNull(toStringResult);
    Assert.assertFalse(hasFailedResult);
    Assert.assertFalse(isSuccessfulResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
