package com.github.theholywaffle.teamspeak3.api.reconnect;

import com.github.theholywaffle.teamspeak3.api.reconnect.ConnectionHandler;
import com.github.theholywaffle.teamspeak3.api.reconnect.DisconnectingConnectionHandler;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class DisconnectingConnectionHandler_DisconnectingConnectionHandlerTest_1_Test {
  @Test
  public void DisconnectingConnectionHandlerTest() throws Exception {
    // Arrange
    DisconnectingConnectionHandler disconnectingConnectionHandler = new DisconnectingConnectionHandler(
        new DisconnectingConnectionHandler(new DisconnectingConnectionHandler(null)));

    // Act
    DisconnectingConnectionHandler disconnectingConnectionHandler1 = new DisconnectingConnectionHandler(
        disconnectingConnectionHandler);

    // Assert
    Assert.assertNotNull(disconnectingConnectionHandler1.toString());
    Assert.assertNotNull(disconnectingConnectionHandler.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
