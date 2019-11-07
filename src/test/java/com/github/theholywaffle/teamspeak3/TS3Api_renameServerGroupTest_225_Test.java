package com.github.theholywaffle.teamspeak3;

import com.github.theholywaffle.teamspeak3.CommandQueue;
import com.github.theholywaffle.teamspeak3.TS3Api;
import com.github.theholywaffle.teamspeak3.TS3ApiAsync;
import com.github.theholywaffle.teamspeak3.TS3Query;
import com.github.theholywaffle.teamspeak3.api.PermissionGroupDatabaseType;
import com.github.theholywaffle.teamspeak3.api.wrapper.ServerGroup;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class TS3Api_renameServerGroupTest_225_Test {
  @Test
  public void renameServerGroupTest() throws Exception {
    // Arrange
    TS3Api tS3Api = new TS3Api(new TS3ApiAsync(new TS3Query(), null));
    HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("aaaaa", "aaaak");
    ServerGroup serverGroup = new ServerGroup(hashMap);
    String name = "aaaaa";

    // Act and Assert
    thrown.expect(NullPointerException.class);
    tS3Api.renameServerGroup(serverGroup, name);
    int id = serverGroup.getId();
    int memberAddPower = serverGroup.getMemberAddPower();
    String name1 = serverGroup.getName();
    String toStringResult = serverGroup.toString();
    int memberRemovePower = serverGroup.getMemberRemovePower();
    Map<String, String> map = serverGroup.getMap();
    int saveDb = serverGroup.getSaveDb();
    int modifyPower = serverGroup.getModifyPower();
    PermissionGroupDatabaseType type = serverGroup.getType();
    int sortId = serverGroup.getSortId();
    long iconId = serverGroup.getIconId();
    Assert.assertEquals(-1, id);
    Assert.assertEquals(-1, serverGroup.getNameMode());
    Assert.assertEquals(-1L, iconId);
    Assert.assertEquals(-1, sortId);
    Assert.assertEquals(null, type);
    Assert.assertEquals(-1, modifyPower);
    Assert.assertEquals(-1, saveDb);
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
