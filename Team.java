import java.util.Scanner;

public class Team {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        
        int count = 0;

        while(n>0){
            
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            
            if (a+b+c >= 2){
                count ++;
            }
        
            n--;
        }
        System.out.println(count);
    
    }
}
