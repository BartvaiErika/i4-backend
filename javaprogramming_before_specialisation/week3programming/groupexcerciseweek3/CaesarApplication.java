package week3programming.groupexcerciseweek3;
public class CaesarApplication {
    public static void main(String[] args) {

        Caesar caesar = new Caesar();
        String encryptedMessage = caesar.encrypt("hello, world! ", 13);
        System.out.println(encryptedMessage);
    }
}
