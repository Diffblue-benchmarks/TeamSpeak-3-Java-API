package com.github.theholywaffle.teamspeak3.api.wrapper;

import com.github.theholywaffle.teamspeak3.api.wrapper.CustomPropertyAssignment;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CustomPropertyAssignment_getKeyTest_1_Test {
  @Test
  public void getKeyTest() throws Exception {
    // Arrange
    HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("aaaaa", "aaaaa");
    CustomPropertyAssignment customPropertyAssignment = new CustomPropertyAssignment(hashMap);

    // Act
    String actual = customPropertyAssignment.getKey();

    // Assert
    Assert.assertEquals("", actual);
    String key = customPropertyAssignment.getKey();
    String toStringResult = customPropertyAssignment.toString();
    Map<String, String> map = customPropertyAssignment.getMap();
    String value = customPropertyAssignment.getValue();
    Assert.assertEquals("", key);
    Assert.assertEquals(-1, customPropertyAssignment.getClientDatabaseId());
    Assert.assertEquals("", value);
    Assert.assertSame(hashMap, map);
    Assert.assertTrue(map instanceof HashMap);
    Assert.assertEquals("{aaaaa=aaaaa}", toStringResult);
    Assert.assertSame(hashMap, map);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
