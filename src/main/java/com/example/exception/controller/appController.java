package com.example.exception.controller;

import com.example.exception.model.App;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "app")

public class appController {

    @Autowired
    private App app;

    @GetMapping
    public ResponseEntity<String> greet() {
        return new ResponseEntity<>("Good Morning", HttpStatus.ACCEPTED);
    }



}
