package com.github.theholywaffle.teamspeak3.api;

import com.github.theholywaffle.teamspeak3.api.PermissionGroupDatabaseType;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PermissionGroupDatabaseType_getIndexTest_1_Test {
  @Test
  public void getIndexTest() throws Exception {
    // Arrange
    PermissionGroupDatabaseType permissionGroupDatabaseType = PermissionGroupDatabaseType.TEMPLATE;

    // Act
    int actual = permissionGroupDatabaseType.getIndex();

    // Assert
    Assert.assertEquals(0, actual);
    Assert.assertEquals(PermissionGroupDatabaseType.TEMPLATE, permissionGroupDatabaseType);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
