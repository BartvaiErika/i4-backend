package at.nacs.ex5thecalculator.controller;

import at.nacs.ex5thecalculator.model.Expression;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.beans.Expression;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.skyscreamer.jsonassert.JSONAssert.assertEquals;

@SpringBootTest
class ExpressionsTest {

    @Autowired
    Expressions expressions;

    @Test
    void fromSucceeds() {
        String input = "1.62 @ 3.14";

        Expression expression = expressions.from(input);

        assertEquals(1.62, expression.getNumber1());
        assertEquals("@", expression.getSymbol());
        assertEquals(3.14, expression.getNumber2());
    }

    @ParameterizedTest
    @CsvSource({
            "1",
            "1 @",
            "1 2 @ 3"
    })
    void fromFailsBecauseOfWrongNumberOfElements(String input) {
        assertThrows(IllegalArgumentException.class, () -> expressions.from(input));
    }
}