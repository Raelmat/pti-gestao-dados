package com.apiPTI.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.time.LocalDateTime;
import java.util.Map;


@RestController
public class StatusController {


@GetMapping("/status")
public Map<String, String> status() {
return Map.of(
"status", "online",
"versao", "1.0.0",
"autor", "Israel Felipe",
"hora", LocalDateTime.now().toString()
);
}
}