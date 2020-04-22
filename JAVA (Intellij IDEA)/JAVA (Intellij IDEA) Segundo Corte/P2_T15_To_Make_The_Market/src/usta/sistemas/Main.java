package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*Author: Andres Nicolas Morales Perez
	    Date: 2020 - April - 13
	    Description: A house wife needs to make the market of the month and only the cash 500.000
	 */
        f_menu();
        Scanner keyboard = new Scanner(System.in);
        int sumatory = 0, cost_product, total_product = 0;
        do {
            total_product += 1;
            System.out.println("Input the cost the product: (" + total_product + " ):");
            cost_product = keyboard.nextInt();
            sumatory += cost_product;
            System.out.println("Total bill: " + sumatory);
        } while (sumatory <= 500000);
        sumatory = cost_product;
        total_product -= 1;
        System.out.println("Total bill: " + sumatory + " ,total product: " + total_product);
    }

    public static void f_menu() {
        //This method show the menu of this software
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║        SoftMakeMarket        ║");
        System.out.println("║     Version 1.0 20200415     ║");
        System.out.println("║  Created by: Nicolas Morales ║");
        System.out.println("╚══════════════════════════════╝");
    }
}
