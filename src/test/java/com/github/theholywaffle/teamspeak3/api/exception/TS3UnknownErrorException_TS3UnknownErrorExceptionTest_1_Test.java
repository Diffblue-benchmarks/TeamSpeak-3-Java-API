package com.github.theholywaffle.teamspeak3.api.exception;

import com.github.theholywaffle.teamspeak3.api.exception.TS3UnknownErrorException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TS3UnknownErrorException_TS3UnknownErrorExceptionTest_1_Test {
  @Test
  public void TS3UnknownErrorExceptionTest() throws Exception {
    // Arrange
    String error = "aaaaa";

    // Act
    TS3UnknownErrorException tS3UnknownErrorException = new TS3UnknownErrorException(error);

    // Assert
    String toStringResult = tS3UnknownErrorException.toString();
    Throwable[] suppressed = tS3UnknownErrorException.getSuppressed();
    String message = tS3UnknownErrorException.getMessage();
    Throwable cause = tS3UnknownErrorException.getCause();
    Assert.assertEquals(
        "com.github.theholywaffle.teamspeak3.api.exception.TS3UnknownErrorException: aaaaa [Please report this exception to the developer!]",
        toStringResult);
    Assert.assertEquals("aaaaa [Please report this exception to the developer!]",
        tS3UnknownErrorException.getLocalizedMessage());
    Assert.assertEquals(null, cause);
    Assert.assertEquals("aaaaa [Please report this exception to the developer!]", message);
    Assert.assertEquals(0, suppressed.length);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
