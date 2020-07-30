package com.challenge.repository;

import com.challenge.entity.Submission;
import com.challenge.entity.SubmissionId;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;

public interface SubmissionRepository extends CrudRepository<Submission, SubmissionId> {

    List<Submission> findAll();

    //Buscar o maior score de um determinado desafio
    @Query(value = "Select Max(sub.score) from Submission sub" +
            "where sub.challenge_id = :challengeId", nativeQuery = true)
    BigDecimal findHigherScoreByChallengeId(@Param("challengeId") Long challengeId);

    @Query(value = "select * from submission sub " +
            "INNER JOIN challenge ch " +
            "ON sub.challenge_id  = ch.id " +
            "INNER JOIN acceleration acc " +
            "ON ch.id = acc.challenge_id " +
            "where ch.id = :challengeId and acc.id = :accelerationId ", nativeQuery = true)
    //buscar submissões de um determinado desafio de uma determinada aceleração
    List<Submission> findByChallengeIdAndAccelerationId(@Param("challengeId") Long challengeId, @Param("accelerationId") Long accelerationId);
}
