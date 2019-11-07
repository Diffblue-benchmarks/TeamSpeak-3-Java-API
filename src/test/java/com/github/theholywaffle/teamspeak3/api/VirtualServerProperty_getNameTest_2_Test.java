package com.github.theholywaffle.teamspeak3.api;

import com.github.theholywaffle.teamspeak3.api.VirtualServerProperty;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class VirtualServerProperty_getNameTest_2_Test {
  @Test
  public void getNameTest() throws Exception {
    // Arrange
    VirtualServerProperty virtualServerProperty = VirtualServerProperty.CONNECTION_BANDWIDTH_RECEIVED_LAST_MINUTE_TOTAL;

    // Act
    String actual = virtualServerProperty.getName();

    // Assert
    Assert.assertEquals("connection_bandwidth_received_last_minute_total", actual);
    Assert.assertEquals(VirtualServerProperty.CONNECTION_BANDWIDTH_RECEIVED_LAST_MINUTE_TOTAL, virtualServerProperty);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
