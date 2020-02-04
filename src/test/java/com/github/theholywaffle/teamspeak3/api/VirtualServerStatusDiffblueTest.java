package com.github.theholywaffle.teamspeak3.api;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class VirtualServerStatusDiffblueTest {
  @Test
  public void getNameTest() {
    // Arrange, Act and Assert
    assertEquals("online", VirtualServerStatus.ONLINE.getName());
  }
}

