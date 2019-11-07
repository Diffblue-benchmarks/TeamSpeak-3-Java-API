package com.github.theholywaffle.teamspeak3;

import com.github.theholywaffle.teamspeak3.TS3Query;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class FloodRate_getMsTest_1_Test {
  @Test
  public void getMsTest() throws Exception {
    // Arrange
    TS3Query.FloodRate floodRate = Whitebox.newInstance(TS3Query.FloodRate.class);

    // Act
    int actual = floodRate.getMs();

    // Assert
    Assert.assertEquals(0, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
