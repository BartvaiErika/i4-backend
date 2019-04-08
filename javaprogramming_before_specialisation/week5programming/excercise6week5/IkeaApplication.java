package week5programming.excercise6week5;

public class IkeaApplication {
    public static void main(String[] args) {
        //Create a WardrobeBuilder and build one Wardrobe.
        //Display the wardrobe. It should have all the right parts.

        WardrobeBuilder wardrobeBuilder = new WardrobeBuilder();
        Wardrobe wartdrobe = wardrobeBuilder.build();

        System.out.println(wartdrobe);

    }
}
