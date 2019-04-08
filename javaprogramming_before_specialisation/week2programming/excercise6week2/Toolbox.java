//Created by Erika
package week2programming.excercise6week2;
import week2programming.excercise3week2.Tool;
import java.util.List;

public class Toolbox {
    private String color;
    private List<Tool> listOfTool;

    public Toolbox(String color) {
    }

    public void getTool(List<Tool> toolbox) {
        listOfTool = toolbox;
    }

    public void add (Tool tool) {
        listOfTool.add(tool);
    }
}


