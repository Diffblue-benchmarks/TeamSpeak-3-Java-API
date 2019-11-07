package com.github.theholywaffle.teamspeak3.api.exception;

import com.github.theholywaffle.teamspeak3.api.exception.TS3CommandFailedException;
import com.github.theholywaffle.teamspeak3.api.wrapper.QueryError;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TS3CommandFailedException_getErrorTest_1_Test {
  @Test
  public void getErrorTest() throws Exception {
    // Arrange
    HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("aaaaa", "aaaaa");
    QueryError queryError = new QueryError(hashMap);
    TS3CommandFailedException tS3CommandFailedException = new TS3CommandFailedException(queryError, "aaaaa");

    // Act
    QueryError actual = tS3CommandFailedException.getError();

    // Assert
    Assert.assertSame(queryError, actual);
    int id = actual.getId();
    boolean isSuccessfulResult = actual.isSuccessful();
    String toStringResult = actual.toString();
    Map<String, String> map = actual.getMap();
    String message = actual.getMessage();
    int failedPermissionId = actual.getFailedPermissionId();
    Assert.assertEquals(-1, id);
    Assert.assertEquals("", actual.getExtraMessage());
    Assert.assertEquals(-1, failedPermissionId);
    Assert.assertEquals("", message);
    Assert.assertSame(hashMap, map);
    Assert.assertTrue(map instanceof HashMap);
    Assert.assertEquals("{aaaaa=aaaaa}", toStringResult);
    Assert.assertSame(hashMap, map);
    Assert.assertFalse(isSuccessfulResult);
    String toStringResult1 = tS3CommandFailedException.toString();
    Throwable[] suppressed = tS3CommandFailedException.getSuppressed();
    String message1 = tS3CommandFailedException.getMessage();
    Throwable cause = tS3CommandFailedException.getCause();
    QueryError error = tS3CommandFailedException.getError();
    Assert.assertEquals(
        "com.github.theholywaffle.teamspeak3.api.exception.TS3CommandFailedException: A \"aaaaa\" command returned with a server error.\n>>  (ID -1)",
        toStringResult1);
    Assert.assertEquals("A \"aaaaa\" command returned with a server error.\n>>  (ID -1)",
        tS3CommandFailedException.getLocalizedMessage());
    Assert.assertSame(actual, error);
    Assert.assertEquals(null, cause);
    Assert.assertEquals("A \"aaaaa\" command returned with a server error.\n>>  (ID -1)", message1);
    Assert.assertEquals(0, suppressed.length);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
