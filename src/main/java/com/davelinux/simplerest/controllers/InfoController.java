package com.davelinux.simplerest.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/info")
public class InfoController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String getInfo() {
        return "this is the info";
    }
}
