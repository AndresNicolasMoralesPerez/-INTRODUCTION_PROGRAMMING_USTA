package usta.sistemas;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Input the first number");
            int number1 = keyboard.nextInt();
            System.out.println("Input the second number");
            int number2 = keyboard.nextInt();
            int number3 = number1 + number2;
            System.out.println("The sum is: " + number3);
        } catch (Exception e) {
            System.err.println("ERR: The software allow only number not words (Public static void main): " + e.toString());
        }


    }
}
