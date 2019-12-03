package com.example.asyncdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/trigger")
public class AController {
    
    @Autowired
    AService aService;
    
    @GetMapping("/myjob/{message}")
    public String triggerMyJob(@PathVariable String message,@RequestParam Long delay) throws InterruptedException {
        
        aService.myJob(message,delay);
        
        return message;
    }
}
