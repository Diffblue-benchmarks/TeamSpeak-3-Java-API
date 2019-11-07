package com.github.theholywaffle.teamspeak3;

import com.github.theholywaffle.teamspeak3.CommandQueue;
import com.github.theholywaffle.teamspeak3.TS3Api;
import com.github.theholywaffle.teamspeak3.TS3ApiAsync;
import com.github.theholywaffle.teamspeak3.TS3Query;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TS3Api_TS3ApiTest_16_Test {
  @Test
  public void TS3ApiTest() throws Exception {
    // Arrange
    TS3ApiAsync tS3ApiAsync = new TS3ApiAsync(new TS3Query(), null);

    // Act
    TS3Api tS3Api = new TS3Api(tS3ApiAsync);

    // Assert
    Assert.assertNotNull(tS3Api.toString());
    Assert.assertNotNull(tS3ApiAsync.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
