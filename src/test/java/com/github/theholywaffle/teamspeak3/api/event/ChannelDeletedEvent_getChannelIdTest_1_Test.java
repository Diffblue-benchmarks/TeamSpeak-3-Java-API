package com.github.theholywaffle.teamspeak3.api.event;

import com.github.theholywaffle.teamspeak3.api.event.ChannelDeletedEvent;
import com.github.theholywaffle.teamspeak3.api.wrapper.Wrapper;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ChannelDeletedEvent_getChannelIdTest_1_Test {
  @Test
  public void getChannelIdTest() throws Exception {
    // Arrange
    HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("aaaaa", "aaaaa");
    ChannelDeletedEvent channelDeletedEvent = new ChannelDeletedEvent(new Wrapper(hashMap));

    // Act
    int actual = channelDeletedEvent.getChannelId();

    // Assert
    Assert.assertEquals(-1, actual);
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
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
