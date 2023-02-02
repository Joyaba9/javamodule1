/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bryan.mod1assign;

/**
 *
 * @author EL GUARDIAN
 */

import java.util.Scanner;

public class Mod1assign {

 public static void main(String[] args){
    
        int myNumber;
        Scanner scanner = new Scanner(System.in);
        
        myNumber = scanner.nextInt();
        
        System.out.println("first digit: "+myNumber/10000);
        System.out.println("second digit: "+myNumber/1000%10);
        System.out.println("third digit: "+myNumber/100%10);
        System.out.println("fourth digit: "+myNumber/10%10);
         System.out.println("fifth digit: "+myNumber%10);
         
         int num1 = myNumber/10000;
         int num2 = myNumber/1000%10;
         int num3 = myNumber/100%10;
         int num4 = myNumber/10%10;
         int num5 = myNumber%10;
         
          System.out.println(num1+"   "+num2+"   "+num3+"   "+num4+"   "+num5);    
 }
}