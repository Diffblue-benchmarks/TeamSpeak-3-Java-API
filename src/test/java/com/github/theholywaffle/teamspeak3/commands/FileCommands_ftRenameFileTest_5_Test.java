package com.github.theholywaffle.teamspeak3.commands;

import com.github.theholywaffle.teamspeak3.api.CommandFuture;
import com.github.theholywaffle.teamspeak3.commands.Command;
import com.github.theholywaffle.teamspeak3.commands.FileCommands;
import com.github.theholywaffle.teamspeak3.commands.response.DefaultArrayResponse;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class FileCommands_ftRenameFileTest_5_Test {
  @Test
  public void ftRenameFileTest() throws Exception {
    // Arrange
    String oldPath = "aaaaa";
    String newPath = "aaaaa";
    int channelId = 1;
    String channelPassword = "aaaaa";

    // Act
    Command actual = FileCommands.ftRenameFile(oldPath, newPath, channelId, channelPassword);

    // Assert
    String name = actual.getName();
    CommandFuture<DefaultArrayResponse> future = actual.getFuture();
    Assert.assertEquals("ftrenamefile", name);
    boolean isDoneResult = future.isDone();
    boolean isSuccessfulResult = future.isSuccessful();
    boolean hasFailedResult = future.hasFailed();
    String toStringResult = future.toString();
    Assert.assertFalse(isDoneResult);
    Assert.assertFalse(future.isCancelled());
    Assert.assertNotNull(toStringResult);
    Assert.assertFalse(hasFailedResult);
    Assert.assertFalse(isSuccessfulResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
