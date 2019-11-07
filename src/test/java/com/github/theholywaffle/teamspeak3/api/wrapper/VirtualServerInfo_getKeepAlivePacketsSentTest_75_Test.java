package com.github.theholywaffle.teamspeak3.api.wrapper;

import com.github.theholywaffle.teamspeak3.api.VirtualServerStatus;
import com.github.theholywaffle.teamspeak3.api.wrapper.VirtualServerInfo;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class VirtualServerInfo_getKeepAlivePacketsSentTest_75_Test {
//failed_pass   @Test
//  public void getKeepAlivePacketsSentTest() throws Exception {
//    // Arrange
//    HashMap<String, String> hashMap = new HashMap<String, String>();
//    hashMap.put("aaaaa", "aaaaa");
//    VirtualServerInfo virtualServerInfo = new VirtualServerInfo(hashMap);
//
//    // Act
//    long actual = virtualServerInfo.getKeepAlivePacketsSent();
//
//    // Assert
//    Assert.assertEquals(-1L, actual);
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
//    String toStringResult = virtualServerInfo.toString();
//    long filetransferBandwidthSent = virtualServerInfo.getFiletransferBandwidthSent();
//    String hostbannerUrl = virtualServerInfo.getHostbannerUrl();
//    long speechBytesReceived = virtualServerInfo.getSpeechBytesReceived();
//    int antifloodPointsNeedIpBlock = virtualServerInfo.getAntifloodPointsNeedIpBlock();
//    String fileBase = virtualServerInfo.getFileBase();
//    int id = virtualServerInfo.getId();
//    int reservedSlots = virtualServerInfo.getReservedSlots();
//    long keepAlivePacketsReceived = virtualServerInfo.getKeepAlivePacketsReceived();
//    int antifloodPointsTickReduce = virtualServerInfo.getAntifloodPointsTickReduce();
//    long uptime = virtualServerInfo.getUptime();
//    long filetransferBandwidthReceived = virtualServerInfo.getFiletransferBandwidthReceived();
//    int totalClientConnections = virtualServerInfo.getTotalClientConnections();
//    boolean isLoggingPermissionsResult = virtualServerInfo.isLoggingPermissions();
//    double ping = virtualServerInfo.getPing();
//    String hostMessage = virtualServerInfo.getHostMessage();
//    long controlPacketsSent = virtualServerInfo.getControlPacketsSent();
//    String machineId = virtualServerInfo.getMachineId();
//    boolean isWeblistEnabledResult = virtualServerInfo.isWeblistEnabled();
//    Assert.assertEquals(-1, defaultChannelGroup);
//    Assert.assertFalse(virtualServerInfo.isLoggingQuery());
//    Assert.assertFalse(isWeblistEnabledResult);
//    Assert.assertEquals("", machineId);
//    Assert.assertEquals(-1L, controlPacketsSent);
//    Assert.assertEquals("", hostMessage);
//    Assert.assertEquals(-1.0, ping);
//    Assert.assertFalse(isLoggingPermissionsResult);
//    Assert.assertEquals(-1, totalClientConnections);
//    Assert.assertEquals(-1L, filetransferBandwidthReceived);
//    Assert.assertEquals(-1L, uptime);
//    Assert.assertEquals(-1, antifloodPointsTickReduce);
//    Assert.assertEquals(-1L, keepAlivePacketsReceived);
//    Assert.assertEquals(-1, reservedSlots);
//    Assert.assertEquals(-1, id);
//    Assert.assertEquals("", fileBase);
//    Assert.assertEquals(-1, antifloodPointsNeedIpBlock);
//    Assert.assertEquals(-1L, speechBytesReceived);
//    Assert.assertEquals("", hostbannerUrl);
//    Assert.assertEquals(-1L, filetransferBandwidthSent);
//    Assert.assertEquals("{aaaaa=aaaaa}", toStringResult);
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
