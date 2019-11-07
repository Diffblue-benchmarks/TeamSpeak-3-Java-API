package com.github.theholywaffle.teamspeak3.api.event;

import com.github.theholywaffle.teamspeak3.api.event.ChannelMovedEvent;
import com.github.theholywaffle.teamspeak3.api.wrapper.Wrapper;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ChannelMovedEvent_ChannelMovedEventTest_4_Test {
  @Test
  public void ChannelMovedEventTest() throws Exception {
    // Arrange
    HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("aaaaa", "aaaaa");
    Wrapper wrapper = new Wrapper(hashMap);

    // Act
    ChannelMovedEvent channelMovedEvent = new ChannelMovedEvent(wrapper);

    // Assert
    String invokerName = channelMovedEvent.getInvokerName();
    int reasonId = channelMovedEvent.getReasonId();
    String toStringResult = channelMovedEvent.toString();
    String invokerUniqueId = channelMovedEvent.getInvokerUniqueId();
    String reasonMessage = channelMovedEvent.getReasonMessage();
    int channelParentId = channelMovedEvent.getChannelParentId();
    int channelOrder = channelMovedEvent.getChannelOrder();
    int channelId = channelMovedEvent.getChannelId();
    Assert.assertEquals("", invokerName);
    Assert.assertEquals(-1, channelMovedEvent.getInvokerId());
    Assert.assertEquals(-1, channelId);
    Assert.assertEquals(-1, channelOrder);
    Assert.assertEquals(-1, channelParentId);
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
