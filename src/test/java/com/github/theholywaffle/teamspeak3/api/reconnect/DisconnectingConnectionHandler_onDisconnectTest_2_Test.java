package com.github.theholywaffle.teamspeak3.api.reconnect;

import com.github.theholywaffle.teamspeak3.TS3Api;
import com.github.theholywaffle.teamspeak3.TS3ApiAsync;
import com.github.theholywaffle.teamspeak3.TS3Query;
import com.github.theholywaffle.teamspeak3.api.reconnect.ConnectionHandler;
import com.github.theholywaffle.teamspeak3.api.reconnect.DisconnectingConnectionHandler;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DisconnectingConnectionHandler_onDisconnectTest_2_Test {
  @Test
  public void onDisconnectTest() throws Exception {
    // Arrange
    DisconnectingConnectionHandler disconnectingConnectionHandler = new DisconnectingConnectionHandler(
        new DisconnectingConnectionHandler(
            new DisconnectingConnectionHandler(new DisconnectingConnectionHandler(null))));
    TS3Query tS3Query = new TS3Query();

    // Act
    disconnectingConnectionHandler.onDisconnect(tS3Query);

    // Assert
    TS3Api api = tS3Query.getApi();
    String toStringResult = tS3Query.toString();
    TS3ApiAsync asyncApi = tS3Query.getAsyncApi();
    boolean isConnectedResult = tS3Query.isConnected();
    String toStringResult1 = api.toString();
    Assert.assertFalse(isConnectedResult);
    Assert.assertNotNull(toStringResult);
    Assert.assertNotNull(toStringResult1);
    Assert.assertNotNull(asyncApi.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
