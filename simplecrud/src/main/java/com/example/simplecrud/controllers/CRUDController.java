package com.example.simplecrud.controllers;

import com.example.simplecrud.Entity.Clans;
import com.example.simplecrud.repository.SimpleCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CRUDController {
    @Autowired
    SimpleCrudRepository simpleCrudRepository;

    @GetMapping("/getclans")
     public Iterable<Clans> getclanDetails(){
        System.out.println("It is working");
        return simpleCrudRepository.findAll();

     }
     @GetMapping("/healthcheck")
     public String getHealth(){

         return "I AM HEALTHY!!!!!!!";
     }
     @PostMapping("/addclan")
     public String addClan(@RequestParam int id, @RequestParam String name){
        Clans clan=new Clans();
        clan.setName(name);
        simpleCrudRepository.save(clan);
        return "SUCCESS";
     }

}
