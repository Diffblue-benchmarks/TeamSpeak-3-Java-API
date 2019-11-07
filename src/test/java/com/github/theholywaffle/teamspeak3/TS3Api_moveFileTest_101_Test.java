package com.github.theholywaffle.teamspeak3;

import com.github.theholywaffle.teamspeak3.CommandQueue;
import com.github.theholywaffle.teamspeak3.TS3Api;
import com.github.theholywaffle.teamspeak3.TS3ApiAsync;
import com.github.theholywaffle.teamspeak3.TS3Query;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class TS3Api_moveFileTest_101_Test {
  @Test
  public void moveFileTest() throws Exception {
    // Arrange
    TS3Api tS3Api = new TS3Api(new TS3ApiAsync(new TS3Query(), null));
    String oldPath = "aaaaa";
    String newPath = "aaaaa";
    int oldChannelId = 1;
    int newChannelId = 2561;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    tS3Api.moveFile(oldPath, newPath, oldChannelId, newChannelId);
    Assert.assertNotNull(tS3Api.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
