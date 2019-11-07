package com.github.theholywaffle.teamspeak3.api.wrapper;

import com.github.theholywaffle.teamspeak3.api.wrapper.ClientInfo;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ClientInfo_getTalkRequestMessageTest_11_Test {
  @Test
  public void getTalkRequestMessageTest() throws Exception {
    // Arrange
    HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("aaaaa", "aaaaa");
    ClientInfo clientInfo = new ClientInfo(1, hashMap);

    // Act
    String actual = clientInfo.getTalkRequestMessage();

    // Assert
    Assert.assertEquals("", actual);
    int talkPower = clientInfo.getTalkPower();
    long bandwidthSentLastSecond = clientInfo.getBandwidthSentLastSecond();
    String loginName = clientInfo.getLoginName();
    String myTeamSpeakId = clientInfo.getMyTeamSpeakId();
    boolean isInputMutedResult = clientInfo.isInputMuted();
    long totalBytesReceived = clientInfo.getTotalBytesReceived();
    boolean isRegularClientResult = clientInfo.isRegularClient();
    long totalPacketsReceived = clientInfo.getTotalPacketsReceived();
    long idleTime = clientInfo.getIdleTime();
    Map<String, String> map = clientInfo.getMap();
    long bandwidthReceivedLastMinute = clientInfo.getBandwidthReceivedLastMinute();
    String uniqueIdentifier = clientInfo.getUniqueIdentifier();
    String metaData = clientInfo.getMetaData();
    boolean isInputHardwareResult = clientInfo.isInputHardware();
    long bandwidthReceivedLastSecond = clientInfo.getBandwidthReceivedLastSecond();
    String toStringResult = clientInfo.toString();
    boolean isOutputOnlyMutedResult = clientInfo.isOutputOnlyMuted();
    long filetransferBandwidthSent = clientInfo.getFiletransferBandwidthSent();
    int channelGroupId = clientInfo.getChannelGroupId();
    long timeConnected = clientInfo.getTimeConnected();
    int inheritedChannelGroupId = clientInfo.getInheritedChannelGroupId();
    int id = clientInfo.getId();
    String awayMessage = clientInfo.getAwayMessage();
    int totalConnections = clientInfo.getTotalConnections();
    String defaultToken = clientInfo.getDefaultToken();
    String description = clientInfo.getDescription();
    long bandwidthSentlastMinute = clientInfo.getBandwidthSentlastMinute();
    long filetransferBandwidthReceived = clientInfo.getFiletransferBandwidthReceived();
    int databaseId = clientInfo.getDatabaseId();
    int type = clientInfo.getType();
    String clientURI = clientInfo.getClientURI();
    String base64ClientUId = clientInfo.getBase64ClientUId();
    int channelId = clientInfo.getChannelId();
    int neededServerQueryViewPower = clientInfo.getNeededServerQueryViewPower();
    boolean isRequestingToTalkResult = clientInfo.isRequestingToTalk();
    String country = clientInfo.getCountry();
    long monthlyBytesDownloaded = clientInfo.getMonthlyBytesDownloaded();
    String phoneticNickname = clientInfo.getPhoneticNickname();
    long totalBytesSent = clientInfo.getTotalBytesSent();
    String ip = clientInfo.getIp();
    long totalBytesUploaded = clientInfo.getTotalBytesUploaded();
    boolean isServerQueryClientResult = clientInfo.isServerQueryClient();
    boolean isChannelCommanderResult = clientInfo.isChannelCommander();
    String avatar = clientInfo.getAvatar();
    String[] badgeGUIDs = clientInfo.getBadgeGUIDs();
    Assert.assertEquals(-1, talkPower);
    Assert.assertEquals(-1, clientInfo.getUnreadMessages());
    Assert.assertEquals(0, badgeGUIDs.length);
    Assert.assertArrayEquals(new String[]{}, badgeGUIDs);
    Assert.assertEquals("", avatar);
    Assert.assertFalse(isChannelCommanderResult);
    Assert.assertFalse(isServerQueryClientResult);
    Assert.assertEquals(-1L, totalBytesUploaded);
    Assert.assertEquals("", ip);
    Assert.assertEquals(-1L, totalBytesSent);
    Assert.assertEquals("", phoneticNickname);
    Assert.assertEquals(-1L, monthlyBytesDownloaded);
    Assert.assertEquals("", country);
    Assert.assertTrue(isRequestingToTalkResult);
    Assert.assertEquals(-1, neededServerQueryViewPower);
    Assert.assertEquals(-1, channelId);
    Assert.assertEquals("", base64ClientUId);
    Assert.assertEquals("client://1/~", clientURI);
    Assert.assertEquals(-1, type);
    Assert.assertEquals(-1, databaseId);
    Assert.assertEquals(-1L, filetransferBandwidthReceived);
    Assert.assertEquals(-1L, bandwidthSentlastMinute);
    Assert.assertEquals("", description);
    Assert.assertEquals("", defaultToken);
    Assert.assertEquals(-1, totalConnections);
    Assert.assertEquals("", awayMessage);
    Assert.assertEquals(1, id);
    Assert.assertEquals(-1, inheritedChannelGroupId);
    Assert.assertEquals(-1L, timeConnected);
    Assert.assertEquals(-1, channelGroupId);
    Assert.assertEquals(-1L, filetransferBandwidthSent);
    Assert.assertFalse(isOutputOnlyMutedResult);
    Assert.assertEquals("{aaaaa=aaaaa}", toStringResult);
    Assert.assertEquals(-1L, bandwidthReceivedLastSecond);
    Assert.assertFalse(isInputHardwareResult);
    Assert.assertEquals("", metaData);
    Assert.assertEquals("", uniqueIdentifier);
    Assert.assertEquals(-1L, bandwidthReceivedLastMinute);
    Assert.assertSame(hashMap, map);
    Assert.assertTrue(map instanceof HashMap);
    Assert.assertEquals(-1L, idleTime);
    Assert.assertSame(hashMap, map);
    Assert.assertEquals(-1L, totalPacketsReceived);
    Assert.assertFalse(isRegularClientResult);
    Assert.assertEquals(-1L, totalBytesReceived);
    Assert.assertFalse(isInputMutedResult);
    Assert.assertEquals("", myTeamSpeakId);
    Assert.assertEquals("", loginName);
    Assert.assertEquals(-1L, bandwidthSentLastSecond);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
