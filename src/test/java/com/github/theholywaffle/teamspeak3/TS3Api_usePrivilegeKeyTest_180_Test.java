package com.github.theholywaffle.teamspeak3;

import com.github.theholywaffle.teamspeak3.CommandQueue;
import com.github.theholywaffle.teamspeak3.TS3Api;
import com.github.theholywaffle.teamspeak3.TS3ApiAsync;
import com.github.theholywaffle.teamspeak3.TS3Query;
import com.github.theholywaffle.teamspeak3.api.wrapper.PrivilegeKey;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class TS3Api_usePrivilegeKeyTest_180_Test {
  @Test
  public void usePrivilegeKeyTest() throws Exception {
    // Arrange
    TS3Api tS3Api = new TS3Api(new TS3ApiAsync(new TS3Query(), null));
    HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("aaaaa", "aaaak");
    PrivilegeKey privilegeKey = new PrivilegeKey(hashMap);

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    tS3Api.usePrivilegeKey(privilegeKey);
    int type = privilegeKey.getType();
    String toStringResult = privilegeKey.toString();
    Map<String, String> map = privilegeKey.getMap();
    boolean isChannelGroupTokenResult = privilegeKey.isChannelGroupToken();
    int channelId = privilegeKey.getChannelId();
    String description = privilegeKey.getDescription();
    boolean isServerGroupTokenResult = privilegeKey.isServerGroupToken();
    Date created = privilegeKey.getCreated();
    int groupId = privilegeKey.getGroupId();
    Assert.assertEquals(-1, type);
    Assert.assertEquals("", privilegeKey.getToken());
    Assert.assertEquals(-1, groupId);
    int year = created.getYear();
    int timezoneOffset = created.getTimezoneOffset();
    int hours = created.getHours();
    String toStringResult1 = created.toString();
    int minutes = created.getMinutes();
    long time = created.getTime();
    int seconds = created.getSeconds();
    int month = created.getMonth();
    int date = created.getDate();
    String toLocaleStringResult = created.toLocaleString();
    Assert.assertFalse(isServerGroupTokenResult);
    Assert.assertEquals("{aaaaa=aaaak}", toStringResult);
    Assert.assertTrue(isChannelGroupTokenResult);
    Assert.assertEquals(-1, channelId);
    Assert.assertSame(hashMap, map);
    Assert.assertTrue(map instanceof HashMap);
    Assert.assertEquals("", description);
    Assert.assertSame(hashMap, map);
    Assert.assertEquals(-1000L, time);
    Assert.assertEquals(59, minutes);
    Assert.assertEquals("Wed Dec 31 23:59:59 UTC 1969", toStringResult1);
    Assert.assertEquals(23, hours);
    Assert.assertEquals(0, timezoneOffset);
    Assert.assertEquals(69, year);
    Assert.assertEquals(59, seconds);
    Assert.assertEquals("Dec 31, 1969 11:59:59 PM", toLocaleStringResult);
    Assert.assertEquals(3, created.getDay());
    Assert.assertEquals(11, month);
    Assert.assertEquals(31, date);
    Assert.assertNotNull(tS3Api.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
