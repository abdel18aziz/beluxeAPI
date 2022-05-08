package com.beluxe.beluxeAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

public class controller {

     private final AtomicLong ct = new AtomicLong();

     @GetMapping("/men")
     public MEN fn(@RequestParam(value = "id", defaultValue = "0") int id,@RequestParam(value="name",defaultValue = "anyshoe") String Name){
         return new MEN((int) ct.incrementAndGet(),Name,"199$","150$");
     }

}
