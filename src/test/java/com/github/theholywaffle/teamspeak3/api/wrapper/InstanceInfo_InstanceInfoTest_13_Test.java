package com.github.theholywaffle.teamspeak3.api.wrapper;

import com.github.theholywaffle.teamspeak3.api.wrapper.InstanceInfo;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class InstanceInfo_InstanceInfoTest_13_Test {
  @Test
  public void InstanceInfoTest() throws Exception {
    // Arrange
    HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("aaaaa", "aaaaa");

    // Act
    InstanceInfo instanceInfo = new InstanceInfo(hashMap);

    // Assert
    int maxFloodCommands = instanceInfo.getMaxFloodCommands();
    int defaultChannelGroup = instanceInfo.getDefaultChannelGroup();
    int maxFloodTime = instanceInfo.getMaxFloodTime();
    int fileTransferPort = instanceInfo.getFileTransferPort();
    long maxUploadBandwidth = instanceInfo.getMaxUploadBandwidth();
    String toStringResult = instanceInfo.toString();
    int guestServerQueryGroup = instanceInfo.getGuestServerQueryGroup();
    int floodBanTime = instanceInfo.getFloodBanTime();
    int databaseVersion = instanceInfo.getDatabaseVersion();
    int defaultServerGroup = instanceInfo.getDefaultServerGroup();
    Map<String, String> map = instanceInfo.getMap();
    long maxDownloadBandwidth = instanceInfo.getMaxDownloadBandwidth();
    int channelAdminGroup = instanceInfo.getChannelAdminGroup();
    int serverAdminGroup = instanceInfo.getServerAdminGroup();
    Assert.assertEquals(-1, maxFloodCommands);
    Assert.assertEquals(-1, instanceInfo.getPermissionsVersion());
    Assert.assertEquals(-1, serverAdminGroup);
    Assert.assertEquals(-1, channelAdminGroup);
    Assert.assertEquals(-1L, maxDownloadBandwidth);
    Assert.assertSame(hashMap, map);
    Assert.assertTrue(map instanceof HashMap);
    Assert.assertEquals(-1, defaultServerGroup);
    Assert.assertSame(hashMap, map);
    Assert.assertEquals(-1, databaseVersion);
    Assert.assertEquals(-1, floodBanTime);
    Assert.assertEquals(-1, guestServerQueryGroup);
    Assert.assertEquals("{aaaaa=aaaaa}", toStringResult);
    Assert.assertEquals(-1L, maxUploadBandwidth);
    Assert.assertEquals(-1, fileTransferPort);
    Assert.assertEquals(-1, maxFloodTime);
    Assert.assertEquals(-1, defaultChannelGroup);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
