package com.github.theholywaffle.teamspeak3.api;

import com.github.theholywaffle.teamspeak3.api.ServerInstanceProperty;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ServerInstanceProperty_isChangeableTest_2_Test {
  @Test
  public void isChangeableTest() throws Exception {
    // Arrange
    ServerInstanceProperty serverInstanceProperty = ServerInstanceProperty.CONNECTION_BANDWIDTH_RECEIVED_LAST_MINUTE_TOTAL;

    // Act
    boolean actual = serverInstanceProperty.isChangeable();

    // Assert
    Assert.assertFalse(actual);
    Assert.assertEquals(ServerInstanceProperty.CONNECTION_BANDWIDTH_RECEIVED_LAST_MINUTE_TOTAL, serverInstanceProperty);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
