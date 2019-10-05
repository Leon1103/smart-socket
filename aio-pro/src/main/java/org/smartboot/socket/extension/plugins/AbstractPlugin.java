package org.smartboot.socket.extension.plugins;

import org.smartboot.socket.StateMachineEnum;
import org.smartboot.socket.transport.AioSession;

import java.nio.channels.AsynchronousSocketChannel;

/**
 * @author 三刀
 * @version V1.0 , 2018/8/19
 */
public abstract class AbstractPlugin<T> implements Plugin<T> {
    @Override
    public boolean preProcess(AioSession<T> session, T t) {
        return true;
    }

    @Override
    public void stateEvent(StateMachineEnum stateMachineEnum, AioSession<T> session, Throwable throwable) {

    }

    @Override
    public boolean acceptMonitor(AsynchronousSocketChannel channel) {
        return true;
    }

    @Override
    public void readMonitor(AioSession<T> session, int readSize) {

    }

    @Override
    public void writeMonitor(AioSession<T> session, int writeSize) {

    }

    @Override
    public void readEvent(AioSession<T> session) {

    }

    @Override
    public void writeEvent(AioSession<T> session) {

    }
}
