package at.nacs.ex5thecalculator.controller;

import at.nacs.ex5thecalculator.model.Expresssion;
import lombok.Builder;
import org.springframework.stereotype.Component;

@Component
public class Expressions {
    public Expresssion from (String input) throws IllegalArgumentException {
        String[] ubputs = input.split(" ");
       // if (input.equals("@")) throw new IllegalArgumentException();
        if (input.length()!=3) throw new IllegalArgumentException();
        return Exception.builder()
                .number1(Double.valueOf(inputs[0]))
                .symbol(inputs[1])
                .number2(Double.valueOf(inputs[2]))
                .build();
    }
}