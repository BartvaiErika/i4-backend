package excercise1;

import excercise1.controller.CaffeCanDecisionMaker;
import excercise1.model.Bean;
import lombok.extern.java.Log;
import java.util.logging.Logger;

public class CaffeCanApplication {


    CaffeCanDecisionMaker decisionMaker = new CaffeCanDecisionMaker();
    public static void main(String[] args) {

        Bean bean = Bean.builder().build();
        CaffeCanDecisionMaker decisionMaker = new CaffeCanDecisionMaker();
        System.out.println(getPercentageBetweenBlackAndWhite());
        System.out.println("Which was the colour of the last one? " + ColorOfLastBean()) ;
        System.out.println("How many tries were performed? " + getNumberOfSelections());
        System.out.println(countLastBeansApperiance());
    }

// Statistics:
// 1.) We want to know how many coffee beans were white and black,
// the percentage ratio between them (as in white ratio 54.17% and black ratio 45.83%),
    public static String getPercentageBetweenBlackAndWhite() {
        CaffeCanDecisionMaker decisionMaker = new CaffeCanDecisionMaker();
        Double PercentageOfWhiteBeans = (double) decisionMaker.lastBeanWhiteCounter;
        Double PercentageOfBlackBeans = 100 - PercentageOfWhiteBeans;
        return "Percentage of white beans is " + PercentageOfWhiteBeans +
                " % and the percentage of black beans is " + PercentageOfBlackBeans + " %.";
    }
// 2.) Which was the colour of the last one?
    public static String ColorOfLastBean() {
        CaffeCanDecisionMaker decisionMaker = new CaffeCanDecisionMaker();
        return decisionMaker.getLastBeanColor();
    }
// 3.) How many tries were performed?
    public static Integer getNumberOfSelections() {
        CaffeCanDecisionMaker decisionMaker = new CaffeCanDecisionMaker();
        return decisionMaker.numberOfSelections;
    }

// 4.) How many total black and white beans were generated with their percentage ratios?

// 5.) How many times was the last bean black or white with their percentage ratios as well?
    public static String countLastBeansApperiance() {
        CaffeCanDecisionMaker decisionMaker = new CaffeCanDecisionMaker();
        return decisionMaker.countLastBeansApperiance();
    }
}
