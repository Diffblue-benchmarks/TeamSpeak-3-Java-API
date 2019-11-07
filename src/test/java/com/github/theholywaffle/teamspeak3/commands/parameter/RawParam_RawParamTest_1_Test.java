package com.github.theholywaffle.teamspeak3.commands.parameter;

import com.github.theholywaffle.teamspeak3.commands.parameter.RawParam;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class RawParam_RawParamTest_1_Test {
  @Test
  public void RawParamTest() throws Exception {
    // Arrange
    String raw = "aaaaa";

    // Act
    RawParam rawParam = new RawParam(raw);

    // Assert
    Assert.assertEquals("aaaaa", rawParam.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
