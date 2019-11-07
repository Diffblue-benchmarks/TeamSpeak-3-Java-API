package com.github.theholywaffle.teamspeak3.api.wrapper;

import com.github.theholywaffle.teamspeak3.api.PermissionGroupDatabaseType;
import com.github.theholywaffle.teamspeak3.api.wrapper.ChannelGroup;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ChannelGroup_getSortIdTest_10_Test {
  @Test
  public void getSortIdTest() throws Exception {
    // Arrange
    HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("aaaaa", "aaaaa");
    ChannelGroup channelGroup = new ChannelGroup(hashMap);

    // Act
    int actual = channelGroup.getSortId();

    // Assert
    Assert.assertEquals(-1, actual);
    int id = channelGroup.getId();
    int memberAddPower = channelGroup.getMemberAddPower();
    String name = channelGroup.getName();
    String toStringResult = channelGroup.toString();
    int memberRemovePower = channelGroup.getMemberRemovePower();
    Map<String, String> map = channelGroup.getMap();
    int modifyPower = channelGroup.getModifyPower();
    boolean isSavedInDatabaseResult = channelGroup.isSavedInDatabase();
    PermissionGroupDatabaseType type = channelGroup.getType();
    int sortId = channelGroup.getSortId();
    long iconId = channelGroup.getIconId();
    Assert.assertEquals(-1, id);
    Assert.assertEquals(-1, channelGroup.getNameMode());
    Assert.assertEquals(-1L, iconId);
    Assert.assertEquals(-1, sortId);
    Assert.assertEquals(null, type);
    Assert.assertFalse(isSavedInDatabaseResult);
    Assert.assertEquals(-1, modifyPower);
    Assert.assertSame(hashMap, map);
    Assert.assertTrue(map instanceof HashMap);
    Assert.assertEquals(-1, memberRemovePower);
    Assert.assertSame(hashMap, map);
    Assert.assertEquals("{aaaaa=aaaaa}", toStringResult);
    Assert.assertEquals("", name);
    Assert.assertEquals(-1, memberAddPower);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
