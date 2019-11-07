package com.github.theholywaffle.teamspeak3.api.event;

import com.github.theholywaffle.teamspeak3.api.event.ChannelDeletedEvent;
import com.github.theholywaffle.teamspeak3.api.wrapper.Wrapper;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ChannelDeletedEvent_ChannelDeletedEventTest_2_Test {
  @Test
  public void ChannelDeletedEventTest() throws Exception {
    // Arrange
    HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("aaaaa", "aaaaa");
    Wrapper wrapper = new Wrapper(hashMap);

    // Act
    ChannelDeletedEvent channelDeletedEvent = new ChannelDeletedEvent(wrapper);

    // Assert
    String invokerName = channelDeletedEvent.getInvokerName();
    int reasonId = channelDeletedEvent.getReasonId();
    String toStringResult = channelDeletedEvent.toString();
    String invokerUniqueId = channelDeletedEvent.getInvokerUniqueId();
    String reasonMessage = channelDeletedEvent.getReasonMessage();
    int channelId = channelDeletedEvent.getChannelId();
    Assert.assertEquals("", invokerName);
    Assert.assertEquals(-1, channelDeletedEvent.getInvokerId());
    Assert.assertEquals(-1, channelId);
    Assert.assertEquals("", reasonMessage);
    Assert.assertEquals("", invokerUniqueId);
    Assert.assertEquals("{aaaaa=aaaaa}", toStringResult);
    Assert.assertEquals(-1, reasonId);
    String toStringResult1 = wrapper.toString();
    Map<String, String> map = wrapper.getMap();
    Assert.assertEquals("{aaaaa=aaaaa}", toStringResult1);
    Assert.assertSame(hashMap, map);
    Assert.assertTrue(map instanceof HashMap);
    Assert.assertSame(hashMap, map);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
