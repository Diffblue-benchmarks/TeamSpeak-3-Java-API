package com.github.theholywaffle.teamspeak3.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class ServerInstancePropertyDiffblueTest {
  @Test
  public void isChangeableTest() {
    // Arrange, Act and Assert
    assertFalse(ServerInstanceProperty.CONNECTION_BANDWIDTH_RECEIVED_LAST_MINUTE_TOTAL.isChangeable());
  }

  @Test
  public void getNameTest() {
    // Arrange, Act and Assert
    assertEquals("connection_bandwidth_received_last_minute_total",
        ServerInstanceProperty.CONNECTION_BANDWIDTH_RECEIVED_LAST_MINUTE_TOTAL.getName());
  }
}

