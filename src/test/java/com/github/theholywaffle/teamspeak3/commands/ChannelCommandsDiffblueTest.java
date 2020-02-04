package com.github.theholywaffle.teamspeak3.commands;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class ChannelCommandsDiffblueTest {
  @Test
  public void channelInfoTest() {
    // Arrange and Act
    Command actualChannelInfoResult = ChannelCommands.channelInfo(1);

    // Assert
    String actualName = actualChannelInfoResult.getName();
    String actualToStringResult = actualChannelInfoResult.toString();
    assertEquals("channelinfo", actualName);
    assertEquals("channelinfo cid=1", actualToStringResult);
    assertFalse(actualChannelInfoResult.getFuture().isCancelled());
  }

  @Test
  public void channelMoveTest() {
    // Arrange and Act
    Command actualChannelMoveResult = ChannelCommands.channelMove(1, 1, 1);

    // Assert
    String actualName = actualChannelMoveResult.getName();
    String actualToStringResult = actualChannelMoveResult.toString();
    assertEquals("channelmove", actualName);
    assertEquals("channelmove cid=1 cpid=1 order=1", actualToStringResult);
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
    Command actualChannelDeleteResult = ChannelCommands.channelDelete(1, true);

    // Assert
    String actualName = actualChannelDeleteResult.getName();
    String actualToStringResult = actualChannelDeleteResult.toString();
    assertEquals("channeldelete", actualName);
    assertEquals("channeldelete cid=1 force=1", actualToStringResult);
    assertFalse(actualChannelDeleteResult.getFuture().isCancelled());
  }

  @Test
  public void channelCreateTest() {
    // Arrange and Act
    Command actualChannelCreateResult = ChannelCommands.channelCreate("channel_name", null);

    // Assert
    String actualName = actualChannelCreateResult.getName();
    String actualToStringResult = actualChannelCreateResult.toString();
    assertEquals("channelcreate", actualName);
    assertEquals("channelcreate channel_name=channel_name", actualToStringResult);
    assertFalse(actualChannelCreateResult.getFuture().isCancelled());
  }

  @Test
  public void channelEditTest() {
    // Arrange and Act
    Command actualChannelEditResult = ChannelCommands.channelEdit(1, null);

    // Assert
    String actualName = actualChannelEditResult.getName();
    String actualToStringResult = actualChannelEditResult.toString();
    assertEquals("channeledit", actualName);
    assertEquals("channeledit cid=1", actualToStringResult);
    assertFalse(actualChannelEditResult.getFuture().isCancelled());
  }

  @Test
  public void channelFindTest() {
    // Arrange and Act
    Command actualChannelFindResult = ChannelCommands.channelFind("channel_name");

    // Assert
    String actualName = actualChannelFindResult.getName();
    String actualToStringResult = actualChannelFindResult.toString();
    assertEquals("channelfind", actualName);
    assertEquals("channelfind pattern=channel_name", actualToStringResult);
    assertFalse(actualChannelFindResult.getFuture().isCancelled());
  }
}

