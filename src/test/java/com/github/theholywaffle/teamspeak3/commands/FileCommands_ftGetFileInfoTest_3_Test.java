package com.github.theholywaffle.teamspeak3.commands;

import com.github.theholywaffle.teamspeak3.commands.Command;
import com.github.theholywaffle.teamspeak3.commands.FileCommands;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class FileCommands_ftGetFileInfoTest_3_Test {
  @Test
  public void ftGetFileInfoTest() throws Exception {
    // Arrange
    int[] intArray = new int[]{1, 1, 1, 1, 1, 1, 1, 655361};
    String string = "aaaaa";
    String string1 = "aaaaa";
    String[] stringArray = new String[]{string, string1, "aaaaa"};
    String[] stringArray1 = new String[]{"aakaa", string, string1};

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    FileCommands.ftGetFileInfo(intArray, stringArray, stringArray1);
    Assert.assertEquals(8, intArray.length);
    Assert.assertArrayEquals(new int[]{1, 1, 1, 1, 1, 1, 1, 655361}, intArray);
    Assert.assertEquals(3, stringArray.length);
    Assert.assertArrayEquals(new String[]{"aaaaa", "aaaaa", "aaaaa"}, stringArray);
    Assert.assertEquals(3, stringArray1.length);
    Assert.assertArrayEquals(new String[]{"aakaa", "aaaaa", "aaaaa"}, stringArray1);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
