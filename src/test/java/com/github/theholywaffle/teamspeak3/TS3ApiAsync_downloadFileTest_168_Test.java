package com.github.theholywaffle.teamspeak3;

import com.github.theholywaffle.teamspeak3.CommandQueue;
import com.github.theholywaffle.teamspeak3.TS3ApiAsync;
import com.github.theholywaffle.teamspeak3.TS3Query;
import com.github.theholywaffle.teamspeak3.api.CommandFuture;
import java.io.ByteArrayOutputStream;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class TS3ApiAsync_downloadFileTest_168_Test {
  @Test
  public void downloadFileTest() throws Exception {
    // Arrange
    TS3ApiAsync tS3ApiAsync = new TS3ApiAsync(new TS3Query(), null);
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    String filePath = "aaaaa";
    int channelId = 1;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    tS3ApiAsync.downloadFile(byteArrayOutputStream, filePath, channelId);
    String toStringResult = byteArrayOutputStream.toString();
    Assert.assertEquals("", toStringResult);
    Assert.assertEquals(0, byteArrayOutputStream.size());
    Assert.assertNotNull(tS3ApiAsync.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
