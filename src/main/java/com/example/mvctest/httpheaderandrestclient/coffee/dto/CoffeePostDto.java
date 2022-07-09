package com.example.mvctest.httpheaderandrestclient.coffee.dto;

import com.example.mvctest.httpheaderandrestclient.coffee.Coffee;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Valid
public class CoffeePostDto {

    @NotEmpty
    private String korName;

    @NotEmpty
    private String engName;

    @Positive
    private int price;

}
