package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*Author: Andres Nicolas Morales Perez
	    Date: 2020 - MAY - 06
	    Description: This software view the letter a
	 */
        int total_person = f_menu();
        String[] vector_names = f_fill_vector(total_person);
        f_show_letter_a(vector_names);
    }

    public static int f_menu() {
        //This method show the menu of this software
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║         SoftNamesVowel       ║");
        System.out.println("║     Version 1.0 20200506     ║");
        System.out.println("║  Created by: Nicolas Morales ║");
        System.out.println("╚══════════════════════════════╝");
        System.out.println("Input total person do you need");
        Scanner keyboard = new Scanner(System.in);
        int total_person = keyboard.nextInt();
        while (total_person < 0) {
            System.err.println("ERR: The total person not lower than 0");
            System.out.println("Input total person do you need again");
        }
        return total_person;
    }

    public static String[] f_fill_vector(int total_person) {
        //Description: This method  return a fill vector
        String[] vector_names = new String[total_person];
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < total_person; i++) {
            System.out.println("Input the name by the person" + (i + 1));
            vector_names[i] = keyboard.nextLine();
        }
        return vector_names;
    }

    public static void f_show_letter_a(String[] vector_name) {
        //Description: This method counts the names that have the letter a
        int total_words = 0;
        for (int i = 0; i < vector_name.length; i++) {
            if (vector_name[i].indexOf("a") >= 0) {
                total_words++;
                System.out.println("Name = " + vector_name[i]);
            }
        }
        System.out.println("The total letter a are " + total_words);
    }
}
