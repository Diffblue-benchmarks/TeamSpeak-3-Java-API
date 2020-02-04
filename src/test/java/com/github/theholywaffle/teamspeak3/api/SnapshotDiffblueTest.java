package com.github.theholywaffle.teamspeak3.api;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SnapshotDiffblueTest {
  @Test
  public void getTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new Snapshot("foo")).get());
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertEquals("foo", (new Snapshot("foo")).get());
  }
}

