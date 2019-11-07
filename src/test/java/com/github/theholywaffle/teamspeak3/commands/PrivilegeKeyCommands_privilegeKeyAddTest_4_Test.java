package com.github.theholywaffle.teamspeak3.commands;

import com.github.theholywaffle.teamspeak3.api.CommandFuture;
import com.github.theholywaffle.teamspeak3.api.PrivilegeKeyType;
import com.github.theholywaffle.teamspeak3.commands.Command;
import com.github.theholywaffle.teamspeak3.commands.PrivilegeKeyCommands;
import com.github.theholywaffle.teamspeak3.commands.response.DefaultArrayResponse;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PrivilegeKeyCommands_privilegeKeyAddTest_4_Test {
  @Test
  public void privilegeKeyAddTest() throws Exception {
    // Arrange
    PrivilegeKeyType type = PrivilegeKeyType.SERVER_GROUP;
    int groupId = 1;
    int channelId = 1;
    String description = "aaaaa";

    // Act
    Command actual = PrivilegeKeyCommands.privilegeKeyAdd(type, groupId, channelId, description);

    // Assert
    String name = actual.getName();
    String toStringResult = actual.toString();
    CommandFuture<DefaultArrayResponse> future = actual.getFuture();
    Assert.assertEquals("privilegekeyadd", name);
    boolean isDoneResult = future.isDone();
    boolean isSuccessfulResult = future.isSuccessful();
    boolean hasFailedResult = future.hasFailed();
    String toStringResult1 = future.toString();
    Assert.assertEquals("privilegekeyadd tokentype=0 tokenid1=1 tokenid2=1 tokendescription=aaaaa", toStringResult);
    Assert.assertFalse(future.isCancelled());
    Assert.assertNotNull(toStringResult1);
    Assert.assertFalse(hasFailedResult);
    Assert.assertFalse(isSuccessfulResult);
    Assert.assertFalse(isDoneResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
