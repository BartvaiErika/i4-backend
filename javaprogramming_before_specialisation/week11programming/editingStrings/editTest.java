package week11programming.editingStrings;

public class editTest {
    public static void main(String[] args) {
        EditingOfStrings editingOfStrings= new EditingOfStrings();
        String test1 = "pal";
        String test2 = "pale";
        System.out.println("comporison: "+  editingOfStrings.editableInOneStep(test1,test2));
        System.out.println("Letter: " + test1.charAt(test1.length()-1));

    }
}
