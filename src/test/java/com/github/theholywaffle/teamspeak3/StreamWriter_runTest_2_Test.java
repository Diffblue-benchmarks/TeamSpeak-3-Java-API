package com.github.theholywaffle.teamspeak3;

import com.github.theholywaffle.teamspeak3.Connection;
import com.github.theholywaffle.teamspeak3.StreamWriter;
import com.github.theholywaffle.teamspeak3.TS3Config;
import java.io.ByteArrayOutputStream;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class StreamWriter_runTest_2_Test {
  @Test
  public void runTest() throws Exception {
    // Arrange
    TS3Config tS3Config = new TS3Config();
    StreamWriter streamWriter = new StreamWriter(null, new ByteArrayOutputStream(), tS3Config);

    // Act and Assert
    thrown.expect(NullPointerException.class);
    streamWriter.run();
    ThreadGroup threadGroup = streamWriter.getThreadGroup();
    long id = streamWriter.getId();
    String name = streamWriter.getName();
    String toStringResult = streamWriter.toString();
    boolean isDaemonResult = streamWriter.isDaemon();
    StackTraceElement[] stackTrace = streamWriter.getStackTrace();
    int priority = streamWriter.getPriority();
    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = streamWriter.getUncaughtExceptionHandler();
    boolean isInterruptedResult = streamWriter.isInterrupted();
    Thread.State state = streamWriter.getState();
    String name1 = threadGroup.getName();
    int maxPriority = threadGroup.getMaxPriority();
    String toStringResult1 = threadGroup.toString();
    boolean isDaemonResult1 = threadGroup.isDaemon();
    boolean isDestroyedResult = threadGroup.isDestroyed();
    ThreadGroup parent = threadGroup.getParent();
    Assert.assertEquals(Thread.State.NEW, state);
    Assert.assertEquals(1845L, id);
    Assert.assertEquals("Thread[[TeamSpeak-3-Java-API] StreamWriter,5,main]", toStringResult);
    Assert.assertSame(threadGroup, uncaughtExceptionHandler);
    Assert.assertFalse(isInterruptedResult);
    Assert.assertFalse(isDaemonResult);
    Assert.assertEquals("[TeamSpeak-3-Java-API] StreamWriter", name);
    Assert.assertEquals(0, stackTrace.length);
    Assert.assertEquals(5, priority);
    Assert.assertFalse(isDestroyedResult);
    Assert.assertEquals("main", name1);
    Assert.assertEquals("java.lang.ThreadGroup[name=main,maxpri=10]", toStringResult1);
    Assert.assertFalse(isDaemonResult1);
    String name2 = parent.getName();
    int maxPriority1 = parent.getMaxPriority();
    String toStringResult2 = parent.toString();
    boolean isDaemonResult2 = parent.isDaemon();
    boolean isDestroyedResult1 = parent.isDestroyed();
    Assert.assertEquals(10, maxPriority);
    Assert.assertEquals(null, parent.getParent());
    Assert.assertFalse(isDestroyedResult1);
    Assert.assertFalse(isDaemonResult2);
    Assert.assertEquals("java.lang.ThreadGroup[name=system,maxpri=10]", toStringResult2);
    Assert.assertEquals(10, maxPriority1);
    Assert.assertEquals("system", name2);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
