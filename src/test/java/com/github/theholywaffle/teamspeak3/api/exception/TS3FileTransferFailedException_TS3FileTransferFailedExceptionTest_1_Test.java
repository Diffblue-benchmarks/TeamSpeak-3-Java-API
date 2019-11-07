package com.github.theholywaffle.teamspeak3.api.exception;

import com.github.theholywaffle.teamspeak3.api.exception.TS3FileTransferFailedException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TS3FileTransferFailedException_TS3FileTransferFailedExceptionTest_1_Test {
  @Test
  public void TS3FileTransferFailedExceptionTest() throws Exception {
    // Arrange
    String msg = "aaaaa";

    // Act
    TS3FileTransferFailedException tS3FileTransferFailedException = new TS3FileTransferFailedException(msg);

    // Assert
    String toStringResult = tS3FileTransferFailedException.toString();
    Throwable[] suppressed = tS3FileTransferFailedException.getSuppressed();
    String message = tS3FileTransferFailedException.getMessage();
    Throwable cause = tS3FileTransferFailedException.getCause();
    Assert.assertEquals("com.github.theholywaffle.teamspeak3.api.exception.TS3FileTransferFailedException: aaaaa",
        toStringResult);
    Assert.assertEquals("aaaaa", tS3FileTransferFailedException.getLocalizedMessage());
    Assert.assertEquals(null, cause);
    Assert.assertEquals("aaaaa", message);
    Assert.assertEquals(0, suppressed.length);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
