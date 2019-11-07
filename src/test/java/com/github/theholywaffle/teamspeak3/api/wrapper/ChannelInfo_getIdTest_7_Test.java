package com.github.theholywaffle.teamspeak3.api.wrapper;

import com.github.theholywaffle.teamspeak3.api.Codec;
import com.github.theholywaffle.teamspeak3.api.wrapper.ChannelInfo;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ChannelInfo_getIdTest_7_Test {
  @Test
  public void getIdTest() throws Exception {
    // Arrange
    HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("aaaaa", "aaaaa");
    ChannelInfo channelInfo = new ChannelInfo(1, hashMap);

    // Act
    int actual = channelInfo.getId();

    // Assert
    Assert.assertEquals(1, actual);
    boolean isEncryptedResult = channelInfo.isEncrypted();
    String name = channelInfo.getName();
    int maxFamilyClients = channelInfo.getMaxFamilyClients();
    boolean hasUnlimitedClientsResult = channelInfo.hasUnlimitedClients();
    Codec codec = channelInfo.getCodec();
    boolean isPermanentResult = channelInfo.isPermanent();
    boolean isSemiPermanentResult = channelInfo.isSemiPermanent();
    int neededTalkPower = channelInfo.getNeededTalkPower();
    Map<String, String> map = channelInfo.getMap();
    String topic = channelInfo.getTopic();
    String filePath = channelInfo.getFilePath();
    int parentChannelId = channelInfo.getParentChannelId();
    boolean hasInheritedMaxFamilyClientsResult = channelInfo.hasInheritedMaxFamilyClients();
    String toStringResult = channelInfo.toString();
    boolean isForcedSilenceResult = channelInfo.isForcedSilence();
    int order = channelInfo.getOrder();
    String phoneticName = channelInfo.getPhoneticName();
    int id = channelInfo.getId();
    int codecQuality = channelInfo.getCodecQuality();
    String password = channelInfo.getPassword();
    boolean hasUnlimitedFamilyClientsResult = channelInfo.hasUnlimitedFamilyClients();
    int maxClients = channelInfo.getMaxClients();
    boolean isFamilyEmptyResult = channelInfo.isFamilyEmpty();
    boolean hasPasswordResult = channelInfo.hasPassword();
    int codecLatencyFactor = channelInfo.getCodecLatencyFactor();
    String description = channelInfo.getDescription();
    long iconId = channelInfo.getIconId();
    boolean isDefaultResult = channelInfo.isDefault();
    Assert.assertTrue(isEncryptedResult);
    Assert.assertEquals(-1, channelInfo.getSecondsEmpty());
    Assert.assertFalse(isDefaultResult);
    Assert.assertEquals(-1L, iconId);
    Assert.assertEquals("", description);
    Assert.assertEquals(-1, codecLatencyFactor);
    Assert.assertFalse(hasPasswordResult);
    Assert.assertFalse(isFamilyEmptyResult);
    Assert.assertEquals(-1, maxClients);
    Assert.assertFalse(hasUnlimitedFamilyClientsResult);
    Assert.assertEquals("", password);
    Assert.assertEquals(-1, codecQuality);
    Assert.assertEquals(1, id);
    Assert.assertEquals("", phoneticName);
    Assert.assertEquals(-1, order);
    Assert.assertFalse(isForcedSilenceResult);
    Assert.assertEquals("{aaaaa=aaaaa}", toStringResult);
    Assert.assertFalse(hasInheritedMaxFamilyClientsResult);
    Assert.assertEquals(-1, parentChannelId);
    Assert.assertEquals("", filePath);
    Assert.assertEquals("", topic);
    Assert.assertSame(hashMap, map);
    Assert.assertTrue(map instanceof HashMap);
    Assert.assertEquals(-1, neededTalkPower);
    Assert.assertSame(hashMap, map);
    Assert.assertFalse(isSemiPermanentResult);
    Assert.assertFalse(isPermanentResult);
    Assert.assertEquals(Codec.UNKNOWN, codec);
    Assert.assertFalse(hasUnlimitedClientsResult);
    Assert.assertEquals(-1, maxFamilyClients);
    Assert.assertEquals("", name);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
