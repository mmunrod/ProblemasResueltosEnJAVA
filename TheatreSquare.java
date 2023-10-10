import java.util.Scanner;
public class TheatreSquare {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        double a = sc.nextInt();

        long p = (long) Math.ceil(n / a);
        long q = (long) Math.ceil(m / a);

        System.out.println(p*q);


    }
}
