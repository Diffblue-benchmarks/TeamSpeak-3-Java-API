package com.github.theholywaffle.teamspeak3.api;

import com.github.theholywaffle.teamspeak3.api.CommandFuture;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class CommandFuture_onFailureTest_11_Test {
  @Test
  public void onFailureTest() throws Exception {
    // Arrange
    CommandFuture<Object> commandFuture = new CommandFuture<Object>();
    CommandFuture.FailureListener listener = Whitebox.newInstance(CommandFuture.FailureListener.class);

    // Act
    CommandFuture<Object> actual = commandFuture.onFailure(listener);

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
    Assert.assertSame(actual, commandFuture);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
