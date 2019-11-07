package com.github.theholywaffle.teamspeak3;

import com.github.theholywaffle.teamspeak3.CommandQueue;
import com.github.theholywaffle.teamspeak3.TS3Api;
import com.github.theholywaffle.teamspeak3.TS3ApiAsync;
import com.github.theholywaffle.teamspeak3.TS3Query;
import com.github.theholywaffle.teamspeak3.api.PermissionGroupDatabaseType;
import com.github.theholywaffle.teamspeak3.api.wrapper.ChannelGroup;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class TS3Api_renameChannelGroupTest_10_Test {
  @Test
  public void renameChannelGroupTest() throws Exception {
    // Arrange
    TS3Api tS3Api = new TS3Api(new TS3ApiAsync(new TS3Query(), null));
    HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("aaaaa", "aaaak");
    ChannelGroup channelGroup = new ChannelGroup(hashMap);
    String name = "aaaaa";

    // Act and Assert
    thrown.expect(NullPointerException.class);
    tS3Api.renameChannelGroup(channelGroup, name);
    int id = channelGroup.getId();
    int memberAddPower = channelGroup.getMemberAddPower();
    String name1 = channelGroup.getName();
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
    Assert.assertEquals("{aaaaa=aaaak}", toStringResult);
    Assert.assertEquals("", name1);
    Assert.assertEquals(-1, memberAddPower);
    Assert.assertNotNull(tS3Api.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
