package at.nacs.ex5thecalculator.controller.operaton;

import at.nacs.ex5thecalculator.model.Expresssion;
import org.springframework.stereotype.Component;

@Component
public interface Operations {
    boolean matches(Expresssion expresssion);
    double apply(Expresssion expresssion);
}
