package com.example.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Enter {
    @RequestMapping("/enter")
    public String enter(){
        return "two";
    }
}
