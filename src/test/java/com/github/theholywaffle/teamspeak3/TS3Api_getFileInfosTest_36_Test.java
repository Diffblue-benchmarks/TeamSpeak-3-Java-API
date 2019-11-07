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

public class TS3Api_getFileInfosTest_36_Test {
  @Test
  public void getFileInfosTest() throws Exception {
    // Arrange
    TS3Api tS3Api = new TS3Api(new TS3ApiAsync(new TS3Query(), null));
    String string = "aaaaa";
    String string1 = "aaaaa";
    String string2 = "kaaaa";
    String[] stringArray = new String[]{string, string1, string2};
    int[] intArray = new int[]{1, 1, 1, 1, 1, 1, 2561, 1};
    String[] stringArray1 = new String[]{string, string1, string2};

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    tS3Api.getFileInfos(stringArray, intArray, stringArray1);
    Assert.assertEquals(3, stringArray.length);
    Assert.assertArrayEquals(new String[]{"aaaaa", "aaaaa", "kaaaa"}, stringArray);
    Assert.assertEquals(8, intArray.length);
    Assert.assertArrayEquals(new int[]{1, 1, 1, 1, 1, 1, 2561, 1}, intArray);
    Assert.assertEquals(3, stringArray1.length);
    Assert.assertArrayEquals(new String[]{"aaaaa", "aaaaa", "kaaaa"}, stringArray1);
    Assert.assertNotNull(tS3Api.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
