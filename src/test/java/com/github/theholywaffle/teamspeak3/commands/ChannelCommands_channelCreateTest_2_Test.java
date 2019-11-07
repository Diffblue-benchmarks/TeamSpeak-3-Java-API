package com.github.theholywaffle.teamspeak3.commands;

import com.github.theholywaffle.teamspeak3.api.ChannelProperty;
import com.github.theholywaffle.teamspeak3.api.CommandFuture;
import com.github.theholywaffle.teamspeak3.commands.ChannelCommands;
import com.github.theholywaffle.teamspeak3.commands.Command;
import com.github.theholywaffle.teamspeak3.commands.response.DefaultArrayResponse;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ChannelCommands_channelCreateTest_2_Test {
  @Test
  public void channelCreateTest() throws Exception {
    // Arrange
    String name = "aaaaa";
    HashMap<ChannelProperty, String> hashMap = new HashMap<ChannelProperty, String>();
    hashMap.put(ChannelProperty.CHANNEL_CODEC, "aaaaa");

    // Act
    Command actual = ChannelCommands.channelCreate(name, hashMap);

    // Assert
    String name1 = actual.getName();
    String toStringResult = actual.toString();
    CommandFuture<DefaultArrayResponse> future = actual.getFuture();
    Assert.assertEquals("channelcreate", name1);
    boolean isDoneResult = future.isDone();
    boolean isSuccessfulResult = future.isSuccessful();
    boolean hasFailedResult = future.hasFailed();
    String toStringResult1 = future.toString();
    Assert.assertEquals("channelcreate channel_name=aaaaa channel_codec=aaaaa", toStringResult);
    Assert.assertFalse(future.isCancelled());
    Assert.assertNotNull(toStringResult1);
    Assert.assertFalse(hasFailedResult);
    Assert.assertFalse(isSuccessfulResult);
    Assert.assertFalse(isDoneResult);
    Assert.assertEquals(1, hashMap.size());
    Assert.assertEquals("aaaaa", hashMap.get(ChannelProperty.CHANNEL_CODEC));
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
