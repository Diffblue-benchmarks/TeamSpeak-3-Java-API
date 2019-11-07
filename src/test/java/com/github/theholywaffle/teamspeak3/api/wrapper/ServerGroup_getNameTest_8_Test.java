package com.github.theholywaffle.teamspeak3.api.wrapper;

import com.github.theholywaffle.teamspeak3.api.PermissionGroupDatabaseType;
import com.github.theholywaffle.teamspeak3.api.wrapper.ServerGroup;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ServerGroup_getNameTest_8_Test {
  @Test
  public void getNameTest() throws Exception {
    // Arrange
    HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("aaaaa", "aaaaa");
    ServerGroup serverGroup = new ServerGroup(hashMap);

    // Act
    String actual = serverGroup.getName();

    // Assert
    Assert.assertEquals("", actual);
    int id = serverGroup.getId();
    int memberAddPower = serverGroup.getMemberAddPower();
    String name = serverGroup.getName();
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
    Assert.assertEquals("{aaaaa=aaaaa}", toStringResult);
    Assert.assertEquals("", name);
    Assert.assertEquals(-1, memberAddPower);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
