package com.github.theholywaffle.teamspeak3.api.wrapper;

import com.github.theholywaffle.teamspeak3.api.VirtualServerStatus;
import com.github.theholywaffle.teamspeak3.api.wrapper.ServerQueryInfo;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ServerQueryInfo_getVirtualServerPortTest_10_Test {
  @Test
  public void getVirtualServerPortTest() throws Exception {
    // Arrange
    HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("aaaaa", "aaaaa");
    ServerQueryInfo serverQueryInfo = new ServerQueryInfo(hashMap);

    // Act
    int actual = serverQueryInfo.getVirtualServerPort();

    // Assert
    Assert.assertEquals(-1, actual);
    int virtualServerId = serverQueryInfo.getVirtualServerId();
    String loginName = serverQueryInfo.getLoginName();
    String toStringResult = serverQueryInfo.toString();
    int originServerId = serverQueryInfo.getOriginServerId();
    int virtualServerPort = serverQueryInfo.getVirtualServerPort();
    int channelId = serverQueryInfo.getChannelId();
    int id = serverQueryInfo.getId();
    VirtualServerStatus virtualServerStatus = serverQueryInfo.getVirtualServerStatus();
    String nickname = serverQueryInfo.getNickname();
    Map<String, String> map = serverQueryInfo.getMap();
    String virtualServerUniqueIdentifier = serverQueryInfo.getVirtualServerUniqueIdentifier();
    String uniqueIdentifier = serverQueryInfo.getUniqueIdentifier();
    Assert.assertEquals(-1, virtualServerId);
    Assert.assertEquals(-1, serverQueryInfo.getDatabaseId());
    Assert.assertEquals("", uniqueIdentifier);
    Assert.assertEquals("", virtualServerUniqueIdentifier);
    Assert.assertSame(hashMap, map);
    Assert.assertTrue(map instanceof HashMap);
    Assert.assertEquals("", nickname);
    Assert.assertSame(hashMap, map);
    Assert.assertEquals(VirtualServerStatus.UNKNOWN, virtualServerStatus);
    Assert.assertEquals(-1, id);
    Assert.assertEquals(-1, channelId);
    Assert.assertEquals(-1, virtualServerPort);
    Assert.assertEquals(-1, originServerId);
    Assert.assertEquals("{aaaaa=aaaaa}", toStringResult);
    Assert.assertEquals("", loginName);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
