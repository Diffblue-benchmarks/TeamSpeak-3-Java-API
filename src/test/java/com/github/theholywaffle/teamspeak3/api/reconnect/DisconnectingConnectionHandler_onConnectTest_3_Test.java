package com.github.theholywaffle.teamspeak3.api.reconnect;

import com.github.theholywaffle.teamspeak3.TS3Api;
import com.github.theholywaffle.teamspeak3.api.reconnect.ConnectionHandler;
import com.github.theholywaffle.teamspeak3.api.reconnect.DisconnectingConnectionHandler;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DisconnectingConnectionHandler_onConnectTest_3_Test {
  @Test
  public void onConnectTest() throws Exception {
    // Arrange
    DisconnectingConnectionHandler disconnectingConnectionHandler = new DisconnectingConnectionHandler(
        new DisconnectingConnectionHandler(
            new DisconnectingConnectionHandler(new DisconnectingConnectionHandler(null))));
    TS3Api tS3Api = (TS3Api) null;

    // Act
    disconnectingConnectionHandler.onConnect(tS3Api);

    // Assert
    Assert.assertEquals(null, tS3Api);
    Assert.assertNotNull(disconnectingConnectionHandler.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
