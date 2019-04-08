package week11programming.editingStrings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class EditingOfStringsTest {
    EditingOfStrings editingOfStrings = new EditingOfStrings();

    @Test
    void editableInOneStep() {
        String word1= "pala";
        String word2= "bala";
        Boolean actuel = editingOfStrings.editableInOneStep(word1,word2);
        Boolean expected = true;
        Assertions.assertEquals(expected,actuel);

    }
}