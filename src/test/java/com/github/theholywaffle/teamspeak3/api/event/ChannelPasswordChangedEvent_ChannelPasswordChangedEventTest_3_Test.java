package com.github.theholywaffle.teamspeak3.api.event;

import com.github.theholywaffle.teamspeak3.api.event.ChannelPasswordChangedEvent;
import com.github.theholywaffle.teamspeak3.api.wrapper.Wrapper;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ChannelPasswordChangedEvent_ChannelPasswordChangedEventTest_3_Test {
  @Test
  public void ChannelPasswordChangedEventTest() throws Exception {
    // Arrange
    HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("aaaaa", "aaaaa");
    Wrapper wrapper = new Wrapper(hashMap);

    // Act
    ChannelPasswordChangedEvent channelPasswordChangedEvent = new ChannelPasswordChangedEvent(wrapper);

    // Assert
    String invokerName = channelPasswordChangedEvent.getInvokerName();
    int reasonId = channelPasswordChangedEvent.getReasonId();
    String toStringResult = channelPasswordChangedEvent.toString();
    String invokerUniqueId = channelPasswordChangedEvent.getInvokerUniqueId();
    String reasonMessage = channelPasswordChangedEvent.getReasonMessage();
    int channelId = channelPasswordChangedEvent.getChannelId();
    Assert.assertEquals("", invokerName);
    Assert.assertEquals(-1, channelPasswordChangedEvent.getInvokerId());
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
