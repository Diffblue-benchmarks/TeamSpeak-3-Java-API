package com.github.theholywaffle.teamspeak3;

import com.github.theholywaffle.teamspeak3.Connection;
import com.github.theholywaffle.teamspeak3.StreamWriter;
import com.github.theholywaffle.teamspeak3.TS3Config;
import com.github.theholywaffle.teamspeak3.TS3Query;
import com.github.theholywaffle.teamspeak3.api.reconnect.ConnectionHandler;
import java.io.ByteArrayOutputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class StreamWriter_StreamWriterTest_1_Test {
//failed_pass   @Test
//  public void StreamWriterTest() throws Exception {
//    // Arrange
//    TS3Config tS3Config = new TS3Config();
//    Connection connection = (Connection) null;
//    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//
//    // Act
//    StreamWriter streamWriter = new StreamWriter(connection, byteArrayOutputStream, tS3Config);
//
//    // Assert
//    ThreadGroup threadGroup = streamWriter.getThreadGroup();
//    long id = streamWriter.getId();
//    String name = streamWriter.getName();
//    String toStringResult = streamWriter.toString();
//    boolean isDaemonResult = streamWriter.isDaemon();
//    StackTraceElement[] stackTrace = streamWriter.getStackTrace();
//    int priority = streamWriter.getPriority();
//    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = streamWriter.getUncaughtExceptionHandler();
//    boolean isInterruptedResult = streamWriter.isInterrupted();
//    Thread.State state = streamWriter.getState();
//    String name1 = threadGroup.getName();
//    int maxPriority = threadGroup.getMaxPriority();
//    String toStringResult1 = threadGroup.toString();
//    boolean isDaemonResult1 = threadGroup.isDaemon();
//    boolean isDestroyedResult = threadGroup.isDestroyed();
//    ThreadGroup parent = threadGroup.getParent();
//    Assert.assertEquals(Thread.State.NEW, state);
//    Assert.assertEquals(1384L, id);
//    Assert.assertEquals("Thread[[TeamSpeak-3-Java-API] StreamWriter,5,main]", toStringResult);
//    Assert.assertSame(threadGroup, uncaughtExceptionHandler);
//    Assert.assertFalse(isInterruptedResult);
//    Assert.assertFalse(isDaemonResult);
//    Assert.assertEquals("[TeamSpeak-3-Java-API] StreamWriter", name);
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
//    String toStringResult3 = byteArrayOutputStream.toString();
//    Assert.assertEquals("", toStringResult3);
//    Assert.assertEquals(0, byteArrayOutputStream.size());
//    int queryPort = tS3Config.getQueryPort();
//    TS3Query.Protocol protocol = tS3Config.getProtocol();
//    String password = tS3Config.getPassword();
//    ConnectionHandler connectionHandler = tS3Config.getConnectionHandler();
//    String toStringResult4 = tS3Config.toString();
//    String host = tS3Config.getHost();
//    String username = tS3Config.getUsername();
//    int commandTimeout = tS3Config.getCommandTimeout();
//    TS3Query.FloodRate floodRate = tS3Config.getFloodRate();
//    boolean hasLoginCredentialsResult = tS3Config.hasLoginCredentials();
//    Assert.assertEquals(10011, queryPort);
//    Assert.assertFalse(tS3Config.getEnableCommunicationsLogging());
//    Assert.assertFalse(hasLoginCredentialsResult);
//    String toStringResult5 = floodRate.toString();
//    Assert.assertEquals(4000, commandTimeout);
//    Assert.assertEquals(TS3Query.Protocol.RAW, protocol);
//    Assert.assertEquals(null, connectionHandler);
//    Assert.assertEquals(null, username);
//    Assert.assertEquals(null, host);
//    Assert.assertNotNull(toStringResult4);
//    Assert.assertEquals(null, password);
//    Assert.assertEquals(350, floodRate.getMs());
//    Assert.assertNotNull(toStringResult5);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
