package com.github.theholywaffle.teamspeak3;

import com.github.theholywaffle.teamspeak3.CommandQueue;
import com.github.theholywaffle.teamspeak3.TS3Api;
import com.github.theholywaffle.teamspeak3.TS3ApiAsync;
import com.github.theholywaffle.teamspeak3.TS3Query;
import com.github.theholywaffle.teamspeak3.api.wrapper.Channel;
import com.github.theholywaffle.teamspeak3.api.wrapper.Client;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class TS3Api_moveClientsTest_24_Test {
  @Test
  public void moveClientsTest() throws Exception {
    // Arrange
    TS3Api tS3Api = new TS3Api(new TS3ApiAsync(new TS3Query(), null));
    HashMap<String, String> hashMap = new HashMap<String, String>();
    String string = "aaaaa";
    hashMap.put(string, "akaaa");
    Client client = new Client(hashMap);
    HashMap<String, String> hashMap1 = new HashMap<String, String>();
    String string1 = "aaaaa";
    hashMap1.put(string1, string);
    Client client1 = new Client(hashMap1);
    HashMap<String, String> hashMap2 = new HashMap<String, String>();
    hashMap2.put("aaaaa", string1);
    Client client2 = new Client(hashMap2);
    Client[] clientArray = new Client[]{client, client1, client2};
    Channel channel = new Channel(hashMap);
    String channelPassword = "aaaaa";

    // Act and Assert
    thrown.expect(NullPointerException.class);
    tS3Api.moveClients(clientArray, channel, channelPassword);
    Assert.assertEquals(3, clientArray.length);
    Client client3 = clientArray[0];
    Client client4 = clientArray[1];
    Client client5 = clientArray[2];
    Assert.assertSame(client, client3);
    int type = client3.getType();
    int talkPower = client3.getTalkPower();
    String clientURI = client3.getClientURI();
    boolean isInputMutedResult = client3.isInputMuted();
    boolean isRegularClientResult = client3.isRegularClient();
    int channelId = client3.getChannelId();
    String country = client3.getCountry();
    long idleTime = client3.getIdleTime();
    boolean isTalkingResult = client3.isTalking();
    Map<String, String> map = client3.getMap();
    String ip = client3.getIp();
    boolean isServerQueryClientResult = client3.isServerQueryClient();
    String uniqueIdentifier = client3.getUniqueIdentifier();
    boolean isChannelCommanderResult = client3.isChannelCommander();
    String[] badgeGUIDs = client3.getBadgeGUIDs();
    boolean isInputHardwareResult = client3.isInputHardware();
    String toStringResult = client3.toString();
    boolean isOutputHardwareResult = client3.isOutputHardware();
    int channelGroupId = client3.getChannelGroupId();
    int inheritedChannelGroupId = client3.getInheritedChannelGroupId();
    String platform = client3.getPlatform();
    int id = client3.getId();
    boolean isRecordingResult = client3.isRecording();
    String nickname = client3.getNickname();
    boolean isPrioritySpeakerResult = client3.isPrioritySpeaker();
    String awayMessage = client3.getAwayMessage();
    boolean isAwayResult = client3.isAway();
    boolean isOutputMutedResult = client3.isOutputMuted();
    long iconId = client3.getIconId();
    int databaseId = client3.getDatabaseId();
    String version = client3.getVersion();
    Assert.assertSame(client2, client5);
    int type1 = client5.getType();
    int talkPower1 = client5.getTalkPower();
    String clientURI1 = client5.getClientURI();
    boolean isInputMutedResult1 = client5.isInputMuted();
    boolean isRegularClientResult1 = client5.isRegularClient();
    int channelId1 = client5.getChannelId();
    String country1 = client5.getCountry();
    long idleTime1 = client5.getIdleTime();
    boolean isTalkingResult1 = client5.isTalking();
    Map<String, String> map1 = client5.getMap();
    String ip1 = client5.getIp();
    boolean isServerQueryClientResult1 = client5.isServerQueryClient();
    Assert.assertSame(client1, client4);
    Assert.assertEquals("", client5.getUniqueIdentifier());
    Assert.assertFalse(isServerQueryClientResult1);
    Assert.assertEquals("", ip1);
    Assert.assertSame(hashMap2, map1);
    Assert.assertTrue(map1 instanceof HashMap);
    Assert.assertFalse(isTalkingResult1);
    Assert.assertSame(hashMap2, map1);
    Assert.assertEquals(-1L, idleTime1);
    Assert.assertEquals("", country1);
    Assert.assertEquals(-1, channelId1);
    Assert.assertFalse(isRegularClientResult1);
    Assert.assertFalse(isInputMutedResult1);
    Assert.assertEquals("client://-1/~", clientURI1);
    Assert.assertEquals(-1, talkPower1);
    Assert.assertEquals(-1, type1);
    Assert.assertEquals(-1, databaseId);
    Assert.assertEquals(-1L, iconId);
    Assert.assertFalse(isOutputMutedResult);
    Assert.assertFalse(isAwayResult);
    Assert.assertEquals("", awayMessage);
    Assert.assertFalse(isPrioritySpeakerResult);
    Assert.assertEquals("", nickname);
    Assert.assertFalse(isRecordingResult);
    Assert.assertEquals(-1, id);
    Assert.assertEquals("", platform);
    Assert.assertEquals(-1, inheritedChannelGroupId);
    Assert.assertEquals(-1, channelGroupId);
    Assert.assertFalse(isOutputHardwareResult);
    Assert.assertEquals("{aaaaa=akaaa}", toStringResult);
    Assert.assertFalse(isInputHardwareResult);
    Assert.assertEquals(0, badgeGUIDs.length);
    Assert.assertArrayEquals(new String[]{}, badgeGUIDs);
    Assert.assertFalse(isChannelCommanderResult);
    Assert.assertEquals("", uniqueIdentifier);
    Assert.assertFalse(isServerQueryClientResult);
    Assert.assertEquals("", ip);
    Assert.assertSame(hashMap, map);
    Assert.assertTrue(map instanceof HashMap);
    Assert.assertFalse(isTalkingResult);
    Assert.assertSame(hashMap, map);
    Assert.assertEquals(-1L, idleTime);
    Assert.assertEquals("", country);
    Assert.assertEquals(-1, channelId);
    Assert.assertFalse(isRegularClientResult);
    Assert.assertFalse(isInputMutedResult);
    Assert.assertEquals("client://-1/~", clientURI);
    Assert.assertEquals(-1, talkPower);
    Assert.assertEquals(-1, type);
    Assert.assertEquals("", version);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
