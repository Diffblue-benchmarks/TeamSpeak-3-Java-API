package com.github.theholywaffle.teamspeak3.api.wrapper;

import com.github.theholywaffle.teamspeak3.api.wrapper.Version;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Version_getVersionTest_4_Test {
  @Test
  public void getVersionTest() throws Exception {
    // Arrange
    HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("aaaaa", "aaaaa");
    Version version = new Version(hashMap);

    // Act
    String actual = version.getVersion();

    // Assert
    Assert.assertEquals("", actual);
    String toStringResult = version.toString();
    Map<String, String> map = version.getMap();
    String build = version.getBuild();
    String version1 = version.getVersion();
    Assert.assertEquals("{aaaaa=aaaaa}", toStringResult);
    Assert.assertEquals("", version.getPlatform());
    Assert.assertEquals("", version1);
    Assert.assertEquals("", build);
    Assert.assertSame(hashMap, map);
    Assert.assertTrue(map instanceof HashMap);
    Assert.assertSame(hashMap, map);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
