package com.github.theholywaffle.teamspeak3.api;

import com.github.theholywaffle.teamspeak3.api.VirtualServerProperty;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class VirtualServerProperty_isChangeableTest_1_Test {
  @Test
  public void isChangeableTest() throws Exception {
    // Arrange
    VirtualServerProperty virtualServerProperty = VirtualServerProperty.CONNECTION_BANDWIDTH_RECEIVED_LAST_MINUTE_TOTAL;

    // Act
    boolean actual = virtualServerProperty.isChangeable();

    // Assert
    Assert.assertFalse(actual);
    Assert.assertEquals(VirtualServerProperty.CONNECTION_BANDWIDTH_RECEIVED_LAST_MINUTE_TOTAL, virtualServerProperty);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
