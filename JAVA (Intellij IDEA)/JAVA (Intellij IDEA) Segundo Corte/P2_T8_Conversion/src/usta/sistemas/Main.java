package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*Author: Andres Nicolas Morales Perez
	Date: 2020 - April - 16
	Description: function that converts kilometers into miles, function that converts miles into Kilometers,function that miles kilometers into Yard's and upsidedown .
	 */
        f_menu();
        int option = f_option();
        if (option == 1){
            f_kilometers_to_miles();
        }else if (option == 2){
            f_kilometers_to_yards();
        }else if (option == 3){
            f_miles_to_kilometers();
        }else if (option == 4){
            f_yards_to_kilometers();
        }
    }

    public static void f_menu() {
        //This method show the menu of this software
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║         SoftConvertTime      ║");
        System.out.println("║     Version 1.0 20200415     ║");
        System.out.println("║  Created by: Nicolas Morales ║");
        System.out.println("╚══════════════════════════════╝");
    }

    public static int f_option() {
        // This method return the option
        System.out.println("Input the option of the convert: \n1-kilometers to miles\n2-kilometers to yards\n3-miles to kilometers");
        Scanner keyboard = new Scanner(System.in);
        int option = keyboard.nextInt();
        while (option < 1 || option > 3) {
            System.err.println("ERR: This option doesn't exist.");
            System.out.println("Input the option of the convert: \n1-kilometers to miles\n2-kilometers to yards\n3-miles to kilometers");
            option = keyboard.nextInt();

        }
        return option;
    }

    public static void f_kilometers_to_miles() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("input the value in kilometers (km)");
        double kilometers = keyboard.nextDouble();
        double miles = kilometers * 0.6214;
        System.out.println("The miles are: " + miles + " miles");
    }

    public static void f_kilometers_to_yards() {
        //Description: This method convert kilometers to yards.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("input the value in kilometers (km)");
        double kilometers = keyboard.nextDouble();
        double yards = kilometers * 1093.6;
        System.out.println("The yards are: " + yards + " yards");
    }

    public static void f_miles_to_kilometers() {
        //Description: This method convert miles to kilometers.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("input the value in miles (ml)");
        double miles = keyboard.nextDouble();
        double kilometers = miles / 0.62137;
        System.out.println("The kilometers are: " + kilometers + " kilometers");
    }

    public static void f_yards_to_kilometers() {
        //Description: This method convert yard's to kilometers.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("input the value in yards (yd)");
        double yards = keyboard.nextDouble();
        double kilometers = yards / 1093.6;
        System.out.println("The kilometers are: " + kilometers + " kilometers");
    }
}
