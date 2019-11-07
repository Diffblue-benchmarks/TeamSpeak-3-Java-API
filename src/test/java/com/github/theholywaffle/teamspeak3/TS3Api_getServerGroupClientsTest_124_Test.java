package com.github.theholywaffle.teamspeak3;

import com.github.theholywaffle.teamspeak3.CommandQueue;
import com.github.theholywaffle.teamspeak3.TS3Api;
import com.github.theholywaffle.teamspeak3.TS3ApiAsync;
import com.github.theholywaffle.teamspeak3.TS3Query;
import com.github.theholywaffle.teamspeak3.api.PermissionGroupDatabaseType;
import com.github.theholywaffle.teamspeak3.api.wrapper.ServerGroup;
import com.github.theholywaffle.teamspeak3.api.wrapper.ServerGroupClient;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class TS3Api_getServerGroupClientsTest_124_Test {
  @Test
  public void getServerGroupClientsTest() throws Exception {
    // Arrange
    TS3Api tS3Api = new TS3Api(new TS3ApiAsync(new TS3Query(), null));
    HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("aaaaa", "aaaak");
    ServerGroup serverGroup = new ServerGroup(hashMap);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    tS3Api.getServerGroupClients(serverGroup);
    int id = serverGroup.getId();
    int memberAddPower = serverGroup.getMemberAddPower();
    String name = serverGroup.getName();
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
    Assert.assertEquals("", name);
    Assert.assertEquals(-1, memberAddPower);
    Assert.assertNotNull(tS3Api.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
