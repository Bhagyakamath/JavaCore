package com.example.exception;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE, ElementType.METHOD})
@Constraint(validatedBy = PasswordValidation.class)
public @interface PasswordValidator {
	String message() default "invalidPassword";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
}
