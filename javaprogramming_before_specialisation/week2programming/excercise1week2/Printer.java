//Created by Erika

package week2programming.excercise1week2;

import week2programming.excercise1week2.Article;
import week2programming.excercisse5week2.Magazin;

import java.util.List;

public class Printer {

    void print(Article article) {
        System.out.println("Title is: " + article.getTitle() + "\n\n" + "Text is: " + article.getText());
    }

    public void printMagazine(Magazin magazin) {   //Made for excercise 5/week2

        List<Article> articles = magazin.getArticles();
        for (Article article:articles) {
            System.out.println(article.getTitle());
            System.out.println(article.getText());
        }

    }
}

