package com.github.theholywaffle.teamspeak3.api.wrapper;

import com.github.theholywaffle.teamspeak3.api.wrapper.FileTransferParameters;
import com.github.theholywaffle.teamspeak3.api.wrapper.QueryError;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class FileTransferParameters_getFileTransferKeyTest_8_Test {
  @Test
  public void getFileTransferKeyTest() throws Exception {
    // Arrange
    HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("aaaaa", "aaaaa");
    FileTransferParameters fileTransferParameters = new FileTransferParameters(hashMap);

    // Act
    String actual = fileTransferParameters.getFileTransferKey();

    // Assert
    Assert.assertEquals("", actual);
    String fileTransferKey = fileTransferParameters.getFileTransferKey();
    int serverTransferId = fileTransferParameters.getServerTransferId();
    String fileServerHost = fileTransferParameters.getFileServerHost();
    int fileServerPort = fileTransferParameters.getFileServerPort();
    QueryError queryError = fileTransferParameters.getQueryError();
    String toStringResult = fileTransferParameters.toString();
    Map<String, String> map = fileTransferParameters.getMap();
    int clientTransferId = fileTransferParameters.getClientTransferId();
    String message = fileTransferParameters.getMessage();
    int status = fileTransferParameters.getStatus();
    Assert.assertEquals("", fileTransferKey);
    Assert.assertEquals(-1L, fileTransferParameters.getFileSize());
    Assert.assertEquals(0, status);
    Assert.assertEquals("", message);
    Assert.assertEquals(-1, clientTransferId);
    Assert.assertSame(hashMap, map);
    Assert.assertTrue(map instanceof HashMap);
    Assert.assertEquals("{aaaaa=aaaaa}", toStringResult);
    Assert.assertSame(hashMap, map);
    int id = queryError.getId();
    boolean isSuccessfulResult = queryError.isSuccessful();
    String toStringResult1 = queryError.toString();
    Map<String, String> map1 = queryError.getMap();
    String message1 = queryError.getMessage();
    int failedPermissionId = queryError.getFailedPermissionId();
    String extraMessage = queryError.getExtraMessage();
    Assert.assertEquals(-1, fileServerPort);
    Assert.assertEquals(-1, serverTransferId);
    Assert.assertEquals("", fileServerHost);
    Assert.assertEquals("", message1);
    Assert.assertTrue(map1 instanceof HashMap);
    Assert.assertEquals("{msg=, id=0}", toStringResult1);
    Assert.assertEquals(2, map1.size());
    Assert.assertEquals("", map1.get("msg"));
    Assert.assertEquals("0", map1.get("id"));
    Assert.assertTrue(isSuccessfulResult);
    Assert.assertEquals(0, id);
    Assert.assertEquals(-1, failedPermissionId);
    Assert.assertEquals("", extraMessage);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
