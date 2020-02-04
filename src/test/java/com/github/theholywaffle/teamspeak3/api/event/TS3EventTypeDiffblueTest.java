package com.github.theholywaffle.teamspeak3.api.event;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TS3EventTypeDiffblueTest {
  @Test
  public void toStringTest() {
    // Arrange, Act and Assert
    assertEquals("server", TS3EventType.SERVER.toString());
  }
}

