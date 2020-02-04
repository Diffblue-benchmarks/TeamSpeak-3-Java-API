package com.github.theholywaffle.teamspeak3.api.wrapper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class FileInfoDiffblueTest {
  @Test
  public void isFileTest() {
    // Arrange, Act and Assert
    assertTrue((new FileInfo(null)).isFile());
  }

  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    assertNull((new FileInfo(null)).getMap());
  }

  @Test
  public void isDirectoryTest() {
    // Arrange, Act and Assert
    assertFalse((new FileInfo(null)).isDirectory());
  }

  @Test
  public void getTypeTest() {
    // Arrange, Act and Assert
    assertEquals(1, (new FileInfo(null)).getType());
  }
}

