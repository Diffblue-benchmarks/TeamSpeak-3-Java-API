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

public class Command_getNameTest_2_Test {
  @Test
  public void getNameTest() throws Exception {
    // Arrange
    ArrayList<Parameter> arrayList = new ArrayList<Parameter>();
    arrayList.add(new ArrayParameter(1));
    Command command = new Command("aaaaa", arrayList);

    // Act
    String actual = command.getName();

    // Assert
    Assert.assertEquals("aaaaa", actual);
    String name = command.getName();
    String toStringResult = command.toString();
    CommandFuture<DefaultArrayResponse> future = command.getFuture();
    Assert.assertEquals("aaaaa", name);
    boolean isDoneResult = future.isDone();
    boolean isSuccessfulResult = future.isSuccessful();
    boolean hasFailedResult = future.hasFailed();
    String toStringResult1 = future.toString();
    Assert.assertEquals("aaaaa ", toStringResult);
    Assert.assertFalse(future.isCancelled());
    Assert.assertNotNull(toStringResult1);
    Assert.assertFalse(hasFailedResult);
    Assert.assertFalse(isSuccessfulResult);
    Assert.assertFalse(isDoneResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
