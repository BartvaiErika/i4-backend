//Created by Erika

//When they write a message, the vowels will be replaced so:
//A ​ and ​ a ​ become a 4.
//E ​ and ​ e ​ become a 3.
//I ​ and ​ i ​ become a 1.
//O and o ​ become a 8.
//U ​ and ​ u ​ become a 9
//rubbish characters ​ !@#$%&*+-=

package week3programming.excercise4week3;

public class Decryptor {
    public String decrypt(String message) {

        message = message.replaceAll("4","a");
        message = message.replaceAll("3","e");
        message = message.replaceAll("1","i");
        message = message.replaceAll("8","o");
        message = message.replaceAll("9","u");
        System.out.println("Decripted message:"+ message);

        return message;
    }
}
