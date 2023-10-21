import java.util.Scanner;

public class cAPSlOCK1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        if (word.toUpperCase().equals(word)) {
            System.out.println(word.toLowerCase());
        } else if ((word.charAt(0) == (word.toLowerCase().charAt(0)))
                && word.substring(1, word.length()).equals(word.substring(1, word.length()).toUpperCase())) {
            System.out.println(word.toUpperCase().charAt(0) + word.substring(1, word.length()).toLowerCase());
        } else {
            System.out.println(word);
        }
    }
}
