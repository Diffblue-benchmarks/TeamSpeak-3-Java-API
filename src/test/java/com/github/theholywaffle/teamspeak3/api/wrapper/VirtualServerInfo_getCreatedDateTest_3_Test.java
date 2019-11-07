package com.github.theholywaffle.teamspeak3.api.wrapper;

import com.github.theholywaffle.teamspeak3.api.VirtualServerStatus;
import com.github.theholywaffle.teamspeak3.api.wrapper.VirtualServerInfo;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class VirtualServerInfo_getCreatedDateTest_3_Test {
//failed_pass   @Test
//  public void getCreatedDateTest() throws Exception {
//    // Arrange
//    HashMap<String, String> hashMap = new HashMap<String, String>();
//    hashMap.put("aaaaa", "aaaaa");
//    VirtualServerInfo virtualServerInfo = new VirtualServerInfo(hashMap);
//
//    // Act
//    Date actual = virtualServerInfo.getCreatedDate();
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
//    int defaultChannelGroup = virtualServerInfo.getDefaultChannelGroup();
//    double totalKeepAlivePacketloss = virtualServerInfo.getTotalKeepAlivePacketloss();
//    long bandwidthSentLastSecond = virtualServerInfo.getBandwidthSentLastSecond();
//    String name = virtualServerInfo.getName();
//    long controlBytesSent = virtualServerInfo.getControlBytesSent();
//    VirtualServerStatus status = virtualServerInfo.getStatus();
//    long filetransferBytesReceived = virtualServerInfo.getFiletransferBytesReceived();
//    long totalBytesReceived = virtualServerInfo.getTotalBytesReceived();
//    int queryClientsOnline = virtualServerInfo.getQueryClientsOnline();
//    String hostbuttonGfxUrl = virtualServerInfo.getHostbuttonGfxUrl();
//    long keepAliveBytesSent = virtualServerInfo.getKeepAliveBytesSent();
//    long totalPacketsReceived = virtualServerInfo.getTotalPacketsReceived();
//    boolean isLoggingFileTransferResult = virtualServerInfo.isLoggingFileTransfer();
//    long speechBytesSent = virtualServerInfo.getSpeechBytesSent();
//    double totalPacketloss = virtualServerInfo.getTotalPacketloss();
//    long keepAliveBytesReceived = virtualServerInfo.getKeepAliveBytesReceived();
//    int minimumClientVersion = virtualServerInfo.getMinimumClientVersion();
//    boolean isLoggingClientResult = virtualServerInfo.isLoggingClient();
//    Map<String, String> map = virtualServerInfo.getMap();
//    long bandwidthReceivedLastMinute = virtualServerInfo.getBandwidthReceivedLastMinute();
//    long controlPacketsReceived = virtualServerInfo.getControlPacketsReceived();
//    double prioritySpeakerDimmModificator = virtualServerInfo.getPrioritySpeakerDimmModificator();
//    long maxDownloadBandwidth = virtualServerInfo.getMaxDownloadBandwidth();
//    String uniqueIdentifier = virtualServerInfo.getUniqueIdentifier();
//    boolean isAskingPrivilegeKeyResult = virtualServerInfo.isAskingPrivilegeKey();
//    int minClientsInChannelBeforeForcedSilence = virtualServerInfo.getMinClientsInChannelBeforeForcedSilence();
//    long bandwidthReceivedLastSecond = virtualServerInfo.getBandwidthReceivedLastSecond();
//    long filetransferBytesSent = virtualServerInfo.getFiletransferBytesSent();
//    String hostbuttonTooltip = virtualServerInfo.getHostbuttonTooltip();
//    String toStringResult1 = virtualServerInfo.toString();
//    long filetransferBandwidthSent = virtualServerInfo.getFiletransferBandwidthSent();
//    String hostbannerUrl = virtualServerInfo.getHostbannerUrl();
//    long speechBytesReceived = virtualServerInfo.getSpeechBytesReceived();
//    int antifloodPointsNeedIpBlock = virtualServerInfo.getAntifloodPointsNeedIpBlock();
//    String fileBase = virtualServerInfo.getFileBase();
//    int id = virtualServerInfo.getId();
//    int reservedSlots = virtualServerInfo.getReservedSlots();
//    Assert.assertEquals(-1, defaultChannelGroup);
//    Assert.assertEquals(-1L, virtualServerInfo.getKeepAlivePacketsReceived());
//    Assert.assertEquals(-1, reservedSlots);
//    Assert.assertEquals(-1, id);
//    Assert.assertEquals("", fileBase);
//    Assert.assertEquals(-1, antifloodPointsNeedIpBlock);
//    Assert.assertEquals(-1L, speechBytesReceived);
//    Assert.assertEquals("", hostbannerUrl);
//    Assert.assertEquals(-1L, filetransferBandwidthSent);
//    Assert.assertEquals("{aaaaa=aaaaa}", toStringResult1);
//    Assert.assertEquals("", hostbuttonTooltip);
//    Assert.assertEquals(-1L, filetransferBytesSent);
//    Assert.assertEquals(-1L, bandwidthReceivedLastSecond);
//    Assert.assertEquals(-1, minClientsInChannelBeforeForcedSilence);
//    Assert.assertFalse(isAskingPrivilegeKeyResult);
//    Assert.assertEquals("", uniqueIdentifier);
//    Assert.assertEquals(-1L, maxDownloadBandwidth);
//    Assert.assertEquals(-1.0, prioritySpeakerDimmModificator);
//    Assert.assertEquals(-1L, controlPacketsReceived);
//    Assert.assertEquals(-1L, bandwidthReceivedLastMinute);
//    Assert.assertSame(hashMap, map);
//    Assert.assertTrue(map instanceof HashMap);
//    Assert.assertFalse(isLoggingClientResult);
//    Assert.assertSame(hashMap, map);
//    Assert.assertEquals(-1, minimumClientVersion);
//    Assert.assertEquals(-1L, keepAliveBytesReceived);
//    Assert.assertEquals(-1.0, totalPacketloss);
//    Assert.assertEquals(-1L, speechBytesSent);
//    Assert.assertFalse(isLoggingFileTransferResult);
//    Assert.assertEquals(-1L, totalPacketsReceived);
//    Assert.assertEquals(-1L, keepAliveBytesSent);
//    Assert.assertEquals("", hostbuttonGfxUrl);
//    Assert.assertEquals(-1, queryClientsOnline);
//    Assert.assertEquals(-1L, totalBytesReceived);
//    Assert.assertEquals(-1L, filetransferBytesReceived);
//    Assert.assertEquals(VirtualServerStatus.UNKNOWN, status);
//    Assert.assertEquals(-1L, controlBytesSent);
//    Assert.assertEquals("", name);
//    Assert.assertEquals(-1L, bandwidthSentLastSecond);
//    Assert.assertEquals(-1.0, totalKeepAlivePacketloss);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
