package com.github.theholywaffle.teamspeak3.commands;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class FileCommandsDiffblueTest {
  @Test
  public void ftInitDownloadTest() {
    // Arrange and Act
    Command actualFtInitDownloadResult = FileCommands.ftInitDownload(123, "foo", 123, "Password123");

    // Assert
    String actualName = actualFtInitDownloadResult.getName();
    String actualToStringResult = actualFtInitDownloadResult.toString();
    assertEquals("ftinitdownload", actualName);
    assertEquals("ftinitdownload clientftfid=123 name=\\/foo cid=123" + " cpw=Password123 seekpos=0 proto=0",
        actualToStringResult);
    assertFalse(actualFtInitDownloadResult.getFuture().isCancelled());
  }

  @Test
  public void ftInitUploadTest() {
    // Arrange and Act
    Command actualFtInitUploadResult = FileCommands.ftInitUpload(123, "foo", 123, "Password123", 3L, true);

    // Assert
    String actualName = actualFtInitUploadResult.getName();
    String actualToStringResult = actualFtInitUploadResult.toString();
    assertEquals("ftinitupload", actualName);
    assertEquals("ftinitupload clientftfid=123 name=\\/foo cid=123" + " cpw=Password123 size=3 overwrite=1 resume=0"
        + " proto=0", actualToStringResult);
    assertFalse(actualFtInitUploadResult.getFuture().isCancelled());
  }

  @Test
  public void ftRenameFileTest2() {
    // Arrange and Act
    Command actualFtRenameFileResult = FileCommands.ftRenameFile("foo", "foo", 123, "Password123", 123, "Password123");

    // Assert
    String actualName = actualFtRenameFileResult.getName();
    String actualToStringResult = actualFtRenameFileResult.toString();
    assertEquals("ftrenamefile", actualName);
    assertEquals("ftrenamefile cid=123 cpw=Password123 tcid=123" + " tcpw=Password123 oldname=\\/foo newname=\\/foo",
        actualToStringResult);
    assertFalse(actualFtRenameFileResult.getFuture().isCancelled());
  }

  @Test
  public void ftListTest() {
    // Arrange and Act
    Command actualFtListResult = FileCommands.ftList();

    // Assert
    String actualName = actualFtListResult.getName();
    String actualToStringResult = actualFtListResult.toString();
    assertEquals("ftlist", actualName);
    assertEquals("ftlist", actualToStringResult);
    assertFalse(actualFtListResult.getFuture().isCancelled());
  }

  @Test
  public void ftGetFileListTest() {
    // Arrange and Act
    Command actualFtGetFileListResult = FileCommands.ftGetFileList("/tmp", 123, "Password123");

    // Assert
    String actualName = actualFtGetFileListResult.getName();
    String actualToStringResult = actualFtGetFileListResult.toString();
    assertEquals("ftgetfilelist", actualName);
    assertEquals("ftgetfilelist cid=123 cpw=Password123 path=\\/tmp\\/", actualToStringResult);
    assertFalse(actualFtGetFileListResult.getFuture().isCancelled());
  }

  @Test
  public void ftCreateDirTest() {
    // Arrange and Act
    Command actualFtCreateDirResult = FileCommands.ftCreateDir("foo", 123, "Password123");

    // Assert
    String actualName = actualFtCreateDirResult.getName();
    String actualToStringResult = actualFtCreateDirResult.toString();
    assertEquals("ftcreatedir", actualName);
    assertEquals("ftcreatedir cid=123 cpw=Password123 dirname=\\/foo", actualToStringResult);
    assertFalse(actualFtCreateDirResult.getFuture().isCancelled());
  }

  @Test
  public void ftRenameFileTest() {
    // Arrange and Act
    Command actualFtRenameFileResult = FileCommands.ftRenameFile("foo", "foo", 123, "Password123");

    // Assert
    String actualName = actualFtRenameFileResult.getName();
    String actualToStringResult = actualFtRenameFileResult.toString();
    assertEquals("ftrenamefile", actualName);
    assertEquals("ftrenamefile cid=123 cpw=Password123 oldname=\\/foo" + " newname=\\/foo", actualToStringResult);
    assertFalse(actualFtRenameFileResult.getFuture().isCancelled());
  }
}

