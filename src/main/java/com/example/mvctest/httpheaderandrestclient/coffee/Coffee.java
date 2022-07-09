package com.example.mvctest.httpheaderandrestclient.coffee;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Coffee {

    private long id;
    private String korName;
    private String engName;
    private int price;

    @Getter
    public enum CoffeeSize {

        TALL(0, "350ml"),
        GRANDE(500, "500ml"),
        VENTI(1000, "650ml");

        private final int additionalCharge;
        private final String volume;

        CoffeeSize(int additionalCharge, String volume) {
            this.additionalCharge = additionalCharge;
            this.volume = volume;
        }
    }

}
