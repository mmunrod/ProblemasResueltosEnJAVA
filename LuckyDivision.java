import java.util.Scanner;

public class LuckyDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (isLucky(num)) {
            System.out.println("YES");
        } else {
            for (int i = 4; i <= 777; i++) {
                if (isLucky(i)) {
                    if (isAlmostLucky(num, i)){
                        System.out.println("YES");
                        return;
                    }
                }
            }
            System.out.println("NO");
            return;
        }
    }

    public static boolean isAlmostLucky(int num, int i) {
        if (num % i == 0) {
            return true;

        } else {
            return false;
        }
    }

    public static boolean isLucky(int myNum) {
        String numStr = String.valueOf(myNum);
        Boolean a = true;
        for (int i = 0; (i < numStr.length()) && (a == true); i++) {
            if (numStr.charAt(i) != '4' && numStr.charAt(i) != '7') {
                a = false;
            } else {
                a = true;
            }
        }
        return a;
    }
}
