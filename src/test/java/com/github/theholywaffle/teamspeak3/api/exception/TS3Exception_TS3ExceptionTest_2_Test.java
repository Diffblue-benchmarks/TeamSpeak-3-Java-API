package com.github.theholywaffle.teamspeak3.api.exception;

import com.github.theholywaffle.teamspeak3.api.exception.TS3Exception;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TS3Exception_TS3ExceptionTest_2_Test {
  @Test
  public void TS3ExceptionTest() throws Exception {
    // Arrange
    String msg = "aaaaa";

    // Act
    TS3Exception tS3Exception = new TS3Exception(msg);

    // Assert
    String toStringResult = tS3Exception.toString();
    Throwable[] suppressed = tS3Exception.getSuppressed();
    String message = tS3Exception.getMessage();
    Throwable cause = tS3Exception.getCause();
    Assert.assertEquals("com.github.theholywaffle.teamspeak3.api.exception.TS3Exception: aaaaa", toStringResult);
    Assert.assertEquals("aaaaa", tS3Exception.getLocalizedMessage());
    Assert.assertEquals(null, cause);
    Assert.assertEquals("aaaaa", message);
    Assert.assertEquals(0, suppressed.length);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
