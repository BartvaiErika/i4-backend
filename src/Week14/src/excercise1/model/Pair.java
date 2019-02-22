package excercise1.model;

import lombok.Builder;
import lombok.Data;
import paarProgramming.model.Participant;

import java.util.List;
    @Data
    @Builder
    public class Pair {

        protected List<Bean> chosedBeans;

    }


