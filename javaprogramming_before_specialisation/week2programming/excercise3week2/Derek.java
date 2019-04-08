//Created by Erika
package week2programming.excercise3week2;

public class Derek {

    public Derek() {}

    private Tool tool;

    public void setTool(Tool tool) {
        this.tool = tool;
    }

    public Boolean canHangPainting(){
        if (tool != null && tool.getName().equals("Hammer")) return true;
        else return false;
    }

    public void hangPainting() {
        if (canHangPainting()) System.out.println("You can hang the painting");
        else System.out.println("The hammer is missing");
    }

}
