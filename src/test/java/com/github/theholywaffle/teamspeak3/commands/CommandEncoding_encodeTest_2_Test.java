package com.github.theholywaffle.teamspeak3.commands;

import com.github.theholywaffle.teamspeak3.commands.CommandEncoding;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CommandEncoding_encodeTest_2_Test {
  @Test
  public void encodeTest() throws Exception {
    // Arrange
    String str = "aaaaa";

    // Act
    String actual = CommandEncoding.encode(str);

    // Assert
    Assert.assertEquals("aaaaa", actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
