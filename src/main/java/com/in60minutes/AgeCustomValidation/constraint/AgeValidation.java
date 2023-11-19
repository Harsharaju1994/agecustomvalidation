package com.in60minutes.AgeCustomValidation.constraint;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.lang.annotation.Annotation;
import java.time.LocalDate;
import java.time.Period;

public class AgeValidation implements ConstraintValidator<Age, LocalDate> {

    @Override
    public boolean isValid(LocalDate value, ConstraintValidatorContext constraintValidatorContext) {

        return Period.between(value,LocalDate.now()).getYears()>=18;
    }
}
