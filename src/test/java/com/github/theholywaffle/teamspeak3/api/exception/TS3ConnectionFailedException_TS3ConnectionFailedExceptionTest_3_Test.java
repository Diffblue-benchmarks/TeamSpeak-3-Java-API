package com.github.theholywaffle.teamspeak3.api.exception;

import com.github.theholywaffle.teamspeak3.api.exception.TS3ConnectionFailedException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TS3ConnectionFailedException_TS3ConnectionFailedExceptionTest_3_Test {
  @Test
  public void TS3ConnectionFailedExceptionTest() throws Exception {
    // Arrange
    Throwable throwable = new Throwable();

    // Act
    TS3ConnectionFailedException tS3ConnectionFailedException = new TS3ConnectionFailedException(throwable);

    // Assert
    String toStringResult = tS3ConnectionFailedException.toString();
    Throwable[] suppressed = tS3ConnectionFailedException.getSuppressed();
    String message = tS3ConnectionFailedException.getMessage();
    Throwable cause = tS3ConnectionFailedException.getCause();
    Assert.assertEquals(
        "com.github.theholywaffle.teamspeak3.api.exception.TS3ConnectionFailedException: Could not connect to the TeamSpeak3 server",
        toStringResult);
    Assert.assertEquals("Could not connect to the TeamSpeak3 server",
        tS3ConnectionFailedException.getLocalizedMessage());
    Assert.assertSame(throwable, cause);
    String toStringResult1 = cause.toString();
    Throwable[] suppressed1 = cause.getSuppressed();
    String message1 = cause.getMessage();
    Throwable cause1 = cause.getCause();
    Assert.assertEquals("Could not connect to the TeamSpeak3 server", message);
    Assert.assertEquals(0, suppressed.length);
    Assert.assertEquals(null, cause1);
    Assert.assertEquals(null, message1);
    Assert.assertSame(suppressed, suppressed1);
    Assert.assertEquals("java.lang.Throwable", toStringResult1);
    Assert.assertEquals(null, cause.getLocalizedMessage());
    Assert.assertSame(cause, throwable);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
