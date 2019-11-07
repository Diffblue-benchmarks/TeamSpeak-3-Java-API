package com.github.theholywaffle.teamspeak3.api.exception;

import com.github.theholywaffle.teamspeak3.api.exception.TS3FileTransferFailedException;
import java.io.IOException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TS3FileTransferFailedException_TS3FileTransferFailedExceptionTest_2_Test {
  @Test
  public void TS3FileTransferFailedExceptionTest() throws Exception {
    // Arrange
    String msg = "aaaaa";
    IOException iOException = new IOException();

    // Act
    TS3FileTransferFailedException tS3FileTransferFailedException = new TS3FileTransferFailedException(msg,
        iOException);

    // Assert
    String toStringResult = tS3FileTransferFailedException.toString();
    Throwable[] suppressed = tS3FileTransferFailedException.getSuppressed();
    String message = tS3FileTransferFailedException.getMessage();
    Throwable cause = tS3FileTransferFailedException.getCause();
    Assert.assertEquals("com.github.theholywaffle.teamspeak3.api.exception.TS3FileTransferFailedException: aaaaa",
        toStringResult);
    Assert.assertEquals("aaaaa", tS3FileTransferFailedException.getLocalizedMessage());
    Assert.assertSame(iOException, cause);
    Assert.assertTrue(cause instanceof IOException);
    Assert.assertEquals("aaaaa", message);
    Assert.assertSame(iOException, cause);
    Assert.assertEquals(0, suppressed.length);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
