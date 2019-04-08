package week5programming.excercise7week5;

public class AnswerProvider {
    public String getChoiceOfHuman(){
        Human human = new Human();
        return human.getChoice();
    }
    public String getChoiceOfComputer(){
        Computer computer = new Computer();
        return computer.getChoice();
    }
}