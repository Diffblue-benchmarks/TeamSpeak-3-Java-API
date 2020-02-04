package com.github.theholywaffle.teamspeak3.commands;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import com.github.theholywaffle.teamspeak3.api.PermissionGroupDatabaseType;
import org.junit.Test;

public class ServerGroupCommandsDiffblueTest {
  @Test
  public void serverGroupCopyTest2() {
    // Arrange and Act
    Command actualServerGroupCopyResult = ServerGroupCommands.serverGroupCopy(123, 123,
        PermissionGroupDatabaseType.TEMPLATE);

    // Assert
    String actualName = actualServerGroupCopyResult.getName();
    String actualToStringResult = actualServerGroupCopyResult.toString();
    assertEquals("servergroupcopy", actualName);
    assertEquals("servergroupcopy ssgid=123 tsgid=123 name=name" + " type=0", actualToStringResult);
    assertFalse(actualServerGroupCopyResult.getFuture().isCancelled());
  }

  @Test
  public void serverGroupsByClientIdTest() {
    // Arrange and Act
    Command actualServerGroupsByClientIdResult = ServerGroupCommands.serverGroupsByClientId(123);

    // Assert
    String actualName = actualServerGroupsByClientIdResult.getName();
    String actualToStringResult = actualServerGroupsByClientIdResult.toString();
    assertEquals("servergroupsbyclientid", actualName);
    assertEquals("servergroupsbyclientid cldbid=123", actualToStringResult);
    assertFalse(actualServerGroupsByClientIdResult.getFuture().isCancelled());
  }

  @Test
  public void serverGroupClientListTest() {
    // Arrange and Act
    Command actualServerGroupClientListResult = ServerGroupCommands.serverGroupClientList(123);

    // Assert
    String actualName = actualServerGroupClientListResult.getName();
    String actualToStringResult = actualServerGroupClientListResult.toString();
    assertEquals("servergroupclientlist", actualName);
    assertEquals("servergroupclientlist sgid=123 -names", actualToStringResult);
    assertFalse(actualServerGroupClientListResult.getFuture().isCancelled());
  }

  @Test
  public void serverGroupRenameTest() {
    // Arrange and Act
    Command actualServerGroupRenameResult = ServerGroupCommands.serverGroupRename(1, "name");

    // Assert
    String actualName = actualServerGroupRenameResult.getName();
    String actualToStringResult = actualServerGroupRenameResult.toString();
    assertEquals("servergrouprename", actualName);
    assertEquals("servergrouprename sgid=1 name=name", actualToStringResult);
    assertFalse(actualServerGroupRenameResult.getFuture().isCancelled());
  }

  @Test
  public void serverGroupAddTest() {
    // Arrange and Act
    Command actualServerGroupAddResult = ServerGroupCommands.serverGroupAdd("name",
        PermissionGroupDatabaseType.TEMPLATE);

    // Assert
    String actualName = actualServerGroupAddResult.getName();
    String actualToStringResult = actualServerGroupAddResult.toString();
    assertEquals("servergroupadd", actualName);
    assertEquals("servergroupadd name=name type=0", actualToStringResult);
    assertFalse(actualServerGroupAddResult.getFuture().isCancelled());
  }

  @Test
  public void serverGroupDelClientTest() {
    // Arrange and Act
    Command actualServerGroupDelClientResult = ServerGroupCommands.serverGroupDelClient(123, 123);

    // Assert
    String actualName = actualServerGroupDelClientResult.getName();
    String actualToStringResult = actualServerGroupDelClientResult.toString();
    assertEquals("servergroupdelclient", actualName);
    assertEquals("servergroupdelclient sgid=123 cldbid=123", actualToStringResult);
    assertFalse(actualServerGroupDelClientResult.getFuture().isCancelled());
  }

  @Test
  public void serverGroupAddClientTest() {
    // Arrange and Act
    Command actualServerGroupAddClientResult = ServerGroupCommands.serverGroupAddClient(123, 123);

    // Assert
    String actualName = actualServerGroupAddClientResult.getName();
    String actualToStringResult = actualServerGroupAddClientResult.toString();
    assertEquals("servergroupaddclient", actualName);
    assertEquals("servergroupaddclient sgid=123 cldbid=123", actualToStringResult);
    assertFalse(actualServerGroupAddClientResult.getFuture().isCancelled());
  }

  @Test
  public void serverGroupDelTest() {
    // Arrange and Act
    Command actualServerGroupDelResult = ServerGroupCommands.serverGroupDel(1, true);

    // Assert
    String actualName = actualServerGroupDelResult.getName();
    String actualToStringResult = actualServerGroupDelResult.toString();
    assertEquals("servergroupdel", actualName);
    assertEquals("servergroupdel sgid=1 force=1", actualToStringResult);
    assertFalse(actualServerGroupDelResult.getFuture().isCancelled());
  }

  @Test
  public void serverGroupCopyTest() {
    // Arrange and Act
    Command actualServerGroupCopyResult = ServerGroupCommands.serverGroupCopy(123, "name",
        PermissionGroupDatabaseType.TEMPLATE);

    // Assert
    String actualName = actualServerGroupCopyResult.getName();
    String actualToStringResult = actualServerGroupCopyResult.toString();
    assertEquals("servergroupcopy", actualName);
    assertEquals("servergroupcopy ssgid=123 tsgid=0 name=name type=0", actualToStringResult);
    assertFalse(actualServerGroupCopyResult.getFuture().isCancelled());
  }

  @Test
  public void serverGroupListTest() {
    // Arrange and Act
    Command actualServerGroupListResult = ServerGroupCommands.serverGroupList();

    // Assert
    String actualName = actualServerGroupListResult.getName();
    String actualToStringResult = actualServerGroupListResult.toString();
    assertEquals("servergrouplist", actualName);
    assertEquals("servergrouplist", actualToStringResult);
    assertFalse(actualServerGroupListResult.getFuture().isCancelled());
  }
}

