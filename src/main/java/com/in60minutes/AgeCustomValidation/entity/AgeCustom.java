package com.in60minutes.AgeCustomValidation.entity;

import com.in60minutes.AgeCustomValidation.constraint.Age;
import com.in60minutes.AgeCustomValidation.constraint.Pan;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name="User_Data")
@Data
public class AgeCustom {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotBlank(message = "")
    private String name;

    @Age(message = "Age still not 18 years")
    private LocalDate dob;
//    @Pattern(regexp = "[A-Z]{5}[0-9]{4}[A-Z]{1}")
    @Pan
    private String pan;
}
