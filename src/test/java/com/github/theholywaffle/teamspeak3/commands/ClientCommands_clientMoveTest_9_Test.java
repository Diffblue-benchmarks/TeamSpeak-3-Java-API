package com.github.theholywaffle.teamspeak3.commands;

import com.github.theholywaffle.teamspeak3.api.CommandFuture;
import com.github.theholywaffle.teamspeak3.commands.ClientCommands;
import com.github.theholywaffle.teamspeak3.commands.Command;
import com.github.theholywaffle.teamspeak3.commands.response.DefaultArrayResponse;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ClientCommands_clientMoveTest_9_Test {
  @Test
  public void clientMoveTest() throws Exception {
    // Arrange
    int[] intArray = new int[]{1, 1, 1, 1, 1, 1, 1, 655361};
    int channelId = 1;
    String channelPassword = "aaaaa";

    // Act
    Command actual = ClientCommands.clientMove(intArray, channelId, channelPassword);

    // Assert
    String name = actual.getName();
    String toStringResult = actual.toString();
    CommandFuture<DefaultArrayResponse> future = actual.getFuture();
    Assert.assertEquals("clientmove", name);
    boolean isDoneResult = future.isDone();
    boolean isSuccessfulResult = future.isSuccessful();
    boolean hasFailedResult = future.hasFailed();
    String toStringResult1 = future.toString();
    Assert.assertEquals("clientmove cid=1 cpw=aaaaa clid=1|clid=1|clid=1|clid=1|clid=1|clid=1|clid=1|clid=655361",
        toStringResult);
    Assert.assertFalse(future.isCancelled());
    Assert.assertNotNull(toStringResult1);
    Assert.assertFalse(hasFailedResult);
    Assert.assertFalse(isSuccessfulResult);
    Assert.assertFalse(isDoneResult);
    Assert.assertEquals(8, intArray.length);
    Assert.assertArrayEquals(new int[]{1, 1, 1, 1, 1, 1, 1, 655361}, intArray);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
