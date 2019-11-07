package com.github.theholywaffle.teamspeak3;

import com.github.theholywaffle.teamspeak3.EventManager;
import com.github.theholywaffle.teamspeak3.FileTransferHelper;
import com.github.theholywaffle.teamspeak3.TS3Api;
import com.github.theholywaffle.teamspeak3.TS3ApiAsync;
import com.github.theholywaffle.teamspeak3.TS3Query;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TS3Query_getEventManagerTest_8_Test {
  @Test
  public void getEventManagerTest() throws Exception {
    // Arrange
    TS3Query tS3Query = new TS3Query();

    // Act
    EventManager actual = tS3Query.getEventManager();

    // Assert
    Assert.assertNotNull(actual.toString());
    TS3Api api = tS3Query.getApi();
    String toStringResult = tS3Query.toString();
    TS3ApiAsync asyncApi = tS3Query.getAsyncApi();
    EventManager eventManager = tS3Query.getEventManager();
    boolean isConnectedResult = tS3Query.isConnected();
    FileTransferHelper fileTransferHelper = tS3Query.getFileTransferHelper();
    String toStringResult1 = api.toString();
    String toStringResult2 = fileTransferHelper.toString();
    int clientTransferId = fileTransferHelper.getClientTransferId();
    Assert.assertNotNull(toStringResult);
    Assert.assertSame(actual, eventManager);
    Assert.assertFalse(isConnectedResult);
    Assert.assertNotNull(toStringResult1);
    Assert.assertNotNull(asyncApi.toString());
    Assert.assertEquals(0, clientTransferId);
    Assert.assertNotNull(toStringResult2);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
