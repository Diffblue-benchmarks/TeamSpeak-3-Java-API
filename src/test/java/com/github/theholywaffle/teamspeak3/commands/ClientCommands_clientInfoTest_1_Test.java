package com.github.theholywaffle.teamspeak3.commands;

import com.github.theholywaffle.teamspeak3.api.CommandFuture;
import com.github.theholywaffle.teamspeak3.commands.ClientCommands;
import com.github.theholywaffle.teamspeak3.commands.Command;
import com.github.theholywaffle.teamspeak3.commands.response.DefaultArrayResponse;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ClientCommands_clientInfoTest_1_Test {
  @Test
  public void clientInfoTest() throws Exception {
    // Arrange
    int clientId = 1;

    // Act
    Command actual = ClientCommands.clientInfo(clientId);

    // Assert
    String toStringResult = actual.toString();
    CommandFuture<DefaultArrayResponse> future = actual.getFuture();
    Assert.assertEquals("clientinfo clid=1", toStringResult);
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
