package com.github.theholywaffle.teamspeak3.api.event;

import com.github.theholywaffle.teamspeak3.api.event.TS3EventType;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TS3EventType_toStringTest_1_Test {
  @Test
  public void toStringTest() throws Exception {
    // Arrange
    TS3EventType tS3EventType = TS3EventType.SERVER;

    // Act
    String actual = tS3EventType.toString();

    // Assert
    Assert.assertEquals("server", actual);
    Assert.assertEquals(TS3EventType.SERVER, tS3EventType);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
