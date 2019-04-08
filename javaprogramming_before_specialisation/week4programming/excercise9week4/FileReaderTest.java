package week4programming.excercise9week4;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class FileReaderTest {

    @Test
    public void getLines() {
        String actual = "week4programming/excercise9week4/lorem-ipsum.txt";
        String expected = "week4programming/excercise9week4/lorem-ipsum.txt";
        Assertions.assertEquals(expected,actual,"Your path is notcorrect");

    }

}
