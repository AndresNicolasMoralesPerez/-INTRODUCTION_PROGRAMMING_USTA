package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int total_numbers = f_menu();
        int[] vector_numbers = f_fill_vector(total_numbers);
        f_show_even_numbers(vector_numbers);
        f_show_odd_numbers(vector_numbers);
    }

    public static int f_menu() {
        //This method show the menu of this software
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║         SoftConvertTime      ║");
        System.out.println("║     Version 1.0 20200415     ║");
        System.out.println("║  Created by: Nicolas Morales ║");
        System.out.println("╚══════════════════════════════╝");
        Scanner keyboard = new Scanner(System.in);
        int total_numbers;
        do {
            System.out.println("Input the total numbers by greater than zero ");
            total_numbers = keyboard.nextInt();
        } while (total_numbers < 0);
        return total_numbers;
    }

    public static int[] f_fill_vector(int total_numbers) {
        //Description: This method return a vector with numbers
        int[] vector_numbers = new int[total_numbers];
        for (int i = 0; i < total_numbers; i++) {
            vector_numbers[i] = (int) Math.floor(Math.random() * (1000 - 100 + 1) + 100);
        }
        return vector_numbers;
    }

    public static void f_show_even_numbers(int[] vector_numbers) {
        //Description: This method show the even numbers
        int total_even = 0;
        for (int number : vector_numbers) {
            if ((number % 2) == 0) {
                total_even++;
            }
        }
        System.out.println("The total even numbers is: " + total_even);
    }

    public static void f_show_odd_numbers(int[] vector_numbers) {
        int total_odd = 0;
        for (int number : vector_numbers) {
            if ((number % 2) != 0) {
                total_odd++;
                System.out.println("odd number is: " + total_odd);
            }
        }
        System.out.println("the totl odd numbers is: " + total_odd);
    }
}

