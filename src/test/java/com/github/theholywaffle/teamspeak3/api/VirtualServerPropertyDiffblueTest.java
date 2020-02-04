package com.github.theholywaffle.teamspeak3.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class VirtualServerPropertyDiffblueTest {
  @Test
  public void isChangeableTest() {
    // Arrange, Act and Assert
    assertFalse(VirtualServerProperty.CONNECTION_BANDWIDTH_RECEIVED_LAST_MINUTE_TOTAL.isChangeable());
  }

  @Test
  public void getNameTest() {
    // Arrange, Act and Assert
    assertEquals("connection_bandwidth_received_last_minute_total",
        VirtualServerProperty.CONNECTION_BANDWIDTH_RECEIVED_LAST_MINUTE_TOTAL.getName());
  }
}

