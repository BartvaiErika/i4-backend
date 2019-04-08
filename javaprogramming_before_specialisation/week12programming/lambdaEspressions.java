package week12programming;

public class lambdaEspressions {

    interface LambdaTest {
        boolean numberTest(int number);
    }

    interface PalindromTest {
        boolean palindromTest(String text);
    }

    public static void main(String[] args) {
        Integer number = 15;
        LambdaTest isEven =(n)->(n%2) == 0;
        LambdaTest isOdd =(n)->(n%2) == 1;

        LambdaTest isPrime =(n)->(n/2)%2 != 0;
        LambdaTest isComposite =(n)->(n/2)%2 == 0;
        System.out.println("Is even: " + isEven.numberTest(number));
        System.out.println("Is odd: " + isOdd.numberTest(number));
        System.out.println("Is prime: " + isPrime.numberTest(number));
        System.out.println("Is prime: " + isComposite.numberTest(number));

        PalindromTest isPalindrom = (word)->(new StringBuilder(word).reverse().toString().equals(word));
        System.out.println("Palindrom: " +isPalindrom.palindromTest("pap"));
    }

}
