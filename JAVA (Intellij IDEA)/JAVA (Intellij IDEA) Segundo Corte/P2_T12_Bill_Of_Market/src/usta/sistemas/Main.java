package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*Author: Andres Nicolas Morales Perez
	    Date: 2020 - April - 13
	    Description:this software calculates value and total value
	 */
        f_menu();
        int N = f_total_products();
        double total_bill = 0;
        for (int i = 1; i <= N; i = i + 1) {
            total_bill = total_bill + f_value_product(i);
        }
        System.out.println("The total bill is: " + total_bill);
    }

    public static void f_menu() {
        //This method show the menu of this software
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║         SoftConvertTime      ║");
        System.out.println("║     Version 1.0 20200415     ║");
        System.out.println("║  Created by: Nicolas Morales ║");
        System.out.println("╚══════════════════════════════╝");
    }

    public static int f_total_products() {
        //Description: this meyhod return the number of total product
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the numbers of products");
        int total_products = keyboard.nextInt();
        while (total_products < 1) {
            System.err.println("ERR: the total of products must be greater than one ");
            System.out.println("Input the numbers of products");
            total_products = keyboard.nextInt();
        }
        return total_products;
    }

    public static double f_value_product(int i) {
        System.out.println("Input the value of product (" + i + ") : ");
        Scanner keyboard = new Scanner(System.in);
        double value_product = keyboard.nextDouble();
        while (value_product <= 0) {
            System.err.println("ERR: The value of product must be grater than zero");
            System.out.println("Input the value of product (" + i + ") : ");
            value_product = keyboard.nextDouble();
        }
        if (value_product > 1000) {
            value_product = value_product * 1.19;
        }
        return value_product;
    }
}