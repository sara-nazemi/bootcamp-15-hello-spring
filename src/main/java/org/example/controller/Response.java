package org.example.controller;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Response <T> {
    private String message;
    private T data;

}
