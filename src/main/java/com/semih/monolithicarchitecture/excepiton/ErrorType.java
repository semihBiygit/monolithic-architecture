package com.semih.monolithicarchitecture.excepiton;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum ErrorType {

    USER_NOT_FOUND(1000, "User not found", INTERNAL_SERVER_ERROR),
    USER_CANNOT_BE_SAVED(1001, "User cannot be saved", INTERNAL_SERVER_ERROR),
    PRODUCT_NOT_FOUND(2000, "Product not found", INTERNAL_SERVER_ERROR);

    private int errorCode;
    private String message;
    HttpStatus httpStatus;
}
