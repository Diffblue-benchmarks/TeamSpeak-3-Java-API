package com.github.theholywaffle.teamspeak3.commands;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class VirtualServerCommandsDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void serverListTest() {
    // Arrange and Act
    Command actualServerListResult = VirtualServerCommands.serverList();

    // Assert
    String actualName = actualServerListResult.getName();
    String actualToStringResult = actualServerListResult.toString();
    assertEquals("serverlist", actualName);
    assertEquals("serverlist -uid -all", actualToStringResult);
    assertFalse(actualServerListResult.getFuture().isCancelled());
  }

  @Test
  public void serverCreateTest2() {
    // Arrange and Act
    Command actualServerCreateResult = VirtualServerCommands.serverCreate("name", null);

    // Assert
    String actualName = actualServerCreateResult.getName();
    String actualToStringResult = actualServerCreateResult.toString();
    assertEquals("servercreate", actualName);
    assertEquals("servercreate virtualserver_name=name", actualToStringResult);
    assertFalse(actualServerCreateResult.getFuture().isCancelled());
  }

  @Test
  public void serverCreateTest() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    VirtualServerCommands.serverCreate("", null);
  }

  @Test
  public void serverSnapshotDeployTest2() {
    // Arrange, Act and Assert
    thrown.expect(IllegalArgumentException.class);
    VirtualServerCommands.serverSnapshotDeploy("");
  }

  @Test
  public void serverSnapshotDeployTest() {
    // Arrange and Act
    Command actualServerSnapshotDeployResult = VirtualServerCommands.serverSnapshotDeploy("all");

    // Assert
    String actualName = actualServerSnapshotDeployResult.getName();
    String actualToStringResult = actualServerSnapshotDeployResult.toString();
    assertEquals("serversnapshotdeploy", actualName);
    assertEquals("serversnapshotdeploy all", actualToStringResult);
    assertFalse(actualServerSnapshotDeployResult.getFuture().isCancelled());
  }

  @Test
  public void serverRequestConnectionInfoTest() {
    // Arrange and Act
    Command actualServerRequestConnectionInfoResult = VirtualServerCommands.serverRequestConnectionInfo();

    // Assert
    String actualName = actualServerRequestConnectionInfoResult.getName();
    String actualToStringResult = actualServerRequestConnectionInfoResult.toString();
    assertEquals("serverrequestconnectioninfo", actualName);
    assertEquals("serverrequestconnectioninfo", actualToStringResult);
    assertFalse(actualServerRequestConnectionInfoResult.getFuture().isCancelled());
  }

  @Test
  public void serverEditTest() {
    // Arrange and Act
    Command actualServerEditResult = VirtualServerCommands.serverEdit(null);

    // Assert
    String actualName = actualServerEditResult.getName();
    String actualToStringResult = actualServerEditResult.toString();
    assertEquals("serveredit", actualName);
    assertEquals("serveredit", actualToStringResult);
    assertFalse(actualServerEditResult.getFuture().isCancelled());
  }

  @Test
  public void serverDeleteTest() {
    // Arrange and Act
    Command actualServerDeleteResult = VirtualServerCommands.serverDelete(1);

    // Assert
    String actualName = actualServerDeleteResult.getName();
    String actualToStringResult = actualServerDeleteResult.toString();
    assertEquals("serverdelete", actualName);
    assertEquals("serverdelete sid=1", actualToStringResult);
    assertFalse(actualServerDeleteResult.getFuture().isCancelled());
  }

  @Test
  public void serverStartTest() {
    // Arrange and Act
    Command actualServerStartResult = VirtualServerCommands.serverStart(1);

    // Assert
    String actualName = actualServerStartResult.getName();
    String actualToStringResult = actualServerStartResult.toString();
    assertEquals("serverstart", actualName);
    assertEquals("serverstart sid=1", actualToStringResult);
    assertFalse(actualServerStartResult.getFuture().isCancelled());
  }

  @Test
  public void serverSnapshotCreateTest() {
    // Arrange and Act
    Command actualServerSnapshotCreateResult = VirtualServerCommands.serverSnapshotCreate();

    // Assert
    String actualName = actualServerSnapshotCreateResult.getName();
    String actualToStringResult = actualServerSnapshotCreateResult.toString();
    assertEquals("serversnapshotcreate", actualName);
    assertEquals("serversnapshotcreate", actualToStringResult);
    assertFalse(actualServerSnapshotCreateResult.getFuture().isCancelled());
  }

  @Test
  public void serverStopTest() {
    // Arrange and Act
    Command actualServerStopResult = VirtualServerCommands.serverStop(1, "because");

    // Assert
    String actualName = actualServerStopResult.getName();
    String actualToStringResult = actualServerStopResult.toString();
    assertEquals("serverstop", actualName);
    assertEquals("serverstop sid=1 reasonmsg=because", actualToStringResult);
    assertFalse(actualServerStopResult.getFuture().isCancelled());
  }

  @Test
  public void serverInfoTest() {
    // Arrange and Act
    Command actualServerInfoResult = VirtualServerCommands.serverInfo();

    // Assert
    String actualName = actualServerInfoResult.getName();
    String actualToStringResult = actualServerInfoResult.toString();
    assertEquals("serverinfo", actualName);
    assertEquals("serverinfo", actualToStringResult);
    assertFalse(actualServerInfoResult.getFuture().isCancelled());
  }

  @Test
  public void serverIdGetByPortTest() {
    // Arrange and Act
    Command actualServerIdGetByPortResult = VirtualServerCommands.serverIdGetByPort(8080);

    // Assert
    String actualName = actualServerIdGetByPortResult.getName();
    String actualToStringResult = actualServerIdGetByPortResult.toString();
    assertEquals("serveridgetbyport", actualName);
    assertEquals("serveridgetbyport virtualserver_port=8080", actualToStringResult);
    assertFalse(actualServerIdGetByPortResult.getFuture().isCancelled());
  }
}

