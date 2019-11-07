package com.github.theholywaffle.teamspeak3;

import com.github.theholywaffle.teamspeak3.TS3Query;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class FloodRate_customTest_2_Test {
  @Test
  public void customTest() throws Exception {
    // Arrange
    int milliseconds = 1;

    // Act
    TS3Query.FloodRate actual = TS3Query.FloodRate.custom(milliseconds);

    // Assert
    String toStringResult = actual.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(1, actual.getMs());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
