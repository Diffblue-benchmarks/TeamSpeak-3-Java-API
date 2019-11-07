package com.github.theholywaffle.teamspeak3.api.event;

import com.github.theholywaffle.teamspeak3.api.event.ChannelDescriptionEditedEvent;
import com.github.theholywaffle.teamspeak3.api.wrapper.Wrapper;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ChannelDescriptionEditedEvent_getChannelIdTest_1_Test {
  @Test
  public void getChannelIdTest() throws Exception {
    // Arrange
    HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("aaaaa", "aaaaa");
    ChannelDescriptionEditedEvent channelDescriptionEditedEvent = new ChannelDescriptionEditedEvent(
        new Wrapper(hashMap));

    // Act
    int actual = channelDescriptionEditedEvent.getChannelId();

    // Assert
    Assert.assertEquals(-1, actual);
    String invokerName = channelDescriptionEditedEvent.getInvokerName();
    int reasonId = channelDescriptionEditedEvent.getReasonId();
    String toStringResult = channelDescriptionEditedEvent.toString();
    String invokerUniqueId = channelDescriptionEditedEvent.getInvokerUniqueId();
    String reasonMessage = channelDescriptionEditedEvent.getReasonMessage();
    int channelId = channelDescriptionEditedEvent.getChannelId();
    Assert.assertEquals("", invokerName);
    Assert.assertEquals(-1, channelDescriptionEditedEvent.getInvokerId());
    Assert.assertEquals(-1, channelId);
    Assert.assertEquals("", reasonMessage);
    Assert.assertEquals("", invokerUniqueId);
    Assert.assertEquals("{aaaaa=aaaaa}", toStringResult);
    Assert.assertEquals(-1, reasonId);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
