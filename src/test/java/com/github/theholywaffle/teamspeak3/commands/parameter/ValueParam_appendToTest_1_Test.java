package com.github.theholywaffle.teamspeak3.commands.parameter;

import com.github.theholywaffle.teamspeak3.commands.parameter.ValueParam;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ValueParam_appendToTest_1_Test {
//failed_compile   @Test
//  public void appendToTest() throws Exception {
//    // Arrange
//    ValueParam valueParam = new ValueParam("aaaaa");
//    StringBuilder stringBuilder = new StringBuilder();
//
//    // Act
//    valueParam.appendTo(stringBuilder);
//
//    // Assert
//    char[] value = stringBuilder.getValue();
//    int capacityResult = stringBuilder.capacity();
//    String toStringResult = stringBuilder.toString();
//    Assert.assertEquals(16, value.length);
//    Assert.assertEquals('a', value[0]);
//    Assert.assertEquals('a', value[1]);
//    Assert.assertEquals('a', value[2]);
//    Assert.assertEquals('\u0000', value[13]);
//    Assert.assertEquals('\u0000', value[14]);
//    Assert.assertEquals('\u0000', value[15]);
//    Assert.assertEquals(5, stringBuilder.length());
//    Assert.assertEquals("aaaaa", toStringResult);
//    Assert.assertEquals(16, capacityResult);
//    Assert.assertEquals("aaaaa", valueParam.toString());
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
