package com.challenge.service.interfaces;

import com.challenge.entity.Challenge;
import com.challenge.repository.ChallengeRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ChallengeServiceImpl implements ChallengeServiceInterface{

    @Autowired
    private ChallengeRepository challengeRepository;

    @Override
    public List<Challenge> findAll() {
        return this.challengeRepository.findAll();
    }

    //buscar desafios feitos por um usuario em determinada aceleração
    @Override
    public List<Challenge> findByAccelerationIdAndUserId(Long accelerationId, Long userId) {
        return this.challengeRepository.findByAccelerationIdAndUserId(accelerationId, userId);
    }

    @Override
    public Challenge save(Challenge challenge) {
        return this.challengeRepository.save(challenge);
    }
}
