package com.github.theholywaffle.teamspeak3.api.wrapper;

import com.github.theholywaffle.teamspeak3.api.wrapper.HostInfo;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class HostInfo_getTimeStampTest_16_Test {
//failed_pass   @Test
//  public void getTimeStampTest() throws Exception {
//    // Arrange
//    HashMap<String, String> hashMap = new HashMap<String, String>();
//    hashMap.put("aaaaa", "aaaaa");
//    HostInfo hostInfo = new HostInfo(hashMap);
//
//    // Act
//    Date actual = hostInfo.getTimeStamp();
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
//    long bytesSentTotal = hostInfo.getBytesSentTotal();
//    long packetsSentTotal = hostInfo.getPacketsSentTotal();
//    long bandwidthSentLastSecond = hostInfo.getBandwidthSentLastSecond();
//    long bandwidthReceivedLastSecond = hostInfo.getBandwidthReceivedLastSecond();
//    String toStringResult1 = hostInfo.toString();
//    long packetsReceivedTotal = hostInfo.getPacketsReceivedTotal();
//    int totalClientsOnline = hostInfo.getTotalClientsOnline();
//    long fileTransferBandwidthReceived = hostInfo.getFileTransferBandwidthReceived();
//    int totalMaxClients = hostInfo.getTotalMaxClients();
//    long bytesReceivedTotal = hostInfo.getBytesReceivedTotal();
//    long fileTransferBytesSent = hostInfo.getFileTransferBytesSent();
//    Date timeStamp = hostInfo.getTimeStamp();
//    Map<String, String> map = hostInfo.getMap();
//    long uptime = hostInfo.getUptime();
//    int totalRunningServers = hostInfo.getTotalRunningServers();
//    long bandwidthSentLastMinute = hostInfo.getBandwidthSentLastMinute();
//    int totalChannels = hostInfo.getTotalChannels();
//    long bandwidthReceivedLastMinute = hostInfo.getBandwidthReceivedLastMinute();
//    long fileTransferBandwidthSent = hostInfo.getFileTransferBandwidthSent();
//    Assert.assertEquals(-1L, bytesSentTotal);
//    Assert.assertEquals(-1L, hostInfo.getFileTransferBytesReceived());
//    Assert.assertEquals(-1L, fileTransferBandwidthSent);
//    Assert.assertEquals(-1L, bandwidthReceivedLastMinute);
//    Assert.assertEquals(-1, totalChannels);
//    Assert.assertEquals(-1L, bandwidthSentLastMinute);
//    Assert.assertEquals(-1, totalRunningServers);
//    Assert.assertEquals(-1L, uptime);
//    Assert.assertSame(hashMap, map);
//    Assert.assertTrue(map instanceof HashMap);
//    int year1 = timeStamp.getYear();
//    int timezoneOffset1 = timeStamp.getTimezoneOffset();
//    int hours1 = timeStamp.getHours();
//    String toStringResult2 = timeStamp.toString();
//    int minutes1 = timeStamp.getMinutes();
//    long time1 = timeStamp.getTime();
//    int seconds1 = timeStamp.getSeconds();
//    int month1 = timeStamp.getMonth();
//    int date1 = timeStamp.getDate();
//    String toLocaleStringResult1 = timeStamp.toLocaleString();
//    Assert.assertSame(hashMap, map);
//    Assert.assertEquals(-1L, packetsSentTotal);
//    Assert.assertEquals(-1L, bandwidthReceivedLastSecond);
//    Assert.assertEquals(-1L, fileTransferBandwidthReceived);
//    Assert.assertEquals(-1, totalMaxClients);
//    Assert.assertEquals("{aaaaa=aaaaa}", toStringResult1);
//    Assert.assertEquals(-1L, bytesReceivedTotal);
//    Assert.assertEquals(-1L, fileTransferBytesSent);
//    Assert.assertEquals(-1L, bandwidthSentLastSecond);
//    Assert.assertEquals(-1L, packetsReceivedTotal);
//    Assert.assertEquals(-1, totalClientsOnline);
//    Assert.assertEquals(69, year1);
//    Assert.assertEquals(59, seconds1);
//    Assert.assertEquals(11, month1);
//    Assert.assertEquals("Dec 31, 1969 11:59:59 PM", toLocaleStringResult1);
//    Assert.assertEquals(3, timeStamp.getDay());
//    Assert.assertEquals(23, hours1);
//    Assert.assertEquals("Wed Dec 31 23:59:59 UTC 1969", toStringResult2);
//    Assert.assertEquals(-1000L, time1);
//    Assert.assertEquals(31, date1);
//    Assert.assertEquals(0, timezoneOffset1);
//    Assert.assertEquals(59, minutes1);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
