package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*Author: Andres Nicolas Morales Perez
	    Date: 2020 - May - 05
	    Description: This software calculate what number is the bigger or minor*/
        int total_numbers = f_menu();
        int[] numbers = f_fill_vector_numbers(total_numbers);
        f_show_minor_number(numbers);
        f_show_bigger_number(numbers);
    }

    public static int f_menu() {
        //This method show the menu of this software
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║     SoftBiggerMinorNumber    ║");
        System.out.println("║     Version 1.0 20200505     ║");
        System.out.println("║  Created by: Nicolas Morales ║");
        System.out.println("╚══════════════════════════════╝");
        System.out.println("Input the total number");
        Scanner keyboard = new Scanner(System.in);
        int total_number = keyboard.nextInt();
        while (total_number <= 0) {
            System.err.println("ERR: Not permitted number minus than 0");
            System.out.println("Input the total number again");
            total_number = keyboard.nextInt();
        }
        return total_number;
    }

    public static int[] f_fill_vector_numbers(int total_numbers) {
        //Description: This fill the vector
        Scanner keyboard = new Scanner(System.in);
        int[] vector = new int[total_numbers];
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Input the number( " + (i + 1) + " )");
            vector[i] = keyboard.nextInt();
        }
        return vector;
    }

    public static void f_show_bigger_number(int[] vector_numbers) {
        //Description: Show the bigger number in vector
        int bigger_number = 0;
        for (int i = 0; i < vector_numbers.length; i++) {
            if (i == 0) {
                bigger_number = vector_numbers[i];
            } else {
                if (bigger_number < vector_numbers[i]) {
                    bigger_number = vector_numbers[i];
                }
            }

        }
        System.out.println("The bigger number is: " + bigger_number);

    }

    public static void f_show_minor_number(int[] vector_numbers) {
        //Description: Show the bigger number in vector
        int minor_number = 0;
        for (int i = 0; i < vector_numbers.length; i++) {
            if (i == 0) {
                minor_number = vector_numbers[i];
            } else {
                if (minor_number < vector_numbers[i]) {
                    minor_number = vector_numbers[i];
                }
            }
            System.out.println("The vector[ " + i + " ]" + vector_numbers);

        }
        System.out.println("The bigger number is: " + minor_number);

    }
}
