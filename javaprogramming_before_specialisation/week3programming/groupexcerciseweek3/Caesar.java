package week3programming.groupexcerciseweek3;
import java.util.ArrayList;
import java.util.List;

public class Caesar {

    //Encrypt: GTA.Wert = (KTA.Wert + key)  MOD 26
    // Decrypt: KTA.Wert = (GTA.Wert - key + 26) MOD 26

    public String encrypt(String message, Integer key){
        List<Character> newLetters = new ArrayList<>();

        for(int position=0; position<message.length(); position++) {
            Character letter = message.charAt(position);
            int valueOfLetter = letter;
            if (Character.isAlphabetic(valueOfLetter)) {
                Character newLetter = shift(letter, key);
                newLetters.add(newLetter);
            } else {
                newLetters.add(letter);
            }
        }
        String newMessage = combineLetter(newLetters);
        return newMessage;
    }

    private String combineLetter(List<Character> newLetters) {
        String newMessage = "";
        for (Character letter : newLetters){
            newMessage += letter.toString();
        }
        return newMessage;
    }

    private Character shift(Character letter, Integer key) {
        int valueOfLetter = letter;
        int shiftedValue = valueOfLetter + key;
        if(isCapitalLetter(valueOfLetter)){
            shiftedValue = (shiftedValue -65)%26 + 65;
        }else{
            shiftedValue = (shiftedValue -97)%26 + 97;
        }
        Character newletter = (char)shiftedValue;
        return newletter;
    }

    private Boolean isCapitalLetter(int valueOfLetter){
        return valueOfLetter <=90 ;
    }

}
