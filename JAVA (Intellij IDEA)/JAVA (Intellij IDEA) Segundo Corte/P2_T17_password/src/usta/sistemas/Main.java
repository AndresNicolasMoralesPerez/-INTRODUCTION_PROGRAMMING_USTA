package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*Author: Andres Nicolas Morales Perez
	    Date: 2020 - April - 13
	    Description: This software Ask for a password (3 attempts maximum) or until the password is 352, 259 or 569.
	 */
        f_menu();
        int n_intentos = 1;
        boolean option = f_input_passwords();
        while (n_intentos <= 3 && option == false) {
            System.err.println("The password is wrong try again: ");
            n_intentos += 1;
            option = f_input_passwords();
        }
        if (n_intentos == 4) {
            System.out.println("Your cannot get into the platform");
        } else {
            System.out.println("Welcome to the system");
        }
    }

    public static void f_menu() {
        //This method show the menu of this software
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║         SoftPassword         ║");
        System.out.println("║     Version 1.0 20200415     ║");
        System.out.println("║  Created by: Nicolas Morales ║");
        System.out.println("╚══════════════════════════════╝");
    }

    public static boolean f_input_passwords() {
        //Description::this method value the password
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the password");
        boolean pass = false;
        int password = keyboard.nextInt();
        if (password == 352 || password == 259 || password == 569) {
            pass = true;
        }
        System.out.println("You are going to return " + pass);
        return pass;
    }
}

