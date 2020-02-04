package com.github.theholywaffle.teamspeak3;

import static org.junit.Assert.assertEquals;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FileTransferHelperDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void getIconIdTest() {
    // Arrange, Act and Assert
    assertEquals(2747386400L, FileTransferHelper.getIconId(new byte[24]));
  }
  @Test
  public void readFullyTest2() throws IOException {
    // Arrange, Act and Assert
    assertEquals(3, FileTransferHelper.readFully(new ByteArrayInputStream(new byte[24]), 3L).length);
  }
  @Test
  public void readFullyTest() throws IOException {
    // Arrange, Act and Assert
    thrown.expect(IOException.class);
    FileTransferHelper.readFully(new ByteArrayInputStream(new byte[24]), 2147483583L);
  }
}

