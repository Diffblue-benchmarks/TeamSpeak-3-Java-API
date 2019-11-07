package com.github.theholywaffle.teamspeak3.api.wrapper;

import com.github.theholywaffle.teamspeak3.api.wrapper.PermissionInfo;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PermissionInfo_getIdTest_3_Test {
  @Test
  public void getIdTest() throws Exception {
    // Arrange
    HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("aaaaa", "aaaaa");
    PermissionInfo permissionInfo = new PermissionInfo(hashMap);

    // Act
    int actual = permissionInfo.getId();

    // Assert
    Assert.assertEquals(-1, actual);
    int id = permissionInfo.getId();
    String name = permissionInfo.getName();
    String toStringResult = permissionInfo.toString();
    Map<String, String> map = permissionInfo.getMap();
    Assert.assertEquals(-1, id);
    Assert.assertEquals("", permissionInfo.getDescription());
    Assert.assertSame(hashMap, map);
    Assert.assertTrue(map instanceof HashMap);
    Assert.assertEquals("{aaaaa=aaaaa}", toStringResult);
    Assert.assertSame(hashMap, map);
    Assert.assertEquals("", name);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
