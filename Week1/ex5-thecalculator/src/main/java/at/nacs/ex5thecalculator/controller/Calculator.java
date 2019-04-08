package at.nacs.ex5thecalculator.controller;

import lombok.RequiredArgsConstructor;
import lombok.Builder;
import org.springframework.expression.Expression;
import org.springframework.stereotype.Component;
import java.util.Set;

@Component
@RequiredArgsConstructor
public class Calculator {
    private final Set<String> operators;  //= Set.of("+","-", "*","/", "=");

    public double calculate (Expression expression) throws IllegalArgumentException {
        return operators.stream()
                .filter(e->e.matches(expression))
                .map(e->e)
               / .map(e->e.apply(expression))
                .findFirst()
                .orElseThrow(IllegalArgumentExpectation::new);
    }

}
