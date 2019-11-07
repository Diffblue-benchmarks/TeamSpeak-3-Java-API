package com.github.theholywaffle.teamspeak3.commands.parameter;

import com.github.theholywaffle.teamspeak3.commands.parameter.ArrayParameter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ArrayParameter_addTest_3_Test {
  @Test
  public void addTest() throws Exception {
    // Arrange
    ArrayParameter arrayParameter = new ArrayParameter(1);
    ArrayParameter arrayParameter1 = new ArrayParameter(1);

    // Act
    ArrayParameter actual = arrayParameter.add(arrayParameter1);

    // Assert
    Assert.assertSame(arrayParameter, actual);
    Assert.assertEquals("", actual.toString());
    Assert.assertEquals("", arrayParameter1.toString());
    Assert.assertSame(actual, arrayParameter);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
