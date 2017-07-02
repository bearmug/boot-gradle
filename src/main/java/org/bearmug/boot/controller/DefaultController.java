package org.bearmug.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @RequestMapping("/")
    public String root() {
        return "It`s running and current timestamp is " + System.currentTimeMillis();
    }
}
