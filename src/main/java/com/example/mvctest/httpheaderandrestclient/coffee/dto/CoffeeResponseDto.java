package com.example.mvctest.httpheaderandrestclient.coffee.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CoffeeResponseDto {

    private String korName;

    private String engName;

    private int price;
}
