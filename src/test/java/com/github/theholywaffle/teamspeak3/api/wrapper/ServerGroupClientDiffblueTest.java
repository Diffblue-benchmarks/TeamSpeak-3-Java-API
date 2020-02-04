package com.github.theholywaffle.teamspeak3.api.wrapper;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class ServerGroupClientDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new ServerGroupClient(null)).getMap());
  }
}

