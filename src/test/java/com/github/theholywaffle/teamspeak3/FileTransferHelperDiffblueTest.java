package com.github.theholywaffle.teamspeak3;

import static org.junit.Assert.assertEquals;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FileTransferHelperDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Test
  public void getIconIdTest() {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    assertEquals(1427048403L, FileTransferHelper.getIconId(byteArray));
  }
  @Test
  public void readFullyTest3() throws IOException {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    thrown.expect(IOException.class);
    FileTransferHelper.readFully(new ByteArrayInputStream(byteArray), 9223372036854775807L);
  }
  @Test
  public void readFullyTest2() throws IOException {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    assertEquals(3, FileTransferHelper.readFully(new ByteArrayInputStream(byteArray), 3L).length);
  }
  @Test
  public void readFullyTest() throws IOException {
    // Arrange
    byte[] byteArray = new byte[24];
    Arrays.fill(byteArray, (byte) 1);

    // Act and Assert
    thrown.expect(IOException.class);
    FileTransferHelper.readFully(new ByteArrayInputStream(byteArray), 2147483583L);
  }
}

