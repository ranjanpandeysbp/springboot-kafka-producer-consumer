package com.mycompany.myappproducer.controller;

import com.mycompany.myappproducer.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {

    @Autowired
    private KafkaProducer kafkaProducer;

    @GetMapping("/publish")
    public String publishMessage(@RequestParam("msg") String msg){
        return kafkaProducer.sendMessage(msg);
    }
    @PostMapping("/publish")
    public String publishObject(@RequestBody String obj){
        return kafkaProducer.sendMessage(obj);
    }
}
