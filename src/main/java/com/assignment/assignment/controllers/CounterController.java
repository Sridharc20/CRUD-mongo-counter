package com.assignment.assignment.controllers;

import com.assignment.assignment.model.Counter;
import com.assignment.assignment.repository.CounterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class CounterController {


    @Autowired
    private CounterRepo counterRepo;

    @GetMapping("/counter")
    public List<Counter> counter(){
        return counterRepo.findAll();
    }

    @GetMapping("/counter/count")
    private List<Counter> Startcounter(){

        Optional<Counter> counter = counterRepo.findById(1);
        counter.setP
        return counterRepo.findAll();
    }
}
