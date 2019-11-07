package com.github.theholywaffle.teamspeak3.api.reconnect;

import com.github.theholywaffle.teamspeak3.api.reconnect.ConnectionHandler;
import com.github.theholywaffle.teamspeak3.api.reconnect.DisconnectingConnectionHandler;
import com.github.theholywaffle.teamspeak3.api.reconnect.ReconnectingConnectionHandler;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ReconnectingConnectionHandler_ReconnectingConnectionHandlerTest_1_Test {
  @Test
  public void ReconnectingConnectionHandlerTest() throws Exception {
    // Arrange
    DisconnectingConnectionHandler disconnectingConnectionHandler = new DisconnectingConnectionHandler(
        new DisconnectingConnectionHandler(new DisconnectingConnectionHandler(null)));
    int startTimeout = 1;
    int timeoutCap = 1;
    int addend = 1;
    double multiplier = 1.0;

    // Act
    ReconnectingConnectionHandler reconnectingConnectionHandler = new ReconnectingConnectionHandler(
        disconnectingConnectionHandler, startTimeout, timeoutCap, addend, multiplier);

    // Assert
    Assert.assertNotNull(reconnectingConnectionHandler.toString());
    Assert.assertNotNull(disconnectingConnectionHandler.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
