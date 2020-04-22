package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
	 Author: Andres Nicolas Morales Perez
	Date: 2020 - April - 16
	Description: This software that returns the first letter of a word entered as a parameter.
	 */
        f_menu();
        int option = f_option();
        if (option == 1) {
            f_first_letter();
        }else if (option == 2){
            f_upper_word();
        }else {
            f_replace_vowels();
        }
    }

    public static void f_menu() {
        //This method show the menu of this software
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║       SoftConvertWord        ║");
        System.out.println("║     Version 1.0 20200415     ║");
        System.out.println("║  Created by: Nicolas Morales ║");
        System.out.println("╚══════════════════════════════╝");
    }

    public static int f_option() {
        // This method return the option
        System.out.println("Input the option of the convert: \n1-First letter\n2-Capital Letter\n3-Replace Vowel's to @");
        Scanner keyboard = new Scanner(System.in);
        int option = keyboard.nextInt();
        while (option < 1 || option > 3) {
            System.err.println("ERR: This option doesn't exist.");
            System.out.println("Input the option of the convert: \n1-First letter\n2-Capital Letter\n3-Replace Vowel's to @");
            option = keyboard.nextInt();

        }
        return option;
    }

    public static void f_first_letter() {
        //Description: This method return the first letter of a word.
        System.out.println("Input the word");
        Scanner keyboard = new Scanner(System.in);
        String word = keyboard.nextLine();
        while (word.length() < 5) {
            System.err.println("ERR: This word should have minimum of 5 letters.");
            System.out.println("Input again the word");
            word = keyboard.nextLine();
        }
        char [] letters = word.toCharArray();
        System.out.println("The first letter is "+letters[0]);
    }

    public static void f_upper_word(){
        //Description: This method turn lowercase to uppercase.
        System.out.println("Input the word");
        Scanner keyboard = new Scanner(System.in);
        String word = keyboard.nextLine();
        while (word.length() < 5) {
            System.err.println("ERR: This word should have minimum of 5 letters.");
            System.out.println("Input again the word");
            word = keyboard.nextLine();
        }
        System.out.println("The uppercase " + word.toUpperCase());
    }

    public static void f_replace_vowels(){
        //Description: this method turn replace vowels to @
        System.out.println("Input the word");
        Scanner keyboard = new Scanner(System.in);
        String word = keyboard.nextLine();
        while (word.length() < 5) {
            System.err.println("ERR: This word should have minimum of 5 letters.");
            System.out.println("Input again the word");
            word = keyboard.nextLine();
        }
        String word2 = word.toLowerCase();
        System.out.println("The uppercase " + word2.replace( "a","@").replace("e","@").replace("i","@").replace("o","@").replace("u","@"));
    }
    }


