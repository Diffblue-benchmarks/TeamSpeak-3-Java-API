package com.github.theholywaffle.teamspeak3;

import com.github.theholywaffle.teamspeak3.FileTransferHelper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class FileTransferHelper_getClientTransferIdTest_4_Test {
  @Test
  public void getClientTransferIdTest() throws Exception {
    // Arrange
    FileTransferHelper fileTransferHelper = new FileTransferHelper("aaaaa");

    // Act
    int actual = fileTransferHelper.getClientTransferId();

    // Assert
    Assert.assertEquals(0, actual);
    String toStringResult = fileTransferHelper.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(1, fileTransferHelper.getClientTransferId());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
