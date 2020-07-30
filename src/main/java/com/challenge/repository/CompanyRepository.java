package com.challenge.repository;

import com.challenge.entity.Company;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CompanyRepository extends CrudRepository<Company, Long> {

    List<Company> findAll();

    Optional<Company> findById(Long id);

    List<Company> findByAccelerationId(Long accelerationId);

    List<Company> findByUserId(Long userId);
}
