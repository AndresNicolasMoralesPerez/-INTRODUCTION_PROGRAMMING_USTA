package usta.sistemas;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*Author: Andres Nicolas Morales Perez
	    Date: 2020 - April - 27
	    Description: program that, Using repetitive cycles build a program that prints the multiplication tables from number 1 to number 10 in the range from 1 to 10.
	 */
        f_menu();
        int aleatory_number = f_aleatory_number();
        int number_user = f_input_number();
        int attempt = 5;
        while (number_user != aleatory_number && attempt > 1) {
            attempt--;
            System.err.println("The number is different than the generated number (Attempt =  " + attempt + " )");
            number_user = f_input_number();
        }
        if (attempt > 1) {
            System.out.println("YOU WIN A HAMBURGER");
        } else {
            System.out.println("SORRY YOU LOST, THE RANDOM NUMBER WAS " + aleatory_number);
        }
    }

    public static void f_menu() {
        //This method show the menu of this software
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║       SoftRandomBurger       ║");
        System.out.println("║     Version 1.0 20200427     ║");
        System.out.println("║  Created by: Nicolas Morales ║");
        System.out.println("╚══════════════════════════════╝");
    }

    public static int f_aleatory_number() {
        //This method generate one number aleatory
        int number = (int) Math.floor(Math.random() * 100 + 1);
        if (number < 50) {
            System.out.println("Hint: The number is minor than 50");
        } else {
            System.out.println("Hint: The number is grater than 50");
        }
        if (number % 2 == 0) {
            System.out.println("Hint 2: the number is pair");
        } else {
            System.out.println("Hint 2: The number is odd");
        }
        return number;
    }

    public static int f_input_number() {
        //This method ask one number
        Scanner keyboard = new Scanner(System.in);
        int input;
        System.out.println("Type number to compare (0 - 100)");
        input = keyboard.nextInt();
        while (input < 0 || input > 100) {
            System.err.println("ERR: the input must be between 0 and 100\nRetry");
            input = keyboard.nextInt();
        }
        return input;
    }
}
