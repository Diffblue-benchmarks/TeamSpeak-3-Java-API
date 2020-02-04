package com.github.theholywaffle.teamspeak3.api;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PermissionGroupTypeDiffblueTest {
  @Test
  public void getIndexTest() {
    // Arrange, Act and Assert
    assertEquals(0, PermissionGroupType.SERVER_GROUP.getIndex());
  }
}

