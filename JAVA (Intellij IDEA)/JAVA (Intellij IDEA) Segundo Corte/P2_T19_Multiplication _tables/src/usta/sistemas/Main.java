package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*Author: Andres Nicolas Morales Perez
	    Date: 2020 - April - 27
	    Description: Using repetitive cycles build a program that prints the multiplication tables from number 1 to number 10 in the range from 1 to 10.
	 */
        f_menu();
        int user_number = f_number_user();
        while (user_number != 0) {
            f_generate_multiplication_table(f_number_user());
            user_number = f_number_user();
        }
        System.out.println("Thanks you for use the soft");

    }

    public static void f_menu() {
        //This method show the menu of this software
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║   SoftMultiplicationTable    ║");
        System.out.println("║     Version 1.0 20200427     ║");
        System.out.println("║  Created by: Nicolas Morales ║");
        System.out.println("╚══════════════════════════════╝");
    }

    public static int f_number_user() {
        //Description: This method ask for the user what multiply table want, And return this number
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the multiply table that you want 0 to exit");
        int user_numb = keyboard.nextInt();
        while (user_numb < 0 || user_numb > 99) {
            System.err.println("ERR: You only have the multiply tables between the 0 and 99");
            System.out.println("Input the multiply table that you want 0 to exit");
            user_numb = keyboard.nextInt();

        }
        return user_numb;
    }

    public static void f_generate_multiplication_table(int user_number) {
        //Description: This method with a "for" show the multiplication tables
        System.out.println("The multiplication table is: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(user_number + " X " + i + " = " + user_number * i);
        }
    }
}
