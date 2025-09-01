package com.example.simplecrud.service;

import com.example.simplecrud.Entity.Clans;
import com.example.simplecrud.repository.SimpleCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SimpleCrudService {
    @Autowired
    SimpleCrudRepository simpleCrudRepository;
    public Iterable<Clans> getClansDetails(){

        return simpleCrudRepository.findAll();
    }
    public String addClan(Clans clan){
        simpleCrudRepository.save(clan);
        return "success";
    }

}
