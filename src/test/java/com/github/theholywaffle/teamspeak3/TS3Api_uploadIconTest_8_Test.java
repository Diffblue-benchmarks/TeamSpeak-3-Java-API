package com.github.theholywaffle.teamspeak3;

import com.github.theholywaffle.teamspeak3.CommandQueue;
import com.github.theholywaffle.teamspeak3.TS3Api;
import com.github.theholywaffle.teamspeak3.TS3ApiAsync;
import com.github.theholywaffle.teamspeak3.TS3Query;
import java.io.ByteArrayInputStream;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class TS3Api_uploadIconTest_8_Test {
  @Test
  public void uploadIconTest() throws Exception {
    // Arrange
    TS3Api tS3Api = new TS3Api(new TS3ApiAsync(new TS3Query(), null));
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(
        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    long dataLength = 1L;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    tS3Api.uploadIcon(byteArrayInputStream, dataLength);
    int availableResult = byteArrayInputStream.available();
    Assert.assertEquals(23, availableResult);
    Assert.assertNotNull(byteArrayInputStream.toString());
    Assert.assertNotNull(tS3Api.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
