package week8programming;

public class RemoveAllRobomime implements Descript {

@Override
    public String getStrategies(String line) {
    String lineWithoutRubbish = removeRubbish(line);
        return removeRobomime(lineWithoutRubbish);
    }


    private String removeRubbish(String line) {
        line= line.replaceAll("#","");
        return line;
    }
    private String removeRobomime(String line) {
        line=line.replaceAll("robomine","");
        return line;
    }


}
