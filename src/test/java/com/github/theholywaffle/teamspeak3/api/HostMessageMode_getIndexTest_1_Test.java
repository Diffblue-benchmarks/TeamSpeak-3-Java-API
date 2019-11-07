package com.github.theholywaffle.teamspeak3.api;

import com.github.theholywaffle.teamspeak3.api.HostMessageMode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class HostMessageMode_getIndexTest_1_Test {
  @Test
  public void getIndexTest() throws Exception {
    // Arrange
    HostMessageMode hostMessageMode = HostMessageMode.LOG;

    // Act
    int actual = hostMessageMode.getIndex();

    // Assert
    Assert.assertEquals(1, actual);
    Assert.assertEquals(HostMessageMode.LOG, hostMessageMode);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
