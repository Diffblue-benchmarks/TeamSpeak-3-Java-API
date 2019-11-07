package com.github.theholywaffle.teamspeak3;

import com.github.theholywaffle.teamspeak3.TS3Config;
import com.github.theholywaffle.teamspeak3.TS3Query;
import com.github.theholywaffle.teamspeak3.api.reconnect.ConnectionHandler;
import com.github.theholywaffle.teamspeak3.api.reconnect.ReconnectStrategy;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class TS3Config_setReconnectStrategyTest_14_Test {
//failed_run   @Test
//  public void setReconnectStrategyTest() throws Exception {
//    // Arrange
//    TS3Config tS3Config = new TS3Config();
//    ReconnectStrategy reconnectStrategy = Whitebox.newInstance(ReconnectStrategy.class);
//
//    // Act
//    TS3Config actual = tS3Config.setReconnectStrategy(reconnectStrategy);
//
//    // Assert
//    Assert.assertSame(tS3Config, actual);
//    int queryPort = actual.getQueryPort();
//    TS3Query.Protocol protocol = actual.getProtocol();
//    String password = actual.getPassword();
//    ConnectionHandler connectionHandler = actual.getConnectionHandler();
//    String toStringResult = actual.toString();
//    String host = actual.getHost();
//    String username = actual.getUsername();
//    int commandTimeout = actual.getCommandTimeout();
//    TS3Query.FloodRate floodRate = actual.getFloodRate();
//    ReconnectStrategy reconnectStrategy1 = actual.getReconnectStrategy();
//    boolean hasLoginCredentialsResult = actual.hasLoginCredentials();
//    Assert.assertEquals(10011, queryPort);
//    Assert.assertFalse(actual.getEnableCommunicationsLogging());
//    Assert.assertFalse(hasLoginCredentialsResult);
//    Assert.assertSame(reconnectStrategy, reconnectStrategy1);
//    String toStringResult1 = floodRate.toString();
//    Assert.assertEquals(4000, commandTimeout);
//    Assert.assertEquals(TS3Query.Protocol.RAW, protocol);
//    Assert.assertEquals(null, connectionHandler);
//    Assert.assertEquals(null, username);
//    Assert.assertEquals(null, host);
//    Assert.assertNotNull(toStringResult);
//    Assert.assertEquals(null, password);
//    Assert.assertEquals(350, floodRate.getMs());
//    Assert.assertNotNull(toStringResult1);
//    Assert.assertSame(actual, tS3Config);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
