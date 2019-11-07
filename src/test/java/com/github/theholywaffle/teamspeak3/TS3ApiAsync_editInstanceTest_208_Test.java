package com.github.theholywaffle.teamspeak3;

import com.github.theholywaffle.teamspeak3.CommandQueue;
import com.github.theholywaffle.teamspeak3.TS3ApiAsync;
import com.github.theholywaffle.teamspeak3.TS3Query;
import com.github.theholywaffle.teamspeak3.api.CommandFuture;
import com.github.theholywaffle.teamspeak3.api.ServerInstanceProperty;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class TS3ApiAsync_editInstanceTest_208_Test {
  @Test
  public void editInstanceTest() throws Exception {
    // Arrange
    TS3ApiAsync tS3ApiAsync = new TS3ApiAsync(new TS3Query(), null);
    ServerInstanceProperty property = ServerInstanceProperty.CONNECTION_BANDWIDTH_RECEIVED_LAST_MINUTE_TOTAL;
    String value = "aaaaa";

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    tS3ApiAsync.editInstance(property, value);
    Assert.assertNotNull(tS3ApiAsync.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
