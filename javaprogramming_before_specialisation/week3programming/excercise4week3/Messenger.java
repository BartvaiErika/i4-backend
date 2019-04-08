//Created by Erika
package week3programming.excercise4week3;

public class Messenger {
   private Encryptor encryptor;
   private Decryptor decryptor;

    public void send(String message) {
        Encryptor encryptor = new Encryptor();
        encryptor.encrypt(message);
        System.out.println(message);

    }
    public void receive(String message) {
        Decryptor decryptor = new Decryptor();
        decryptor.decrypt(message);
        System.out.println(message);

    }
}
