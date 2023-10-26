import java.util.Scanner;
public class YoungPhysicist {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int counti= 0;
        int countj=0;
        int countk= 0;

        for(int i=0; i<num ; i++){
            counti= counti + scan.nextInt();
            countj= countj +scan.nextInt();
            countk= countk +scan.nextInt();     
        } 
        if (counti==0 && countj==0 && countk==0){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }

    }
}
