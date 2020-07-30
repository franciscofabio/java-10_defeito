package com.challenge.controller;

import com.challenge.entity.Challenge;
import com.challenge.service.interfaces.ChallengeServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/challenge")
public class ChallengeController {

    @Autowired
    private ChallengeServiceInterface challengeService;

    @GetMapping
    public Iterable<Challenge> findAll(){
        return this.challengeService.findAll();
    }

    @GetMapping("/findByAccelerationIdAndUserId/{accelerationId}/{userId}")
    public List<Challenge> findByAccelerationIdAndUserId(
            @PathVariable("accelerationId") Long accelerationId, @PathVariable("userId") Long userId){
        return this.challengeService.findByAccelerationIdAndUserId(accelerationId, userId);
    }

    @PostMapping
    public Challenge save(@RequestBody Challenge challenge){
        return this.challengeService.save(challenge);
    }
}
