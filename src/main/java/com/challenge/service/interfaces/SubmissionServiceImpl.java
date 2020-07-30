package com.challenge.service.interfaces;

import com.challenge.entity.Submission;
import com.challenge.repository.SubmissionRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
@AllArgsConstructor
public class SubmissionServiceImpl implements SubmissionServiceInterface{

    @Autowired
    private SubmissionRepository submissionRepository;

    @Override
    public List<Submission> findAll() {
        return this.submissionRepository.findAll();
    }

    @Override
    public BigDecimal findHigherScoreByChallengeId(Long challengeId) {
        return this.submissionRepository.findHigherScoreByChallengeId(challengeId);
    }

    @Override
    public List<Submission> findByChallengeIdAndAccelerationId(Long challengeId, Long accelerationId) {
        return this.submissionRepository.findByChallengeIdAndAccelerationId(challengeId, accelerationId);
    }

    @Override
    public Submission save(Submission submission) {
        return this.submissionRepository.save(submission);
    }
}
