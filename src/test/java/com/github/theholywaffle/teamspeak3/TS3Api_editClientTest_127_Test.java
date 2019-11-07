package com.github.theholywaffle.teamspeak3;

import com.github.theholywaffle.teamspeak3.CommandQueue;
import com.github.theholywaffle.teamspeak3.TS3Api;
import com.github.theholywaffle.teamspeak3.TS3ApiAsync;
import com.github.theholywaffle.teamspeak3.TS3Query;
import com.github.theholywaffle.teamspeak3.api.ClientProperty;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class TS3Api_editClientTest_127_Test {
  @Test
  public void editClientTest() throws Exception {
    // Arrange
    TS3Api tS3Api = new TS3Api(new TS3ApiAsync(new TS3Query(), null));
    int clientId = 1;
    HashMap<ClientProperty, String> hashMap = new HashMap<ClientProperty, String>();
    hashMap.put(ClientProperty.CID, "aaaaa");

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    tS3Api.editClient(clientId, hashMap);
    Assert.assertEquals(1, hashMap.size());
    Assert.assertEquals("aaaaa", hashMap.get(ClientProperty.CID));
    Assert.assertNotNull(tS3Api.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
