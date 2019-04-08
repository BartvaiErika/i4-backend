//Created by Erika
package week2programming.excercisse5week2;

import week2programming.excercise1week2.Article;
import java.util.ArrayList;
import java.util.List;

public class Magazin {
    private String title;
    private ArrayList <Article> listOfArticle = new ArrayList<>();

    public Magazin (String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void add (Article article) {
        listOfArticle.add(article);
    }

    public List<Article> getArticles() {
        return listOfArticle;
    }

}
