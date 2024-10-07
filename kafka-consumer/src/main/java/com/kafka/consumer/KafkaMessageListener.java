package com.kafka.consumer;

import com.kafka.dto.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {

    Logger log = LoggerFactory.getLogger(KafkaMessageListener.class);

//    @KafkaListener(topics = "javatechie-demo",groupId = "jt-group")
//    public void consumeEvents(Customer customer) {
//        log.info("consumer consume the events {} ", customer.toString());
//    }


//    @KafkaListener(topics = "javatechie-topic1",groupId = "jt-group",
//                    topicPartitions = {@TopicPartition(topic = "javatechie-topic1", partitions = {"2"})})
//    public void consumeEvents(String customer) {
//        log.info("consumer consume the events {} ", customer.toString());
//    }
}

