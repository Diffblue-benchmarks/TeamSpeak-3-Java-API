package com.github.theholywaffle.teamspeak3;

import com.github.theholywaffle.teamspeak3.EventManager;
import com.github.theholywaffle.teamspeak3.FileTransferHelper;
import com.github.theholywaffle.teamspeak3.TS3Api;
import com.github.theholywaffle.teamspeak3.TS3ApiAsync;
import com.github.theholywaffle.teamspeak3.TS3Query;
import java.awt.geom.AffineTransform;
import java.awt.image.renderable.ContextualRenderedImageFactory;
import java.awt.image.renderable.ParameterBlock;
import java.awt.image.renderable.RenderContext;
import java.awt.image.renderable.RenderableImageOp;
import java.awt.image.renderable.RenderableImageProducer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class TS3Query_submitUserTaskTest_9_Test {
  @Test
  public void submitUserTaskTest() throws Exception {
    // Arrange
    TS3Query tS3Query = new TS3Query();
    String name = "aaaaa";
    ContextualRenderedImageFactory contextualRenderedImageFactory = Whitebox
        .newInstance(ContextualRenderedImageFactory.class);
    RenderableImageOp renderableImageOp = new RenderableImageOp(contextualRenderedImageFactory, new ParameterBlock());
    RenderableImageProducer renderableImageProducer = new RenderableImageProducer(renderableImageOp,
        new RenderContext(new AffineTransform()));
    renderableImageProducer.setRenderContext(new RenderContext(new AffineTransform()));
    renderableImageProducer.setRenderContext(new RenderContext(new AffineTransform()));

    // Act
    tS3Query.submitUserTask(name, renderableImageProducer);

    // Assert
    Assert.assertNotNull(renderableImageProducer.toString());
    TS3Api api = tS3Query.getApi();
    String toStringResult = tS3Query.toString();
    TS3ApiAsync asyncApi = tS3Query.getAsyncApi();
    EventManager eventManager = tS3Query.getEventManager();
    boolean isConnectedResult = tS3Query.isConnected();
    FileTransferHelper fileTransferHelper = tS3Query.getFileTransferHelper();
    String toStringResult1 = api.toString();
    String toStringResult2 = fileTransferHelper.toString();
    int clientTransferId = fileTransferHelper.getClientTransferId();
    Assert.assertNotNull(toStringResult);
    String toStringResult3 = eventManager.toString();
    Assert.assertFalse(isConnectedResult);
    Assert.assertEquals(0, clientTransferId);
    Assert.assertNotNull(asyncApi.toString());
    Assert.assertNotNull(toStringResult1);
    Assert.assertNotNull(toStringResult3);
    Assert.assertNotNull(toStringResult2);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
