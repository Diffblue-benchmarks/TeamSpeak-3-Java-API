package com.github.theholywaffle.teamspeak3.api.wrapper;

import com.github.theholywaffle.teamspeak3.api.PermissionGroupType;
import com.github.theholywaffle.teamspeak3.api.wrapper.PermissionAssignment;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PermissionAssignment_PermissionAssignmentTest_8_Test {
  @Test
  public void PermissionAssignmentTest() throws Exception {
    // Arrange
    HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("aaaaa", "aaaaa");

    // Act
    PermissionAssignment permissionAssignment = new PermissionAssignment(hashMap);

    // Assert
    int minorId = permissionAssignment.getMinorId();
    int id = permissionAssignment.getId();
    int majorId = permissionAssignment.getMajorId();
    boolean isSkippedResult = permissionAssignment.isSkipped();
    int value = permissionAssignment.getValue();
    String toStringResult = permissionAssignment.toString();
    Map<String, String> map = permissionAssignment.getMap();
    PermissionGroupType type = permissionAssignment.getType();
    Assert.assertEquals(-1, minorId);
    Assert.assertFalse(permissionAssignment.isNegated());
    Assert.assertEquals(null, type);
    Assert.assertSame(hashMap, map);
    Assert.assertTrue(map instanceof HashMap);
    Assert.assertEquals("{aaaaa=aaaaa}", toStringResult);
    Assert.assertSame(hashMap, map);
    Assert.assertEquals(-1, value);
    Assert.assertFalse(isSkippedResult);
    Assert.assertEquals(-1, majorId);
    Assert.assertEquals(-1, id);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
