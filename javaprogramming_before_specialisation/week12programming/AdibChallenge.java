package week12programming;

public class AdibChallenge {
    public static void main(String[] args) {
        String word ="The quick brown fox";
        String reversedWord = "";
        for (int i = word.length()-1; i >= 0; i--) {
 //           for (int i = 0; i < word.length(); i++) {
            reversedWord = reversedWord + word.charAt(i);
        }
        System.out.println("Reversed word: " + reversedWord);
        String reversed = new StringBuilder(word).reverse().toString();
        System.out.println(reversed);

    }
}
