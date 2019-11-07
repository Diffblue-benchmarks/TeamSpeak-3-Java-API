package com.github.theholywaffle.teamspeak3.api;

import com.github.theholywaffle.teamspeak3.api.CommandFuture;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CommandFuture_immediateTest_3_Test {
  @Test
  public void immediateTest() throws Exception {
    // Arrange
    String value = "aaaaa";

    // Act
    CommandFuture<Object> actual = CommandFuture.<Object>immediate(value);

    // Assert
    boolean isDoneResult = actual.isDone();
    boolean isSuccessfulResult = actual.isSuccessful();
    boolean hasFailedResult = actual.hasFailed();
    String toStringResult = actual.toString();
    Object getResult = actual.get();
    Object uninterruptibly = actual.getUninterruptibly();
    Assert.assertTrue(isDoneResult);
    Assert.assertFalse(actual.isCancelled());
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
