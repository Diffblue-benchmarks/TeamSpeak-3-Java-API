package com.github.theholywaffle.teamspeak3.api;

import com.github.theholywaffle.teamspeak3.api.ServerInstanceProperty;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ServerInstanceProperty_getNameTest_1_Test {
  @Test
  public void getNameTest() throws Exception {
    // Arrange
    ServerInstanceProperty serverInstanceProperty = ServerInstanceProperty.CONNECTION_BANDWIDTH_RECEIVED_LAST_MINUTE_TOTAL;

    // Act
    String actual = serverInstanceProperty.getName();

    // Assert
    Assert.assertEquals("connection_bandwidth_received_last_minute_total", actual);
    Assert.assertEquals(ServerInstanceProperty.CONNECTION_BANDWIDTH_RECEIVED_LAST_MINUTE_TOTAL, serverInstanceProperty);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
