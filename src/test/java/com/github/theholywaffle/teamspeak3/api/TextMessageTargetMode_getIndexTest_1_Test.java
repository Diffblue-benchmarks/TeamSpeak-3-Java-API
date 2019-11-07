package com.github.theholywaffle.teamspeak3.api;

import com.github.theholywaffle.teamspeak3.api.TextMessageTargetMode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TextMessageTargetMode_getIndexTest_1_Test {
  @Test
  public void getIndexTest() throws Exception {
    // Arrange
    TextMessageTargetMode textMessageTargetMode = TextMessageTargetMode.CLIENT;

    // Act
    int actual = textMessageTargetMode.getIndex();

    // Assert
    Assert.assertEquals(1, actual);
    Assert.assertEquals(TextMessageTargetMode.CLIENT, textMessageTargetMode);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
