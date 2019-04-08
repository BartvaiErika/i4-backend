package com.example.excercise10creditcards;

import lombok.Data;
    @Data
    public class CreditCardIssuer {
        private String name;
        private Integer length;
        private String startWith;
        private String startNotWith;
        private Boolean isValid;

}
