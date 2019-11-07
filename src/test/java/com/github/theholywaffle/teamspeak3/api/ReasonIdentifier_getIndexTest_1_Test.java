package com.github.theholywaffle.teamspeak3.api;

import com.github.theholywaffle.teamspeak3.api.ReasonIdentifier;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ReasonIdentifier_getIndexTest_1_Test {
  @Test
  public void getIndexTest() throws Exception {
    // Arrange
    ReasonIdentifier reasonIdentifier = ReasonIdentifier.REASON_KICK_CHANNEL;

    // Act
    int actual = reasonIdentifier.getIndex();

    // Assert
    Assert.assertEquals(4, actual);
    Assert.assertEquals(ReasonIdentifier.REASON_KICK_CHANNEL, reasonIdentifier);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
