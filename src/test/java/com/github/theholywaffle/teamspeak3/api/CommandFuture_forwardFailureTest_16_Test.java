package com.github.theholywaffle.teamspeak3.api;

import com.github.theholywaffle.teamspeak3.api.CommandFuture;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CommandFuture_forwardFailureTest_16_Test {
  @Test
  public void forwardFailureTest() throws Exception {
    // Arrange
    CommandFuture<Object> commandFuture = new CommandFuture<Object>();
    CommandFuture<Object> commandFuture1 = new CommandFuture<Object>();

    // Act
    CommandFuture<Object> actual = commandFuture.forwardFailure(commandFuture1);

    // Assert
    Assert.assertSame(commandFuture, actual);
    boolean isDoneResult = actual.isDone();
    boolean isSuccessfulResult = actual.isSuccessful();
    boolean hasFailedResult = actual.hasFailed();
    String toStringResult = actual.toString();
    Assert.assertFalse(isDoneResult);
    Assert.assertFalse(actual.isCancelled());
    Assert.assertNotNull(toStringResult);
    Assert.assertFalse(hasFailedResult);
    Assert.assertFalse(isSuccessfulResult);
    boolean isDoneResult1 = commandFuture1.isDone();
    boolean isSuccessfulResult1 = commandFuture1.isSuccessful();
    boolean hasFailedResult1 = commandFuture1.hasFailed();
    String toStringResult1 = commandFuture1.toString();
    Assert.assertFalse(isDoneResult1);
    Assert.assertFalse(commandFuture1.isCancelled());
    Assert.assertNotNull(toStringResult1);
    Assert.assertFalse(hasFailedResult1);
    Assert.assertFalse(isSuccessfulResult1);
    Assert.assertSame(actual, commandFuture);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
