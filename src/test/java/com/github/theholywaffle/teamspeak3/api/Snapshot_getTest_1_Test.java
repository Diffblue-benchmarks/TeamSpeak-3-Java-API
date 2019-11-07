package com.github.theholywaffle.teamspeak3.api;

import com.github.theholywaffle.teamspeak3.api.Snapshot;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Snapshot_getTest_1_Test {
  @Test
  public void getTest() throws Exception {
    // Arrange
    Snapshot snapshot = new Snapshot("aaaaa");

    // Act
    String actual = snapshot.get();

    // Assert
    Assert.assertEquals("aaaaa", actual);
    String toStringResult = snapshot.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals("aaaaa", snapshot.get());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
