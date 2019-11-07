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

public class TS3ApiAsync_banClientTest_32_Test {
  @Test
  public void banClientTest() throws Exception {
    // Arrange
    TS3ApiAsync tS3ApiAsync = new TS3ApiAsync(new TS3Query(), null);
    int clientId = 1;
    long timeInSeconds = 1L;
    String reason = "aaaaa";

    // Act and Assert
    thrown.expect(NullPointerException.class);
    tS3ApiAsync.banClient(clientId, timeInSeconds, reason);
    Assert.assertNotNull(tS3ApiAsync.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
