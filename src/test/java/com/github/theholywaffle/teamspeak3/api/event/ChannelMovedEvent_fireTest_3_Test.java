package com.github.theholywaffle.teamspeak3.api.event;

import com.github.theholywaffle.teamspeak3.api.event.ChannelMovedEvent;
import com.github.theholywaffle.teamspeak3.api.event.TS3Listener;
import com.github.theholywaffle.teamspeak3.api.wrapper.Wrapper;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class ChannelMovedEvent_fireTest_3_Test {
  @Test
  public void fireTest() throws Exception {
    // Arrange
    HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("aaaaa", "aaaaa");
    ChannelMovedEvent channelMovedEvent = new ChannelMovedEvent(new Wrapper(hashMap));
    TS3Listener listener = Whitebox.newInstance(TS3Listener.class);

    // Act
    channelMovedEvent.fire(listener);

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
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
