package com.github.theholywaffle.teamspeak3.api.wrapper;

import com.github.theholywaffle.teamspeak3.api.wrapper.Binding;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Binding_getIpTest_1_Test {
  @Test
  public void getIpTest() throws Exception {
    // Arrange
    HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("aaaaa", "aaaaa");
    Binding binding = new Binding(hashMap);

    // Act
    String actual = binding.getIp();

    // Assert
    Assert.assertEquals("", actual);
    String toStringResult = binding.toString();
    Map<String, String> map = binding.getMap();
    Assert.assertEquals("{aaaaa=aaaaa}", toStringResult);
    Assert.assertEquals("", binding.getIp());
    Assert.assertSame(hashMap, map);
    Assert.assertTrue(map instanceof HashMap);
    Assert.assertSame(hashMap, map);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
