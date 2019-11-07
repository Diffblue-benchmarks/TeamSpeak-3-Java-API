package com.github.theholywaffle.teamspeak3.commands.parameter;

import com.github.theholywaffle.teamspeak3.commands.parameter.ArrayParameter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ArrayParameter_ArrayParameterTest_1_Test {
  @Test
  public void ArrayParameterTest() throws Exception {
    // Arrange
    int numberOfEntries = 1;
    int parametersPerEntry = 1;

    // Act
    ArrayParameter arrayParameter = new ArrayParameter(numberOfEntries, parametersPerEntry);

    // Assert
    Assert.assertEquals("", arrayParameter.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
