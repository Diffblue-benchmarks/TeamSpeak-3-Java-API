package com.github.theholywaffle.teamspeak3.commands.parameter;

import com.github.theholywaffle.teamspeak3.commands.parameter.ValueParam;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ValueParam_ValueParamTest_2_Test {
  @Test
  public void ValueParamTest() throws Exception {
    // Arrange
    String value = "aaaaa";

    // Act
    ValueParam valueParam = new ValueParam(value);

    // Assert
    Assert.assertEquals("aaaaa", valueParam.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
