package com.github.theholywaffle.teamspeak3;

import com.github.theholywaffle.teamspeak3.CommandQueue;
import com.github.theholywaffle.teamspeak3.TS3ApiAsync;
import com.github.theholywaffle.teamspeak3.TS3Query;
import com.github.theholywaffle.teamspeak3.api.ChannelProperty;
import com.github.theholywaffle.teamspeak3.api.CommandFuture;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class TS3ApiAsync_createChannelTest_206_Test {
  @Test
  public void createChannelTest() throws Exception {
    // Arrange
    TS3ApiAsync tS3ApiAsync = new TS3ApiAsync(new TS3Query(), null);
    String name = "aaaaa";
    HashMap<ChannelProperty, String> hashMap = new HashMap<ChannelProperty, String>();
    hashMap.put(ChannelProperty.CHANNEL_CODEC, "aaaaa");

    // Act and Assert
    thrown.expect(NullPointerException.class);
    tS3ApiAsync.createChannel(name, hashMap);
    Assert.assertEquals(1, hashMap.size());
    Assert.assertEquals("aaaaa", hashMap.get(ChannelProperty.CHANNEL_CODEC));
    Assert.assertNotNull(tS3ApiAsync.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
