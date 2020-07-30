package com.challenge.service.interfaces;

import com.challenge.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserServiceInterface extends ServiceInterface<User> {

    List<User> findAll();

    //buscar um usuário por id
    Optional<User> findById(Long userId);

    //busca candidatos pelo nome da aceleração
    List<User> findByAccelerationName(String name);

    //buscar usuários relacionados com uma empresa
    List<User> findByCompanyId(Long companyId);

    User save(User user);


}
