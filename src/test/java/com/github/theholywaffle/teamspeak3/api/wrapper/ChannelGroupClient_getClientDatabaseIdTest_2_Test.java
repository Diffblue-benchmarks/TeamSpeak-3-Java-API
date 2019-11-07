package com.github.theholywaffle.teamspeak3.api.wrapper;

import com.github.theholywaffle.teamspeak3.api.wrapper.ChannelGroupClient;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ChannelGroupClient_getClientDatabaseIdTest_2_Test {
  @Test
  public void getClientDatabaseIdTest() throws Exception {
    // Arrange
    HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("aaaaa", "aaaaa");
    ChannelGroupClient channelGroupClient = new ChannelGroupClient(hashMap);

    // Act
    int actual = channelGroupClient.getClientDatabaseId();

    // Assert
    Assert.assertEquals(-1, actual);
    String toStringResult = channelGroupClient.toString();
    Map<String, String> map = channelGroupClient.getMap();
    int channelId = channelGroupClient.getChannelId();
    int channelGroupId = channelGroupClient.getChannelGroupId();
    Assert.assertEquals("{aaaaa=aaaaa}", toStringResult);
    Assert.assertEquals(-1, channelGroupClient.getClientDatabaseId());
    Assert.assertEquals(-1, channelGroupId);
    Assert.assertEquals(-1, channelId);
    Assert.assertSame(hashMap, map);
    Assert.assertTrue(map instanceof HashMap);
    Assert.assertSame(hashMap, map);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
