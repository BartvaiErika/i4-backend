//Created by Erika
package week2programming.excercisse5week2;

import week2programming.excercise1week2.Article;

public class Editor {
    public Editor() {}


        public Magazin writeMagazine(){

            Magazin magazin = new Magazin("News");

            Article article1 = new Article("News1", "This is my first article ...");
            Article article2 = new Article("News2", "This is my second article ...");
            Article article3 = new Article("News3", "This is my third article ...");
            magazin.add(article1);
            magazin.add(article2);
            magazin.add(article3);

            return magazin;

        }
    }
