package com.github.theholywaffle.teamspeak3.commands;

import com.github.theholywaffle.teamspeak3.api.CommandFuture;
import com.github.theholywaffle.teamspeak3.commands.BanCommands;
import com.github.theholywaffle.teamspeak3.commands.Command;
import com.github.theholywaffle.teamspeak3.commands.response.DefaultArrayResponse;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BanCommands_banAddTest_4_Test {
  @Test
  public void banAddTest() throws Exception {
    // Arrange
    String ip = "aaaaa";
    String name = "aaaaa";
    String uid = "aaaaa";
    String myTSId = "aaaaa";
    long timeInSeconds = 1L;
    String reason = "aaaaa";

    // Act
    Command actual = BanCommands.banAdd(ip, name, uid, myTSId, timeInSeconds, reason);

    // Assert
    String name1 = actual.getName();
    String toStringResult = actual.toString();
    CommandFuture<DefaultArrayResponse> future = actual.getFuture();
    Assert.assertEquals("banadd", name1);
    boolean isDoneResult = future.isDone();
    boolean isSuccessfulResult = future.isSuccessful();
    boolean hasFailedResult = future.hasFailed();
    String toStringResult1 = future.toString();
    Assert.assertEquals("banadd ip=aaaaa name=aaaaa uid=aaaaa mytsid=aaaaa time=1 banreason=aaaaa", toStringResult);
    Assert.assertFalse(future.isCancelled());
    Assert.assertNotNull(toStringResult1);
    Assert.assertFalse(hasFailedResult);
    Assert.assertFalse(isSuccessfulResult);
    Assert.assertFalse(isDoneResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
