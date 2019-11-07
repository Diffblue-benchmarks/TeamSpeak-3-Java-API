package com.github.theholywaffle.teamspeak3;

import com.github.theholywaffle.teamspeak3.CommandQueue;
import com.github.theholywaffle.teamspeak3.TS3Api;
import com.github.theholywaffle.teamspeak3.TS3ApiAsync;
import com.github.theholywaffle.teamspeak3.TS3Query;
import com.github.theholywaffle.teamspeak3.api.wrapper.FileInfo;
import java.util.List;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class TS3Api_getFileInfosTest_75_Test {
  @Test
  public void getFileInfosTest() throws Exception {
    // Arrange
    TS3Api tS3Api = new TS3Api(new TS3ApiAsync(new TS3Query(), null));
    String[] stringArray = new String[]{"aaaaa", "aaaaa", "kaaaa"};
    int channelId = 1;

    // Act and Assert
    thrown.expect(NullPointerException.class);
    tS3Api.getFileInfos(stringArray, channelId);
    Assert.assertEquals(3, stringArray.length);
    Assert.assertArrayEquals(new String[]{"aaaaa", "aaaaa", "kaaaa"}, stringArray);
    Assert.assertNotNull(tS3Api.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
