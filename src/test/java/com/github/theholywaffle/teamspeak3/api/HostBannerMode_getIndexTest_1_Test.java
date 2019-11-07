package com.github.theholywaffle.teamspeak3.api;

import com.github.theholywaffle.teamspeak3.api.HostBannerMode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class HostBannerMode_getIndexTest_1_Test {
  @Test
  public void getIndexTest() throws Exception {
    // Arrange
    HostBannerMode hostBannerMode = HostBannerMode.NO_ADJUST;

    // Act
    int actual = hostBannerMode.getIndex();

    // Assert
    Assert.assertEquals(0, actual);
    Assert.assertEquals(HostBannerMode.NO_ADJUST, hostBannerMode);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
