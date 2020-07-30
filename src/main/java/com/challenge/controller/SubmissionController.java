package com.challenge.controller;

import com.challenge.entity.Submission;
import com.challenge.service.interfaces.SubmissionServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/submission")
public class SubmissionController {

    @Autowired
    private SubmissionServiceInterface submissionService;

    @GetMapping
    public Iterable<Submission> findAll(){
        return this.submissionService.findAll();
    }

    @GetMapping("/findHigherScoreByChallengeId/{challengeId}")
    public BigDecimal findHigherScoreByChallengeId(@PathVariable("challengeId") Long challengeId){
        return this.submissionService.findHigherScoreByChallengeId(challengeId);
    }

    @GetMapping("/findByChallengeIdAndAccelerationId/{challengeId}/{accelerationId}")
    public List<Submission> findByChallengeIdAndAccelerationId(
            @PathVariable("challengeId") Long challengeId, @PathVariable("accelerationId") Long accelerationId){
        return this.submissionService.findByChallengeIdAndAccelerationId(challengeId, accelerationId);
    }

    @PostMapping
    public Submission save(@RequestBody Submission submission){
        return this.submissionService.save(submission);
    }
}
