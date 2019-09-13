package io.github.jetqin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @RequestMapping("/greeting")
    public String greeting(){
        return "Greeting";
    }
}
