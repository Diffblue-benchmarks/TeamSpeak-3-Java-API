package com.github.theholywaffle.teamspeak3.commands.parameter;

import com.github.theholywaffle.teamspeak3.commands.parameter.OptionParam;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class OptionParam_appendToTest_2_Test {
//failed_compile   @Test
//  public void appendToTest() throws Exception {
//    // Arrange
//    OptionParam optionParam = new OptionParam("aaaaa");
//    StringBuilder stringBuilder = new StringBuilder();
//
//    // Act
//    optionParam.appendTo(stringBuilder);
//
//    // Assert
//    char[] value = stringBuilder.getValue();
//    int capacityResult = stringBuilder.capacity();
//    String toStringResult = stringBuilder.toString();
//    Assert.assertEquals(16, value.length);
//    Assert.assertEquals('-', value[0]);
//    Assert.assertEquals('a', value[1]);
//    Assert.assertEquals('a', value[2]);
//    Assert.assertEquals('\u0000', value[13]);
//    Assert.assertEquals('\u0000', value[14]);
//    Assert.assertEquals('\u0000', value[15]);
//    Assert.assertEquals(6, stringBuilder.length());
//    Assert.assertEquals("-aaaaa", toStringResult);
//    Assert.assertEquals(16, capacityResult);
//    Assert.assertEquals("-aaaaa", optionParam.toString());
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
