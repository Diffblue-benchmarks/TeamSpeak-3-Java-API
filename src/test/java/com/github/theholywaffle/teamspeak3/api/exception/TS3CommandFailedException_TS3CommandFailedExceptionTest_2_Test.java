package com.github.theholywaffle.teamspeak3.api.exception;

import com.github.theholywaffle.teamspeak3.api.exception.TS3CommandFailedException;
import com.github.theholywaffle.teamspeak3.api.wrapper.QueryError;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TS3CommandFailedException_TS3CommandFailedExceptionTest_2_Test {
  @Test
  public void TS3CommandFailedExceptionTest() throws Exception {
    // Arrange
    HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("aaaaa", "aaaaa");
    QueryError queryError = new QueryError(hashMap);
    String commandName = "aaaaa";

    // Act
    TS3CommandFailedException tS3CommandFailedException = new TS3CommandFailedException(queryError, commandName);

    // Assert
    String toStringResult = tS3CommandFailedException.toString();
    Throwable[] suppressed = tS3CommandFailedException.getSuppressed();
    String message = tS3CommandFailedException.getMessage();
    Throwable cause = tS3CommandFailedException.getCause();
    QueryError error = tS3CommandFailedException.getError();
    Assert.assertEquals(
        "com.github.theholywaffle.teamspeak3.api.exception.TS3CommandFailedException: A \"aaaaa\" command returned with a server error.\n>>  (ID -1)",
        toStringResult);
    Assert.assertEquals("A \"aaaaa\" command returned with a server error.\n>>  (ID -1)",
        tS3CommandFailedException.getLocalizedMessage());
    Assert.assertSame(queryError, error);
    int id = error.getId();
    boolean isSuccessfulResult = error.isSuccessful();
    String toStringResult1 = error.toString();
    Map<String, String> map = error.getMap();
    String message1 = error.getMessage();
    int failedPermissionId = error.getFailedPermissionId();
    Assert.assertEquals(null, cause);
    Assert.assertEquals(0, suppressed.length);
    Assert.assertEquals("A \"aaaaa\" command returned with a server error.\n>>  (ID -1)", message);
    Assert.assertEquals("", message1);
    Assert.assertSame(hashMap, map);
    Assert.assertTrue(map instanceof HashMap);
    Assert.assertEquals("{aaaaa=aaaaa}", toStringResult1);
    Assert.assertSame(hashMap, map);
    Assert.assertFalse(isSuccessfulResult);
    Assert.assertEquals(-1, id);
    Assert.assertEquals(-1, failedPermissionId);
    Assert.assertEquals("", error.getExtraMessage());
    Assert.assertSame(error, queryError);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
