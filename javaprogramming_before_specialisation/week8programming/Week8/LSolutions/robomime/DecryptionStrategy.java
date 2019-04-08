package Week8.LSolutions.robomime;


public interface DecryptionStrategy {

    boolean isValid(String text);

    String decrypt(String text);

}