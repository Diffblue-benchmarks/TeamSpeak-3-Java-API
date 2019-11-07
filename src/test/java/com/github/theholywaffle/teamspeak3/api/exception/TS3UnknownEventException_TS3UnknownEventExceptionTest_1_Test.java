package com.github.theholywaffle.teamspeak3.api.exception;

import com.github.theholywaffle.teamspeak3.api.exception.TS3UnknownEventException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TS3UnknownEventException_TS3UnknownEventExceptionTest_1_Test {
  @Test
  public void TS3UnknownEventExceptionTest() throws Exception {
    // Arrange
    String event = "aaaaa";

    // Act
    TS3UnknownEventException tS3UnknownEventException = new TS3UnknownEventException(event);

    // Assert
    String toStringResult = tS3UnknownEventException.toString();
    Throwable[] suppressed = tS3UnknownEventException.getSuppressed();
    String message = tS3UnknownEventException.getMessage();
    Throwable cause = tS3UnknownEventException.getCause();
    Assert.assertEquals(
        "com.github.theholywaffle.teamspeak3.api.exception.TS3UnknownEventException: aaaaa [Please report this exception to the developer!]",
        toStringResult);
    Assert.assertEquals("aaaaa [Please report this exception to the developer!]",
        tS3UnknownEventException.getLocalizedMessage());
    Assert.assertEquals(null, cause);
    Assert.assertEquals("aaaaa [Please report this exception to the developer!]", message);
    Assert.assertEquals(0, suppressed.length);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
