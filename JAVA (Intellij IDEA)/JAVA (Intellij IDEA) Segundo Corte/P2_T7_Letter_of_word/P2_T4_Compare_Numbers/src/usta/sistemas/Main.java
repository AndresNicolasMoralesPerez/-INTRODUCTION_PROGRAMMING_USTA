package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/* Author: Andres Nicolas Morales Perez
	   Date: 2020 - April - 14
	   Description: This program that asks for two numbers and says if they are the same or not.
	 */
	f_menu();
	boolean rpta = f_compare();
	if (rpta == true){
        System.out.println("------------------------------");
        System.out.println("|  The two numbers are same  |");
        System.out.println("------------------------------");
    } else {
        System.out.println("-------------------------------");
        System.out.println("| The two numbers aren't same |");
        System.out.println("-------------------------------");
    }
    }
    //Este no me etorna nada
    public static void f_menu(){
        //This method show the menu of this software
        System.out.println("--------------------------------");
        System.out.println("|      SoftCompareNumber       |");
        System.out.println("|     Version 1.0 20200413     |");
        System.out.println("|  Created by: Nicolas Morales |");
        System.out.println("--------------------------------");
    }
    public static boolean f_compare(){
        Scanner keyboard = new Scanner(System.in);
        int n1, n2;
        boolean rpta;
        System.out.println(" This program that asks for two integer numbers and says if they are the same or not.");
        System.out.println("Input the first number");
        n1 = keyboard.nextInt();
        System.out.println("Input the second number");
        n2 = keyboard.nextInt();
        if (n1 == n2){
            rpta = true;
        } else {
            rpta = false;
        }
        return rpta;
    }
}
