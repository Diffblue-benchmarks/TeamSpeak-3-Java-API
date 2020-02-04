package com.github.theholywaffle.teamspeak3.api;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HostBannerModeDiffblueTest {
  @Test
  public void getIndexTest() {
    // Arrange, Act and Assert
    assertEquals(0, HostBannerMode.NO_ADJUST.getIndex());
  }
}

