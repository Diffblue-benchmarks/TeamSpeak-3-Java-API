package com.github.theholywaffle.teamspeak3.api.event;

import com.github.theholywaffle.teamspeak3.api.event.ChannelCreateEvent;
import com.github.theholywaffle.teamspeak3.api.wrapper.Wrapper;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ChannelCreateEvent_getChannelIdTest_2_Test {
  @Test
  public void getChannelIdTest() throws Exception {
    // Arrange
    HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("aaaaa", "aaaaa");
    ChannelCreateEvent channelCreateEvent = new ChannelCreateEvent(new Wrapper(hashMap));

    // Act
    int actual = channelCreateEvent.getChannelId();

    // Assert
    Assert.assertEquals(-1, actual);
    String invokerName = channelCreateEvent.getInvokerName();
    int reasonId = channelCreateEvent.getReasonId();
    String toStringResult = channelCreateEvent.toString();
    String invokerUniqueId = channelCreateEvent.getInvokerUniqueId();
    String reasonMessage = channelCreateEvent.getReasonMessage();
    int channelId = channelCreateEvent.getChannelId();
    Assert.assertEquals("", invokerName);
    Assert.assertEquals(-1, channelCreateEvent.getInvokerId());
    Assert.assertEquals(-1, channelId);
    Assert.assertEquals("", reasonMessage);
    Assert.assertEquals("", invokerUniqueId);
    Assert.assertEquals("{aaaaa=aaaaa}", toStringResult);
    Assert.assertEquals(-1, reasonId);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
