package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@Controller
@RestController
public class ApiСontroller {
    @GetMapping("books")
    public ResponseEntity<String> getText() {
        return ResponseEntity.ok("Я Варя Березецкая сделала работу и получилось создать и запустить сервис");
    }
}