package com.github.theholywaffle.teamspeak3;

import com.github.theholywaffle.teamspeak3.FileTransferHelper;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class FileTransferHelper_readFullyTest_3_Test {
  @Test
  public void readFullyTest() throws Exception {
    // Arrange
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    long dataLength = 2561L;

    // Act and Assert
    thrown.expect(IOException.class);
    FileTransferHelper.readFully(byteArrayInputStream, dataLength);
    int availableResult = byteArrayInputStream.available();
    Assert.assertEquals(0, availableResult);
    Assert.assertNotNull(byteArrayInputStream.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
