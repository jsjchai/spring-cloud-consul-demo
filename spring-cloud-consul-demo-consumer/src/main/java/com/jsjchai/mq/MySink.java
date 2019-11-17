package com.jsjchai.mq;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author jsjchai.
 */
public interface MySink {

    @Input("input")
    SubscribableChannel input();

    @Input("input1")
    SubscribableChannel input1();
}
