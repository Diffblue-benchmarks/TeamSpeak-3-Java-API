package com.github.theholywaffle.teamspeak3.commands;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import com.github.theholywaffle.teamspeak3.api.PermissionGroupDatabaseType;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ChannelGroupCommandsDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void channelGroupClientListTest4() {
    // Arrange and Act
    Command actualChannelGroupClientListResult = ChannelGroupCommands.channelGroupClientList(-1, 123, 123);

    // Assert
    String actualName = actualChannelGroupClientListResult.getName();
    String actualToStringResult = actualChannelGroupClientListResult.toString();
    assertEquals("channelgroupclientlist", actualName);
    assertEquals("channelgroupclientlist cldbid=123 cgid=123", actualToStringResult);
    assertFalse(actualChannelGroupClientListResult.getFuture().isCancelled());
  }
  @Test
  public void channelGroupClientListTest3() {
    // Arrange and Act
    Command actualChannelGroupClientListResult = ChannelGroupCommands.channelGroupClientList(123, 123, -1);

    // Assert
    String actualName = actualChannelGroupClientListResult.getName();
    String actualToStringResult = actualChannelGroupClientListResult.toString();
    assertEquals("channelgroupclientlist", actualName);
    assertEquals("channelgroupclientlist cid=123 cldbid=123", actualToStringResult);
    assertFalse(actualChannelGroupClientListResult.getFuture().isCancelled());
  }
  @Test
  public void channelGroupClientListTest2() {
    // Arrange and Act
    Command actualChannelGroupClientListResult = ChannelGroupCommands.channelGroupClientList(123, 123, 123);

    // Assert
    String actualName = actualChannelGroupClientListResult.getName();
    String actualToStringResult = actualChannelGroupClientListResult.toString();
    assertEquals("channelgroupclientlist", actualName);
    assertEquals("channelgroupclientlist cid=123 cldbid=123 cgid=123", actualToStringResult);
    assertFalse(actualChannelGroupClientListResult.getFuture().isCancelled());
  }
  @Test
  public void channelGroupClientListTest() {
    // Arrange and Act
    Command actualChannelGroupClientListResult = ChannelGroupCommands.channelGroupClientList(123, -1, 123);

    // Assert
    String actualName = actualChannelGroupClientListResult.getName();
    String actualToStringResult = actualChannelGroupClientListResult.toString();
    assertEquals("channelgroupclientlist", actualName);
    assertEquals("channelgroupclientlist cid=123 cgid=123", actualToStringResult);
    assertFalse(actualChannelGroupClientListResult.getFuture().isCancelled());
  }
  @Test
  public void setClientChannelGroupTest() {
    // Arrange and Act
    Command actualSetClientChannelGroupResult = ChannelGroupCommands.setClientChannelGroup(123, 123, 123);

    // Assert
    String actualName = actualSetClientChannelGroupResult.getName();
    String actualToStringResult = actualSetClientChannelGroupResult.toString();
    assertEquals("setclientchannelgroup", actualName);
    assertEquals("setclientchannelgroup cgid=123 cid=123 cldbid=123", actualToStringResult);
    assertFalse(actualSetClientChannelGroupResult.getFuture().isCancelled());
  }
  @Test
  public void channelGroupListTest() {
    // Arrange and Act
    Command actualChannelGroupListResult = ChannelGroupCommands.channelGroupList();

    // Assert
    String actualName = actualChannelGroupListResult.getName();
    String actualToStringResult = actualChannelGroupListResult.toString();
    assertEquals("channelgrouplist", actualName);
    assertEquals("channelgrouplist", actualToStringResult);
    assertFalse(actualChannelGroupListResult.getFuture().isCancelled());
  }
  @Test
  public void channelGroupCopyTest3() {
    // Arrange and Act
    Command actualChannelGroupCopyResult = ChannelGroupCommands.channelGroupCopy(123, 123,
        PermissionGroupDatabaseType.TEMPLATE);

    // Assert
    String actualName = actualChannelGroupCopyResult.getName();
    String actualToStringResult = actualChannelGroupCopyResult.toString();
    assertEquals("channelgroupcopy", actualName);
    assertEquals("channelgroupcopy scgid=123 tcgid=123 name=name" + " type=0", actualToStringResult);
    assertFalse(actualChannelGroupCopyResult.getFuture().isCancelled());
  }
  @Test
  public void channelGroupAddTest2() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    ChannelGroupCommands.channelGroupAdd("", PermissionGroupDatabaseType.TEMPLATE);
  }
  @Test
  public void channelGroupAddTest() {
    // Arrange and Act
    Command actualChannelGroupAddResult = ChannelGroupCommands.channelGroupAdd("name",
        PermissionGroupDatabaseType.TEMPLATE);

    // Assert
    String actualName = actualChannelGroupAddResult.getName();
    String actualToStringResult = actualChannelGroupAddResult.toString();
    assertEquals("channelgroupadd", actualName);
    assertEquals("channelgroupadd name=name type=0", actualToStringResult);
    assertFalse(actualChannelGroupAddResult.getFuture().isCancelled());
  }
  @Test
  public void channelGroupCopyTest2() {
    // Arrange and Act
    Command actualChannelGroupCopyResult = ChannelGroupCommands.channelGroupCopy(123, "name",
        PermissionGroupDatabaseType.TEMPLATE);

    // Assert
    String actualName = actualChannelGroupCopyResult.getName();
    String actualToStringResult = actualChannelGroupCopyResult.toString();
    assertEquals("channelgroupcopy", actualName);
    assertEquals("channelgroupcopy scgid=123 tcgid=0 name=name" + " type=0", actualToStringResult);
    assertFalse(actualChannelGroupCopyResult.getFuture().isCancelled());
  }
  @Test
  public void channelGroupCopyTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    ChannelGroupCommands.channelGroupCopy(123, "", PermissionGroupDatabaseType.TEMPLATE);
  }
  @Test
  public void channelGroupDelTest() {
    // Arrange and Act
    Command actualChannelGroupDelResult = ChannelGroupCommands.channelGroupDel(123, true);

    // Assert
    String actualName = actualChannelGroupDelResult.getName();
    String actualToStringResult = actualChannelGroupDelResult.toString();
    assertEquals("channelgroupdel", actualName);
    assertEquals("channelgroupdel cgid=123 force=1", actualToStringResult);
    assertFalse(actualChannelGroupDelResult.getFuture().isCancelled());
  }
  @Test
  public void channelGroupRenameTest2() {
    // Arrange and Act
    Command actualChannelGroupRenameResult = ChannelGroupCommands.channelGroupRename(123, "name");

    // Assert
    String actualName = actualChannelGroupRenameResult.getName();
    String actualToStringResult = actualChannelGroupRenameResult.toString();
    assertEquals("channelgrouprename", actualName);
    assertEquals("channelgrouprename cgid=123 name=name", actualToStringResult);
    assertFalse(actualChannelGroupRenameResult.getFuture().isCancelled());
  }
  @Test
  public void channelGroupRenameTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    ChannelGroupCommands.channelGroupRename(123, "");
  }
}

