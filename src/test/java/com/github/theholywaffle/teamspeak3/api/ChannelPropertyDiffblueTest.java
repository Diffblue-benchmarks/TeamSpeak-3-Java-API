package com.github.theholywaffle.teamspeak3.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ChannelPropertyDiffblueTest {
  @Test
  public void isChangeableTest() {
    // Arrange, Act and Assert
    assertTrue(ChannelProperty.CHANNEL_CODEC.isChangeable());
  }

  @Test
  public void getNameTest() {
    // Arrange, Act and Assert
    assertEquals("channel_codec", ChannelProperty.CHANNEL_CODEC.getName());
  }
}

