package com.github.theholywaffle.teamspeak3.api;

import com.github.theholywaffle.teamspeak3.api.PermissionGroupType;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PermissionGroupType_getIndexTest_1_Test {
  @Test
  public void getIndexTest() throws Exception {
    // Arrange
    PermissionGroupType permissionGroupType = PermissionGroupType.SERVER_GROUP;

    // Act
    int actual = permissionGroupType.getIndex();

    // Assert
    Assert.assertEquals(0, actual);
    Assert.assertEquals(PermissionGroupType.SERVER_GROUP, permissionGroupType);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
