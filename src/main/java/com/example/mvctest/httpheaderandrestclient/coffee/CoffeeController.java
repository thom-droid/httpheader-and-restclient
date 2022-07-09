package com.example.mvctest.httpheaderandrestclient.coffee;

import com.example.mvctest.httpheaderandrestclient.coffee.dto.CoffeePostDto;
import com.example.mvctest.httpheaderandrestclient.coffee.dto.CoffeeResponseDto;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;

@RequestMapping(path = "/coffees")
@RestController
public class CoffeeController {


    @PostMapping
    public ResponseEntity<CoffeeResponseDto> postCoffee(@RequestBody @Valid CoffeePostDto coffeePostDto,
                                                        @RequestHeader Map<String, String> headers) {

        headers.forEach((v, k) ->{
            System.out.println("header :" +v+ ", value : " + k);
            System.out.println(k);
        });

        return new ResponseEntity<>(
                CoffeeResponseDto.builder()
                        .engName(coffeePostDto.getEngName())
                        .korName(coffeePostDto.getKorName())
                        .price(coffeePostDto.getPrice())
                        .build(),
                HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<CoffeeResponseDto> getCoffee(HttpEntity httpEntity) {

    }
}
