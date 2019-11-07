package com.github.theholywaffle.teamspeak3.api;

import com.github.theholywaffle.teamspeak3.api.ServerGroupType;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ServerGroupType_getIndexTest_1_Test {
  @Test
  public void getIndexTest() throws Exception {
    // Arrange
    ServerGroupType serverGroupType = ServerGroupType.CHANNEL_GUEST;

    // Act
    int actual = serverGroupType.getIndex();

    // Assert
    Assert.assertEquals(10, actual);
    Assert.assertEquals(ServerGroupType.CHANNEL_GUEST, serverGroupType);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
