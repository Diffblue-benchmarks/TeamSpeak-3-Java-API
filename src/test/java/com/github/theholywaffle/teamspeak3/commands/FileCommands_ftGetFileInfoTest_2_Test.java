package com.github.theholywaffle.teamspeak3.commands;

import com.github.theholywaffle.teamspeak3.api.CommandFuture;
import com.github.theholywaffle.teamspeak3.commands.Command;
import com.github.theholywaffle.teamspeak3.commands.FileCommands;
import com.github.theholywaffle.teamspeak3.commands.response.DefaultArrayResponse;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class FileCommands_ftGetFileInfoTest_2_Test {
  @Test
  public void ftGetFileInfoTest() throws Exception {
    // Arrange
    int channelId = 1;
    String channelPassword = "aaaaa";
    String[] stringArray = new String[]{"aaaaa", "aaaaa", "aaaka"};

    // Act
    Command actual = FileCommands.ftGetFileInfo(channelId, channelPassword, stringArray);

    // Assert
    String name = actual.getName();
    String toStringResult = actual.toString();
    CommandFuture<DefaultArrayResponse> future = actual.getFuture();
    Assert.assertEquals("ftgetfileinfo", name);
    boolean isDoneResult = future.isDone();
    boolean isSuccessfulResult = future.isSuccessful();
    boolean hasFailedResult = future.hasFailed();
    String toStringResult1 = future.toString();
    Assert.assertEquals(
        "ftgetfileinfo cid=1 cpw=aaaaa name=\\/aaaaa|cid=1 cpw=aaaaa name=\\/aaaaa|cid=1 cpw=aaaaa name=\\/aaaka",
        toStringResult);
    Assert.assertFalse(future.isCancelled());
    Assert.assertNotNull(toStringResult1);
    Assert.assertFalse(hasFailedResult);
    Assert.assertFalse(isSuccessfulResult);
    Assert.assertFalse(isDoneResult);
    Assert.assertEquals(3, stringArray.length);
    Assert.assertArrayEquals(new String[]{"aaaaa", "aaaaa", "aaaka"}, stringArray);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
