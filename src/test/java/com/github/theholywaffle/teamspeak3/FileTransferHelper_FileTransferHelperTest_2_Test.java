package com.github.theholywaffle.teamspeak3;

import com.github.theholywaffle.teamspeak3.FileTransferHelper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class FileTransferHelper_FileTransferHelperTest_2_Test {
  @Test
  public void FileTransferHelperTest() throws Exception {
    // Arrange
    String host = "aaaaa";

    // Act
    FileTransferHelper fileTransferHelper = new FileTransferHelper(host);

    // Assert
    Assert.assertEquals(0, fileTransferHelper.getClientTransferId());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
