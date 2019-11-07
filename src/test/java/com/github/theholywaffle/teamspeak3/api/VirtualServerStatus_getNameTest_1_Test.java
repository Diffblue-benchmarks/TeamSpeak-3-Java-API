package com.github.theholywaffle.teamspeak3.api;

import com.github.theholywaffle.teamspeak3.api.VirtualServerStatus;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class VirtualServerStatus_getNameTest_1_Test {
  @Test
  public void getNameTest() throws Exception {
    // Arrange
    VirtualServerStatus virtualServerStatus = VirtualServerStatus.ONLINE;

    // Act
    String actual = virtualServerStatus.getName();

    // Assert
    Assert.assertEquals("online", actual);
    Assert.assertEquals(VirtualServerStatus.ONLINE, virtualServerStatus);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
