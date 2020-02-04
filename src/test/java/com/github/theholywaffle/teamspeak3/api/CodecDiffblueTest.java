package com.github.theholywaffle.teamspeak3.api;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CodecDiffblueTest {
  @Test
  public void getIndexTest() {
    // Arrange, Act and Assert
    assertEquals(0, Codec.SPEEX_NARROWBAND.getIndex());
  }
}

