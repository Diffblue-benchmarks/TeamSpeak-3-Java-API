package com.github.theholywaffle.teamspeak3.api.event;

import com.github.theholywaffle.teamspeak3.api.event.ServerEditedEvent;
import com.github.theholywaffle.teamspeak3.api.wrapper.Wrapper;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ServerEditedEvent_ServerEditedEventTest_2_Test {
  @Test
  public void ServerEditedEventTest() throws Exception {
    // Arrange
    HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("aaaaa", "aaaaa");
    Wrapper wrapper = new Wrapper(hashMap);

    // Act
    ServerEditedEvent serverEditedEvent = new ServerEditedEvent(wrapper);

    // Assert
    String invokerName = serverEditedEvent.getInvokerName();
    int reasonId = serverEditedEvent.getReasonId();
    String toStringResult = serverEditedEvent.toString();
    String invokerUniqueId = serverEditedEvent.getInvokerUniqueId();
    String reasonMessage = serverEditedEvent.getReasonMessage();
    Assert.assertEquals("", invokerName);
    Assert.assertEquals(-1, serverEditedEvent.getInvokerId());
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
