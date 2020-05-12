package usta.sistemas;

public class Main {

    public static void main(String[] args) {
	/*Author: Andres Nicolas Morales Perez
	    Date: 2020 - May - 12
	    Description: This software Store in a matrix the number of students (10) with which a subject has, with their respective four notes (P1: 20%, P2:25%, P3:25%, P4:30%.... Notes are random values between 0.0 and 5.0): */
        f_menu();
        double[][] matrix_grades = f_fill_matrix();
        f_show_final_grades(matrix_grades);
    }

    public static void f_menu() {
        //This method show the menu of this software
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║       SoftGradeStudents      ║");
        System.out.println("║     Version 1.0 20200512     ║");
        System.out.println("║  Created by: Nicolas Morales ║");
        System.out.println("╚══════════════════════════════╝");
    }

    public static double[][] f_fill_matrix() {
        //Description: This method return the fill matrix (10x24)
        double[][] matrix = new double[10][4];
        for (int i = 0; i < 10; i++) {
            matrix[i][0] = Math.floor((Math.random() * 5) + 1);//First grade random 0.0 y 5.0
            matrix[i][1] = Math.floor((Math.random() * 5) + 1);//Second grade random 0.0 y 5.0
            matrix[i][2] = Math.floor((Math.random() * 5) + 1);//Third grade random 0.0 y 5.0
            matrix[i][3] = Math.floor((Math.random() * 5) + 1);//four grade random 0.0 y 5.0
        }
        return matrix;
    }

    public static void f_show_final_grades(double[][] matrix_grades) {
        //Description: This method show the final grades.
        double final_grades = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("student ( " + (i + 1) + " ), grade 1 " + matrix_grades[i][0] + " grade 2 " + matrix_grades[i][1] +
                    " , grade 3 " + matrix_grades[i][2] + " grade 4 " + matrix_grades[i][3]);
            final_grades = matrix_grades[i][0] * 0.2 +
                    matrix_grades[i][1] * 0.25 +
                    matrix_grades[i][2] * 0.25 +
                    matrix_grades[i][3] * 0.3;
            System.out.println("student ( " + (i + 1) + " ), grade 1: " + matrix_grades[i][0] + " grade 2: " + matrix_grades[i][1] + " grade 3: " + matrix_grades[i][2] + " grade 4: " + matrix_grades[i][3] + " -> final grade : " + final_grades);


        }
    }
}
