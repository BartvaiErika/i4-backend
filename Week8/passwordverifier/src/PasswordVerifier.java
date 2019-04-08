import java.util.Scanner;

public class PasswordVerifier {

    public static void main(String[] args) {
        System.out.println("Please give me your password!");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.next();
        if (verify(password).equals(true))
            System.out.println("Your password is acceptable!");
        else
            System.out.println("Your password is NOT acceptable!");

    }

    public static Boolean verify (String password) {
        if ((password.length()+1 >8)
                &&(!password.equals(null))
                && (isLowerCase(password).equals(true))
                && (isUpperCase(password).equals(true)))
                    return true;
        return false;
    }

    public static Boolean isUpperCase (String password) {
        Integer uppercasesCounter = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                uppercasesCounter++;
            }
        }
        if (uppercasesCounter>0) return true;
        return false;
    }

    public static Boolean isLowerCase (String password) {
        Integer lowercasesCounter = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                lowercasesCounter++;
            }
        }
        if (lowercasesCounter>0) return true;
        return false;
    }

}
