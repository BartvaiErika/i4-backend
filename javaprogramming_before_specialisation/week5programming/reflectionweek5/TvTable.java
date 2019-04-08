package week5programming.reflectionweek5;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

 //The table needs the following parts to be finished: four legs, one shelf and one top.

    public class TvTable implements Furniture {

        List<String> parts = new ArrayList<>();

        public List<String> getParts() {
            return parts;
        }


        @Override
        public void add (String part) {
            parts.add(part);
        }
        @Override
        public String toString() {
            return "TVTable {" + "parts=" + parts + '}';
        }


    }


