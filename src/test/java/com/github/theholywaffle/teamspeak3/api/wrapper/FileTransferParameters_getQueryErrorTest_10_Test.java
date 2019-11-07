package com.github.theholywaffle.teamspeak3.api.wrapper;

import com.github.theholywaffle.teamspeak3.api.wrapper.FileTransferParameters;
import com.github.theholywaffle.teamspeak3.api.wrapper.QueryError;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class FileTransferParameters_getQueryErrorTest_10_Test {
  @Test
  public void getQueryErrorTest() throws Exception {
    // Arrange
    HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("aaaaa", "aaaaa");
    FileTransferParameters fileTransferParameters = new FileTransferParameters(hashMap);

    // Act
    QueryError actual = fileTransferParameters.getQueryError();

    // Assert
    int id = actual.getId();
    boolean isSuccessfulResult = actual.isSuccessful();
    String toStringResult = actual.toString();
    Map<String, String> map = actual.getMap();
    String message = actual.getMessage();
    int failedPermissionId = actual.getFailedPermissionId();
    Assert.assertEquals(0, id);
    Assert.assertEquals("", actual.getExtraMessage());
    Assert.assertEquals(-1, failedPermissionId);
    Assert.assertEquals("", message);
    Assert.assertTrue(map instanceof HashMap);
    Assert.assertEquals("{msg=, id=0}", toStringResult);
    Assert.assertEquals(2, map.size());
    Assert.assertEquals("", map.get("msg"));
    Assert.assertEquals("0", map.get("id"));
    Assert.assertTrue(isSuccessfulResult);
    String fileTransferKey = fileTransferParameters.getFileTransferKey();
    int serverTransferId = fileTransferParameters.getServerTransferId();
    String fileServerHost = fileTransferParameters.getFileServerHost();
    int fileServerPort = fileTransferParameters.getFileServerPort();
    QueryError queryError = fileTransferParameters.getQueryError();
    String toStringResult1 = fileTransferParameters.toString();
    Map<String, String> map1 = fileTransferParameters.getMap();
    int clientTransferId = fileTransferParameters.getClientTransferId();
    String message1 = fileTransferParameters.getMessage();
    int status = fileTransferParameters.getStatus();
    Assert.assertEquals("", fileTransferKey);
    Assert.assertEquals(-1L, fileTransferParameters.getFileSize());
    Assert.assertEquals(0, status);
    Assert.assertEquals("", message1);
    Assert.assertEquals(-1, clientTransferId);
    Assert.assertSame(hashMap, map1);
    Assert.assertTrue(map1 instanceof HashMap);
    Assert.assertEquals("{aaaaa=aaaaa}", toStringResult1);
    Assert.assertSame(hashMap, map1);
    int id1 = queryError.getId();
    boolean isSuccessfulResult1 = queryError.isSuccessful();
    String toStringResult2 = queryError.toString();
    Map<String, String> map2 = queryError.getMap();
    String message2 = queryError.getMessage();
    int failedPermissionId1 = queryError.getFailedPermissionId();
    String extraMessage = queryError.getExtraMessage();
    Assert.assertEquals(-1, fileServerPort);
    Assert.assertEquals(-1, serverTransferId);
    Assert.assertEquals("", fileServerHost);
    Assert.assertEquals("", message2);
    Assert.assertTrue(map2 instanceof HashMap);
    Assert.assertEquals("{msg=, id=0}", toStringResult2);
    Assert.assertEquals(2, map2.size());
    Assert.assertEquals("", map2.get("msg"));
    Assert.assertEquals("0", map2.get("id"));
    Assert.assertTrue(isSuccessfulResult1);
    Assert.assertEquals(0, id1);
    Assert.assertEquals(-1, failedPermissionId1);
    Assert.assertEquals("", extraMessage);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
