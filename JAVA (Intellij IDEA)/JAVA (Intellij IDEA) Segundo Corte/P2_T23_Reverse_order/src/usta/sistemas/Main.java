package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*Author: Andres Nicolas Morales Perez
	    Date: 2020 - April - 28
	    Description: This software Read 5 numbers and show them in reverse order to the one entered.
	 */
        f_menu();
        f_numbers_user();
    }

    public static void f_menu() {
        //This method show the menu of this software
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║     SoftLettersToNumbers     ║");
        System.out.println("║     Version 1.0 20200429     ║");
        System.out.println("║  Created by: Nicolas Morales ║");
        System.out.println("╚══════════════════════════════╝");
    }

    public static void f_numbers_user() {
        //This method input 5 numbers.
        Scanner keyboard = new Scanner(System.in);
        int number1, number2, number3, number4, number5;
        double average = 0;
        System.out.println("Input the number 1");
        number1 = keyboard.nextInt();
        System.out.println("Input the number 2");
        number2 = keyboard.nextInt();
        System.out.println("Input the number 3");
        number3 = keyboard.nextInt();
        System.out.println("Input the number 4");
        number4 = keyboard.nextInt();
        System.out.println("Input the number 5");
        number5 = keyboard.nextInt();
        System.out.println("The inverted numbers are: " + number5 + " , " + number4 + " , " + number3 + " , " + number2 + " , " + number1);
        average = (number1 + number2 + number3 + number4 + number5) / 5;
        System.out.println("The average of the numbers is: " + average);
    }
}
