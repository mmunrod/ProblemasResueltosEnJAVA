import java.util.Scanner;

public class Translation {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();

    StringBuilder stringBuilder = new StringBuilder();

    int length = s.length();
   
    String [] str = new String [length];

    for(int i = length - 1; i>=0 ;i--){
        stringBuilder.append(s.charAt(i));
        }
        String result = stringBuilder.toString();

    if(t.equals(result)){
        System.out.println("YES");
        }
    else{
        System.out.println("NO");       
        }
    }
}
