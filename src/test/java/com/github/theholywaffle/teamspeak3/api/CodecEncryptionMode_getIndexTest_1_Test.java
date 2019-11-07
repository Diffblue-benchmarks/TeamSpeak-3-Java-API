package com.github.theholywaffle.teamspeak3.api;

import com.github.theholywaffle.teamspeak3.api.CodecEncryptionMode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CodecEncryptionMode_getIndexTest_1_Test {
  @Test
  public void getIndexTest() throws Exception {
    // Arrange
    CodecEncryptionMode codecEncryptionMode = CodecEncryptionMode.CODEC_CRYPT_INDIVIDUAL;

    // Act
    int actual = codecEncryptionMode.getIndex();

    // Assert
    Assert.assertEquals(0, actual);
    Assert.assertEquals(CodecEncryptionMode.CODEC_CRYPT_INDIVIDUAL, codecEncryptionMode);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
