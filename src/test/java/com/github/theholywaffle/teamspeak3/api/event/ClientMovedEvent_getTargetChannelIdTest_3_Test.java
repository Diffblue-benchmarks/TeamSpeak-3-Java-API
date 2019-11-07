package com.github.theholywaffle.teamspeak3.api.event;

import com.github.theholywaffle.teamspeak3.api.event.ClientMovedEvent;
import com.github.theholywaffle.teamspeak3.api.wrapper.Wrapper;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ClientMovedEvent_getTargetChannelIdTest_3_Test {
  @Test
  public void getTargetChannelIdTest() throws Exception {
    // Arrange
    HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("aaaaa", "aaaaa");
    ClientMovedEvent clientMovedEvent = new ClientMovedEvent(new Wrapper(hashMap));

    // Act
    int actual = clientMovedEvent.getTargetChannelId();

    // Assert
    Assert.assertEquals(-1, actual);
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
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
