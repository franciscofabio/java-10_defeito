package com.challenge.controller;

import java.util.List;
import java.util.Optional;

import com.challenge.entity.Acceleration;
import com.challenge.repository.AccelerationRepository;
import com.challenge.service.interfaces.AccelerationServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/*
* Controller - contem os metodos do Service
* Service - contem os metodos implementados de ServiceImpl
* ServiceImpl - implementa os metodos
* */
@RestController
@RequestMapping("/acceleration")
public class AccelerationController {

    @Autowired
    private AccelerationServiceInterface accelerationService;

    @GetMapping("/{id}")
    public Optional<Acceleration> findById(@PathVariable("id") Long id) {
        return this.accelerationService.findById(id);
    }

    @GetMapping("/findByName/{name}")
    public Optional<Acceleration> findById(@PathVariable("name") String name) {
        return this.accelerationService.findByName(name);
    }

    @GetMapping("/findByCompanyId/{id}")
    public List<Acceleration> findByCompanyId(@PathVariable("id") Long companyId) {
        return this.accelerationService.findByCompanyId(companyId);
    }

    @PostMapping
    public Acceleration save(@RequestBody Acceleration acceleration) {
        return this.accelerationService.save(acceleration);
    }

    @GetMapping
    public Iterable<Acceleration> findAll() {
        return this.accelerationService.findAll();
    }
}
