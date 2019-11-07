package com.github.theholywaffle.teamspeak3.commands.parameter;

import com.github.theholywaffle.teamspeak3.commands.parameter.RawParam;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class RawParam_appendToTest_2_Test {
  @Test
  public void appendToTest() throws Exception {
    // Arrange
    RawParam rawParam = new RawParam("aaaaa");
    StringBuilder stringBuilder = new StringBuilder();

    // Act
    rawParam.appendTo(stringBuilder);

    // Assert
    int capacityResult = stringBuilder.capacity();
    String toStringResult = stringBuilder.toString();
    Assert.assertEquals(16, capacityResult);
    Assert.assertEquals(5, stringBuilder.length());
    Assert.assertEquals("aaaaa", toStringResult);
    Assert.assertEquals("aaaaa", rawParam.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
