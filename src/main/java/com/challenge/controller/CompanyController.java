package com.challenge.controller;

import com.challenge.entity.Company;
import com.challenge.service.interfaces.CompanyServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyServiceInterface companyService;

    @GetMapping
    public Iterable<Company> findAll(){
        return this.companyService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Company> findById(@PathVariable("id") Long id){
        return this.companyService.findById(id);
    }

    @GetMapping("/findByAccelerationId/{accelerationId}")
    public List<Company> findByAccelerationId(@PathVariable("accelerationId") Long accelerationId){
        return this.companyService.findByAccelerationId(accelerationId);
    }

    @GetMapping("/findByUserId/{userId}")
    public List<Company> findByUserId(@PathVariable("userId") Long userId){
        return this.companyService.findByUserId(userId);
    }

    @PostMapping
    public Company save(@RequestBody Company company){
        return this.companyService.save(company);
    }
}
