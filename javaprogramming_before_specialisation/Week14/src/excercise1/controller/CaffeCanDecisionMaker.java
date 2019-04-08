package excercise1.controller;

import excercise1.model.Bean;
import lombok.Builder;
import lombok.experimental.UtilityClass;

import java.util.*;
import java.util.List;

public class CaffeCanDecisionMaker {

    private Random random = new Random();
    public String lastBeanColor;
    public Integer numberOfSelections = 0;
    public Integer lastBeanBlackCounter = 0;
    public Integer lastBeanWhiteCounter = 0;

    //@UtilityClass
    @Builder
    public Integer getRandomNumberOfBeans(Integer RandomIntevall) {
        return random.nextInt(RandomIntevall);
    }

    public String getRandomColorOfBeans() {
        Integer randomNumber=random.nextInt(2);
        if (randomNumber.equals(1)) {
            return "white";
        }
        return "black";
    }

    private List<Bean> getCaffeCan() {
       List <Bean> CaffeCan = new ArrayList<Bean>();
        for (int i = 0; i < getRandomNumberOfBeans(10) ; i++) {
            CaffeCan.addAll(getOneBean());
        }
        return CaffeCan;
    }

    public Bean getOneBean() {
        return Bean.builder().colour(getRandomColorOfBeans()).build();
    }

    public List<Bean> getPairOfBeans() {
        return Arrays.asList(Bean.builder().colour(getRandomColorOfBeans()).build(),
                Bean.builder().colour(getRandomColorOfBeans()).build());
    }

    public Boolean  checkColor(List <Bean> pairsOfBeans) {
        return pairsOfBeans.stream()
                .distinct()
                .count()==1;
    }

    public List<Bean> manipulateCaffeCan (List<Bean> CaffeCan) {
        while(CaffeCan.size()>1) {
            List<Bean> selectedBeans = createPair(CaffeCan);
            if (checkColor(selectedBeans)) {
                CaffeCan.add(Bean.builder().colour("black").build());
            } else {
                CaffeCan.add(Bean.builder().colour("white").build());
            }
            numberOfSelections++;
        }
        if (CaffeCan.size()==1) {
            lastBeanColor = CaffeCan.get(0).getColour();
            if (lastBeanColor.equalsIgnoreCase("white"))
                lastBeanWhiteCounter++;
            else lastBeanBlackCounter++;
        }
        return CaffeCan;
    }

    private List<Bean> createPair(List<Bean> CaffeCan) {
        List<Bean> selectedBeans = new ArrayList<>();
        Bean bean1 = CaffeCan.remove(0);
        Bean bean2 = CaffeCan.remove(0);
        selectedBeans.add(bean1);
        selectedBeans.add(bean2);
        return selectedBeans;
    }

    public String getLastBeanColor() {
        return lastBeanColor;
    }

    public Integer NumberOfSelections() {
        return numberOfSelections;
    }

    public String countLastBeansApperiance() {
        Double whiteBeanLastPercentage = (double) lastBeanWhiteCounter/(lastBeanBlackCounter+lastBeanWhiteCounter);
        Double blackBeanLastPercentage = 100 - whiteBeanLastPercentage;
        return "White beans was the last " + lastBeanWhiteCounter +
                " times and black beans was the last " + lastBeanBlackCounter + " times.";
    }
}
