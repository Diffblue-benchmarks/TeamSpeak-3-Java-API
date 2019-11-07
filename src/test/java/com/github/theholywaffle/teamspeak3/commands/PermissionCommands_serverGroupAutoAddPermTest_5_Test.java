package com.github.theholywaffle.teamspeak3.commands;

import com.github.theholywaffle.teamspeak3.api.CommandFuture;
import com.github.theholywaffle.teamspeak3.api.ServerGroupType;
import com.github.theholywaffle.teamspeak3.commands.Command;
import com.github.theholywaffle.teamspeak3.commands.PermissionCommands;
import com.github.theholywaffle.teamspeak3.commands.response.DefaultArrayResponse;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PermissionCommands_serverGroupAutoAddPermTest_5_Test {
  @Test
  public void serverGroupAutoAddPermTest() throws Exception {
    // Arrange
    ServerGroupType type = ServerGroupType.CHANNEL_GUEST;
    String permName = "aaaaa";
    int permValue = 1;
    boolean negate = true;
    boolean skip = true;

    // Act
    Command actual = PermissionCommands.serverGroupAutoAddPerm(type, permName, permValue, negate, skip);

    // Assert
    String name = actual.getName();
    String toStringResult = actual.toString();
    CommandFuture<DefaultArrayResponse> future = actual.getFuture();
    Assert.assertEquals("servergroupautoaddperm", name);
    boolean isDoneResult = future.isDone();
    boolean isSuccessfulResult = future.isSuccessful();
    boolean hasFailedResult = future.hasFailed();
    String toStringResult1 = future.toString();
    Assert.assertEquals("servergroupautoaddperm sgtype=10 permsid=aaaaa permvalue=1 permnegated=1 permskip=1",
        toStringResult);
    Assert.assertFalse(future.isCancelled());
    Assert.assertNotNull(toStringResult1);
    Assert.assertFalse(hasFailedResult);
    Assert.assertFalse(isSuccessfulResult);
    Assert.assertFalse(isDoneResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
