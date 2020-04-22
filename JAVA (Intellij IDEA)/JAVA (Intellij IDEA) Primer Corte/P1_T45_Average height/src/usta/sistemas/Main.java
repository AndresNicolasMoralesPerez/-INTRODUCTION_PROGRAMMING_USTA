package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Andres Nicolas Morales Perez
	DATE: 29/03/2020
	DESCRIPTION: Calculate the average height of group of 5 children in (CM)
	 */
	int child_1,child_2,child_3,child_4,child_5;
	Scanner keyboard= new Scanner(System.in);
        System.out.println("Let's enter the height of the children in (CM)");
        System.out.println("enter the child's height 1 (CM)");
        child_1= keyboard.nextInt();
        System.out.println("enter the child's height 2 (CM)");
        child_2= keyboard.nextInt();
        System.out.println("enter the child's height 3 (CM)");
        child_3= keyboard.nextInt();
        System.out.println("enter the child's height 4 (CM)");
        child_4= keyboard.nextInt();
        System.out.println("enter the child's height 5 (CM)");
        child_5= keyboard.nextInt();
        System.out.println("The Average of children height is:"+(child_1+child_2+child_3+child_4+child_5)/5+"(CM)");
    }
}
