package com.github.theholywaffle.teamspeak3.commands;

import com.github.theholywaffle.teamspeak3.api.CommandFuture;
import com.github.theholywaffle.teamspeak3.api.ReasonIdentifier;
import com.github.theholywaffle.teamspeak3.commands.ClientCommands;
import com.github.theholywaffle.teamspeak3.commands.Command;
import com.github.theholywaffle.teamspeak3.commands.response.DefaultArrayResponse;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ClientCommands_clientKickTest_13_Test {
  @Test
  public void clientKickTest() throws Exception {
    // Arrange
    ReasonIdentifier reason = ReasonIdentifier.REASON_KICK_CHANNEL;
    String reasonMessage = "aaaaa";
    int[] intArray = new int[]{1, 1, 1, 1, 1, 655361, 1, 1};

    // Act
    Command actual = ClientCommands.clientKick(reason, reasonMessage, intArray);

    // Assert
    String name = actual.getName();
    String toStringResult = actual.toString();
    CommandFuture<DefaultArrayResponse> future = actual.getFuture();
    Assert.assertEquals("clientkick", name);
    boolean isDoneResult = future.isDone();
    boolean isSuccessfulResult = future.isSuccessful();
    boolean hasFailedResult = future.hasFailed();
    String toStringResult1 = future.toString();
    Assert.assertEquals(
        "clientkick reasonid=4 reasonmsg=aaaaa clid=1|clid=1|clid=1|clid=1|clid=1|clid=655361|clid=1|clid=1",
        toStringResult);
    Assert.assertFalse(future.isCancelled());
    Assert.assertNotNull(toStringResult1);
    Assert.assertFalse(hasFailedResult);
    Assert.assertFalse(isSuccessfulResult);
    Assert.assertFalse(isDoneResult);
    Assert.assertEquals(8, intArray.length);
    Assert.assertArrayEquals(new int[]{1, 1, 1, 1, 1, 655361, 1, 1}, intArray);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
