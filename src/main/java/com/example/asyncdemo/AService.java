package com.example.asyncdemo;

import java.util.concurrent.CompletableFuture;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AService {
    
    @Async
    public CompletableFuture<String> myJob(String message,long dealy) throws InterruptedException {
        Thread.sleep(dealy + 2000);
        System.out.println("Message : " + message);
        return CompletableFuture.completedFuture(message);
    }
}
