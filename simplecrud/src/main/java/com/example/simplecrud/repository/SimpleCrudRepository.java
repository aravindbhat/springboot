package com.example.simplecrud.repository;

import com.example.simplecrud.Entity.Clans;
import org.springframework.data.repository.CrudRepository;

public interface SimpleCrudRepository extends CrudRepository<Clans, Integer> {
}