package com.semih.monolithicarchitecture.excepiton;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Component
public class ErrorMessage {
    private int errorCode;
    private String message;
    private List<String> fields;
}
