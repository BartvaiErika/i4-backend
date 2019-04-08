//Created by Erika
package week2programming.excercise1week2;

import week2programming.excercise1week2.Article;

public class printArticle {

    public static void main(String[] args) {

        Article article = new Article("MyTitle","MyText");
        Printer printer = new Printer();
        printer.print(article);

    }
}
