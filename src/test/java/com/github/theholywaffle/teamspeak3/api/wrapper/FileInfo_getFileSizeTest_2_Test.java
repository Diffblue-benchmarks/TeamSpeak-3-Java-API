package com.github.theholywaffle.teamspeak3.api.wrapper;

import com.github.theholywaffle.teamspeak3.api.wrapper.FileInfo;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class FileInfo_getFileSizeTest_2_Test {
//failed_pass   @Test
//  public void getFileSizeTest() throws Exception {
//    // Arrange
//    HashMap<String, String> hashMap = new HashMap<String, String>();
//    hashMap.put("aaaaa", "aaaaa");
//    FileInfo fileInfo = new FileInfo(hashMap);
//
//    // Act
//    long actual = fileInfo.getFileSize();
//
//    // Assert
//    Assert.assertEquals(-1L, actual);
//    int type = fileInfo.getType();
//    String name = fileInfo.getName();
//    String toStringResult = fileInfo.toString();
//    Map<String, String> map = fileInfo.getMap();
//    String path = fileInfo.getPath();
//    boolean isDirectoryResult = fileInfo.isDirectory();
//    int channelId = fileInfo.getChannelId();
//    String parentPath = fileInfo.getParentPath();
//    long fileSize = fileInfo.getFileSize();
//    boolean isFileResult = fileInfo.isFile();
//    Date lastModifiedDate = fileInfo.getLastModifiedDate();
//    Assert.assertEquals(1, type);
//    int year = lastModifiedDate.getYear();
//    int timezoneOffset = lastModifiedDate.getTimezoneOffset();
//    int hours = lastModifiedDate.getHours();
//    String toStringResult1 = lastModifiedDate.toString();
//    int minutes = lastModifiedDate.getMinutes();
//    long time = lastModifiedDate.getTime();
//    int seconds = lastModifiedDate.getSeconds();
//    int month = lastModifiedDate.getMonth();
//    int date = lastModifiedDate.getDate();
//    String toLocaleStringResult = lastModifiedDate.toLocaleString();
//    Assert.assertTrue(isFileResult);
//    Assert.assertEquals("", name);
//    Assert.assertSame(hashMap, map);
//    Assert.assertTrue(map instanceof HashMap);
//    Assert.assertEquals("/", parentPath);
//    Assert.assertEquals(-1L, fileSize);
//    Assert.assertSame(hashMap, map);
//    Assert.assertEquals("", path);
//    Assert.assertEquals("{aaaaa=aaaaa}", toStringResult);
//    Assert.assertFalse(isDirectoryResult);
//    Assert.assertEquals(-1, channelId);
//    Assert.assertEquals(23, hours);
//    Assert.assertEquals(0, timezoneOffset);
//    Assert.assertEquals(69, year);
//    Assert.assertEquals(31, date);
//    Assert.assertEquals(3, lastModifiedDate.getDay());
//    Assert.assertEquals(59, minutes);
//    Assert.assertEquals(-1000L, time);
//    Assert.assertEquals(11, month);
//    Assert.assertEquals("Dec 31, 1969 11:59:59 PM", toLocaleStringResult);
//    Assert.assertEquals("Wed Dec 31 23:59:59 UTC 1969", toStringResult1);
//    Assert.assertEquals(59, seconds);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
