package usta.sistemas;

import java.util.Scanner;

public class Main {
    /*Author: Andres Nicolas Morales Perez
	    Date: 2020 - May - 12
	    Description: this software have a matrix 4x5 with certain names, and replace some letters */


    public static void main(String[] args) {
        f_menu();
        String[][] matrix_names = {{"maria", "pedro", "jose", "camilo", "rodrigo"},
                {"Ana", "lucia", "martha", "juliana", "patricia"},
                {"Felipe", "ALEXANDER", "soffy", "Carmen", "Augusto"},
                {"Alfredo", "Luis", "Ramiro", "Karen", "ANDREA"}};
        matrix_names = f_replace_vowels(matrix_names);
        System.out.println("---------show matrix-----------");
        for (int i = 0; i < matrix_names.length; i = i + 1) {
            System.out.print("\n(" + (i + 1) + ") =");
            for (int c = 0; c < matrix_names[0].length; c = c + 1) {
                System.out.print(" | " + matrix_names[i][c] + " | ");
            }
        }
    }

    public static void f_menu() {
        //This method show the menu of this software
        Scanner keyboard = new Scanner(System.in);
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║       SoftGradeStudents      ║");
        System.out.println("║     Version 1.0 20200512     ║");
        System.out.println("║  Created by: Nicolas Morales ║");
        System.out.println("╚══════════════════════════════╝");
        System.out.println("This program creates a 4x5 matrix with the people names");
    }

    public static String[][] f_replace_vowels(String[][] matrix_names) {
        //Description: this method replace the vowel for alternative characters
        for (int i = 0; i < matrix_names.length; i = i + 1) {
            for (int c = 0; c < 5; c = c + 1) {
                matrix_names[i][c] = matrix_names[i][c].toUpperCase().replace("A", "@").
                        replace("E", "3").replace("I", "1").
                        replace("O", "0").replace("U", "⌂");
            }
        }
        return matrix_names;
    }

}
