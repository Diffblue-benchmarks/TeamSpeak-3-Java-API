package com.github.theholywaffle.teamspeak3.api;

import com.github.theholywaffle.teamspeak3.api.CommandFuture;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CommandFuture_forwardResultTest_2_Test {
  @Test
  public void forwardResultTest() throws Exception {
    // Arrange
    CommandFuture<Object> commandFuture = new CommandFuture<Object>();
    CommandFuture<Object> commandFuture1 = new CommandFuture<Object>();

    // Act
    commandFuture.forwardResult(commandFuture1);

    // Assert
    boolean isDoneResult = commandFuture1.isDone();
    boolean isSuccessfulResult = commandFuture1.isSuccessful();
    boolean hasFailedResult = commandFuture1.hasFailed();
    String toStringResult = commandFuture1.toString();
    Assert.assertFalse(isDoneResult);
    Assert.assertFalse(commandFuture1.isCancelled());
    Assert.assertNotNull(toStringResult);
    Assert.assertFalse(hasFailedResult);
    Assert.assertFalse(isSuccessfulResult);
    boolean isDoneResult1 = commandFuture.isDone();
    boolean isSuccessfulResult1 = commandFuture.isSuccessful();
    boolean hasFailedResult1 = commandFuture.hasFailed();
    String toStringResult1 = commandFuture.toString();
    Assert.assertFalse(isDoneResult1);
    Assert.assertFalse(commandFuture.isCancelled());
    Assert.assertNotNull(toStringResult1);
    Assert.assertFalse(hasFailedResult1);
    Assert.assertFalse(isSuccessfulResult1);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
