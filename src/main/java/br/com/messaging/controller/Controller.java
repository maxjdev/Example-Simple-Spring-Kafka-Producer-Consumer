package br.com.messaging.controller;

import br.com.messaging.producer.Producer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class Controller {
    private Producer service;

    public Controller(Producer service) {
        this.service = service;
    }

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name) {
        service.sendMessage("Hello " + name);
        return "OK";
    }
}
