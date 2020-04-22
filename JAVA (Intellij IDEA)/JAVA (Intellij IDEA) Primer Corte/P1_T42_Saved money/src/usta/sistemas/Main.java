package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Andres Nicolas Morales Perez
	DATE: 29/03/202
	DESCRIPTION: This software determines how much money a person will save in a year
if you consider that each week you save 15% of your salary
	 */
Scanner keyboard= new Scanner(System.in);
double salary_annual;
        System.out.println("determines how much money a person will save in a year");
        System.out.println("Input your salary annual");
        salary_annual= keyboard.nextDouble();
        System.out.println("The salary in the month is:"+salary_annual/12);
        System.out.println("The salary in the weak is:"+salary_annual/48);
        System.out.println("The saving salary in the weak is"+salary_annual/48*0.15);
        System.out.println("The money save in the tear is"+salary_annual/48*0.15*48);
    }
}
