package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/* Author: Andres Nicolas Morales
	   Date: 2020 - April - 14
	   Description: This program that asks for two numbers and says if one is a multiple of the other.
	 */
	f_menu();
	f_input_numbers();
    }
    public static void f_menu(){
        System.out.println("--------------------------------");
        System.out.println("|         SoftMultiples         |");
        System.out.println("|         Version 1.0           |");
        System.out.println("|  Created by: Nicolas Morales  |");
        System.out.println("---------------------------------");
    }
    public static boolean f_multiplo(int m1, int m2){
        //Description: This method that asks for two numbers and says if one is a multiple of the other.
        boolean multiplo = false;
        if (m1 % m2 == 0){
            multiplo = true;
        }

        return multiplo;
    }
    public static void f_input_numbers(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the first integer number");
        int m1 = keyboard.nextInt();
        System.out.println("input the second integer number");
        int m2 = keyboard.nextInt();
        boolean rpta = f_multiplo(m1, m2);
        if (rpta == true){
            System.out.println(m1+    "its multiple of"    +m2);
        } else {
            System.out.println(m1+ "doesn't multiple of"     +m2);
        }
    }
}
