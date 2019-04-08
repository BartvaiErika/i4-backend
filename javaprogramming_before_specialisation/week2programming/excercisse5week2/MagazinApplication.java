//Created by Erika
package week2programming.excercisse5week2;

import week2programming.excercise1week2.Article;
import week2programming.excercise1week2.Printer;
import week2programming.excercise1week2.Printer;

import java.util.List;
import java.util.ArrayList;

public class MagazinApplication {

    //private ArrayList<String> listOfArticle;

    public static void main(String[] args) {
        Editor editor = new Editor();
      //  Magazin magazin = new Magazin("News");
        Magazin magazin = editor.writeMagazine();
        Printer printer = new Printer();
        printer.printMagazine(magazin);

    }
}
