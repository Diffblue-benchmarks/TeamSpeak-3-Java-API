package com.github.theholywaffle.teamspeak3.commands;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class ServerCommandsDiffblueTest {
  @Test
  public void serverProcessStopTest() {
    // Arrange and Act
    Command actualServerProcessStopResult = ServerCommands.serverProcessStop(")");

    // Assert
    String actualName = actualServerProcessStopResult.getName();
    String actualToStringResult = actualServerProcessStopResult.toString();
    assertEquals("serverprocessstop", actualName);
    assertEquals("serverprocessstop reasonmsg=)", actualToStringResult);
    assertFalse(actualServerProcessStopResult.getFuture().isCancelled());
  }

  @Test
  public void instanceInfoTest() {
    // Arrange and Act
    Command actualInstanceInfoResult = ServerCommands.instanceInfo();

    // Assert
    String actualName = actualInstanceInfoResult.getName();
    String actualToStringResult = actualInstanceInfoResult.toString();
    assertEquals("instanceinfo", actualName);
    assertEquals("instanceinfo", actualToStringResult);
    assertFalse(actualInstanceInfoResult.getFuture().isCancelled());
  }

  @Test
  public void versionTest() {
    // Arrange and Act
    Command actualVersionResult = ServerCommands.version();

    // Assert
    String actualName = actualVersionResult.getName();
    String actualToStringResult = actualVersionResult.toString();
    assertEquals("version", actualName);
    assertEquals("version", actualToStringResult);
    assertFalse(actualVersionResult.getFuture().isCancelled());
  }

  @Test
  public void instanceEditTest() {
    // Arrange and Act
    Command actualInstanceEditResult = ServerCommands.instanceEdit(null);

    // Assert
    String actualName = actualInstanceEditResult.getName();
    String actualToStringResult = actualInstanceEditResult.toString();
    assertEquals("instanceedit", actualName);
    assertEquals("instanceedit", actualToStringResult);
    assertFalse(actualInstanceEditResult.getFuture().isCancelled());
  }

  @Test
  public void gmTest() {
    // Arrange and Act
    Command actualGmResult = ServerCommands.gm(")");

    // Assert
    String actualName = actualGmResult.getName();
    String actualToStringResult = actualGmResult.toString();
    assertEquals("gm", actualName);
    assertEquals("gm msg=)", actualToStringResult);
    assertFalse(actualGmResult.getFuture().isCancelled());
  }

  @Test
  public void bindingListTest() {
    // Arrange and Act
    Command actualBindingListResult = ServerCommands.bindingList();

    // Assert
    String actualName = actualBindingListResult.getName();
    String actualToStringResult = actualBindingListResult.toString();
    assertEquals("bindinglist", actualName);
    assertEquals("bindinglist", actualToStringResult);
    assertFalse(actualBindingListResult.getFuture().isCancelled());
  }

  @Test
  public void logViewTest() {
    // Arrange and Act
    Command actualLogViewResult = ServerCommands.logView(1, true);

    // Assert
    String actualName = actualLogViewResult.getName();
    String actualToStringResult = actualLogViewResult.toString();
    assertEquals("logview", actualName);
    assertEquals("logview lines=1 instance=1", actualToStringResult);
    assertFalse(actualLogViewResult.getFuture().isCancelled());
  }
}

