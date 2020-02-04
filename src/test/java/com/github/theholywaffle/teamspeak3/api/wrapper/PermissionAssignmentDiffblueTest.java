package com.github.theholywaffle.teamspeak3.api.wrapper;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class PermissionAssignmentDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new PermissionAssignment(null)).getMap());
  }
}

