package com.challenge.service.interfaces;

import com.challenge.entity.Candidate;
import com.challenge.entity.CandidateId;
import com.challenge.repository.CandidateRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CandidateServiceImpl implements CandidateServiceInterface {

    @Autowired
    private CandidateRepository candidateRepository;

    @Override
    public Optional<Candidate> findById(CandidateId id) {
        return this.candidateRepository.findById(id);
    }

    @Override
    public Optional<Candidate> findById(Long userId, Long companyId, Long accelerationId) {
        return Optional.empty();
    }

    //Retorna candidatos por id da company
    @Override
    public List<Candidate> findByCompanyId(Long companyId) {
        return this.candidateRepository.findByCompanyId(companyId);
    }

    @Override
    public List<Candidate> findByAccelerationId(Long accelerationId) {
        return this.candidateRepository.findByAccelerationId(accelerationId);
    }

    @Override
    public Candidate save(Candidate candidate) {
        return this.candidateRepository.save(candidate);
    }
}
