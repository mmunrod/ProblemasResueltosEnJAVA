import java.util.*;
public class HelpfulMaths {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        input = input.replace("+", "");
        char [] array = input.toCharArray();
        Arrays.sort(array);
        int length = array.length;
        String[] result = new String[length];

        for (int i=0; i < length; i++ ){
            
            if(i == length - 1){
                result[i] = String.valueOf(array[i]);
            }
            else{
            result[i] = (array[i] + "+");
            }
        }

            for (String str : result) {
                System.out.print(str);
            } 
        }
           
    }  
