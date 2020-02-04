package com.github.theholywaffle.teamspeak3.commands;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import com.github.theholywaffle.teamspeak3.api.ServerGroupType;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PermissionCommandsDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void channelGroupPermListTest() {
    // Arrange and Act
    Command actualChannelGroupPermListResult = PermissionCommands.channelGroupPermList(123);

    // Assert
    String actualName = actualChannelGroupPermListResult.getName();
    String actualToStringResult = actualChannelGroupPermListResult.toString();
    assertEquals("channelgrouppermlist", actualName);
    assertEquals("channelgrouppermlist cgid=123 -permsid", actualToStringResult);
    assertFalse(actualChannelGroupPermListResult.getFuture().isCancelled());
  }

  @Test
  public void channelGroupDelPermTest() {
    // Arrange and Act
    Command actualChannelGroupDelPermResult = PermissionCommands.channelGroupDelPerm(123, "name");

    // Assert
    String actualName = actualChannelGroupDelPermResult.getName();
    String actualToStringResult = actualChannelGroupDelPermResult.toString();
    assertEquals("channelgroupdelperm", actualName);
    assertEquals("channelgroupdelperm cgid=123 permsid=name", actualToStringResult);
    assertFalse(actualChannelGroupDelPermResult.getFuture().isCancelled());
  }

  @Test
  public void channelClientDelPermTest() {
    // Arrange and Act
    Command actualChannelClientDelPermResult = PermissionCommands.channelClientDelPerm(123, 123, "name");

    // Assert
    String actualName = actualChannelClientDelPermResult.getName();
    String actualToStringResult = actualChannelClientDelPermResult.toString();
    assertEquals("channelclientdelperm", actualName);
    assertEquals("channelclientdelperm cid=123 cldbid=123" + " permsid=name", actualToStringResult);
    assertFalse(actualChannelClientDelPermResult.getFuture().isCancelled());
  }

  @Test
  public void channelClientAddPermTest() {
    // Arrange and Act
    Command actualChannelClientAddPermResult = PermissionCommands.channelClientAddPerm(123, 123, "name", 42);

    // Assert
    String actualName = actualChannelClientAddPermResult.getName();
    String actualToStringResult = actualChannelClientAddPermResult.toString();
    assertEquals("channelclientaddperm", actualName);
    assertEquals("channelclientaddperm cid=123 cldbid=123 permsid=name" + " permvalue=42", actualToStringResult);
    assertFalse(actualChannelClientAddPermResult.getFuture().isCancelled());
  }

  @Test
  public void permGetTest() {
    // Arrange and Act
    Command actualPermGetResult = PermissionCommands.permGet("cgid", "cgid", "cgid");

    // Assert
    String actualName = actualPermGetResult.getName();
    String actualToStringResult = actualPermGetResult.toString();
    assertEquals("permget", actualName);
    assertEquals("permget permsid=cgid|permsid=cgid|permsid=cgid", actualToStringResult);
    assertFalse(actualPermGetResult.getFuture().isCancelled());
  }

  @Test
  public void channelDelPermTest() {
    // Arrange and Act
    Command actualChannelDelPermResult = PermissionCommands.channelDelPerm(123, "name");

    // Assert
    String actualName = actualChannelDelPermResult.getName();
    String actualToStringResult = actualChannelDelPermResult.toString();
    assertEquals("channeldelperm", actualName);
    assertEquals("channeldelperm cid=123 permsid=name", actualToStringResult);
    assertFalse(actualChannelDelPermResult.getFuture().isCancelled());
  }

  @Test
  public void clientDelPermTest() {
    // Arrange and Act
    Command actualClientDelPermResult = PermissionCommands.clientDelPerm(123, "name");

    // Assert
    String actualName = actualClientDelPermResult.getName();
    String actualToStringResult = actualClientDelPermResult.toString();
    assertEquals("clientdelperm", actualName);
    assertEquals("clientdelperm cldbid=123 permsid=name", actualToStringResult);
    assertFalse(actualClientDelPermResult.getFuture().isCancelled());
  }

  @Test
  public void channelAddPermTest() {
    // Arrange and Act
    Command actualChannelAddPermResult = PermissionCommands.channelAddPerm(123, "name", 42);

    // Assert
    String actualName = actualChannelAddPermResult.getName();
    String actualToStringResult = actualChannelAddPermResult.toString();
    assertEquals("channeladdperm", actualName);
    assertEquals("channeladdperm cid=123 permsid=name permvalue=42", actualToStringResult);
    assertFalse(actualChannelAddPermResult.getFuture().isCancelled());
  }

  @Test
  public void permResetTest() {
    // Arrange and Act
    Command actualPermResetResult = PermissionCommands.permReset();

    // Assert
    String actualName = actualPermResetResult.getName();
    String actualToStringResult = actualPermResetResult.toString();
    assertEquals("permreset", actualName);
    assertEquals("permreset", actualToStringResult);
    assertFalse(actualPermResetResult.getFuture().isCancelled());
  }

  @Test
  public void channelClientPermListTest() {
    // Arrange and Act
    Command actualChannelClientPermListResult = PermissionCommands.channelClientPermList(123, 123);

    // Assert
    String actualName = actualChannelClientPermListResult.getName();
    String actualToStringResult = actualChannelClientPermListResult.toString();
    assertEquals("channelclientpermlist", actualName);
    assertEquals("channelclientpermlist cid=123 cldbid=123 -permsid", actualToStringResult);
    assertFalse(actualChannelClientPermListResult.getFuture().isCancelled());
  }

  @Test
  public void clientAddPermTest() {
    // Arrange and Act
    Command actualClientAddPermResult = PermissionCommands.clientAddPerm(123, "name", 42, true);

    // Assert
    String actualName = actualClientAddPermResult.getName();
    String actualToStringResult = actualClientAddPermResult.toString();
    assertEquals("clientaddperm", actualName);
    assertEquals("clientaddperm cldbid=123 permsid=name permvalue=42" + " permskip=1", actualToStringResult);
    assertFalse(actualClientAddPermResult.getFuture().isCancelled());
  }

  @Test
  public void channelPermListTest() {
    // Arrange and Act
    Command actualChannelPermListResult = PermissionCommands.channelPermList(123);

    // Assert
    String actualName = actualChannelPermListResult.getName();
    String actualToStringResult = actualChannelPermListResult.toString();
    assertEquals("channelpermlist", actualName);
    assertEquals("channelpermlist cid=123 -permsid", actualToStringResult);
    assertFalse(actualChannelPermListResult.getFuture().isCancelled());
  }

  @Test
  public void permIdGetByNameTest2() {
    // Arrange and Act
    Command actualPermIdGetByNameResult = PermissionCommands.permIdGetByName("name");

    // Assert
    String actualName = actualPermIdGetByNameResult.getName();
    String actualToStringResult = actualPermIdGetByNameResult.toString();
    assertEquals("permidgetbyname", actualName);
    assertEquals("permidgetbyname permsid=name", actualToStringResult);
    assertFalse(actualPermIdGetByNameResult.getFuture().isCancelled());
  }

  @Test
  public void serverGroupDelPermTest() {
    // Arrange and Act
    Command actualServerGroupDelPermResult = PermissionCommands.serverGroupDelPerm(123, "name");

    // Assert
    String actualName = actualServerGroupDelPermResult.getName();
    String actualToStringResult = actualServerGroupDelPermResult.toString();
    assertEquals("servergroupdelperm", actualName);
    assertEquals("servergroupdelperm sgid=123 permsid=name", actualToStringResult);
    assertFalse(actualServerGroupDelPermResult.getFuture().isCancelled());
  }

  @Test
  public void permIdGetByNameTest() {
    // Arrange and Act
    Command actualPermIdGetByNameResult = PermissionCommands.permIdGetByName("cgid", "cgid", "cgid");

    // Assert
    String actualName = actualPermIdGetByNameResult.getName();
    String actualToStringResult = actualPermIdGetByNameResult.toString();
    assertEquals("permidgetbyname", actualName);
    assertEquals("permidgetbyname permsid=cgid|permsid=cgid" + "|permsid=cgid", actualToStringResult);
    assertFalse(actualPermIdGetByNameResult.getFuture().isCancelled());
  }

  @Test
  public void serverGroupAddPermTest() {
    // Arrange and Act
    Command actualServerGroupAddPermResult = PermissionCommands.serverGroupAddPerm(123, "name", 42, true, true);

    // Assert
    String actualName = actualServerGroupAddPermResult.getName();
    String actualToStringResult = actualServerGroupAddPermResult.toString();
    assertEquals("servergroupaddperm", actualName);
    assertEquals("servergroupaddperm sgid=123 permsid=name permvalue=42" + " permnegated=1 permskip=1",
        actualToStringResult);
    assertFalse(actualServerGroupAddPermResult.getFuture().isCancelled());
  }

  @Test
  public void channelGroupAddPermTest() {
    // Arrange and Act
    Command actualChannelGroupAddPermResult = PermissionCommands.channelGroupAddPerm(123, "name", 42);

    // Assert
    String actualName = actualChannelGroupAddPermResult.getName();
    String actualToStringResult = actualChannelGroupAddPermResult.toString();
    assertEquals("channelgroupaddperm", actualName);
    assertEquals("channelgroupaddperm cgid=123 permsid=name" + " permvalue=42", actualToStringResult);
    assertFalse(actualChannelGroupAddPermResult.getFuture().isCancelled());
  }

  @Test
  public void clientPermListTest() {
    // Arrange and Act
    Command actualClientPermListResult = PermissionCommands.clientPermList(123);

    // Assert
    String actualName = actualClientPermListResult.getName();
    String actualToStringResult = actualClientPermListResult.toString();
    assertEquals("clientpermlist", actualName);
    assertEquals("clientpermlist cldbid=123 -permsid", actualToStringResult);
    assertFalse(actualClientPermListResult.getFuture().isCancelled());
  }

  @Test
  public void serverGroupPermListTest() {
    // Arrange and Act
    Command actualServerGroupPermListResult = PermissionCommands.serverGroupPermList(123);

    // Assert
    String actualName = actualServerGroupPermListResult.getName();
    String actualToStringResult = actualServerGroupPermListResult.toString();
    assertEquals("servergrouppermlist", actualName);
    assertEquals("servergrouppermlist sgid=123 -permsid", actualToStringResult);
    assertFalse(actualServerGroupPermListResult.getFuture().isCancelled());
  }

  @Test
  public void permOverviewTest() {
    // Arrange and Act
    Command actualPermOverviewResult = PermissionCommands.permOverview(123, 123);

    // Assert
    String actualName = actualPermOverviewResult.getName();
    String actualToStringResult = actualPermOverviewResult.toString();
    assertEquals("permoverview", actualName);
    assertEquals("permoverview cid=123 cldbid=123 permid=0", actualToStringResult);
    assertFalse(actualPermOverviewResult.getFuture().isCancelled());
  }

  @Test
  public void permissionListTest() {
    // Arrange and Act
    Command actualPermissionListResult = PermissionCommands.permissionList();

    // Assert
    String actualName = actualPermissionListResult.getName();
    String actualToStringResult = actualPermissionListResult.toString();
    assertEquals("permissionlist", actualName);
    assertEquals("permissionlist", actualToStringResult);
    assertFalse(actualPermissionListResult.getFuture().isCancelled());
  }

  @Test
  public void serverGroupAutoDelPermTest() {
    // Arrange and Act
    Command actualServerGroupAutoDelPermResult = PermissionCommands
        .serverGroupAutoDelPerm(ServerGroupType.CHANNEL_GUEST, "name");

    // Assert
    String actualName = actualServerGroupAutoDelPermResult.getName();
    String actualToStringResult = actualServerGroupAutoDelPermResult.toString();
    assertEquals("servergroupautodelperm", actualName);
    assertEquals("servergroupautodelperm sgtype=10 permsid=name", actualToStringResult);
    assertFalse(actualServerGroupAutoDelPermResult.getFuture().isCancelled());
  }

  @Test
  public void serverGroupAutoAddPermTest() {
    // Arrange and Act
    Command actualServerGroupAutoAddPermResult = PermissionCommands
        .serverGroupAutoAddPerm(ServerGroupType.CHANNEL_GUEST, "name", 42, true, true);

    // Assert
    String actualName = actualServerGroupAutoAddPermResult.getName();
    String actualToStringResult = actualServerGroupAutoAddPermResult.toString();
    assertEquals("servergroupautoaddperm", actualName);
    assertEquals("servergroupautoaddperm sgtype=10 permsid=name" + " permvalue=42 permnegated=1 permskip=1",
        actualToStringResult);
    assertFalse(actualServerGroupAutoAddPermResult.getFuture().isCancelled());
  }

  @Test
  public void permFindTest2() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    PermissionCommands.permFind("");
  }

  @Test
  public void permFindTest() {
    // Arrange and Act
    Command actualPermFindResult = PermissionCommands.permFind("name");

    // Assert
    String actualName = actualPermFindResult.getName();
    String actualToStringResult = actualPermFindResult.toString();
    assertEquals("permfind", actualName);
    assertEquals("permfind permsid=name", actualToStringResult);
    assertFalse(actualPermFindResult.getFuture().isCancelled());
  }
}

