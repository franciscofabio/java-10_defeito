package com.challenge.service.interfaces;

import com.challenge.entity.Acceleration;
import com.challenge.repository.AccelerationRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AccelerationServiceImpl implements AccelerationServiceInterface {

    @Autowired
    private AccelerationRepository accelerationRepository;

    @Override
    public Acceleration save(Acceleration acceleration) {
        return this.accelerationRepository.save(acceleration);
    }

    @Override
    public List<Acceleration> findAll() {
        return null;
    }

    @Override
    public Optional<Acceleration> findById(Long id) {
        return this.accelerationRepository.findById(id);
    }

    @Override
    public Optional<Acceleration> findByName(String name) {
        return this.accelerationRepository.findByName(name);
    }

    @Override
    public List<Acceleration> findByCompanyId(Long companyId) {
        return this.accelerationRepository.findByCandidatesIdCompanyId(companyId);
    }


}
