package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*Author: Andres Nicolas Morales Perez
	    Date: 2020 - May - 12
	    Description: This software Allow to simulate the data of a swimming competition where the four times are stored for each competitor and also determine based on all the times of the competitors who is the winner. */
        int total_competitors = f_menu_total_competitors();
        double[][] matrix_competition = f_fill_matrix_total_competitors(total_competitors);
        String texto = "";
        System.out.println("-----------The times of competition------------");
        System.out.println("  Player|  T1  |  T2  |  T3  |  T4  |  T5  |  T6  |  T7  |  T8  |  T9  |  T10  |");
        for (int i = 0; i < total_competitors; i++) {
            texto += "\n" + (i + 1);
            for (int j = 0; j < 10; j++) {
                texto += "  |  " + matrix_competition[i][j] + " | ";
            }
        }
        System.out.println(texto);
    }

    public static int f_menu_total_competitors() {
        //This method show the menu of this software
        Scanner keyboard = new Scanner(System.in);
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║       SoftGradeStudents      ║");
        System.out.println("║     Version 1.0 20200512     ║");
        System.out.println("║  Created by: Nicolas Morales ║");
        System.out.println("╚══════════════════════════════╝");
        System.out.println("Input the total competitors");
        int total_competitors = keyboard.nextInt();
        while (total_competitors <= 0) {
            System.err.println("ERR: THE VALUE MUST GREATER THAN ZERO");
            System.out.println("Input the total competitors again");
            total_competitors = keyboard.nextInt();
        }
        return total_competitors;
    }

    public static double[][] f_fill_matrix_total_competitors(int total_competitors) {
        //Description: This method return a fill matrix of time the competition.
        double[][] matrix_competitor = new double[total_competitors][10];
        for (int i = 0; i < total_competitors; i++) {
            for (int j = 0; j < 10; j++) {
                matrix_competitor[i][j] = Math.floor(Math.random() * (10 - 6) + 6);
            }
        }
        return matrix_competitor;
    }
}

