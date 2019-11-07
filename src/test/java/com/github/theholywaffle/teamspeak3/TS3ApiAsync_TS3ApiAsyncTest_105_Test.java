package com.github.theholywaffle.teamspeak3;

import com.github.theholywaffle.teamspeak3.CommandQueue;
import com.github.theholywaffle.teamspeak3.TS3Api;
import com.github.theholywaffle.teamspeak3.TS3ApiAsync;
import com.github.theholywaffle.teamspeak3.TS3Query;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TS3ApiAsync_TS3ApiAsyncTest_105_Test {
  @Test
  public void TS3ApiAsyncTest() throws Exception {
    // Arrange
    TS3Query tS3Query = new TS3Query();
    CommandQueue commandQueue = (CommandQueue) null;

    // Act
    TS3ApiAsync tS3ApiAsync = new TS3ApiAsync(tS3Query, commandQueue);

    // Assert
    Assert.assertNotNull(tS3ApiAsync.toString());
    TS3Api api = tS3Query.getApi();
    String toStringResult = tS3Query.toString();
    boolean isConnectedResult = tS3Query.isConnected();
    Assert.assertNotNull(toStringResult);
    Assert.assertFalse(isConnectedResult);
    Assert.assertNotNull(api.toString());
    Assert.assertEquals(null, commandQueue);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
