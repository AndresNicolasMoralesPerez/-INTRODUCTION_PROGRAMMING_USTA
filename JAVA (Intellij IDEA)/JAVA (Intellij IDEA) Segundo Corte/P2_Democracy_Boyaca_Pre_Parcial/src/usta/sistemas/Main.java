package usta.sistemas;

public class Main {
    /*Author: Andres Nicolas Morales Perez
       Date: 2020 - May - 13
       Description: This software show the democracy of boyaca. */
    public static int[][] matrix_votes = new int[123][8]; //123 x 8 columns
    public static int[] total_votes = new int[8];
    public static String[] vector_parties = {"Liberal ", " Conservador ", " Alianza verde ", " Centro democratico ", " Polo ", " La u ", " Cambio Radical ", " Mira"};
    public static int winner_votes = 0;
    public static int winner_column = 0;

    public static void main(String[] args) {
        f_menu();
        f_fill_matrix();
        f_total_votes();
        f_show_winner_and_second();
        for (int i = 0; i < total_votes.length; i++) {
            System.out.println(vector_parties[i] + " Total votes : " + total_votes[i]);
        }
    }

    public static void f_menu() {
        //This method show the menu of this software
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║     SoftDemocracyBoyacá      ║");
        System.out.println("║     Version 1.0 20200513     ║");
        System.out.println("║  Created by: Nicolas Morales ║");
        System.out.println("╚══════════════════════════════╝");
    }

    public static void f_fill_matrix() {
        //Description: This method Fill the matrix votes.
        for (int i = 0; i < matrix_votes.length; i++) { //To walk matrix from 0 to 122
            for (int k = 0; k < matrix_votes[0].length; k++) { //To walk columns matrix from 0 to 7
                matrix_votes[i][k] = (int) Math.floor((Math.random() * 1000) + 1); //Random numbers between 1 and 1000
            }
        }
    }

    public static void f_total_votes() {
        //Description: This method calculates the total votes for every parties.
        for (int k = 0; k < matrix_votes[0].length; k++) { //To walk columns matrix from 0 to 7
            for (int i = 0; i < matrix_votes.length; i++) { //To walk matrix from 0 to 122
                total_votes[k] += matrix_votes[i][k]; //Summ every row (i) by any column.
            }
        }
    }

    public static void f_show_winner_and_second() {
        //Description_show winner and second.
        winner_votes = total_votes[0];
        int loser_votes = 0, loser_column = 0;
        for (int k = 1; k < total_votes.length; k++) {
            if (winner_votes < total_votes[k]) {
                winner_votes = total_votes[k];
            }
        }
        //Second place
        for (int k = 0; k < total_votes.length; k++) {
            if (winner_column != loser_column) {
                if (loser_votes < total_votes[k]) {
                    loser_votes = total_votes[k];
                    loser_column = k;
                }
            }
        }
        System.out.println("The winner is: Partido " + vector_parties[winner_column] + " Total votes " + total_votes[winner_column]);
        System.out.println("The Second place is: partido " + vector_parties[loser_column] + " Total votes " + total_votes[loser_column]);
    }
}
