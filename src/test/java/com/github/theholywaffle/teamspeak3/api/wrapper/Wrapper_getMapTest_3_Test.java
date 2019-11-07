package com.github.theholywaffle.teamspeak3.api.wrapper;

import com.github.theholywaffle.teamspeak3.api.wrapper.Wrapper;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Wrapper_getMapTest_3_Test {
  @Test
  public void getMapTest() throws Exception {
    // Arrange
    HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("aaaaa", "aaaaa");
    Wrapper wrapper = new Wrapper(hashMap);

    // Act
    Map<String, String> actual = wrapper.getMap();

    // Assert
    Assert.assertSame(hashMap, actual);
    Assert.assertTrue(actual instanceof HashMap);
    Assert.assertSame(hashMap, actual);
    String toStringResult = wrapper.toString();
    Assert.assertEquals("{aaaaa=aaaaa}", toStringResult);
    Assert.assertSame(hashMap, wrapper.getMap());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
