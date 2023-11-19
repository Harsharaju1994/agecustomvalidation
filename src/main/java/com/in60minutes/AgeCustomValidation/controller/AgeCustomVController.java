package com.in60minutes.AgeCustomValidation.controller;

import com.in60minutes.AgeCustomValidation.entity.AgeCustom;
import com.in60minutes.AgeCustomValidation.repository.AgeCustomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AgeCustomVController {

    @Autowired
    AgeCustomRepo ageCustomRepo;

    @PostMapping("/postUser")
    public AgeCustom postData(@Validated @RequestBody AgeCustom ageCustom){
        return ageCustomRepo.save(ageCustom);
    }

    @GetMapping("/getAll")
    public List<AgeCustom> getAll(){
        return ageCustomRepo.findAll();
    }
}
