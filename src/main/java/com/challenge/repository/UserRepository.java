package com.challenge.repository;

import com.challenge.entity.Company;
import com.challenge.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findAll();

    Optional<User> findById(Long userId);

    List<User> findByAccelerationName(String name);

    List<User> findByCompanyId(Long companyId);
}
