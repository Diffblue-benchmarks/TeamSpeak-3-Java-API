package com.github.theholywaffle.teamspeak3.api.wrapper;

import com.github.theholywaffle.teamspeak3.api.wrapper.Binding;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Binding_BindingTest_2_Test {
  @Test
  public void BindingTest() throws Exception {
    // Arrange
    HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("aaaaa", "aaaaa");

    // Act
    Binding binding = new Binding(hashMap);

    // Assert
    String toStringResult = binding.toString();
    Assert.assertEquals("{aaaaa=aaaaa}", toStringResult);
    Assert.assertEquals("", binding.getIp());
    Assert.assertEquals(1, hashMap.size());
    Assert.assertEquals("aaaaa", hashMap.get("aaaaa"));
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
