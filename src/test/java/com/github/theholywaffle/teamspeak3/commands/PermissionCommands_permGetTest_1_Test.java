package com.github.theholywaffle.teamspeak3.commands;

import com.github.theholywaffle.teamspeak3.api.CommandFuture;
import com.github.theholywaffle.teamspeak3.commands.Command;
import com.github.theholywaffle.teamspeak3.commands.PermissionCommands;
import com.github.theholywaffle.teamspeak3.commands.response.DefaultArrayResponse;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PermissionCommands_permGetTest_1_Test {
  @Test
  public void permGetTest() throws Exception {
    // Arrange
    String[] stringArray = new String[]{"aaaaa", "aaaaa", "aaaaa"};

    // Act
    Command actual = PermissionCommands.permGet(stringArray);

    // Assert
    String name = actual.getName();
    String toStringResult = actual.toString();
    CommandFuture<DefaultArrayResponse> future = actual.getFuture();
    Assert.assertEquals("permget", name);
    boolean isDoneResult = future.isDone();
    boolean isSuccessfulResult = future.isSuccessful();
    boolean hasFailedResult = future.hasFailed();
    String toStringResult1 = future.toString();
    Assert.assertEquals("permget permsid=aaaaa|permsid=aaaaa|permsid=aaaaa", toStringResult);
    Assert.assertFalse(future.isCancelled());
    Assert.assertNotNull(toStringResult1);
    Assert.assertFalse(hasFailedResult);
    Assert.assertFalse(isSuccessfulResult);
    Assert.assertFalse(isDoneResult);
    Assert.assertEquals(3, stringArray.length);
    Assert.assertArrayEquals(new String[]{"aaaaa", "aaaaa", "aaaaa"}, stringArray);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
