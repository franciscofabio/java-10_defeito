package com.challenge.service.interfaces;

import com.challenge.entity.Company;

import java.util.List;
import java.util.Optional;

public interface CompanyServiceInterface extends ServiceInterface<Company> {

    List<Company> findAll();

    //buscar uma empresa pelo id
    Optional<Company> findById(Long id);

    //buscar empresas de uma aceleração
    List<Company> findByAccelerationId(Long accelerationId);

    //buscar empresas relacionadas com um usuário
    List<Company> findByUserId(Long userId);

    //Cria ou altera uma empresa
    Company save(Company company);

}
