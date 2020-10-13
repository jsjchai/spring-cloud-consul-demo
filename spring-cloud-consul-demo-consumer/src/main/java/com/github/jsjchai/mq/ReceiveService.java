package com.github.jsjchai.mq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

/**
 * @author jsjchai.
 */
@Slf4j
@Service
public class ReceiveService {

    @StreamListener("input")
    public void receiveInput(String receiveMsg) {
       log.info("receiveMsg={}",receiveMsg);
    }

    @StreamListener("input1")
    public void receiveInput1(String receiveMsg) {
        log.info("receiveMsg1={}",receiveMsg);
    }
}
