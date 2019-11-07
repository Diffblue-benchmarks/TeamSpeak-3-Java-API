package com.github.theholywaffle.teamspeak3.api.reconnect;

import com.github.theholywaffle.teamspeak3.TS3Api;
import com.github.theholywaffle.teamspeak3.TS3ApiAsync;
import com.github.theholywaffle.teamspeak3.TS3Query;
import com.github.theholywaffle.teamspeak3.api.reconnect.ConnectionHandler;
import com.github.theholywaffle.teamspeak3.api.reconnect.DisconnectingConnectionHandler;
import com.github.theholywaffle.teamspeak3.api.reconnect.ReconnectingConnectionHandler;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ReconnectingConnectionHandler_onDisconnectTest_3_Test {
  @Test
  public void onDisconnectTest() throws Exception {
    // Arrange
    ReconnectingConnectionHandler reconnectingConnectionHandler = new ReconnectingConnectionHandler(
        new DisconnectingConnectionHandler(
            new DisconnectingConnectionHandler(new DisconnectingConnectionHandler(null))),
        1, 1, 1, 1.0);
    TS3Query tS3Query = new TS3Query();

    // Act and Assert
    thrown.expect(IllegalStateException.class);
    reconnectingConnectionHandler.onDisconnect(tS3Query);
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
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
