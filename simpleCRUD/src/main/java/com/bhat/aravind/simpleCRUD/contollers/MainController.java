package com.bhat.aravind.simpleCRUD.contollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/healthCheck")
    public void healthCheck(){
        System.out.println("IT IS UP!!!!!!!!");
    }
}
