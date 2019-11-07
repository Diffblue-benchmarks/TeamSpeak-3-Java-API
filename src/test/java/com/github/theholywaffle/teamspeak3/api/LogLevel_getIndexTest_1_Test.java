package com.github.theholywaffle.teamspeak3.api;

import com.github.theholywaffle.teamspeak3.api.LogLevel;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class LogLevel_getIndexTest_1_Test {
  @Test
  public void getIndexTest() throws Exception {
    // Arrange
    LogLevel logLevel = LogLevel.ERROR;

    // Act
    int actual = logLevel.getIndex();

    // Assert
    Assert.assertEquals(1, actual);
    Assert.assertEquals(LogLevel.ERROR, logLevel);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
