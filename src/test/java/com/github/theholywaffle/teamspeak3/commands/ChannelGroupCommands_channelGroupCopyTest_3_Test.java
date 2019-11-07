package com.github.theholywaffle.teamspeak3.commands;

import com.github.theholywaffle.teamspeak3.api.CommandFuture;
import com.github.theholywaffle.teamspeak3.api.PermissionGroupDatabaseType;
import com.github.theholywaffle.teamspeak3.commands.ChannelGroupCommands;
import com.github.theholywaffle.teamspeak3.commands.Command;
import com.github.theholywaffle.teamspeak3.commands.response.DefaultArrayResponse;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ChannelGroupCommands_channelGroupCopyTest_3_Test {
  @Test
  public void channelGroupCopyTest() throws Exception {
    // Arrange
    int sourceGroupId = 1;
    String groupName = "aaaaa";
    PermissionGroupDatabaseType type = PermissionGroupDatabaseType.TEMPLATE;

    // Act
    Command actual = ChannelGroupCommands.channelGroupCopy(sourceGroupId, groupName, type);

    // Assert
    String name = actual.getName();
    String toStringResult = actual.toString();
    CommandFuture<DefaultArrayResponse> future = actual.getFuture();
    Assert.assertEquals("channelgroupcopy", name);
    boolean isDoneResult = future.isDone();
    boolean isSuccessfulResult = future.isSuccessful();
    boolean hasFailedResult = future.hasFailed();
    String toStringResult1 = future.toString();
    Assert.assertEquals("channelgroupcopy scgid=1 tcgid=0 name=aaaaa type=0", toStringResult);
    Assert.assertFalse(future.isCancelled());
    Assert.assertNotNull(toStringResult1);
    Assert.assertFalse(hasFailedResult);
    Assert.assertFalse(isSuccessfulResult);
    Assert.assertFalse(isDoneResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
