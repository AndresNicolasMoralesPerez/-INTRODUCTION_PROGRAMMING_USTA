package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*Author: Andres Nicolas Morales Perez
	    Date: 2020 - April - 28
	    Description: This software Ask for 10 numbers. Show the mean of positive numbers, the mean of negative numbers and the number of zeros.
	 */
        f_menu();
        f_operation_numbers();
    }

    public static void f_menu() {
        //This method show the menu of this software
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║     SoftLettersToNumbers     ║");
        System.out.println("║     Version 1.0 20200427     ║");
        System.out.println("║  Created by: Nicolas Morales ║");
        System.out.println("╚══════════════════════════════╝");
    }

    public static void f_operation_numbers() {
        //This method ask for ten numbers.
        int summary_positives = 0, summary_negatives = 0, total_zero = 0, number = 0;
        int total_positives = 0, total_negatives = 0;
        double average_positives = 0, average_negatives = 0;
        for (int i = 1; i <= 10; i++) {
            number = f_user_number(i);
            if (number < 0) {
                summary_negatives -= number;
                total_negatives++;
            } else if (number > 0) {
                summary_positives += number;
                total_positives++;
            } else {
                total_zero++;
            }
        }
        if (total_positives > 0) {
            average_positives = summary_positives / total_positives;
            System.out.println("The average");
        }
        if (total_negatives > 0) {
            average_negatives = summary_negatives / total_negatives;
        }
        System.out.println("The positive average is: " + average_positives);
        System.out.println("The negative average is: " + average_negatives);
        System.out.println("The total zero numbers is: " + total_zero);
    }

    public static int f_user_number(int i) {
        //Description: This method ask for the number.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Add the number ( " + i + " )");
        int number = keyboard.nextInt();
        return number;
    }
}
