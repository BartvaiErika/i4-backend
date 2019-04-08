package week5programming.excercise7week5;

public class DecisionMaker {
    public void displayWinner(String humanChoice, String computerChoice){
        if(humanChoice.equals("paper")){
            if(computerChoice.equals("rock")){
                System.out.println("Player1 wins!");
            }else if(computerChoice.equals("scissors")){
                System.out.println("Player2 wins!");
            }else{
                System.out.println("You are equal!");
            }
        }
        if(humanChoice.equals("rock")){
            if(computerChoice.equals("scissors")){
                System.out.println("Player1 wins!");
            }else if(computerChoice.equals("paper")){
                System.out.println("Player2 wins!");
            }else{
                System.out.println("You are equal!");
            }
        }
        if(humanChoice.equals("scissors")){
            if(computerChoice.equals("paper")){
                System.out.println("Player1 wins!");
            }else if(computerChoice.equals("rock")){
                System.out.println("Player2 wins!");
            }else{
                System.out.println("You are equal!");
            }
        }


    }
}