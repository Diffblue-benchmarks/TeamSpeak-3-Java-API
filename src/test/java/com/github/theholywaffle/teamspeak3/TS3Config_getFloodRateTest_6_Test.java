package com.github.theholywaffle.teamspeak3;

import com.github.theholywaffle.teamspeak3.TS3Config;
import com.github.theholywaffle.teamspeak3.TS3Query;
import com.github.theholywaffle.teamspeak3.api.reconnect.ConnectionHandler;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TS3Config_getFloodRateTest_6_Test {
  @Test
  public void getFloodRateTest() throws Exception {
    // Arrange
    TS3Config tS3Config = new TS3Config();

    // Act
    TS3Query.FloodRate actual = tS3Config.getFloodRate();

    // Assert
    String toStringResult = actual.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(350, actual.getMs());
    int queryPort = tS3Config.getQueryPort();
    TS3Query.Protocol protocol = tS3Config.getProtocol();
    String password = tS3Config.getPassword();
    ConnectionHandler connectionHandler = tS3Config.getConnectionHandler();
    String toStringResult1 = tS3Config.toString();
    String host = tS3Config.getHost();
    String username = tS3Config.getUsername();
    int commandTimeout = tS3Config.getCommandTimeout();
    TS3Query.FloodRate floodRate = tS3Config.getFloodRate();
    boolean hasLoginCredentialsResult = tS3Config.hasLoginCredentials();
    Assert.assertEquals(10011, queryPort);
    Assert.assertFalse(tS3Config.getEnableCommunicationsLogging());
    Assert.assertFalse(hasLoginCredentialsResult);
    Assert.assertSame(actual, floodRate);
    Assert.assertEquals(4000, commandTimeout);
    Assert.assertEquals(null, username);
    Assert.assertEquals(null, host);
    Assert.assertNotNull(toStringResult1);
    Assert.assertEquals(null, connectionHandler);
    Assert.assertEquals(null, password);
    Assert.assertEquals(TS3Query.Protocol.RAW, protocol);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
