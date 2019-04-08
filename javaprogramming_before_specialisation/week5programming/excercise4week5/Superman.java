package week5programming.excercise4week5;

    import week5programming.excercise5week5.Villain;

    public class Superman implements Superhero {

        @Override
        public String getName() {
            return "superman";
        }

        @Override
        public void fight(Villain villain) {
            villain.weaken(getName());
        }

        @Override
        public String toString() {
            return "superman";
        }

    }


