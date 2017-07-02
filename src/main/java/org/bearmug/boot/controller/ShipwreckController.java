package org.bearmug.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class ShipwreckController {

    @RequestMapping(value = "shipwrecks", method = RequestMethod.GET)
    public List<org.bearmug.boot.model.Shipwreck> list() {
        return ShipwreckStub.list();
    }
}
