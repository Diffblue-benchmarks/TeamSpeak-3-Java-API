package com.github.theholywaffle.teamspeak3.api.wrapper;

import com.github.theholywaffle.teamspeak3.api.wrapper.ClientInfo;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ClientInfo_getTalkRequestCreatedDateTest_32_Test {
//failed_pass   @Test
//  public void getTalkRequestCreatedDateTest() throws Exception {
//    // Arrange
//    HashMap<String, String> hashMap = new HashMap<String, String>();
//    hashMap.put("aaaaa", "aaaaa");
//    ClientInfo clientInfo = new ClientInfo(1, hashMap);
//
//    // Act
//    Date actual = clientInfo.getTalkRequestCreatedDate();
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
//    int talkPower = clientInfo.getTalkPower();
//    long bandwidthSentLastSecond = clientInfo.getBandwidthSentLastSecond();
//    String loginName = clientInfo.getLoginName();
//    String myTeamSpeakId = clientInfo.getMyTeamSpeakId();
//    boolean isInputMutedResult = clientInfo.isInputMuted();
//    long totalBytesReceived = clientInfo.getTotalBytesReceived();
//    boolean isRegularClientResult = clientInfo.isRegularClient();
//    long totalPacketsReceived = clientInfo.getTotalPacketsReceived();
//    long idleTime = clientInfo.getIdleTime();
//    Map<String, String> map = clientInfo.getMap();
//    long bandwidthReceivedLastMinute = clientInfo.getBandwidthReceivedLastMinute();
//    String uniqueIdentifier = clientInfo.getUniqueIdentifier();
//    String metaData = clientInfo.getMetaData();
//    boolean isInputHardwareResult = clientInfo.isInputHardware();
//    long bandwidthReceivedLastSecond = clientInfo.getBandwidthReceivedLastSecond();
//    String toStringResult1 = clientInfo.toString();
//    boolean isOutputOnlyMutedResult = clientInfo.isOutputOnlyMuted();
//    long filetransferBandwidthSent = clientInfo.getFiletransferBandwidthSent();
//    int channelGroupId = clientInfo.getChannelGroupId();
//    long timeConnected = clientInfo.getTimeConnected();
//    int inheritedChannelGroupId = clientInfo.getInheritedChannelGroupId();
//    int id = clientInfo.getId();
//    String awayMessage = clientInfo.getAwayMessage();
//    int totalConnections = clientInfo.getTotalConnections();
//    String defaultToken = clientInfo.getDefaultToken();
//    String description = clientInfo.getDescription();
//    long bandwidthSentlastMinute = clientInfo.getBandwidthSentlastMinute();
//    long filetransferBandwidthReceived = clientInfo.getFiletransferBandwidthReceived();
//    int databaseId = clientInfo.getDatabaseId();
//    int type = clientInfo.getType();
//    String clientURI = clientInfo.getClientURI();
//    String base64ClientUId = clientInfo.getBase64ClientUId();
//    int channelId = clientInfo.getChannelId();
//    int neededServerQueryViewPower = clientInfo.getNeededServerQueryViewPower();
//    boolean isRequestingToTalkResult = clientInfo.isRequestingToTalk();
//    Assert.assertEquals(-1, talkPower);
//    Assert.assertEquals("", clientInfo.getCountry());
//    Assert.assertTrue(isRequestingToTalkResult);
//    Assert.assertEquals(-1, neededServerQueryViewPower);
//    Assert.assertEquals(-1, channelId);
//    Assert.assertEquals("", base64ClientUId);
//    Assert.assertEquals("client://1/~", clientURI);
//    Assert.assertEquals(-1, type);
//    Assert.assertEquals(-1, databaseId);
//    Assert.assertEquals(-1L, filetransferBandwidthReceived);
//    Assert.assertEquals(-1L, bandwidthSentlastMinute);
//    Assert.assertEquals("", description);
//    Assert.assertEquals("", defaultToken);
//    Assert.assertEquals(-1, totalConnections);
//    Assert.assertEquals("", awayMessage);
//    Assert.assertEquals(1, id);
//    Assert.assertEquals(-1, inheritedChannelGroupId);
//    Assert.assertEquals(-1L, timeConnected);
//    Assert.assertEquals(-1, channelGroupId);
//    Assert.assertEquals(-1L, filetransferBandwidthSent);
//    Assert.assertFalse(isOutputOnlyMutedResult);
//    Assert.assertEquals("{aaaaa=aaaaa}", toStringResult1);
//    Assert.assertEquals(-1L, bandwidthReceivedLastSecond);
//    Assert.assertFalse(isInputHardwareResult);
//    Assert.assertEquals("", metaData);
//    Assert.assertEquals("", uniqueIdentifier);
//    Assert.assertEquals(-1L, bandwidthReceivedLastMinute);
//    Assert.assertSame(hashMap, map);
//    Assert.assertTrue(map instanceof HashMap);
//    Assert.assertEquals(-1L, idleTime);
//    Assert.assertSame(hashMap, map);
//    Assert.assertEquals(-1L, totalPacketsReceived);
//    Assert.assertFalse(isRegularClientResult);
//    Assert.assertEquals(-1L, totalBytesReceived);
//    Assert.assertFalse(isInputMutedResult);
//    Assert.assertEquals("", myTeamSpeakId);
//    Assert.assertEquals("", loginName);
//    Assert.assertEquals(-1L, bandwidthSentLastSecond);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
