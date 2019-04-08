package at.nacs.ex5thecalculator.controller.operaton;

import at.nacs.ex5thecalculator.model.Expresssion;


public class Division implements Operations {

    @Override
    public boolean matches(Expresssion expresssion) {
        return expresssion.getSymbol().equals("/");
    }

    @Override
    public double apply(Expresssion expresssion) {
        if (expresssion.getNumber2().equals(0.0)&&(expresssion.getNumber1()>0.0)) {
            return Double.POSITIVE_INFINITY;
        }
        if (expresssion.getNumber2().equals(0.0)&&(expresssion.getNumber1()<0.0)) {
            return Double.NEGATIVE_INFINITY;
        }
        return expresssion.getNumber1() / expresssion.getNumber2();
    }
}
