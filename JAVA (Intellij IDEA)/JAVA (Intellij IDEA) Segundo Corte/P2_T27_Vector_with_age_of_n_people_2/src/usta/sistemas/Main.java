package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*Author: Andres Nicolas Morales Perez
	    Date: 2020 - May - 05
	    Description: This software Generates the age randomly for N people and save them in a vector, with this information:
                     determine how many are over 18 and when they are under.
                     Those who are over 60 years old.
                     Average age.
	 */
        int total_people = f_menu();
        int[] age_people = f_age_of_people(total_people);
        f_show_ages(age_people);
        f_show_ages_upper_60(age_people);
        f_show_average_age(age_people);
    }

    public static int f_menu() {
        //This method show the menu of this software
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║       SoftVectorNPeople      ║");
        System.out.println("║     Version 1.0 20200505     ║");
        System.out.println("║  Created by: Nicolas Morales ║");
        System.out.println("╚══════════════════════════════╝");
        System.out.println("Input the total number of people");
        Scanner keyboard = new Scanner(System.in);
        int total_people = keyboard.nextInt();
        while (total_people <= 0) {
            System.err.println("ERR: Only numbers of total people higher to zero");
            System.out.println("Input again the total number of people");
            total_people = keyboard.nextInt();
        }
        return total_people;
    }

    public static int[] f_age_of_people(int total_people) {
        //Description:
        int[] age_people = new int[total_people];
        for (int i = 0; i < total_people; i++) {
            age_people[i] = (int) Math.floor((Math.random() * 80) + 1);

        }
        return age_people;
    }

    public static void f_show_ages(int[] age_people) {
        //Description: This method show how many are over 18 and when they are under
        int total_people = age_people.length;
        int total_over_18 = 0, total_under_18 = 0;
        for (int i = 0; i < total_people; i++) {
            System.out.println(age_people[i]);
            if (age_people[i] < 18) {
                total_under_18++;
            } else {
                total_over_18++;
            }
        }
        System.out.println("The total of people under 18 are " + total_under_18);
        System.out.println("The total of people over 18 are " + total_over_18);
    }

    public static void f_show_ages_upper_60(int[] age_people) {
        //Description: This method show how many are over 18 and when they are under
        int total_people = age_people.length;
        int total_over_60 = 0, total_under_60 = 0;
        for (int i = 0; i < total_people; i++) {
            System.out.println(age_people[i]);
            if (age_people[i] < 60) {
                total_under_60++;
            } else {
                total_over_60++;
            }
        }
        System.out.println("The total of people under 60 are " + total_under_60);
        System.out.println("The total of people over 60 are " + total_over_60);
    }

    public static void f_show_average_age(int[] age_people) {
        //DESCRIPTION: This method show the average of some ages.
        int sum_ages = 0;
        for (int i = 0; i < age_people.length; i++) {
            sum_ages = sum_ages + age_people[i];
        }
        double average = sum_ages / age_people.length;
        System.out.println("The average is: " + average);
    }
}

