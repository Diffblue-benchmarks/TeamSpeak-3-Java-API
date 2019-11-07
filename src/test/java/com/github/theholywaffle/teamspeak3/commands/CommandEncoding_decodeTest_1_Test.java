package com.github.theholywaffle.teamspeak3.commands;

import com.github.theholywaffle.teamspeak3.commands.CommandEncoding;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CommandEncoding_decodeTest_1_Test {
  @Test
  public void decodeTest() throws Exception {
    // Arrange
    String str = "aaaaa";

    // Act
    String actual = CommandEncoding.decode(str);

    // Assert
    Assert.assertEquals("aaaaa", actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
