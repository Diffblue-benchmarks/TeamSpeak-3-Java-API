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

public class TS3ApiAsync_deleteIconsTest_138_Test {
  @Test
  public void deleteIconsTest() throws Exception {
    // Arrange
    TS3ApiAsync tS3ApiAsync = new TS3ApiAsync(new TS3Query(), null);
    long[] longArray = new long[]{1L, 1L, 1L, 1L, 1L, 11L, 1L, 1L};

    // Act and Assert
    thrown.expect(NullPointerException.class);
    tS3ApiAsync.deleteIcons(longArray);
    Assert.assertEquals(8, longArray.length);
    Assert.assertArrayEquals(new long[]{1L, 1L, 1L, 1L, 1L, 11L, 1L, 1L}, longArray);
    Assert.assertNotNull(tS3ApiAsync.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
