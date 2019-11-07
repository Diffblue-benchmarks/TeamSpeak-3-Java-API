package com.github.theholywaffle.teamspeak3.api.exception;

import com.github.theholywaffle.teamspeak3.api.exception.TS3QueryShutDownException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TS3QueryShutDownException_TS3QueryShutDownExceptionTest_1_Test {
  @Test
  public void TS3QueryShutDownExceptionTest() throws Exception {
    // Arrange and Act
    TS3QueryShutDownException tS3QueryShutDownException = new TS3QueryShutDownException();

    // Assert
    String toStringResult = tS3QueryShutDownException.toString();
    Throwable[] suppressed = tS3QueryShutDownException.getSuppressed();
    String message = tS3QueryShutDownException.getMessage();
    Throwable cause = tS3QueryShutDownException.getCause();
    Assert.assertEquals(
        "com.github.theholywaffle.teamspeak3.api.exception.TS3QueryShutDownException: The query was shut down or disconnected.",
        toStringResult);
    Assert.assertEquals("The query was shut down or disconnected.", tS3QueryShutDownException.getLocalizedMessage());
    Assert.assertEquals(null, cause);
    Assert.assertEquals("The query was shut down or disconnected.", message);
    Assert.assertEquals(0, suppressed.length);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
