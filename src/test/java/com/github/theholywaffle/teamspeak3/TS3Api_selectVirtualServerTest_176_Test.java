package com.github.theholywaffle.teamspeak3;

import com.github.theholywaffle.teamspeak3.CommandQueue;
import com.github.theholywaffle.teamspeak3.TS3Api;
import com.github.theholywaffle.teamspeak3.TS3ApiAsync;
import com.github.theholywaffle.teamspeak3.TS3Query;
import com.github.theholywaffle.teamspeak3.api.VirtualServerStatus;
import com.github.theholywaffle.teamspeak3.api.wrapper.VirtualServer;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class TS3Api_selectVirtualServerTest_176_Test {
  @Test
  public void selectVirtualServerTest() throws Exception {
    // Arrange
    TS3Api tS3Api = new TS3Api(new TS3ApiAsync(new TS3Query(), null));
    HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("aaaaa", "aaaak");
    VirtualServer virtualServer = new VirtualServer(hashMap);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    tS3Api.selectVirtualServer(virtualServer);
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
    Assert.assertEquals("{aaaaa=aaaak}", toStringResult);
    Assert.assertSame(hashMap, map);
    Assert.assertEquals("", name);
    Assert.assertEquals(-1, maxClients);
    Assert.assertNotNull(tS3Api.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
