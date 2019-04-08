package week8programming;

public class Remove implements Descript {
    @Override
    public String getStrategies(String line) {
        return removeRubbish(line);
    }

    private String removeRubbish(String line) {
        line.replaceAll("!","");
        return line;
    }

}
