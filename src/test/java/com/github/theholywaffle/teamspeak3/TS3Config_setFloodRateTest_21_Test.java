package com.github.theholywaffle.teamspeak3;

import com.github.theholywaffle.teamspeak3.TS3Config;
import com.github.theholywaffle.teamspeak3.TS3Query;
import com.github.theholywaffle.teamspeak3.api.reconnect.ConnectionHandler;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class TS3Config_setFloodRateTest_21_Test {
  @Test
  public void setFloodRateTest() throws Exception {
    // Arrange
    TS3Config tS3Config = new TS3Config();
    TS3Query.FloodRate floodRate = (TS3Query.FloodRate) null;

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    tS3Config.setFloodRate(floodRate);
    Assert.assertEquals(null, floodRate);
    int queryPort = tS3Config.getQueryPort();
    TS3Query.Protocol protocol = tS3Config.getProtocol();
    String password = tS3Config.getPassword();
    ConnectionHandler connectionHandler = tS3Config.getConnectionHandler();
    String toStringResult = tS3Config.toString();
    String host = tS3Config.getHost();
    String username = tS3Config.getUsername();
    int commandTimeout = tS3Config.getCommandTimeout();
    TS3Query.FloodRate floodRate1 = tS3Config.getFloodRate();
    boolean hasLoginCredentialsResult = tS3Config.hasLoginCredentials();
    Assert.assertEquals(10011, queryPort);
    Assert.assertFalse(tS3Config.getEnableCommunicationsLogging());
    Assert.assertFalse(hasLoginCredentialsResult);
    String toStringResult1 = floodRate1.toString();
    Assert.assertEquals(4000, commandTimeout);
    Assert.assertEquals(TS3Query.Protocol.RAW, protocol);
    Assert.assertEquals(null, connectionHandler);
    Assert.assertEquals(null, username);
    Assert.assertEquals(null, host);
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, password);
    Assert.assertEquals(350, floodRate1.getMs());
    Assert.assertNotNull(toStringResult1);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
