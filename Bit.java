import java.util.Scanner;
public class Bit {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int x =0;
        sc.nextLine();
    

        for (int i=0; i < num; i++){

            String input = sc.nextLine();          
            if(input.contains("++")){               
                x++;
               
            } else if(input.contains("--")){
                    x--;
            }
        }
        System.out.println(x);

    }
}
