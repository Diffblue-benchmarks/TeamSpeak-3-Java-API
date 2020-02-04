package com.github.theholywaffle.teamspeak3.api;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ReasonIdentifierDiffblueTest {
  @Test
  public void getIndexTest() {
    // Arrange, Act and Assert
    assertEquals(4, ReasonIdentifier.REASON_KICK_CHANNEL.getIndex());
  }
}

