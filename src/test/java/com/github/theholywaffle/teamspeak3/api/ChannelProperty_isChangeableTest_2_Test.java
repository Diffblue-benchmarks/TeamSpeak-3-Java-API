package com.github.theholywaffle.teamspeak3.api;

import com.github.theholywaffle.teamspeak3.api.ChannelProperty;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ChannelProperty_isChangeableTest_2_Test {
  @Test
  public void isChangeableTest() throws Exception {
    // Arrange
    ChannelProperty channelProperty = ChannelProperty.CHANNEL_CODEC;

    // Act
    boolean actual = channelProperty.isChangeable();

    // Assert
    Assert.assertTrue(actual);
    Assert.assertEquals(ChannelProperty.CHANNEL_CODEC, channelProperty);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
