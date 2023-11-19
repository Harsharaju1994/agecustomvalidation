package com.in60minutes.AgeCustomValidation.repository;

import com.in60minutes.AgeCustomValidation.entity.AgeCustom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgeCustomRepo extends JpaRepository<AgeCustom,Integer> {
}
