package com.github.theholywaffle.teamspeak3.api.wrapper;

import com.github.theholywaffle.teamspeak3.api.wrapper.FileInfo;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class FileInfo_getLastModifiedDateTest_4_Test {
//failed_pass   @Test
//  public void getLastModifiedDateTest() throws Exception {
//    // Arrange
//    HashMap<String, String> hashMap = new HashMap<String, String>();
//    hashMap.put("aaaaa", "aaaaa");
//    FileInfo fileInfo = new FileInfo(hashMap);
//
//    // Act
//    Date actual = fileInfo.getLastModifiedDate();
//
//    // Assert
//    int year = actual.getYear();
//    int timezoneOffset = actual.getTimezoneOffset();
//    int hours = actual.getHours();
//    String toStringResult = actual.toString();
//    int minutes = actual.getMinutes();
//    long time = actual.getTime();
//    int seconds = actual.getSeconds();
//    int month = actual.getMonth();
//    int date = actual.getDate();
//    String toLocaleStringResult = actual.toLocaleString();
//    Assert.assertEquals(69, year);
//    Assert.assertEquals(3, actual.getDay());
//    Assert.assertEquals("Dec 31, 1969 11:59:59 PM", toLocaleStringResult);
//    Assert.assertEquals(31, date);
//    Assert.assertEquals(11, month);
//    Assert.assertEquals(59, seconds);
//    Assert.assertEquals(-1000L, time);
//    Assert.assertEquals(59, minutes);
//    Assert.assertEquals("Wed Dec 31 23:59:59 UTC 1969", toStringResult);
//    Assert.assertEquals(23, hours);
//    Assert.assertEquals(0, timezoneOffset);
//    int type = fileInfo.getType();
//    String name = fileInfo.getName();
//    String toStringResult1 = fileInfo.toString();
//    Map<String, String> map = fileInfo.getMap();
//    String path = fileInfo.getPath();
//    boolean isDirectoryResult = fileInfo.isDirectory();
//    int channelId = fileInfo.getChannelId();
//    String parentPath = fileInfo.getParentPath();
//    long fileSize = fileInfo.getFileSize();
//    boolean isFileResult = fileInfo.isFile();
//    Date lastModifiedDate = fileInfo.getLastModifiedDate();
//    Assert.assertEquals(1, type);
//    int year1 = lastModifiedDate.getYear();
//    int timezoneOffset1 = lastModifiedDate.getTimezoneOffset();
//    int hours1 = lastModifiedDate.getHours();
//    String toStringResult2 = lastModifiedDate.toString();
//    int minutes1 = lastModifiedDate.getMinutes();
//    long time1 = lastModifiedDate.getTime();
//    int seconds1 = lastModifiedDate.getSeconds();
//    int month1 = lastModifiedDate.getMonth();
//    int date1 = lastModifiedDate.getDate();
//    String toLocaleStringResult1 = lastModifiedDate.toLocaleString();
//    Assert.assertTrue(isFileResult);
//    Assert.assertEquals("", name);
//    Assert.assertSame(hashMap, map);
//    Assert.assertTrue(map instanceof HashMap);
//    Assert.assertEquals("/", parentPath);
//    Assert.assertEquals(-1L, fileSize);
//    Assert.assertSame(hashMap, map);
//    Assert.assertEquals("", path);
//    Assert.assertEquals("{aaaaa=aaaaa}", toStringResult1);
//    Assert.assertFalse(isDirectoryResult);
//    Assert.assertEquals(-1, channelId);
//    Assert.assertEquals(23, hours1);
//    Assert.assertEquals(0, timezoneOffset1);
//    Assert.assertEquals(69, year1);
//    Assert.assertEquals(31, date1);
//    Assert.assertEquals(3, lastModifiedDate.getDay());
//    Assert.assertEquals(59, minutes1);
//    Assert.assertEquals(-1000L, time1);
//    Assert.assertEquals(11, month1);
//    Assert.assertEquals("Dec 31, 1969 11:59:59 PM", toLocaleStringResult1);
//    Assert.assertEquals("Wed Dec 31 23:59:59 UTC 1969", toStringResult2);
//    Assert.assertEquals(59, seconds1);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
