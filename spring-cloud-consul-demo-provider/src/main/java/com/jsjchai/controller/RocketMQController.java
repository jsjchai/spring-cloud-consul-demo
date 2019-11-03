package com.jsjchai.controller;

import com.jsjchai.service.StreamClient;
import org.apache.rocketmq.common.message.MessageConst;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jsjchai.
 */
@RestController
public class RocketMQController {

    @Autowired
    StreamClient streamClient;

    @PostMapping("/mq/send")
    public String sendMessage(){
        Map<String, Object> headers = new HashMap<>(10);
        headers.put(MessageConst.PROPERTY_TAGS, "tagStr");
        Message message = MessageBuilder.createMessage("msg", new MessageHeaders(headers));
        streamClient.output().send(message);

        return "success";
    }
}
