package com.github.theholywaffle.teamspeak3.commands;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class ChannelCommandsDiffblueTest {
  @Test
  public void channelInfoTest() {
    // Arrange and Act
    Command actualChannelInfoResult = ChannelCommands.channelInfo(123);

    // Assert
    String actualName = actualChannelInfoResult.getName();
    String actualToStringResult = actualChannelInfoResult.toString();
    assertEquals("channelinfo", actualName);
    assertEquals("channelinfo cid=123", actualToStringResult);
    assertFalse(actualChannelInfoResult.getFuture().isCancelled());
  }

  @Test
  public void channelMoveTest() {
    // Arrange and Act
    Command actualChannelMoveResult = ChannelCommands.channelMove(123, 123, 1);

    // Assert
    String actualName = actualChannelMoveResult.getName();
    String actualToStringResult = actualChannelMoveResult.toString();
    assertEquals("channelmove", actualName);
    assertEquals("channelmove cid=123 cpid=123 order=1", actualToStringResult);
    assertFalse(actualChannelMoveResult.getFuture().isCancelled());
  }

  @Test
  public void channelListTest() {
    // Arrange and Act
    Command actualChannelListResult = ChannelCommands.channelList();

    // Assert
    String actualName = actualChannelListResult.getName();
    String actualToStringResult = actualChannelListResult.toString();
    assertEquals("channellist", actualName);
    assertEquals("channellist -topic -flags -voice -limits -icon" + " -secondsempty", actualToStringResult);
    assertFalse(actualChannelListResult.getFuture().isCancelled());
  }

  @Test
  public void channelDeleteTest() {
    // Arrange and Act
    Command actualChannelDeleteResult = ChannelCommands.channelDelete(123, true);

    // Assert
    String actualName = actualChannelDeleteResult.getName();
    String actualToStringResult = actualChannelDeleteResult.toString();
    assertEquals("channeldelete", actualName);
    assertEquals("channeldelete cid=123 force=1", actualToStringResult);
    assertFalse(actualChannelDeleteResult.getFuture().isCancelled());
  }

  @Test
  public void channelCreateTest() {
    // Arrange and Act
    Command actualChannelCreateResult = ChannelCommands.channelCreate("name", null);

    // Assert
    String actualName = actualChannelCreateResult.getName();
    String actualToStringResult = actualChannelCreateResult.toString();
    assertEquals("channelcreate", actualName);
    assertEquals("channelcreate channel_name=name", actualToStringResult);
    assertFalse(actualChannelCreateResult.getFuture().isCancelled());
  }

  @Test
  public void channelEditTest() {
    // Arrange and Act
    Command actualChannelEditResult = ChannelCommands.channelEdit(123, null);

    // Assert
    String actualName = actualChannelEditResult.getName();
    String actualToStringResult = actualChannelEditResult.toString();
    assertEquals("channeledit", actualName);
    assertEquals("channeledit cid=123", actualToStringResult);
    assertFalse(actualChannelEditResult.getFuture().isCancelled());
  }

  @Test
  public void channelFindTest() {
    // Arrange and Act
    Command actualChannelFindResult = ChannelCommands.channelFind("foo");

    // Assert
    String actualName = actualChannelFindResult.getName();
    String actualToStringResult = actualChannelFindResult.toString();
    assertEquals("channelfind", actualName);
    assertEquals("channelfind pattern=foo", actualToStringResult);
    assertFalse(actualChannelFindResult.getFuture().isCancelled());
  }
}
