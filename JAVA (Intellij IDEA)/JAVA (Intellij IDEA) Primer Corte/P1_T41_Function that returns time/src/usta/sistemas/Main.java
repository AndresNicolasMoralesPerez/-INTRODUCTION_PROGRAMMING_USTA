package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Andres Nicolas Morales Perez
	DATE: 29/03/2020
	DESCRIPTION: This software determines the time it takes a person to
get from one city to another by bicycle, considering that it takes
a constant speed
	 */
double speed, distance, time_spent;
Scanner keyboard= new Scanner(System.in);
        System.out.println("determines the time it takes a person to\n" +
                "get from one city to another by bicycle");
        System.out.println("Put the distance of the travel (Km)");
        distance = keyboard.nextDouble();
        System.out.println("Input the average speed (Km/h");
        speed = keyboard.nextDouble();
        time_spent = distance/speed;
        System.out.println("The time spent of travel is:"+time_spent+"Hours");
    }
}
