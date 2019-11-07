package com.github.theholywaffle.teamspeak3.api.event;

import com.github.theholywaffle.teamspeak3.api.PrivilegeKeyType;
import com.github.theholywaffle.teamspeak3.api.event.PrivilegeKeyUsedEvent;
import com.github.theholywaffle.teamspeak3.api.wrapper.Wrapper;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PrivilegeKeyUsedEvent_PrivilegeKeyUsedEventTest_7_Test {
  @Test
  public void PrivilegeKeyUsedEventTest() throws Exception {
    // Arrange
    HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("aaaaa", "aaaaa");
    Wrapper wrapper = new Wrapper(hashMap);

    // Act
    PrivilegeKeyUsedEvent privilegeKeyUsedEvent = new PrivilegeKeyUsedEvent(wrapper);

    // Assert
    int clientId = privilegeKeyUsedEvent.getClientId();
    String invokerName = privilegeKeyUsedEvent.getInvokerName();
    String toStringResult = privilegeKeyUsedEvent.toString();
    String invokerUniqueId = privilegeKeyUsedEvent.getInvokerUniqueId();
    String clientUniqueIdentifier = privilegeKeyUsedEvent.getClientUniqueIdentifier();
    String privilegeKey = privilegeKeyUsedEvent.getPrivilegeKey();
    String reasonMessage = privilegeKeyUsedEvent.getReasonMessage();
    int invokerId = privilegeKeyUsedEvent.getInvokerId();
    int reasonId = privilegeKeyUsedEvent.getReasonId();
    int privilegeKeyChannelId = privilegeKeyUsedEvent.getPrivilegeKeyChannelId();
    PrivilegeKeyType privilegeKeyType = privilegeKeyUsedEvent.getPrivilegeKeyType();
    int privilegeKeyGroupId = privilegeKeyUsedEvent.getPrivilegeKeyGroupId();
    Assert.assertEquals(-1, clientId);
    Assert.assertEquals(-1, privilegeKeyUsedEvent.getClientDatabaseId());
    Assert.assertEquals(-1, privilegeKeyGroupId);
    Assert.assertEquals(PrivilegeKeyType.CHANNEL_GROUP, privilegeKeyType);
    Assert.assertEquals(-1, privilegeKeyChannelId);
    Assert.assertEquals(-1, reasonId);
    Assert.assertEquals(-1, invokerId);
    Assert.assertEquals("", reasonMessage);
    Assert.assertEquals("", privilegeKey);
    Assert.assertEquals("", clientUniqueIdentifier);
    Assert.assertEquals("", invokerUniqueId);
    Assert.assertEquals("{aaaaa=aaaaa}", toStringResult);
    Assert.assertEquals("", invokerName);
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
