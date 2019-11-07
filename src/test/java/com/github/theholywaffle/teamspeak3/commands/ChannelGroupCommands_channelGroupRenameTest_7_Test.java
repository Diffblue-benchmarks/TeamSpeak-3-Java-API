package com.github.theholywaffle.teamspeak3.commands;

import com.github.theholywaffle.teamspeak3.api.CommandFuture;
import com.github.theholywaffle.teamspeak3.commands.ChannelGroupCommands;
import com.github.theholywaffle.teamspeak3.commands.Command;
import com.github.theholywaffle.teamspeak3.commands.response.DefaultArrayResponse;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ChannelGroupCommands_channelGroupRenameTest_7_Test {
  @Test
  public void channelGroupRenameTest() throws Exception {
    // Arrange
    int groupId = 1;
    String groupName = "aaaaa";

    // Act
    Command actual = ChannelGroupCommands.channelGroupRename(groupId, groupName);

    // Assert
    String name = actual.getName();
    String toStringResult = actual.toString();
    CommandFuture<DefaultArrayResponse> future = actual.getFuture();
    Assert.assertEquals("channelgrouprename", name);
    boolean isDoneResult = future.isDone();
    boolean isSuccessfulResult = future.isSuccessful();
    boolean hasFailedResult = future.hasFailed();
    String toStringResult1 = future.toString();
    Assert.assertEquals("channelgrouprename cgid=1 name=aaaaa", toStringResult);
    Assert.assertFalse(future.isCancelled());
    Assert.assertNotNull(toStringResult1);
    Assert.assertFalse(hasFailedResult);
    Assert.assertFalse(isSuccessfulResult);
    Assert.assertFalse(isDoneResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
