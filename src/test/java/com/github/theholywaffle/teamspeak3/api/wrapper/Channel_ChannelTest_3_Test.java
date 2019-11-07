package com.github.theholywaffle.teamspeak3.api.wrapper;

import com.github.theholywaffle.teamspeak3.api.Codec;
import com.github.theholywaffle.teamspeak3.api.wrapper.Channel;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Channel_ChannelTest_3_Test {
  @Test
  public void ChannelTest() throws Exception {
    // Arrange
    HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("aaaaa", "aaaaa");

    // Act
    Channel channel = new Channel(hashMap);

    // Assert
    int neededSubscribePower = channel.getNeededSubscribePower();
    String name = channel.getName();
    String toStringResult = channel.toString();
    int maxFamilyClients = channel.getMaxFamilyClients();
    int order = channel.getOrder();
    int totalClientsFamily = channel.getTotalClientsFamily();
    Codec codec = channel.getCodec();
    boolean isPermanentResult = channel.isPermanent();
    boolean isEmptyResult = channel.isEmpty();
    int id = channel.getId();
    boolean isSemiPermanentResult = channel.isSemiPermanent();
    int codecQuality = channel.getCodecQuality();
    int neededTalkPower = channel.getNeededTalkPower();
    int maxClients = channel.getMaxClients();
    boolean isFamilyEmptyResult = channel.isFamilyEmpty();
    boolean hasPasswordResult = channel.hasPassword();
    Map<String, String> map = channel.getMap();
    int totalClients = channel.getTotalClients();
    String topic = channel.getTopic();
    long iconId = channel.getIconId();
    boolean isDefaultResult = channel.isDefault();
    int secondsEmpty = channel.getSecondsEmpty();
    Assert.assertEquals(-1, neededSubscribePower);
    Assert.assertEquals(-1, channel.getParentChannelId());
    Assert.assertEquals(-1, secondsEmpty);
    Assert.assertFalse(isDefaultResult);
    Assert.assertEquals(-1L, iconId);
    Assert.assertEquals("", topic);
    Assert.assertEquals(-1, totalClients);
    Assert.assertSame(hashMap, map);
    Assert.assertTrue(map instanceof HashMap);
    Assert.assertFalse(hasPasswordResult);
    Assert.assertSame(hashMap, map);
    Assert.assertFalse(isFamilyEmptyResult);
    Assert.assertEquals(-1, maxClients);
    Assert.assertEquals(-1, neededTalkPower);
    Assert.assertEquals(-1, codecQuality);
    Assert.assertFalse(isSemiPermanentResult);
    Assert.assertEquals(-1, id);
    Assert.assertFalse(isEmptyResult);
    Assert.assertFalse(isPermanentResult);
    Assert.assertEquals(Codec.UNKNOWN, codec);
    Assert.assertEquals(-1, totalClientsFamily);
    Assert.assertEquals(-1, order);
    Assert.assertEquals(-1, maxFamilyClients);
    Assert.assertEquals("{aaaaa=aaaaa}", toStringResult);
    Assert.assertEquals("", name);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
