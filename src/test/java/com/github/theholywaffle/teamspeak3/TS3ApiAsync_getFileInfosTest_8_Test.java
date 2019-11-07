package com.github.theholywaffle.teamspeak3;

import com.github.theholywaffle.teamspeak3.CommandQueue;
import com.github.theholywaffle.teamspeak3.TS3ApiAsync;
import com.github.theholywaffle.teamspeak3.TS3Query;
import com.github.theholywaffle.teamspeak3.api.CommandFuture;
import com.github.theholywaffle.teamspeak3.api.wrapper.FileInfo;
import java.util.List;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class TS3ApiAsync_getFileInfosTest_8_Test {
  @Test
  public void getFileInfosTest() throws Exception {
    // Arrange
    TS3ApiAsync tS3ApiAsync = new TS3ApiAsync(new TS3Query(), null);
    String string = "aaaaa";
    String string1 = "aaaaa";
    String string2 = "aaaak";
    String[] stringArray = new String[]{string, string1, string2};
    int[] intArray = new int[]{1, 1, 1, 1, 1, 1, 1, 2561};
    String[] stringArray1 = new String[]{string, string1, string2};

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    tS3ApiAsync.getFileInfos(stringArray, intArray, stringArray1);
    Assert.assertEquals(3, stringArray.length);
    Assert.assertArrayEquals(new String[]{"aaaaa", "aaaaa", "aaaak"}, stringArray);
    Assert.assertEquals(8, intArray.length);
    Assert.assertArrayEquals(new int[]{1, 1, 1, 1, 1, 1, 1, 2561}, intArray);
    Assert.assertEquals(3, stringArray1.length);
    Assert.assertArrayEquals(new String[]{"aaaaa", "aaaaa", "aaaak"}, stringArray1);
    Assert.assertNotNull(tS3ApiAsync.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
