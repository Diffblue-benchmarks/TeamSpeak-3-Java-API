package com.github.theholywaffle.teamspeak3.api.exception;

import com.github.theholywaffle.teamspeak3.api.exception.TS3ConnectionFailedException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TS3ConnectionFailedException_TS3ConnectionFailedExceptionTest_1_Test {
  @Test
  public void TS3ConnectionFailedExceptionTest() throws Exception {
    // Arrange
    String msg = "aaaaa";

    // Act
    TS3ConnectionFailedException tS3ConnectionFailedException = new TS3ConnectionFailedException(msg);

    // Assert
    String toStringResult = tS3ConnectionFailedException.toString();
    Throwable[] suppressed = tS3ConnectionFailedException.getSuppressed();
    String message = tS3ConnectionFailedException.getMessage();
    Throwable cause = tS3ConnectionFailedException.getCause();
    Assert.assertEquals("com.github.theholywaffle.teamspeak3.api.exception.TS3ConnectionFailedException: aaaaa",
        toStringResult);
    Assert.assertEquals("aaaaa", tS3ConnectionFailedException.getLocalizedMessage());
    Assert.assertEquals(null, cause);
    Assert.assertEquals("aaaaa", message);
    Assert.assertEquals(0, suppressed.length);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
