package com.github.theholywaffle.teamspeak3.api.event;

import com.github.theholywaffle.teamspeak3.api.event.ClientJoinEvent;
import com.github.theholywaffle.teamspeak3.api.wrapper.Wrapper;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ClientJoinEvent_getClientNicknameTest_30_Test {
  @Test
  public void getClientNicknameTest() throws Exception {
    // Arrange
    HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("aaaaa", "aaaaa");
    ClientJoinEvent clientJoinEvent = new ClientJoinEvent(new Wrapper(hashMap));

    // Act
    String actual = clientJoinEvent.getClientNickname();

    // Assert
    Assert.assertEquals("", actual);
    int clientId = clientJoinEvent.getClientId();
    boolean isClientAwayResult = clientJoinEvent.isClientAway();
    boolean isClientOutputOnlyMutedResult = clientJoinEvent.isClientOutputOnlyMuted();
    boolean isClientUsingHardwareOutputResult = clientJoinEvent.isClientUsingHardwareOutput();
    String invokerUniqueId = clientJoinEvent.getInvokerUniqueId();
    int clientUnreadMessages = clientJoinEvent.getClientUnreadMessages();
    String reasonMessage = clientJoinEvent.getReasonMessage();
    int clientType = clientJoinEvent.getClientType();
    int invokerId = clientJoinEvent.getInvokerId();
    boolean isClientUsingHardwareInputResult = clientJoinEvent.isClientUsingHardwareInput();
    String clientMetadata = clientJoinEvent.getClientMetadata();
    String clientNickname = clientJoinEvent.getClientNickname();
    int reasonId = clientJoinEvent.getReasonId();
    int clientChannelGroupId = clientJoinEvent.getClientChannelGroupId();
    String clientPhoneticNickname = clientJoinEvent.getClientPhoneticNickname();
    String clientServerGroups = clientJoinEvent.getClientServerGroups();
    int clientNeededServerQueryViewPower = clientJoinEvent.getClientNeededServerQueryViewPower();
    int clientTargetId = clientJoinEvent.getClientTargetId();
    String clientCountry = clientJoinEvent.getClientCountry();
    String clientAwayMessage = clientJoinEvent.getClientAwayMessage();
    int clientFromId = clientJoinEvent.getClientFromId();
    String invokerName = clientJoinEvent.getInvokerName();
    String toStringResult = clientJoinEvent.toString();
    boolean isClientTalkingResult = clientJoinEvent.isClientTalking();
    String clientFlagAvatarId = clientJoinEvent.getClientFlagAvatarId();
    String clientDescription = clientJoinEvent.getClientDescription();
    int clientInheritedChannelGroupId = clientJoinEvent.getClientInheritedChannelGroupId();
    boolean isClientOutputMutedResult = clientJoinEvent.isClientOutputMuted();
    long clientIconId = clientJoinEvent.getClientIconId();
    int amountOfServerGroups = clientJoinEvent.getAmountOfServerGroups();
    boolean isClientRequestingToTalkResult = clientJoinEvent.isClientRequestingToTalk();
    boolean isClientChannelCommanderResult = clientJoinEvent.isClientChannelCommander();
    boolean isClientRecordingResult = clientJoinEvent.isClientRecording();
    boolean isClientInputMutedResult = clientJoinEvent.isClientInputMuted();
    boolean isClientPrioritySpeakerResult = clientJoinEvent.isClientPrioritySpeaker();
    String clientTalkRequestMessage = clientJoinEvent.getClientTalkRequestMessage();
    String uniqueClientIdentifier = clientJoinEvent.getUniqueClientIdentifier();
    int clientTalkPower = clientJoinEvent.getClientTalkPower();
    Assert.assertEquals(-1, clientId);
    Assert.assertEquals(-1, clientJoinEvent.getClientDatabaseId());
    Assert.assertEquals(-1, clientTalkPower);
    Assert.assertEquals("", uniqueClientIdentifier);
    Assert.assertEquals("", clientTalkRequestMessage);
    Assert.assertFalse(isClientPrioritySpeakerResult);
    Assert.assertFalse(isClientInputMutedResult);
    Assert.assertFalse(isClientRecordingResult);
    Assert.assertFalse(isClientChannelCommanderResult);
    Assert.assertFalse(isClientRequestingToTalkResult);
    Assert.assertEquals(1, amountOfServerGroups);
    Assert.assertEquals(-1L, clientIconId);
    Assert.assertFalse(isClientOutputMutedResult);
    Assert.assertEquals(-1, clientInheritedChannelGroupId);
    Assert.assertEquals("", clientDescription);
    Assert.assertEquals("", clientFlagAvatarId);
    Assert.assertFalse(isClientTalkingResult);
    Assert.assertEquals("{aaaaa=aaaaa}", toStringResult);
    Assert.assertEquals("", invokerName);
    Assert.assertEquals(-1, clientFromId);
    Assert.assertEquals("", clientAwayMessage);
    Assert.assertEquals("", clientCountry);
    Assert.assertEquals(-1, clientTargetId);
    Assert.assertEquals(-1, clientNeededServerQueryViewPower);
    Assert.assertEquals("", clientServerGroups);
    Assert.assertEquals("", clientPhoneticNickname);
    Assert.assertEquals(-1, clientChannelGroupId);
    Assert.assertEquals(-1, reasonId);
    Assert.assertEquals("", clientNickname);
    Assert.assertEquals("", clientMetadata);
    Assert.assertFalse(isClientUsingHardwareInputResult);
    Assert.assertEquals(-1, invokerId);
    Assert.assertEquals(-1, clientType);
    Assert.assertEquals("", reasonMessage);
    Assert.assertEquals(-1, clientUnreadMessages);
    Assert.assertEquals("", invokerUniqueId);
    Assert.assertFalse(isClientUsingHardwareOutputResult);
    Assert.assertFalse(isClientOutputOnlyMutedResult);
    Assert.assertFalse(isClientAwayResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
