package com.github.theholywaffle.teamspeak3.commands;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import java.util.Arrays;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FileCommandsDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void ftInitDownloadTest() {
    // Arrange and Act
    Command actualFtInitDownloadResult = FileCommands.ftInitDownload(1, "/", 1, "/");

    // Assert
    String actualName = actualFtInitDownloadResult.getName();
    String actualToStringResult = actualFtInitDownloadResult.toString();
    assertEquals("ftinitdownload", actualName);
    assertEquals("ftinitdownload clientftfid=1 name=\\/ cid=1 cpw=\\/" + " seekpos=0 proto=0", actualToStringResult);
    assertFalse(actualFtInitDownloadResult.getFuture().isCancelled());
  }

  @Test
  public void ftInitUploadTest() {
    // Arrange and Act
    Command actualFtInitUploadResult = FileCommands.ftInitUpload(1, "/", 1, "/", 1L, true);

    // Assert
    String actualName = actualFtInitUploadResult.getName();
    String actualToStringResult = actualFtInitUploadResult.toString();
    assertEquals("ftinitupload", actualName);
    assertEquals("ftinitupload clientftfid=1 name=\\/ cid=1 cpw=\\/" + " size=1 overwrite=1 resume=0 proto=0",
        actualToStringResult);
    assertFalse(actualFtInitUploadResult.getFuture().isCancelled());
  }

  @Test
  public void ftRenameFileTest2() {
    // Arrange and Act
    Command actualFtRenameFileResult = FileCommands.ftRenameFile("/", "/", 1, "/", 1, "/");

    // Assert
    String actualName = actualFtRenameFileResult.getName();
    String actualToStringResult = actualFtRenameFileResult.toString();
    assertEquals("ftrenamefile", actualName);
    assertEquals("ftrenamefile cid=1 cpw=\\/ tcid=1 tcpw=\\/ oldname=\\/" + " newname=\\/", actualToStringResult);
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
  public void ftDeleteFileTest() {
    // Arrange and Act
    Command actualFtDeleteFileResult = FileCommands.ftDeleteFile(1, "/", "/", "/", "/");

    // Assert
    String actualName = actualFtDeleteFileResult.getName();
    String actualToStringResult = actualFtDeleteFileResult.toString();
    assertEquals("ftdeletefile", actualName);
    assertEquals("ftdeletefile cid=1 cpw=\\/ name=\\/|name=\\/|name=\\/", actualToStringResult);
    assertFalse(actualFtDeleteFileResult.getFuture().isCancelled());
  }

  @Test
  public void ftGetFileListTest() {
    // Arrange and Act
    Command actualFtGetFileListResult = FileCommands.ftGetFileList("/", 1, "/");

    // Assert
    String actualName = actualFtGetFileListResult.getName();
    String actualToStringResult = actualFtGetFileListResult.toString();
    assertEquals("ftgetfilelist", actualName);
    assertEquals("ftgetfilelist cid=1 cpw=\\/ path=\\/", actualToStringResult);
    assertFalse(actualFtGetFileListResult.getFuture().isCancelled());
  }

  @Test
  public void ftGetFileInfoTest2() {
    // Arrange
    int[] intArray = new int[8];
    Arrays.fill(intArray, 1);

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    FileCommands.ftGetFileInfo(intArray, new String[]{"/", "/", "/"}, new String[]{"/", "/", "/"});
  }

  @Test
  public void ftCreateDirTest() {
    // Arrange and Act
    Command actualFtCreateDirResult = FileCommands.ftCreateDir("/", 1, "/");

    // Assert
    String actualName = actualFtCreateDirResult.getName();
    String actualToStringResult = actualFtCreateDirResult.toString();
    assertEquals("ftcreatedir", actualName);
    assertEquals("ftcreatedir cid=1 cpw=\\/ dirname=\\/", actualToStringResult);
    assertFalse(actualFtCreateDirResult.getFuture().isCancelled());
  }

  @Test
  public void ftRenameFileTest() {
    // Arrange and Act
    Command actualFtRenameFileResult = FileCommands.ftRenameFile("/", "/", 1, "/");

    // Assert
    String actualName = actualFtRenameFileResult.getName();
    String actualToStringResult = actualFtRenameFileResult.toString();
    assertEquals("ftrenamefile", actualName);
    assertEquals("ftrenamefile cid=1 cpw=\\/ oldname=\\/ newname=\\/", actualToStringResult);
    assertFalse(actualFtRenameFileResult.getFuture().isCancelled());
  }

  @Test
  public void ftGetFileInfoTest() {
    // Arrange and Act
    Command actualFtGetFileInfoResult = FileCommands.ftGetFileInfo(1, "/", "/", "/", "/");

    // Assert
    String actualName = actualFtGetFileInfoResult.getName();
    String actualToStringResult = actualFtGetFileInfoResult.toString();
    assertEquals("ftgetfileinfo", actualName);
    assertEquals("ftgetfileinfo cid=1 cpw=\\/ name=\\/|cid=1 cpw=\\/" + " name=\\/|cid=1 cpw=\\/ name=\\/",
        actualToStringResult);
    assertFalse(actualFtGetFileInfoResult.getFuture().isCancelled());
  }
}

