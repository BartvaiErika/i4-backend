package at.nacs.ex5thecalculator.controller.operaton;

import at.nacs.ex5thecalculator.model.Expresssion;
import org.springframework.stereotype.Component;

@Component
public class Substraction implements Operations {
    @Override
    public boolean matches(Expresssion expresssion) {
        return expresssion.getSymbol().equals("-");
    }

    @Override
    public double apply(Expresssion expresssion) {
        return expresssion.getNumber1() - expresssion.getNumber2();
    }
}
