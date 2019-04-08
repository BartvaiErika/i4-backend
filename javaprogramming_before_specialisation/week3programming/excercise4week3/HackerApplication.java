//Created by Erika
package week3programming.excercise4week3;

public class HackerApplication {
    public static void main(String[] args) {
        String message = "from: thomas.miller@gmail.com, an: anne.fischer@yahoo.at subject: ";
                //+
                //"Application Email: Dear Mrs. Fiscchwer! I would like to apply the vacant position. " +
                //"Best regards Thomas Miller";
        Messenger messenger = new Messenger();
        messenger.send(message);
        messenger.receive(message);
        Encryptor encryptor=new Encryptor();
        System.out.println(encryptor.encrypt(message));


    }
}
