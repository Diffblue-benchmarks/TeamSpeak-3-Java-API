package com.github.theholywaffle.teamspeak3.api.event;

import com.github.theholywaffle.teamspeak3.api.event.ClientLeaveEvent;
import com.github.theholywaffle.teamspeak3.api.wrapper.Wrapper;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ClientLeaveEvent_getClientTargetIdTest_5_Test {
  @Test
  public void getClientTargetIdTest() throws Exception {
    // Arrange
    HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("aaaaa", "aaaaa");
    ClientLeaveEvent clientLeaveEvent = new ClientLeaveEvent(new Wrapper(hashMap));

    // Act
    int actual = clientLeaveEvent.getClientTargetId();

    // Assert
    Assert.assertEquals(-1, actual);
    int clientId = clientLeaveEvent.getClientId();
    int clientFromId = clientLeaveEvent.getClientFromId();
    String invokerName = clientLeaveEvent.getInvokerName();
    int reasonId = clientLeaveEvent.getReasonId();
    String toStringResult = clientLeaveEvent.toString();
    String invokerUniqueId = clientLeaveEvent.getInvokerUniqueId();
    String reasonMessage = clientLeaveEvent.getReasonMessage();
    int invokerId = clientLeaveEvent.getInvokerId();
    Assert.assertEquals(-1, clientId);
    Assert.assertEquals(-1, clientLeaveEvent.getClientTargetId());
    Assert.assertEquals(-1, invokerId);
    Assert.assertEquals("", reasonMessage);
    Assert.assertEquals("", invokerUniqueId);
    Assert.assertEquals("{aaaaa=aaaaa}", toStringResult);
    Assert.assertEquals(-1, reasonId);
    Assert.assertEquals("", invokerName);
    Assert.assertEquals(-1, clientFromId);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
