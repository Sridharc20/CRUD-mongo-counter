package com.assignment.assignment.controllers;

import com.assignment.assignment.repository.JobsRepo;
import com.assignment.assignment.model.Jobs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class Controllers {

    @Autowired
    private JobsRepo jobsRepo;

    @PostMapping
    public Jobs createJobs(@RequestBody Jobs jobs){

        return jobsRepo.save(jobs);
    }

    @GetMapping("/all")
    public List<Jobs> getJobs(){
        return jobsRepo.findAll();
    }
    @DeleteMapping("/all")
    public void deleteJobs(){
        jobsRepo.deleteAll();
    }


}
