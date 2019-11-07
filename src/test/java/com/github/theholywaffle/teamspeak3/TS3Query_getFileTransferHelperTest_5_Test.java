package com.github.theholywaffle.teamspeak3;

import com.github.theholywaffle.teamspeak3.EventManager;
import com.github.theholywaffle.teamspeak3.FileTransferHelper;
import com.github.theholywaffle.teamspeak3.TS3Api;
import com.github.theholywaffle.teamspeak3.TS3ApiAsync;
import com.github.theholywaffle.teamspeak3.TS3Query;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TS3Query_getFileTransferHelperTest_5_Test {
  @Test
  public void getFileTransferHelperTest() throws Exception {
    // Arrange
    TS3Query tS3Query = new TS3Query();

    // Act
    FileTransferHelper actual = tS3Query.getFileTransferHelper();

    // Assert
    String toStringResult = actual.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(0, actual.getClientTransferId());
    TS3Api api = tS3Query.getApi();
    String toStringResult1 = tS3Query.toString();
    TS3ApiAsync asyncApi = tS3Query.getAsyncApi();
    EventManager eventManager = tS3Query.getEventManager();
    boolean isConnectedResult = tS3Query.isConnected();
    FileTransferHelper fileTransferHelper = tS3Query.getFileTransferHelper();
    String toStringResult2 = api.toString();
    Assert.assertSame(actual, fileTransferHelper);
    Assert.assertNotNull(toStringResult1);
    Assert.assertFalse(isConnectedResult);
    String toStringResult3 = eventManager.toString();
    Assert.assertNotNull(toStringResult3);
    Assert.assertNotNull(asyncApi.toString());
    Assert.assertNotNull(toStringResult2);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
