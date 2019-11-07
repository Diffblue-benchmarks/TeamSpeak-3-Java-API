package com.github.theholywaffle.teamspeak3.api;

import com.github.theholywaffle.teamspeak3.api.CommandFuture;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CommandFuture_setTest_19_Test {
  @Test
  public void setTest() throws Exception {
    // Arrange
    CommandFuture<Object> commandFuture = new CommandFuture<Object>();
    String value = "aaaaa";

    // Act
    boolean actual = commandFuture.set(value);

    // Assert
    Assert.assertTrue(actual);
    boolean isDoneResult = commandFuture.isDone();
    boolean isSuccessfulResult = commandFuture.isSuccessful();
    boolean hasFailedResult = commandFuture.hasFailed();
    String toStringResult = commandFuture.toString();
    Object getResult = commandFuture.get();
    Object uninterruptibly = commandFuture.getUninterruptibly();
    Assert.assertTrue(isDoneResult);
    Assert.assertFalse(commandFuture.isCancelled());
    Assert.assertTrue(uninterruptibly instanceof String);
    Assert.assertTrue(getResult instanceof String);
    Assert.assertEquals("aaaaa", uninterruptibly);
    Assert.assertEquals("aaaaa", getResult);
    Assert.assertNotNull(toStringResult);
    Assert.assertFalse(hasFailedResult);
    Assert.assertTrue(isSuccessfulResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
