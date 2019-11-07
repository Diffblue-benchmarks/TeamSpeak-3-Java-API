package com.github.theholywaffle.teamspeak3.commands;

import com.github.theholywaffle.teamspeak3.api.CommandFuture;
import com.github.theholywaffle.teamspeak3.commands.Command;
import com.github.theholywaffle.teamspeak3.commands.FileCommands;
import com.github.theholywaffle.teamspeak3.commands.response.DefaultArrayResponse;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class FileCommands_ftDeleteFileTest_7_Test {
  @Test
  public void ftDeleteFileTest() throws Exception {
    // Arrange
    int channelId = 1;
    String channelPassword = "aaaaa";
    String[] stringArray = new String[]{"aaaaa", "aaaaa", "aaaka"};

    // Act
    Command actual = FileCommands.ftDeleteFile(channelId, channelPassword, stringArray);

    // Assert
    String name = actual.getName();
    String toStringResult = actual.toString();
    CommandFuture<DefaultArrayResponse> future = actual.getFuture();
    Assert.assertEquals("ftdeletefile", name);
    boolean isDoneResult = future.isDone();
    boolean isSuccessfulResult = future.isSuccessful();
    boolean hasFailedResult = future.hasFailed();
    String toStringResult1 = future.toString();
    Assert.assertEquals("ftdeletefile cid=1 cpw=aaaaa name=\\/aaaaa|name=\\/aaaaa|name=\\/aaaka", toStringResult);
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
