package com.github.theholywaffle.teamspeak3;

import com.github.theholywaffle.teamspeak3.TS3ApiAsync;
import com.github.theholywaffle.teamspeak3.TS3Query;
import com.github.theholywaffle.teamspeak3.api.CommandFuture;
import com.github.theholywaffle.teamspeak3.api.wrapper.Binding;
import com.github.theholywaffle.teamspeak3.api.wrapper.FileTransfer;
import com.github.theholywaffle.teamspeak3.api.wrapper.InstanceInfo;
import com.github.theholywaffle.teamspeak3.api.wrapper.VirtualServer;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TS3Query_getAsyncApiTest_7_Test {
  @Test
  public void getAsyncApiTest() throws Exception {
    // Arrange
    TS3Query tS3Query = new TS3Query();

    // Act
    TS3ApiAsync actual = tS3Query.getAsyncApi();

    // Assert
    CommandFuture<List<VirtualServer>> virtualServers = actual.getVirtualServers();
    CommandFuture<InstanceInfo> instanceInfo = actual.getInstanceInfo();
    String toStringResult = actual.toString();
    CommandFuture<List<FileTransfer>> fileTransfers = actual.getFileTransfers();
    CommandFuture<List<Binding>> bindings = actual.getBindings();
    boolean isDoneResult = virtualServers.isDone();
    boolean isSuccessfulResult = virtualServers.isSuccessful();
    boolean hasFailedResult = virtualServers.hasFailed();
    String toStringResult1 = virtualServers.toString();
    boolean isCancelledResult = virtualServers.isCancelled();
    boolean isDoneResult1 = bindings.isDone();
    boolean isSuccessfulResult1 = bindings.isSuccessful();
    boolean hasFailedResult1 = bindings.hasFailed();
    String toStringResult2 = bindings.toString();
    boolean isCancelledResult1 = bindings.isCancelled();
    boolean isDoneResult2 = instanceInfo.isDone();
    boolean isSuccessfulResult2 = instanceInfo.isSuccessful();
    boolean hasFailedResult2 = instanceInfo.hasFailed();
    String toStringResult3 = instanceInfo.toString();
    boolean isCancelledResult2 = instanceInfo.isCancelled();
    boolean isDoneResult3 = fileTransfers.isDone();
    boolean isSuccessfulResult3 = fileTransfers.isSuccessful();
    boolean hasFailedResult3 = fileTransfers.hasFailed();
    String toStringResult4 = fileTransfers.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertNotNull(toStringResult3);
    Assert.assertFalse(isDoneResult3);
    Assert.assertNotNull(toStringResult4);
    Assert.assertFalse(fileTransfers.isCancelled());
    Assert.assertFalse(isCancelledResult1);
    Assert.assertFalse(isCancelledResult);
    Assert.assertFalse(hasFailedResult);
    Assert.assertNotNull(toStringResult1);
    Assert.assertFalse(isSuccessfulResult1);
    Assert.assertFalse(hasFailedResult1);
    Assert.assertFalse(isSuccessfulResult2);
    Assert.assertFalse(hasFailedResult2);
    Assert.assertFalse(hasFailedResult3);
    Assert.assertFalse(isCancelledResult2);
    Assert.assertFalse(isSuccessfulResult);
    Assert.assertFalse(isDoneResult1);
    Assert.assertFalse(isDoneResult2);
    Assert.assertFalse(isSuccessfulResult3);
    Assert.assertFalse(isDoneResult);
    Assert.assertNotNull(toStringResult2);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
