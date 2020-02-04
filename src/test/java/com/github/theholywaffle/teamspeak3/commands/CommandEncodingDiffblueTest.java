package com.github.theholywaffle.teamspeak3.commands;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CommandEncodingDiffblueTest {
  @Test
  public void encodeTest() {
    // Arrange, Act and Assert
    assertEquals("foo", CommandEncoding.encode("foo"));
  }

  @Test
  public void decodeTest() {
    // Arrange, Act and Assert
    assertEquals("foo", CommandEncoding.decode("foo"));
  }
}

