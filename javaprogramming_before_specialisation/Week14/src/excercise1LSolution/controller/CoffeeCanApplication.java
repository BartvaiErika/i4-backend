package excercise1LSolution.controller;

import excercise1LSolution.controller.experiment.OverallExperiment;
import excercise1LSolution.model.OverallStatistic;
import excercise1LSolution.view.Screen;

import java.util.Optional;

public class CoffeeCanApplication {

    public static void main(String[] args) {
        Optional<OverallStatistic> statistic = OverallExperiment.perform(10);
        statistic.ifPresent(Screen::display);
    }

}