package com.github.theholywaffle.teamspeak3.api;

import com.github.theholywaffle.teamspeak3.api.PrivilegeKeyType;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PrivilegeKeyType_getIndexTest_1_Test {
  @Test
  public void getIndexTest() throws Exception {
    // Arrange
    PrivilegeKeyType privilegeKeyType = PrivilegeKeyType.SERVER_GROUP;

    // Act
    int actual = privilegeKeyType.getIndex();

    // Assert
    Assert.assertEquals(0, actual);
    Assert.assertEquals(PrivilegeKeyType.SERVER_GROUP, privilegeKeyType);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
