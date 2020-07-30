package com.challenge.service.interfaces;

import com.challenge.entity.Company;
import com.challenge.repository.CompanyRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CompanyServiceImpl implements CompanyServiceInterface{

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public List<Company> findAll() {
        return this.companyRepository.findAll();
    }

    //buscar uma empresa pelo id
    @Override
    public Optional<Company> findById(Long id) {
        return this.companyRepository.findById(id);
    }

    //buscar empresas de uma aceleração
    @Override
    public List<Company> findByAccelerationId(Long accelerationId) {
        return this.companyRepository.findByAccelerationId(accelerationId);
    }

    //buscar empresas relacionadas com um usuário
    @Override
    public List<Company> findByUserId(Long userId) {
        return this.companyRepository.findByUserId(userId);
    }

    @Override
    public Company save(Company company) {
        return this.companyRepository.save(company);
    }
}
