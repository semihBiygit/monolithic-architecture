package com.semih.monolithicarchitecture.excepiton;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public ResponseEntity<String> handleRuntimeException(RuntimeException ex) {
        return ResponseEntity.ok("Unknown error is accured. " + ex.getMessage());
    }

    @ExceptionHandler(MonolithicManagerException.class)
    @ResponseBody
    public ResponseEntity<ErrorMessage> handleMonolithicManagerException(MonolithicManagerException ex) {
        ErrorType errorType = ex.getErrorType();
        HttpStatus httpStatus = errorType.getHttpStatus();
        return new ResponseEntity<>(createError(errorType,ex), httpStatus);
    }

    private ErrorMessage createError(ErrorType errorType, Exception exception) {
        System.out.println("Exception is accured. " + exception.getMessage());
        return ErrorMessage.builder()
                .errorCode(errorType.getErrorCode())
                .message(errorType.getMessage())
                .build();
    }
}
