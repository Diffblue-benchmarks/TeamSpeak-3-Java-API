package com.github.theholywaffle.teamspeak3.commands.parameter;

import com.github.theholywaffle.teamspeak3.commands.parameter.KeyValueParam;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class KeyValueParam_KeyValueParamTest_5_Test {
  @Test
  public void KeyValueParamTest() throws Exception {
    // Arrange
    String key = "aaaaa";
    String value = "aaaaa";

    // Act
    KeyValueParam keyValueParam = new KeyValueParam(key, value);

    // Assert
    Assert.assertEquals("aaaaa=aaaaa", keyValueParam.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
