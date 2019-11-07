package com.github.theholywaffle.teamspeak3.api.event;

import com.github.theholywaffle.teamspeak3.api.event.ChannelEditedEvent;
import com.github.theholywaffle.teamspeak3.api.event.TS3Listener;
import com.github.theholywaffle.teamspeak3.api.wrapper.Wrapper;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class ChannelEditedEvent_fireTest_2_Test {
  @Test
  public void fireTest() throws Exception {
    // Arrange
    HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("aaaaa", "aaaaa");
    ChannelEditedEvent channelEditedEvent = new ChannelEditedEvent(new Wrapper(hashMap));
    TS3Listener listener = Whitebox.newInstance(TS3Listener.class);

    // Act
    channelEditedEvent.fire(listener);

    // Assert
    String invokerName = channelEditedEvent.getInvokerName();
    int reasonId = channelEditedEvent.getReasonId();
    String toStringResult = channelEditedEvent.toString();
    String invokerUniqueId = channelEditedEvent.getInvokerUniqueId();
    String reasonMessage = channelEditedEvent.getReasonMessage();
    int channelId = channelEditedEvent.getChannelId();
    Assert.assertEquals("", invokerName);
    Assert.assertEquals(-1, channelEditedEvent.getInvokerId());
    Assert.assertEquals(-1, channelId);
    Assert.assertEquals("", reasonMessage);
    Assert.assertEquals("", invokerUniqueId);
    Assert.assertEquals("{aaaaa=aaaaa}", toStringResult);
    Assert.assertEquals(-1, reasonId);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
