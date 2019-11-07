package com.github.theholywaffle.teamspeak3.api.wrapper;

import com.github.theholywaffle.teamspeak3.api.wrapper.QueryError;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class QueryError_getExtraMessageTest_3_Test {
  @Test
  public void getExtraMessageTest() throws Exception {
    // Arrange
    HashMap<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("aaaaa", "aaaaa");
    QueryError queryError = new QueryError(hashMap);

    // Act
    String actual = queryError.getExtraMessage();

    // Assert
    Assert.assertEquals("", actual);
    int id = queryError.getId();
    boolean isSuccessfulResult = queryError.isSuccessful();
    String toStringResult = queryError.toString();
    Map<String, String> map = queryError.getMap();
    String message = queryError.getMessage();
    int failedPermissionId = queryError.getFailedPermissionId();
    Assert.assertEquals(-1, id);
    Assert.assertEquals("", queryError.getExtraMessage());
    Assert.assertEquals(-1, failedPermissionId);
    Assert.assertEquals("", message);
    Assert.assertSame(hashMap, map);
    Assert.assertTrue(map instanceof HashMap);
    Assert.assertEquals("{aaaaa=aaaaa}", toStringResult);
    Assert.assertSame(hashMap, map);
    Assert.assertFalse(isSuccessfulResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
