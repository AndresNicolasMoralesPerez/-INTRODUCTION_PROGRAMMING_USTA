package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*Author: Andres Nicolas Morales Perez
	    Date: 2020 - April - 13
	    Description: program that calculates the average height of a group of 5 children.*/
	    f_menu();
	    double sumatory=f_sum_height();
        System.out.println("The sumatory is:"+sumatory+ "(MTS)");
	    f_average(sumatory);
    }
        public static void f_menu(){
        //This method show the menu of this software
        //Esta funcion no le ingresan parametros y no me retorna nada
        System.out.println("--------------------------------");
        System.out.println("|       SoftAverageHeight      |");
        System.out.println("|     Version 1.0 20200413     |");
        System.out.println("|  Created by: Nicolas Morales |");
        System.out.println("--------------------------------");
    }
        public static double f_sum_height(){
        //Description: This method calculate the sumatory of 5 height
        //Esta funcion no le ingresan parametros y si me retorna un double
        Scanner keyboard = new Scanner(System.in);
        double sumatory, height1, height2, height3, height4, height5;
        System.out.println("Input the first height (MTS)");
        height1=keyboard.nextDouble();
        System.out.println("Input the second height (MTS)");
        height2=keyboard.nextDouble();
        System.out.println("Input the third height (MTS)");
        height3=keyboard.nextDouble();
        System.out.println("Input the four height (MTS)");
        height4=keyboard.nextDouble();
        System.out.println("Input the five height (MTS)");
        height5=keyboard.nextDouble();
        sumatory=height1+height2+height3+height4+height5;
        return sumatory;
    }
        public static void  f_average(double sumatory){
        //Description: This method calculate average
        //Esta funcion si le ingresan parametros y no me retorna
        double average= sumatory/5;
        System.out.println("Average is:"+average+"(MTS)");
    }

}
