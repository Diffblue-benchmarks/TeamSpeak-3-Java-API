package com.github.theholywaffle.teamspeak3.api.wrapper;

import com.github.theholywaffle.teamspeak3.api.Property;
import com.github.theholywaffle.teamspeak3.api.wrapper.Wrapper;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class Wrapper_getTest_1_Test {
  @Test
  public void getTest() throws Exception {
    // Arrange
    HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("aaaaa", "aaaaa");
    Wrapper wrapper = new Wrapper(hashMap);
    Property property = Whitebox.newInstance(Property.class);

    // Act
    String actual = wrapper.get(property);

    // Assert
    Assert.assertEquals("", actual);
    String toStringResult = wrapper.toString();
    Map<String, String> map = wrapper.getMap();
    Assert.assertEquals("{aaaaa=aaaaa}", toStringResult);
    Assert.assertSame(hashMap, map);
    Assert.assertTrue(map instanceof HashMap);
    Assert.assertSame(hashMap, map);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
