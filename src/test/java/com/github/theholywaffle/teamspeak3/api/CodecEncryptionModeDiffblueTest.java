package com.github.theholywaffle.teamspeak3.api;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CodecEncryptionModeDiffblueTest {
  @Test
  public void getIndexTest() {
    // Arrange, Act and Assert
    assertEquals(0, CodecEncryptionMode.CODEC_CRYPT_INDIVIDUAL.getIndex());
  }
}

