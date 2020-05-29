package usta.sistemas;

import java.util.Scanner;

public class Main {
  /*Author: Andres Nicolas Morales Perez
       Date: 2020 - May - 26
       Description: This software simulates the automatic generation
       of twelve (12) salaries for the year for N employees (value entered by the user),
       where the minimum salary value of one employee per month is from the SMLV in Colombia in 2020
       and the maximum value is SMLV * 5 in Colombia.*/

    public static void main(String[] args) {
        int rows = f_menu_total_rows();
        int[][] matrix_numbers = new int[rows][12];
        matrix_numbers = f_fill_matrix(matrix_numbers);
        int sum = 0;
        for (int i = 0; i < matrix_numbers.length; i++) {
            for (int k = 0; k < matrix_numbers[0].length; k++) {
                sum += matrix_numbers[i][k];
            }
        }
        f_show_average(matrix_numbers);
        f_employed_mayor_paid();
    }

    public static int f_menu_total_rows() {
        //This method show the menu of this software
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║      SoftEmployedSalary      ║");
        System.out.println("║     Version 1.0 20200513     ║");
        System.out.println("║  Created by: Nicolas Morales ║");
        System.out.println("╚══════════════════════════════╝");
        System.out.println("Input how many employees do you want in the matrix.");
        Scanner keyboard = new Scanner(System.in);
        int total_rows = keyboard.nextInt();
        while (total_rows <= 0) {
            System.err.println("ERROR: The value must be greater than zero.");
            System.out.println("Input again how many employees do you want in the matrix.");
            total_rows = keyboard.nextInt();
        }
        return total_rows;
    }

    public static int[][] f_fill_matrix(int[][] matrix_numbers) {
        //Description: This method fill the matrix.
        for (int i = 0; i < matrix_numbers.length; i++) {
            for (int k = 0; k < matrix_numbers[0].length; k++) {
                matrix_numbers[i][k] = (int) Math.floor((Math.random() * (4439015 - 877803 + 1) + 877803));
                System.out.println("The salaries for the employed " + (i + 1) + " are: $");
                System.out.println(matrix_numbers[i][k]);
            }
        }
        return matrix_numbers; //Return a fill matrix
    }

    public static void f_show_average(int[][] matrix_fill) {
        //Description: This method show the average paid in the year (12 months).
        int count = 0;
        int average = 0;
        for (int i = 0; i < matrix_fill.length; i++) {
            for (int k = 0; k < 12; k++) {
                count = count + matrix_fill[i][k];
            }
        }
        average = count / (matrix_fill.length * 12);
        System.out.println("The total paid the company in the year is: " + count + " $");
        System.out.println("The average of salaries is: " + average + " $");
    }

    public static void f_employed_mayor_paid() {
        int mayor_paid = 0;
        mayor_paid = mayor_paid + mayor_paid;
        System.out.println("The employed with mayor paid is: " + mayor_paid + " $");
    }
}


