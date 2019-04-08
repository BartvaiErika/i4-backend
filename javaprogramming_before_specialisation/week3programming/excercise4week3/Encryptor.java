//Created by Erika
//When they write a message, the vowels will be replaced so:
//A ​ and ​ a ​ become a 4.
//E ​ and ​ e ​ become a 3.
//I ​ and ​ i ​ become a 1.
//O and o ​ become a 8.
//U ​ and ​ u ​ become a 9
//rubbish characters ​ !@#$%&*+-=

package week3programming.excercise4week3;

import java.util.*;
import java.util.Collections;

public class Encryptor {

    public List<String> encrypt(String message) {
       // for (int i = 0; i < message.length(); i++) {
            message = message.replaceAll("a","4");
            message = message.replaceAll("A","4");
            message = message.replaceAll("e","3");
            message = message.replaceAll("E","3");
            message = message.replaceAll("i","1");
            message = message.replaceAll("I","1");
            message = message.replaceAll("o","8");
            message = message.replaceAll("O","8");
            message = message.replaceAll("u","9");
            message = message.replaceAll("U","9");

            message = message.replaceAll("!", "");
            message = message.replaceAll("@", "");
            message = message.replaceAll("#", "");
            message = message.replaceAll("$", "");
            message = message.replaceAll("%", "");
            message = message.replaceAll("&", "");
            message = message.replaceAll("//*", "");
            message = message.replaceAll("//+", "");
            message = message.replaceAll("-", "");
            message = message.replaceAll("=", "");

        //}

        String [] rubbish = "[!@#$%&*+-=]".split("");
        List<String> newRubbish = new ArrayList<>(Arrays.asList(rubbish ));

        List <String> listOfMessage = new ArrayList<>();

        for (int i =0; i < message.length(); i++) {
            Character letter = message.charAt(i);
            listOfMessage.add(letter.toString());
        }
        System.out.println("List of Message" + listOfMessage);

         Random random = new Random();
         Integer randomNummer = random.nextInt(5)+1;
         List<String> encryptedMessage = new ArrayList<>();

        for (int i = 0; i < listOfMessage.size(); i++) {
            String letter = listOfMessage.get(i);
            encryptedMessage.add(letter);
            for (int j = 0; j < randomNummer; j++) {
                String rubich = newRubbish.get(j);
                encryptedMessage.add(rubich);
            }
        }


            //Arrays.asList()

       //List <String> newListOfMessage = Collections.shuffle(listOfMessage,random);
      // Collections.
        return encryptedMessage;
        }

    }

