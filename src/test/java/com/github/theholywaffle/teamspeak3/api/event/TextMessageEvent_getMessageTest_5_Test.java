package com.github.theholywaffle.teamspeak3.api.event;

import com.github.theholywaffle.teamspeak3.api.TextMessageTargetMode;
import com.github.theholywaffle.teamspeak3.api.event.TextMessageEvent;
import com.github.theholywaffle.teamspeak3.api.wrapper.Wrapper;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TextMessageEvent_getMessageTest_5_Test {
  @Test
  public void getMessageTest() throws Exception {
    // Arrange
    HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("aaaaa", "aaaaa");
    TextMessageEvent textMessageEvent = new TextMessageEvent(new Wrapper(hashMap));

    // Act
    String actual = textMessageEvent.getMessage();

    // Assert
    Assert.assertEquals("", actual);
    TextMessageTargetMode targetMode = textMessageEvent.getTargetMode();
    int targetClientId = textMessageEvent.getTargetClientId();
    String invokerName = textMessageEvent.getInvokerName();
    int reasonId = textMessageEvent.getReasonId();
    String toStringResult = textMessageEvent.toString();
    String invokerUniqueId = textMessageEvent.getInvokerUniqueId();
    String message = textMessageEvent.getMessage();
    String reasonMessage = textMessageEvent.getReasonMessage();
    Assert.assertEquals(null, targetMode);
    Assert.assertEquals(-1, textMessageEvent.getInvokerId());
    Assert.assertEquals("", reasonMessage);
    Assert.assertEquals("", message);
    Assert.assertEquals("", invokerUniqueId);
    Assert.assertEquals("{aaaaa=aaaaa}", toStringResult);
    Assert.assertEquals(-1, reasonId);
    Assert.assertEquals("", invokerName);
    Assert.assertEquals(-1, targetClientId);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
