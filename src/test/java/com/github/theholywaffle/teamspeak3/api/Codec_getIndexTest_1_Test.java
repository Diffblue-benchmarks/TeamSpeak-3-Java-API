package com.github.theholywaffle.teamspeak3.api;

import com.github.theholywaffle.teamspeak3.api.Codec;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Codec_getIndexTest_1_Test {
  @Test
  public void getIndexTest() throws Exception {
    // Arrange
    Codec codec = Codec.SPEEX_NARROWBAND;

    // Act
    int actual = codec.getIndex();

    // Assert
    Assert.assertEquals(0, actual);
    Assert.assertEquals(Codec.SPEEX_NARROWBAND, codec);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
