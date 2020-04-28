package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*Author: Andres Nicolas Morales Perez
	    Date: 2020 - April - 28
	    Description: This JAVA program that counts the number of digits of a number entered by keyboard.
	 */
        f_menu();
        int number = f_user_number();
        int total_digits = 0;
        if (number != 0) {
            while (number != 0) {
                number = number / 10;
                total_digits++;
            }
        } else {
            total_digits = 1;
        }
        System.out.println("The total digits of number is: " + total_digits);
    }

    public static void f_menu() {
        //This method show the menu of this software
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║        SoftCountDigit        ║");
        System.out.println("║     Version 1.0 20200428     ║");
        System.out.println("║  Created by: Nicolas Morales ║");
        System.out.println("╚══════════════════════════════╝");
    }

    public static int f_user_number() {
        //Description: This method input the user number
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the any number");
        int number = keyboard.nextInt();
        return number;
    }
}
