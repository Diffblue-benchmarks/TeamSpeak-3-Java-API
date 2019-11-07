package com.github.theholywaffle.teamspeak3.api.event;

import com.github.theholywaffle.teamspeak3.api.event.ServerEditedEvent;
import com.github.theholywaffle.teamspeak3.api.event.TS3Listener;
import com.github.theholywaffle.teamspeak3.api.wrapper.Wrapper;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class ServerEditedEvent_fireTest_1_Test {
  @Test
  public void fireTest() throws Exception {
    // Arrange
    HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("aaaaa", "aaaaa");
    ServerEditedEvent serverEditedEvent = new ServerEditedEvent(new Wrapper(hashMap));
    TS3Listener listener = Whitebox.newInstance(TS3Listener.class);

    // Act
    serverEditedEvent.fire(listener);

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
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
