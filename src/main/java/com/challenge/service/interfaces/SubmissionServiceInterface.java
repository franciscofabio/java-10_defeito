package com.challenge.service.interfaces;

import com.challenge.entity.Submission;

import java.math.BigDecimal;
import java.util.List;

public interface SubmissionServiceInterface extends ServiceInterface<Submission> {

    List<Submission> findAll();

    BigDecimal findHigherScoreByChallengeId(Long challengeId);

    List<Submission> findByChallengeIdAndAccelerationId(Long challengeId, Long accelerationId);

    Submission save(Submission submission);

}
