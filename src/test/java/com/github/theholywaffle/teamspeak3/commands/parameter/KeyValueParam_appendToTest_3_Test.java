package com.github.theholywaffle.teamspeak3.commands.parameter;

import com.github.theholywaffle.teamspeak3.commands.parameter.KeyValueParam;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class KeyValueParam_appendToTest_3_Test {
//failed_compile   @Test
//  public void appendToTest() throws Exception {
//    // Arrange
//    KeyValueParam keyValueParam = new KeyValueParam("aaaaa", true);
//    StringBuilder stringBuilder = new StringBuilder();
//
//    // Act
//    keyValueParam.appendTo(stringBuilder);
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
//    Assert.assertEquals(7, stringBuilder.length());
//    Assert.assertEquals("aaaaa=1", toStringResult);
//    Assert.assertEquals(16, capacityResult);
//    Assert.assertEquals("aaaaa=1", keyValueParam.toString());
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
