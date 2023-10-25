import java.util.Scanner;
public class Word {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int lowerchars= 0;
        int upperChars = 0;
        
        for (int i= 0; i< word.length() ; i++){
            if(word.charAt(i) == (Character.toUpperCase(word.charAt(i)))){
                upperChars++;
            }
            if(word.charAt(i) == (Character.toLowerCase(word.charAt(i)))){
                lowerchars++;
            }
        }
        if (lowerchars >= upperChars){
            System.out.println(word.toLowerCase());
        }
        if (upperChars>lowerchars){
            System.out.println(word.toUpperCase());
        }
    }

}
