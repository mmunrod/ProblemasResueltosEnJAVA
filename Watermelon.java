
import java.util.Scanner;
/*
 One hot summer day Pete and his friend Billy decided to buy a watermelon. They chose the biggest and the ripest one, in their
 opinion. After that the watermelon was weighed, and the scales showed w kilos. They rushed home, dying of thirst, and decided 
 to divide the berry, however they faced a hard problem.

 Pete and Billy are great fans of even numbers, that's why they want to divide the watermelon in such a way that each of the two
 parts weighs even number of kilos, at the same time it is not obligatory that the parts are equal. The boys are extremely 
 tired and want to start their meal as soon as possible, that's why you should help them and find out, if they can divide the
 watermelon in the way they want. For sure, each of them should get a part of positive weight.
 */

public class Watermelon
{  /*La suma de dos numeros pares nunca dará un número impar entonces w % 2 == 0 (con una excepción).
  También hay que tener en cuenta que 1 + 1 = 2 es una suma de numeros impares que da un numero par entonces tiene
  que salir del rango del problema
    */
    public static void main (String args []){
    Scanner scan = new Scanner(System.in); 
    
    int w = Integer.valueOf(scan.nextLine());
    
    if (2 < w && w <= 100 && w%2 == 0) {
        System.out.println("YES");
        
    } else {
        System.out.println("NO");
        
        } 
    }
 }
