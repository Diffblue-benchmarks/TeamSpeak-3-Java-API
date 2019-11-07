package com.github.theholywaffle.teamspeak3.api.wrapper;

import com.github.theholywaffle.teamspeak3.api.wrapper.ServerGroupClient;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ServerGroupClient_ServerGroupClientTest_4_Test {
  @Test
  public void ServerGroupClientTest() throws Exception {
    // Arrange
    HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("aaaaa", "aaaaa");

    // Act
    ServerGroupClient serverGroupClient = new ServerGroupClient(hashMap);

    // Assert
    String nickname = serverGroupClient.getNickname();
    String toStringResult = serverGroupClient.toString();
    Map<String, String> map = serverGroupClient.getMap();
    String uniqueIdentifier = serverGroupClient.getUniqueIdentifier();
    Assert.assertEquals("", nickname);
    Assert.assertEquals(-1, serverGroupClient.getClientDatabaseId());
    Assert.assertEquals("", uniqueIdentifier);
    Assert.assertSame(hashMap, map);
    Assert.assertTrue(map instanceof HashMap);
    Assert.assertEquals("{aaaaa=aaaaa}", toStringResult);
    Assert.assertSame(hashMap, map);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
