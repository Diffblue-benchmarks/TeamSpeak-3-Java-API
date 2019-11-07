package com.github.theholywaffle.teamspeak3.api.event;

import com.github.theholywaffle.teamspeak3.api.event.ClientMovedEvent;
import com.github.theholywaffle.teamspeak3.api.wrapper.Wrapper;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ClientMovedEvent_ClientMovedEventTest_1_Test {
  @Test
  public void ClientMovedEventTest() throws Exception {
    // Arrange
    HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("aaaaa", "aaaaa");
    Wrapper wrapper = new Wrapper(hashMap);

    // Act
    ClientMovedEvent clientMovedEvent = new ClientMovedEvent(wrapper);

    // Assert
    int targetChannelId = clientMovedEvent.getTargetChannelId();
    int clientId = clientMovedEvent.getClientId();
    String invokerName = clientMovedEvent.getInvokerName();
    int reasonId = clientMovedEvent.getReasonId();
    String toStringResult = clientMovedEvent.toString();
    String invokerUniqueId = clientMovedEvent.getInvokerUniqueId();
    String reasonMessage = clientMovedEvent.getReasonMessage();
    Assert.assertEquals(-1, targetChannelId);
    Assert.assertEquals(-1, clientMovedEvent.getInvokerId());
    Assert.assertEquals("", reasonMessage);
    Assert.assertEquals("", invokerUniqueId);
    Assert.assertEquals("{aaaaa=aaaaa}", toStringResult);
    Assert.assertEquals(-1, reasonId);
    Assert.assertEquals("", invokerName);
    Assert.assertEquals(-1, clientId);
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
