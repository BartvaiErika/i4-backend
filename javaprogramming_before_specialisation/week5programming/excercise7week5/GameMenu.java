package week5programming.excercise7week5;

import java.util.Arrays;
import java.util.List;

public class GameMenu {
    private List<String> moves = Arrays.asList("rock","scissors","paper");
    private AnswerProvider answerProvider = new AnswerProvider();
    private Human human = new Human();
    private Computer computer = new Computer();
    private DecisionMaker decisionMaker = new DecisionMaker();

    public void displayMenu(){
        System.out.println("Let’s play rock, paper, scissors!");
        showOptions();
        String humansChoice = answerProvider.getChoiceOfHuman();
        while (!moves.contains(humansChoice)){
            showOptions();
            humansChoice = answerProvider.getChoiceOfHuman();
        }
        String computerChoice = answerProvider.getChoiceOfComputer();
        displayAllAnswers(humansChoice, computerChoice);
        decisionMaker.displayWinner(humansChoice,computerChoice);

    }

    private void showOptions(){
        System.out.println("These are your options: rock, paper, scissors.");
        System.out.println("Choose one :");
    }

    private void displayAllAnswers(String humansChoice, String computerChoice) {
        System.out.println(human.getName() + "choose : " + humansChoice);
        System.out.println(computer.getName() + "choose : "+ computerChoice);
    }
}