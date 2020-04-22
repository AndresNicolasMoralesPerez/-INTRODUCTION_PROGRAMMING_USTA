package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*Author: Andres Nicolas Morales Perez
	    Date: 2020 - April - 13
	    Description:This software calculate the average salary, total salary and highest salary
	 */
        f_menu();
        int N = f_number_employers();
        double highest_salary = 0, total_salary = 0, average_salary, salary_employed;
        for (int i = 1; i < N; i = i + 1) {
            salary_employed = f_salary(i);
            total_salary = total_salary + salary_employed;
            if (highest_salary < salary_employed) {
                highest_salary = salary_employed;
            }
        }
        average_salary = total_salary / N;
        System.out.println("The total salary is: " + total_salary + " the average salary is: " + average_salary + " the highest salary is: " + highest_salary);
    }

    public static void f_menu() {
        //This method show the menu of this software
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║         SoftConvertTime      ║");
        System.out.println("║     Version 1.0 20200415     ║");
        System.out.println("║  Created by: Nicolas Morales ║");
        System.out.println("╚══════════════════════════════╝");
    }

    public static int f_number_employers() {
        //Description: this method return the numbers of employers
        Scanner keyboard = new Scanner(System.in);
        int employers;
        do {
            System.out.println("Input the total employers");
            employers = keyboard.nextInt();
        } while (employers < 1);

        return employers;
    }

    public static double f_salary(int i) {
        Scanner keyboard = new Scanner(System.in);
        double salary, works_days, sueldo;
        do {
            System.out.println("Input the wages");
            sueldo = keyboard.nextDouble();

        } while (sueldo < 1);
        do {
            System.out.println("Input the worked days in the month");
            works_days = keyboard.nextDouble();
        } while (works_days < 1 || works_days > 30);
        salary = (sueldo / 30) * works_days;

        return salary;
    }
}
