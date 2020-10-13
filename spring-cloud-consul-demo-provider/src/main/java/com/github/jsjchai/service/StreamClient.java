package com.github.jsjchai.service;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @author jsjchai.
 */
public interface StreamClient {

    @Output("output")
    MessageChannel output();
}
