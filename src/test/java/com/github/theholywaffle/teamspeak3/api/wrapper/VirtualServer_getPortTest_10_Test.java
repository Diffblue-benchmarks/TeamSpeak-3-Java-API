package com.github.theholywaffle.teamspeak3.api.wrapper;

import com.github.theholywaffle.teamspeak3.api.VirtualServerStatus;
import com.github.theholywaffle.teamspeak3.api.wrapper.VirtualServer;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class VirtualServer_getPortTest_10_Test {
  @Test
  public void getPortTest() throws Exception {
    // Arrange
    HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("aaaaa", "aaaaa");
    VirtualServer virtualServer = new VirtualServer(hashMap);

    // Act
    int actual = virtualServer.getPort();

    // Assert
    Assert.assertEquals(-1, actual);
    int id = virtualServer.getId();
    int maxClients = virtualServer.getMaxClients();
    String name = virtualServer.getName();
    String toStringResult = virtualServer.toString();
    Map<String, String> map = virtualServer.getMap();
    long uptime = virtualServer.getUptime();
    boolean isAutoStartResult = virtualServer.isAutoStart();
    VirtualServerStatus status = virtualServer.getStatus();
    int queryClientsOnline = virtualServer.getQueryClientsOnline();
    String uniqueIdentifier = virtualServer.getUniqueIdentifier();
    int clientsOnline = virtualServer.getClientsOnline();
    Assert.assertEquals(-1, id);
    Assert.assertEquals(-1, virtualServer.getPort());
    Assert.assertEquals(-1, clientsOnline);
    Assert.assertEquals("", uniqueIdentifier);
    Assert.assertEquals(-1, queryClientsOnline);
    Assert.assertEquals(VirtualServerStatus.UNKNOWN, status);
    Assert.assertFalse(isAutoStartResult);
    Assert.assertEquals(-1L, uptime);
    Assert.assertSame(hashMap, map);
    Assert.assertTrue(map instanceof HashMap);
    Assert.assertEquals("{aaaaa=aaaaa}", toStringResult);
    Assert.assertSame(hashMap, map);
    Assert.assertEquals("", name);
    Assert.assertEquals(-1, maxClients);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
