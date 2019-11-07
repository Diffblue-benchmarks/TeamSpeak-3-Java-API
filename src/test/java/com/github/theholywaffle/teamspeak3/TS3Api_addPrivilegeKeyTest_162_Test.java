package com.github.theholywaffle.teamspeak3;

import com.github.theholywaffle.teamspeak3.CommandQueue;
import com.github.theholywaffle.teamspeak3.TS3Api;
import com.github.theholywaffle.teamspeak3.TS3ApiAsync;
import com.github.theholywaffle.teamspeak3.TS3Query;
import com.github.theholywaffle.teamspeak3.api.PrivilegeKeyType;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class TS3Api_addPrivilegeKeyTest_162_Test {
  @Test
  public void addPrivilegeKeyTest() throws Exception {
    // Arrange
    TS3Api tS3Api = new TS3Api(new TS3ApiAsync(new TS3Query(), null));
    PrivilegeKeyType type = PrivilegeKeyType.SERVER_GROUP;
    int groupId = 1;
    int channelId = 1;
    String description = "aaaaa";

    // Act and Assert
    thrown.expect(NullPointerException.class);
    tS3Api.addPrivilegeKey(type, groupId, channelId, description);
    Assert.assertNotNull(tS3Api.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
