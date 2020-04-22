package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/* Author: Andres Nicolas Morales Perez
	   Date: 2020 - April - 15
	   Description: Write two functions that allow you to calculate:
       o The number of seconds in a given time in hours.
       o The number of seconds in a given time in minutes.
       o The number of hours, minutes in given time in seconds.
	 */
	f_menu();
	int option = f_option();
	if (option == 1){ //Covert hours to seconds}
	    f_convert_hours_to_seconds();
    }else if (option == 2){ //Convert mintes to seconds
	    f_convert_minutes_to_seconds();
    }else {
	    f_convert_seconds_to_hours_and_minutes();
    }
    }
    //Esta funcion no le ingresan parametros y no me retorna nada
    public static void f_menu(){
        //This method show the menu of this software
        System.out.println("╔═══════════════════════════════╗");
        System.out.println("║        SoftConvertTime        ║");
        System.out.println("║     Version 1.0 20200415      ║");
        System.out.println("║  Created by: Nicolas Morales  ║");
        System.out.println("╚═══════════════════════════════╝");

    }
    public static int f_option(){
        //Description: This method return the option
        System.out.println("Input the option of the convert: \n1-Hours to seconds\n2-Minutes to seconds\n3-Seconds to hours and minutes");
        Scanner keyboard = new Scanner(System.in);
        int option = keyboard.nextInt();
        while (option < 1 || option > 3){ //Si la option is less to 1 or grater than 3
            System.err.println("ERR: This option not exist");
            System.out.println("Input the option of the convert: \n1-Hours to seconds\n2-Minutes to seconds\n3-Seconds to hours and minutes");
            option = keyboard.nextInt();
        }
        return option;
    }
    public static void  f_convert_hours_to_seconds(){
        //Convert the number of seconds in a given time in a hours.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the numbers hours to convert");
        int hours = keyboard.nextInt();
        int seconds = hours*60*60;
        System.out.println("The number hours : "+hours+" Have "+seconds+" Seconds");
    }
    public static void  f_convert_minutes_to_seconds(){
        //Convert the number of seconds in a given time in a minutes.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the numbers minutes to convert");
        int minutes = keyboard.nextInt();
        int seconds = minutes*60;
        System.out.println("The number minutes : "+minutes+" Have "+seconds+" Seconds");
    }
    public static void  f_convert_seconds_to_hours_and_minutes(){
        //Convert seconds to hours and minutes.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the numbers seconds to convert");
        int seconds = keyboard.nextInt();
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        System.out.println(seconds+ " seconds equals to "+ hours +" hours and "+minutes+ " minutes");
    }
}
