package com.challenge.controller;

import com.challenge.entity.Candidate;
import com.challenge.entity.CandidateId;
import com.challenge.service.interfaces.CandidateServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    @Autowired
    private CandidateServiceInterface candidateService;

    @GetMapping("/{id}")
    public Optional<Candidate> findId(@PathVariable("id") CandidateId id){
        return this.candidateService.findById(id);
    }

    @GetMapping("/findByCompanyId/{companyId}")
    public List<Candidate> findByCompanyId(@PathVariable("companyId") Long companyId){
        return this.candidateService.findByCompanyId(companyId);
    }

    @GetMapping("/findByAccelerationId/{accelerationId}")
    public List<Candidate> findByAccelerationId(@PathVariable("accelerationId") Long accelerationId){
        return this.candidateService.findByAccelerationId(accelerationId);
    }

    @PostMapping()
    public Candidate save(@RequestBody Candidate candidate){
        return this.candidateService.save(candidate);
    }

}
