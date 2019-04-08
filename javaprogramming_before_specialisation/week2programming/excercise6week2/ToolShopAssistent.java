//Created by Erika
package week2programming.excercise6week2;

import week2programming.excercise3week2.Tool;
import week2programming.excercise3week2.Tool;

public class ToolShopAssistent {
    public static void main(String[] args) {
        ShopAssistent shopAssistent = new ShopAssistent();
        Tool too11 = new Tool("hammer");
        Tool tool2 = new Tool("pincer");
        Tool tool3 = new Tool("nail");
        Toolbox toolbox = new Toolbox("red");
        toolbox.add(too11);
        toolbox.add(tool2);
        toolbox.add(tool3);
        shopAssistent.findToolbox(toolbox);


    }
}
