package com.github.theholywaffle.teamspeak3;

import com.github.theholywaffle.teamspeak3.Connection;
import com.github.theholywaffle.teamspeak3.StreamReader;
import com.github.theholywaffle.teamspeak3.TS3Api;
import com.github.theholywaffle.teamspeak3.TS3Config;
import com.github.theholywaffle.teamspeak3.TS3Query;
import java.io.ByteArrayInputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StreamReader_StreamReaderTest_1_Test {
//failed_pass   @Test
//  public void StreamReaderTest() throws Exception {
//    // Arrange
//    Connection connection = (Connection) null;
//    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(
//        new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
//    TS3Query tS3Query = new TS3Query();
//    TS3Config config = new TS3Config();
//
//    // Act
//    StreamReader streamReader = new StreamReader(connection, byteArrayInputStream, tS3Query, config);
//
//    // Assert
//    ThreadGroup threadGroup = streamReader.getThreadGroup();
//    long id = streamReader.getId();
//    String name = streamReader.getName();
//    String toStringResult = streamReader.toString();
//    boolean isDaemonResult = streamReader.isDaemon();
//    StackTraceElement[] stackTrace = streamReader.getStackTrace();
//    int priority = streamReader.getPriority();
//    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = streamReader.getUncaughtExceptionHandler();
//    boolean isInterruptedResult = streamReader.isInterrupted();
//    Thread.State state = streamReader.getState();
//    String name1 = threadGroup.getName();
//    int maxPriority = threadGroup.getMaxPriority();
//    String toStringResult1 = threadGroup.toString();
//    boolean isDaemonResult1 = threadGroup.isDaemon();
//    boolean isDestroyedResult = threadGroup.isDestroyed();
//    ThreadGroup parent = threadGroup.getParent();
//    Assert.assertEquals(Thread.State.NEW, state);
//    Assert.assertEquals(168L, id);
//    Assert.assertEquals("Thread[[TeamSpeak-3-Java-API] StreamReader,5,main]", toStringResult);
//    Assert.assertSame(threadGroup, uncaughtExceptionHandler);
//    Assert.assertFalse(isInterruptedResult);
//    Assert.assertFalse(isDaemonResult);
//    Assert.assertEquals("[TeamSpeak-3-Java-API] StreamReader", name);
//    Assert.assertEquals(0, stackTrace.length);
//    Assert.assertEquals(5, priority);
//    Assert.assertFalse(isDestroyedResult);
//    Assert.assertEquals("main", name1);
//    Assert.assertEquals("java.lang.ThreadGroup[name=main,maxpri=10]", toStringResult1);
//    Assert.assertFalse(isDaemonResult1);
//    String name2 = parent.getName();
//    int maxPriority1 = parent.getMaxPriority();
//    String toStringResult2 = parent.toString();
//    boolean isDaemonResult2 = parent.isDaemon();
//    boolean isDestroyedResult1 = parent.isDestroyed();
//    Assert.assertEquals(10, maxPriority);
//    Assert.assertEquals(null, parent.getParent());
//    Assert.assertFalse(isDestroyedResult1);
//    Assert.assertFalse(isDaemonResult2);
//    Assert.assertEquals("java.lang.ThreadGroup[name=system,maxpri=10]", toStringResult2);
//    Assert.assertEquals(10, maxPriority1);
//    Assert.assertEquals("system", name2);
//    Assert.assertEquals(null, connection);
//    int availableResult = byteArrayInputStream.available();
//    Assert.assertEquals(0, availableResult);
//    Assert.assertNotNull(byteArrayInputStream.toString());
//    TS3Api api = tS3Query.getApi();
//    String toStringResult3 = tS3Query.toString();
//    boolean isConnectedResult = tS3Query.isConnected();
//    Assert.assertNotNull(toStringResult3);
//    Assert.assertFalse(isConnectedResult);
//    Assert.assertNotNull(api.toString());
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
