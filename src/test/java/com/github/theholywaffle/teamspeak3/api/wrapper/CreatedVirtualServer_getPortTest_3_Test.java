package com.github.theholywaffle.teamspeak3.api.wrapper;

import com.github.theholywaffle.teamspeak3.api.wrapper.CreatedVirtualServer;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CreatedVirtualServer_getPortTest_3_Test {
  @Test
  public void getPortTest() throws Exception {
    // Arrange
    HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("aaaaa", "aaaaa");
    CreatedVirtualServer createdVirtualServer = new CreatedVirtualServer(hashMap);

    // Act
    int actual = createdVirtualServer.getPort();

    // Assert
    Assert.assertEquals(-1, actual);
    int id = createdVirtualServer.getId();
    String toStringResult = createdVirtualServer.toString();
    Map<String, String> map = createdVirtualServer.getMap();
    String serverAdminToken = createdVirtualServer.getServerAdminToken();
    Assert.assertEquals(-1, id);
    Assert.assertEquals(-1, createdVirtualServer.getPort());
    Assert.assertEquals("", serverAdminToken);
    Assert.assertSame(hashMap, map);
    Assert.assertTrue(map instanceof HashMap);
    Assert.assertEquals("{aaaaa=aaaaa}", toStringResult);
    Assert.assertSame(hashMap, map);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
