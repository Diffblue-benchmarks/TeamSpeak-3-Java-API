package com.github.theholywaffle.teamspeak3;

import com.github.theholywaffle.teamspeak3.TS3Config;
import com.github.theholywaffle.teamspeak3.TS3Query;
import com.github.theholywaffle.teamspeak3.api.reconnect.ConnectionHandler;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TS3Config_getUsernameTest_5_Test {
  @Test
  public void getUsernameTest() throws Exception {
    // Arrange
    TS3Config tS3Config = new TS3Config();

    // Act
    String actual = tS3Config.getUsername();

    // Assert
    Assert.assertEquals(null, actual);
    TS3Query.Protocol protocol = tS3Config.getProtocol();
    String password = tS3Config.getPassword();
    ConnectionHandler connectionHandler = tS3Config.getConnectionHandler();
    String toStringResult = tS3Config.toString();
    String host = tS3Config.getHost();
    String username = tS3Config.getUsername();
    int commandTimeout = tS3Config.getCommandTimeout();
    TS3Query.FloodRate floodRate = tS3Config.getFloodRate();
    boolean hasLoginCredentialsResult = tS3Config.hasLoginCredentials();
    Assert.assertEquals(TS3Query.Protocol.RAW, protocol);
    Assert.assertFalse(tS3Config.getEnableCommunicationsLogging());
    Assert.assertFalse(hasLoginCredentialsResult);
    String toStringResult1 = floodRate.toString();
    Assert.assertEquals(4000, commandTimeout);
    Assert.assertEquals(null, password);
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, username);
    Assert.assertEquals(null, host);
    Assert.assertEquals(null, connectionHandler);
    Assert.assertEquals(350, floodRate.getMs());
    Assert.assertNotNull(toStringResult1);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
