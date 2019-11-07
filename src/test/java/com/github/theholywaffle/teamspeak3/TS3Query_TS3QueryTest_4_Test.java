package com.github.theholywaffle.teamspeak3;

import com.github.theholywaffle.teamspeak3.EventManager;
import com.github.theholywaffle.teamspeak3.FileTransferHelper;
import com.github.theholywaffle.teamspeak3.TS3Api;
import com.github.theholywaffle.teamspeak3.TS3ApiAsync;
import com.github.theholywaffle.teamspeak3.TS3Query;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TS3Query_TS3QueryTest_4_Test {
  @Test
  public void TS3QueryTest() throws Exception {
    // Arrange and Act
    TS3Query tS3Query = new TS3Query();

    // Assert
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
    String toStringResult3 = eventManager.toString();
    Assert.assertFalse(isConnectedResult);
    Assert.assertEquals(0, clientTransferId);
    Assert.assertNotNull(asyncApi.toString());
    Assert.assertNotNull(toStringResult1);
    Assert.assertNotNull(toStringResult3);
    Assert.assertNotNull(toStringResult2);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
