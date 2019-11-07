package com.github.theholywaffle.teamspeak3.commands;

import com.github.theholywaffle.teamspeak3.api.CommandFuture;
import com.github.theholywaffle.teamspeak3.commands.Command;
import com.github.theholywaffle.teamspeak3.commands.FileCommands;
import com.github.theholywaffle.teamspeak3.commands.response.DefaultArrayResponse;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class FileCommands_ftRenameFileTest_4_Test {
  @Test
  public void ftRenameFileTest() throws Exception {
    // Arrange
    String oldPath = "aaaaa";
    String newPath = "aaaaa";
    int oldChannelId = 1;
    String oldChannelPassword = "aaaaa";
    int newChannelId = 1;
    String newChannelPassword = "akaaa";

    // Act
    Command actual = FileCommands.ftRenameFile(oldPath, newPath, oldChannelId, oldChannelPassword, newChannelId,
        newChannelPassword);

    // Assert
    String name = actual.getName();
    String toStringResult = actual.toString();
    CommandFuture<DefaultArrayResponse> future = actual.getFuture();
    Assert.assertEquals("ftrenamefile", name);
    boolean isDoneResult = future.isDone();
    boolean isSuccessfulResult = future.isSuccessful();
    boolean hasFailedResult = future.hasFailed();
    String toStringResult1 = future.toString();
    Assert.assertEquals("ftrenamefile cid=1 cpw=aaaaa tcid=1 tcpw=akaaa oldname=\\/aaaaa newname=\\/aaaaa",
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
