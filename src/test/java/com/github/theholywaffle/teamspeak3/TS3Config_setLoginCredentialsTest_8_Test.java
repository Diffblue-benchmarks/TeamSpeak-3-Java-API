package com.github.theholywaffle.teamspeak3;

import com.github.theholywaffle.teamspeak3.TS3Config;
import com.github.theholywaffle.teamspeak3.TS3Query;
import com.github.theholywaffle.teamspeak3.api.reconnect.ConnectionHandler;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TS3Config_setLoginCredentialsTest_8_Test {
  @Test
  public void setLoginCredentialsTest() throws Exception {
    // Arrange
    TS3Config tS3Config = new TS3Config();
    String username = "aaaaa";
    String password = "aaaaa";

    // Act
    TS3Config actual = tS3Config.setLoginCredentials(username, password);

    // Assert
    Assert.assertSame(tS3Config, actual);
    int queryPort = actual.getQueryPort();
    TS3Query.Protocol protocol = actual.getProtocol();
    String password1 = actual.getPassword();
    ConnectionHandler connectionHandler = actual.getConnectionHandler();
    String toStringResult = actual.toString();
    String host = actual.getHost();
    String username1 = actual.getUsername();
    int commandTimeout = actual.getCommandTimeout();
    TS3Query.FloodRate floodRate = actual.getFloodRate();
    boolean hasLoginCredentialsResult = actual.hasLoginCredentials();
    Assert.assertEquals(10011, queryPort);
    Assert.assertFalse(actual.getEnableCommunicationsLogging());
    Assert.assertTrue(hasLoginCredentialsResult);
    String toStringResult1 = floodRate.toString();
    Assert.assertEquals(4000, commandTimeout);
    Assert.assertEquals(TS3Query.Protocol.RAW, protocol);
    Assert.assertEquals(null, connectionHandler);
    Assert.assertEquals("aaaaa", username1);
    Assert.assertEquals(null, host);
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals("aaaaa", password1);
    Assert.assertEquals(350, floodRate.getMs());
    Assert.assertNotNull(toStringResult1);
    Assert.assertSame(actual, tS3Config);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
