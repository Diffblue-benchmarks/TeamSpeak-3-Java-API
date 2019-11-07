package com.github.theholywaffle.teamspeak3;

import com.github.theholywaffle.teamspeak3.CommandQueue;
import com.github.theholywaffle.teamspeak3.TS3ApiAsync;
import com.github.theholywaffle.teamspeak3.TS3Query;
import com.github.theholywaffle.teamspeak3.api.CommandFuture;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class TS3ApiAsync_kickClientFromChannelTest_129_Test {
  @Test
  public void kickClientFromChannelTest() throws Exception {
    // Arrange
    TS3ApiAsync tS3ApiAsync = new TS3ApiAsync(new TS3Query(), null);
    int[] intArray = new int[]{1, 1, 1, 1, 1, 11, 1, 1};

    // Act and Assert
    thrown.expect(NullPointerException.class);
    tS3ApiAsync.kickClientFromChannel(intArray);
    Assert.assertEquals(8, intArray.length);
    Assert.assertArrayEquals(new int[]{1, 1, 1, 1, 1, 11, 1, 1}, intArray);
    Assert.assertNotNull(tS3ApiAsync.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
