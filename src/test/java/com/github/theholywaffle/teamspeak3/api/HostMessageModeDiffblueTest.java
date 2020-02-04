package com.github.theholywaffle.teamspeak3.api;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HostMessageModeDiffblueTest {
  @Test
  public void getIndexTest() {
    // Arrange, Act and Assert
    assertEquals(1, HostMessageMode.LOG.getIndex());
  }
}

