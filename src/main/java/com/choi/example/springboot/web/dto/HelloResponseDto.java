package com.choi.example.springboot.web.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class HelloResponseDto {
    private final String name;
    private final int amount;

}
