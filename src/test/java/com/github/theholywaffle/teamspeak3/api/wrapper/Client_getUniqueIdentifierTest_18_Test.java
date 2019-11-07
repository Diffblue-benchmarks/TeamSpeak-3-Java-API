package com.github.theholywaffle.teamspeak3.api.wrapper;

import com.github.theholywaffle.teamspeak3.api.wrapper.Client;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Client_getUniqueIdentifierTest_18_Test {
//failed_pass   @Test
//  public void getUniqueIdentifierTest() throws Exception {
//    // Arrange
//    HashMap<String, String> hashMap = new HashMap<String, String>();
//    hashMap.put("aaaaa", "aaaaa");
//    Client client = new Client(hashMap);
//
//    // Act
//    String actual = client.getUniqueIdentifier();
//
//    // Assert
//    Assert.assertEquals("", actual);
//    int type = client.getType();
//    int talkPower = client.getTalkPower();
//    String clientURI = client.getClientURI();
//    boolean isInputMutedResult = client.isInputMuted();
//    Date createdDate = client.getCreatedDate();
//    Date lastConnectedDate = client.getLastConnectedDate();
//    boolean isRegularClientResult = client.isRegularClient();
//    int channelId = client.getChannelId();
//    String country = client.getCountry();
//    long idleTime = client.getIdleTime();
//    boolean isTalkingResult = client.isTalking();
//    Map<String, String> map = client.getMap();
//    String ip = client.getIp();
//    boolean isServerQueryClientResult = client.isServerQueryClient();
//    String uniqueIdentifier = client.getUniqueIdentifier();
//    boolean isChannelCommanderResult = client.isChannelCommander();
//    String[] badgeGUIDs = client.getBadgeGUIDs();
//    boolean isInputHardwareResult = client.isInputHardware();
//    String toStringResult = client.toString();
//    boolean isOutputHardwareResult = client.isOutputHardware();
//    int channelGroupId = client.getChannelGroupId();
//    int inheritedChannelGroupId = client.getInheritedChannelGroupId();
//    String platform = client.getPlatform();
//    int id = client.getId();
//    boolean isRecordingResult = client.isRecording();
//    String nickname = client.getNickname();
//    boolean isPrioritySpeakerResult = client.isPrioritySpeaker();
//    String awayMessage = client.getAwayMessage();
//    boolean isAwayResult = client.isAway();
//    boolean isOutputMutedResult = client.isOutputMuted();
//    long iconId = client.getIconId();
//    int databaseId = client.getDatabaseId();
//    Assert.assertEquals(-1, type);
//    Assert.assertEquals("", client.getVersion());
//    Assert.assertEquals(-1, databaseId);
//    Assert.assertEquals(-1L, iconId);
//    Assert.assertFalse(isOutputMutedResult);
//    Assert.assertFalse(isAwayResult);
//    Assert.assertEquals("", awayMessage);
//    Assert.assertFalse(isPrioritySpeakerResult);
//    Assert.assertEquals("", nickname);
//    Assert.assertFalse(isRecordingResult);
//    Assert.assertEquals(-1, id);
//    Assert.assertEquals("", platform);
//    Assert.assertEquals(-1, inheritedChannelGroupId);
//    Assert.assertEquals(-1, channelGroupId);
//    Assert.assertFalse(isOutputHardwareResult);
//    Assert.assertEquals("{aaaaa=aaaaa}", toStringResult);
//    Assert.assertFalse(isInputHardwareResult);
//    Assert.assertEquals(0, badgeGUIDs.length);
//    Assert.assertArrayEquals(new String[]{}, badgeGUIDs);
//    Assert.assertFalse(isChannelCommanderResult);
//    Assert.assertEquals("", uniqueIdentifier);
//    Assert.assertFalse(isServerQueryClientResult);
//    Assert.assertEquals("", ip);
//    Assert.assertSame(hashMap, map);
//    Assert.assertTrue(map instanceof HashMap);
//    Assert.assertFalse(isTalkingResult);
//    Assert.assertSame(hashMap, map);
//    Assert.assertEquals(-1L, idleTime);
//    Assert.assertEquals("", country);
//    Assert.assertEquals(-1, channelId);
//    Assert.assertFalse(isRegularClientResult);
//    int year = lastConnectedDate.getYear();
//    int timezoneOffset = lastConnectedDate.getTimezoneOffset();
//    int hours = lastConnectedDate.getHours();
//    String toStringResult1 = lastConnectedDate.toString();
//    int minutes = lastConnectedDate.getMinutes();
//    long time = lastConnectedDate.getTime();
//    int seconds = lastConnectedDate.getSeconds();
//    int month = lastConnectedDate.getMonth();
//    int date = lastConnectedDate.getDate();
//    String toLocaleStringResult = lastConnectedDate.toLocaleString();
//    int day = lastConnectedDate.getDay();
//    int year1 = createdDate.getYear();
//    int timezoneOffset1 = createdDate.getTimezoneOffset();
//    int hours1 = createdDate.getHours();
//    String toStringResult2 = createdDate.toString();
//    Assert.assertEquals(-1, talkPower);
//    Assert.assertFalse(isInputMutedResult);
//    Assert.assertEquals("client://-1/~", clientURI);
//    Assert.assertEquals(23, hours1);
//    Assert.assertEquals(0, timezoneOffset1);
//    Assert.assertEquals(69, year1);
//    Assert.assertEquals("Dec 31, 1969 11:59:59 PM", toLocaleStringResult);
//    Assert.assertEquals(31, date);
//    Assert.assertEquals(11, month);
//    Assert.assertEquals(59, seconds);
//    Assert.assertEquals(-1000L, time);
//    Assert.assertEquals(59, minutes);
//    Assert.assertEquals("Wed Dec 31 23:59:59 UTC 1969", toStringResult1);
//    Assert.assertEquals(23, hours);
//    Assert.assertEquals(0, timezoneOffset);
//    Assert.assertEquals(69, year);
//    Assert.assertEquals(3, day);
//    Assert.assertEquals("Wed Dec 31 23:59:59 UTC 1969", toStringResult2);
//    Assert.assertEquals(59, createdDate.getMinutes());
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
