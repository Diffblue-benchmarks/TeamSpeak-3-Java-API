package com.github.theholywaffle.teamspeak3.commands.parameter;

import com.github.theholywaffle.teamspeak3.commands.parameter.KeyValueParam;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class KeyValueParam_KeyValueParamTest_2_Test {
  @Test
  public void KeyValueParamTest() throws Exception {
    // Arrange
    String key = "aaaaa";
    long value = 1L;

    // Act
    KeyValueParam keyValueParam = new KeyValueParam(key, value);

    // Assert
    Assert.assertEquals("aaaaa=1", keyValueParam.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
