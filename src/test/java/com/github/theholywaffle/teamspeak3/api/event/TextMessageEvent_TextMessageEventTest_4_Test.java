package com.github.theholywaffle.teamspeak3.api.event;

import com.github.theholywaffle.teamspeak3.api.TextMessageTargetMode;
import com.github.theholywaffle.teamspeak3.api.event.TextMessageEvent;
import com.github.theholywaffle.teamspeak3.api.wrapper.Wrapper;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TextMessageEvent_TextMessageEventTest_4_Test {
  @Test
  public void TextMessageEventTest() throws Exception {
    // Arrange
    HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("aaaaa", "aaaaa");
    Wrapper wrapper = new Wrapper(hashMap);

    // Act
    TextMessageEvent textMessageEvent = new TextMessageEvent(wrapper);

    // Assert
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
