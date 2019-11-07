package com.github.theholywaffle.teamspeak3.commands;

import com.github.theholywaffle.teamspeak3.api.CommandFuture;
import com.github.theholywaffle.teamspeak3.commands.Command;
import com.github.theholywaffle.teamspeak3.commands.parameter.ArrayParameter;
import com.github.theholywaffle.teamspeak3.commands.parameter.Parameter;
import com.github.theholywaffle.teamspeak3.commands.response.DefaultArrayResponse;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Command_getFutureTest_3_Test {
  @Test
  public void getFutureTest() throws Exception {
    // Arrange
    ArrayList<Parameter> arrayList = new ArrayList<Parameter>();
    arrayList.add(new ArrayParameter(1));
    Command command = new Command("aaaaa", arrayList);

    // Act
    CommandFuture<DefaultArrayResponse> actual = command.getFuture();

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
    String name = command.getName();
    String toStringResult1 = command.toString();
    Assert.assertEquals("aaaaa", name);
    Assert.assertSame(actual, command.getFuture());
    Assert.assertEquals("aaaaa ", toStringResult1);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
