package com.github.theholywaffle.teamspeak3.api;

import com.github.theholywaffle.teamspeak3.api.CommandFuture;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CommandFuture_ofAllTest_18_Test {
  @Test
  public void ofAllTest() throws Exception {
    // Arrange
    ArrayList<CommandFuture<Object>> arrayList = new ArrayList<CommandFuture<Object>>();
    arrayList.add(new CommandFuture<Object>());

    // Act
    CommandFuture<List<Object>> actual = CommandFuture.<Object>ofAll(arrayList);

    // Assert
    boolean isDoneResult = actual.isDone();
    boolean isSuccessfulResult = actual.isSuccessful();
    boolean hasFailedResult = actual.hasFailed();
    String toStringResult = actual.toString();
    Assert.assertFalse(isDoneResult);
    Assert.assertFalse(actual.isCancelled());
    Assert.assertNotNull(toStringResult);
    Assert.assertFalse(hasFailedResult);
    Assert.assertFalse(isSuccessfulResult);
    Assert.assertEquals(1, arrayList.size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
