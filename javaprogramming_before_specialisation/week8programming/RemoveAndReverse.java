package week8programming;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class RemoveAndReverse implements Descript {

    String reversedLine;
    @Override
    public String getStrategies(String line) {
        String lineWithoutRubbish = removeRubbish(line);
        return reverseLine(lineWithoutRubbish);
    }

    private String removeRubbish(String line) {
        line = line.replaceAll("&","");
        return line;
    }

    private String reverseLine(String line) {
        for (int i = 0; i < line.length()-1; i++) {
            reversedLine  += line.substring(line.length()-1-i) ;
        }
        return reversedLine;
    }


}
