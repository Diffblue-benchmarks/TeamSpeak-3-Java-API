package com.github.theholywaffle.teamspeak3.api;

import com.github.theholywaffle.teamspeak3.api.CommandFuture;
import com.github.theholywaffle.teamspeak3.api.exception.TS3Exception;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CommandFuture_failTest_9_Test {
  @Test
  public void failTest() throws Exception {
    // Arrange
    CommandFuture<Object> commandFuture = new CommandFuture<Object>();
    TS3Exception tS3Exception = new TS3Exception("aaaaa");

    // Act
    boolean actual = commandFuture.fail(tS3Exception);

    // Assert
    Assert.assertTrue(actual);
    String toStringResult = tS3Exception.toString();
    Throwable[] suppressed = tS3Exception.getSuppressed();
    String message = tS3Exception.getMessage();
    Throwable cause = tS3Exception.getCause();
    Assert.assertEquals("com.github.theholywaffle.teamspeak3.api.exception.TS3Exception: aaaaa", toStringResult);
    Assert.assertEquals("aaaaa", tS3Exception.getLocalizedMessage());
    Assert.assertEquals(null, cause);
    Assert.assertEquals("aaaaa", message);
    Assert.assertEquals(0, suppressed.length);
    boolean isDoneResult = commandFuture.isDone();
    boolean isSuccessfulResult = commandFuture.isSuccessful();
    boolean hasFailedResult = commandFuture.hasFailed();
    String toStringResult1 = commandFuture.toString();
    Assert.assertTrue(isDoneResult);
    Assert.assertFalse(commandFuture.isCancelled());
    Assert.assertNotNull(toStringResult1);
    Assert.assertTrue(hasFailedResult);
    Assert.assertFalse(isSuccessfulResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
