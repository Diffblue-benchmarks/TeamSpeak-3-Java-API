package com.github.theholywaffle.teamspeak3.api;

import com.github.theholywaffle.teamspeak3.api.ChannelProperty;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ChannelProperty_getNameTest_1_Test {
  @Test
  public void getNameTest() throws Exception {
    // Arrange
    ChannelProperty channelProperty = ChannelProperty.CHANNEL_CODEC;

    // Act
    String actual = channelProperty.getName();

    // Assert
    Assert.assertEquals("channel_codec", actual);
    Assert.assertEquals(ChannelProperty.CHANNEL_CODEC, channelProperty);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
