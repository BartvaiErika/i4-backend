package at.nacs.ex5thecalculator.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Expresssion {
    private Double number1;
    private Double number2;
    private String symbol;

}