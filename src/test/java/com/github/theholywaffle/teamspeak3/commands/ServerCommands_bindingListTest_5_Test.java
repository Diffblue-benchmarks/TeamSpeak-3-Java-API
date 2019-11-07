package com.github.theholywaffle.teamspeak3.commands;

import com.github.theholywaffle.teamspeak3.api.CommandFuture;
import com.github.theholywaffle.teamspeak3.commands.Command;
import com.github.theholywaffle.teamspeak3.commands.ServerCommands;
import com.github.theholywaffle.teamspeak3.commands.response.DefaultArrayResponse;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ServerCommands_bindingListTest_5_Test {
  @Test
  public void bindingListTest() throws Exception {
    // Arrange and Act
    Command actual = ServerCommands.bindingList();

    // Assert
    String toStringResult = actual.toString();
    CommandFuture<DefaultArrayResponse> future = actual.getFuture();
    Assert.assertEquals("bindinglist", toStringResult);
    boolean isDoneResult = future.isDone();
    boolean isSuccessfulResult = future.isSuccessful();
    boolean hasFailedResult = future.hasFailed();
    String toStringResult1 = future.toString();
    Assert.assertFalse(isDoneResult);
    Assert.assertFalse(future.isCancelled());
    Assert.assertNotNull(toStringResult1);
    Assert.assertFalse(hasFailedResult);
    Assert.assertFalse(isSuccessfulResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
