package com.challenge.repository;

import com.challenge.entity.Candidate;
import com.challenge.entity.CandidateId;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CandidateRepository extends CrudRepository<Candidate, Long> {

    List<Candidate> findAll();

    Optional<Candidate> findById(CandidateId id);

    List<Candidate> findByCompanyId(Long companyId);

    List<Candidate> findByAccelerationId(Long accelerationId);
}
