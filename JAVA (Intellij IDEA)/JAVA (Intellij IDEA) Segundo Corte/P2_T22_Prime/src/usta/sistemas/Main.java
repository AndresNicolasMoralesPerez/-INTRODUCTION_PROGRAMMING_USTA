package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*Author: Andres Nicolas Morales Perez
	    Date: 2020 - April - 29
	    Description: This software Carry out a program that asks us for a number n, and tells us how many numbers there are between 1 and n that are prime.
	 */
        f_menu();
        int number = f_user_number();
        int total_primes = 0;
        for (int i = 1; i <= number; i++) {
            if (f_n_primes(i) == true) {
                total_primes++;
                System.out.println("Number " + i + " is prime");
            }
        }
        System.out.println("The total prime is: " + total_primes);
    }

    public static void f_menu() {
        //This method show the menu of this software
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║          SoftPrime           ║");
        System.out.println("║     Version 1.0 20200429     ║");
        System.out.println("║  Created by: Nicolas Morales ║");
        System.out.println("╚══════════════════════════════╝");
    }

    public static int f_user_number() {
        //Description: This method return a number input by the user
        System.out.println(" Input a number greater to 1");
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        while (number <= 1) {
            System.err.println("ERR: Only numbers less than or equals to one");
            System.out.println("Input again a number greater to 1");
            number = keyboard.nextInt();
        }
        return number;
    }

    public static boolean f_n_primes(int number) {
        //Description: This method contain the funtion of n_primes
        int divisors = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                divisors = divisors + 1;
            }
        }
        if (divisors <= 2) {
            return true;
        } else {
            return false;
        }
    }
}
