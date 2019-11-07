package com.github.theholywaffle.teamspeak3.api.wrapper;

import com.github.theholywaffle.teamspeak3.api.wrapper.Permission;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Permission_getNameTest_2_Test {
  @Test
  public void getNameTest() throws Exception {
    // Arrange
    HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("aaaaa", "aaaaa");
    Permission permission = new Permission(hashMap);

    // Act
    String actual = permission.getName();

    // Assert
    Assert.assertEquals("", actual);
    boolean isSkippedResult = permission.isSkipped();
    String name = permission.getName();
    int value = permission.getValue();
    String toStringResult = permission.toString();
    Map<String, String> map = permission.getMap();
    Assert.assertFalse(isSkippedResult);
    Assert.assertFalse(permission.isNegated());
    Assert.assertSame(hashMap, map);
    Assert.assertTrue(map instanceof HashMap);
    Assert.assertEquals("{aaaaa=aaaaa}", toStringResult);
    Assert.assertSame(hashMap, map);
    Assert.assertEquals(-1, value);
    Assert.assertEquals("", name);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
