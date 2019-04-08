package week8programming;
import java.util.ArrayList;
import java.util.List;


public class Decriptor {
    Remove remove = new Remove();
    RemoveAllRobomime removeAllRobomime  = new RemoveAllRobomime();
    RemoveAndReverse removeAndReverse = new RemoveAndReverse();
    List <String> lines = readLines();

    List<String> trickes  = new ArrayList();

    public List<String> getTrickes() {
        for (String line : lines) {
            if (line.contains("!")) {
                trickes .add(remove.getStrategies(line)) ;
            }
            else if (line.contains("&")) {
                trickes.add(removeAndReverse.getStrategies(line));
            }
            else if (line.contains("#")) {
             trickes.add(removeAllRobomime.getStrategies(line));
            }
        }
        return trickes;
    }

    private List<String> readLines() {
        FileReader reader = new FileReader();
        List <String> lines = reader.getLines("/home/erika/IdeaProjects/java-projects/src/week8programming/robomime.txt");
        return lines;
    }
}
