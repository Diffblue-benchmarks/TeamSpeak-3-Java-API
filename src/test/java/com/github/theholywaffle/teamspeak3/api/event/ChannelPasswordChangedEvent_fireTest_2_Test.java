package com.github.theholywaffle.teamspeak3.api.event;

import com.github.theholywaffle.teamspeak3.api.event.ChannelPasswordChangedEvent;
import com.github.theholywaffle.teamspeak3.api.event.TS3Listener;
import com.github.theholywaffle.teamspeak3.api.wrapper.Wrapper;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class ChannelPasswordChangedEvent_fireTest_2_Test {
  @Test
  public void fireTest() throws Exception {
    // Arrange
    HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("aaaaa", "aaaaa");
    ChannelPasswordChangedEvent channelPasswordChangedEvent = new ChannelPasswordChangedEvent(new Wrapper(hashMap));
    TS3Listener listener = Whitebox.newInstance(TS3Listener.class);

    // Act
    channelPasswordChangedEvent.fire(listener);

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
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
