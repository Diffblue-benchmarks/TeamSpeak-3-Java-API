package com.github.theholywaffle.teamspeak3;

import com.github.theholywaffle.teamspeak3.TS3Config;
import com.github.theholywaffle.teamspeak3.TS3Query;
import com.github.theholywaffle.teamspeak3.api.reconnect.ConnectionHandler;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TS3Config_freezeTest_3_Test {
  @Test
  public void freezeTest() throws Exception {
    // Arrange
    TS3Config tS3Config = new TS3Config();

    // Act
    TS3Config actual = tS3Config.freeze();

    // Assert
    Assert.assertSame(tS3Config, actual);
    TS3Query.Protocol protocol = actual.getProtocol();
    String password = actual.getPassword();
    ConnectionHandler connectionHandler = actual.getConnectionHandler();
    String toStringResult = actual.toString();
    String host = actual.getHost();
    String username = actual.getUsername();
    int commandTimeout = actual.getCommandTimeout();
    TS3Query.FloodRate floodRate = actual.getFloodRate();
    boolean hasLoginCredentialsResult = actual.hasLoginCredentials();
    Assert.assertEquals(TS3Query.Protocol.RAW, protocol);
    Assert.assertFalse(actual.getEnableCommunicationsLogging());
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
    Assert.assertSame(actual, tS3Config);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
