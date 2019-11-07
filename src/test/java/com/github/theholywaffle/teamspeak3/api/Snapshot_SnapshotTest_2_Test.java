package com.github.theholywaffle.teamspeak3.api;

import com.github.theholywaffle.teamspeak3.api.Snapshot;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Snapshot_SnapshotTest_2_Test {
  @Test
  public void SnapshotTest() throws Exception {
    // Arrange
    String snapshot = "aaaaa";

    // Act
    Snapshot snapshot1 = new Snapshot(snapshot);

    // Assert
    String toStringResult = snapshot1.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals("aaaaa", snapshot1.get());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
