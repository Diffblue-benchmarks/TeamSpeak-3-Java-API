package com.github.theholywaffle.teamspeak3.commands.parameter;

import com.github.theholywaffle.teamspeak3.commands.parameter.OptionParam;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class OptionParam_OptionParamTest_1_Test {
  @Test
  public void OptionParamTest() throws Exception {
    // Arrange
    String option = "aaaaa";

    // Act
    OptionParam optionParam = new OptionParam(option);

    // Assert
    Assert.assertEquals("-aaaaa", optionParam.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
