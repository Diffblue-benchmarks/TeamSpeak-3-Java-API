package com.github.theholywaffle.teamspeak3.api.reconnect;

import com.github.theholywaffle.teamspeak3.TS3Api;
import com.github.theholywaffle.teamspeak3.api.reconnect.ConnectionHandler;
import com.github.theholywaffle.teamspeak3.api.reconnect.DisconnectingConnectionHandler;
import com.github.theholywaffle.teamspeak3.api.reconnect.ReconnectingConnectionHandler;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ReconnectingConnectionHandler_onConnectTest_2_Test {
  @Test
  public void onConnectTest() throws Exception {
    // Arrange
    ReconnectingConnectionHandler reconnectingConnectionHandler = new ReconnectingConnectionHandler(
        new DisconnectingConnectionHandler(
            new DisconnectingConnectionHandler(new DisconnectingConnectionHandler(null))),
        1, 1, 1, 1.0);
    TS3Api tS3Api = (TS3Api) null;

    // Act
    reconnectingConnectionHandler.onConnect(tS3Api);

    // Assert
    Assert.assertEquals(null, tS3Api);
    Assert.assertNotNull(reconnectingConnectionHandler.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
