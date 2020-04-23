package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*Author: Andres Nicolas Morales Perez
	    Date: 2020 - April - 23
	    Description: This software Records the times of each lap of training and determines the best lap, the average and the number of laps per training (the laps will be until the athlete gets tired / exhausted)
	 */
	int total_laps = 0;
	double best_lap = 0, average, time_lap, summatory_time = 0;
	f_menu();
	while (f_continuar()==true){
	    total_laps+=1;
	    time_lap = f_value_laps(total_laps);
	    summatory_time+=time_lap;
	    if (total_laps==1){
	        best_lap = time_lap;
        }if (best_lap>time_lap){
	        best_lap=time_lap;
        }
    }
    }
    public static void f_menu() {
        //This method show the menu of this software
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║         SoftConvertTime      ║");
        System.out.println("║     Version 1.0 20200415     ║");
        System.out.println("║  Created by: Nicolas Morales ║");
        System.out.println("╚══════════════════════════════╝");
    }
    public static boolean f_continuar(){
        //This method return a boolean value true/false
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Do you want to continue the training");
        boolean rpta = keyboard.nextBoolean();
        return rpta;
    }
    public static double f_value_laps(int lap){
        //Description: this method return the time of a lap.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("input the time ("+lap+") lap (seconds)");
        double time = keyboard.nextDouble();
        while (time < 1){
            System.err.println("ERR: The time must greater to be one");
            System.out.println("input the time ("+lap+") lap (seconds)");
            time = keyboard.nextDouble();
        }
        return time;
    }
}
