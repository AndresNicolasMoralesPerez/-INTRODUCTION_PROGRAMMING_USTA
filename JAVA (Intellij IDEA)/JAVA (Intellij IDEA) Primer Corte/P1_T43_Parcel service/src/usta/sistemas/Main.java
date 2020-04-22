package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Andres Nicolas Morales Perez
	DATE: 1/04/2020
	DESCRIPTION: This program calculate the shipping cost of the ten different products
	 */
int p1, p2, p3, p4, p5, destiny,total_bill;
Scanner keyboard= new Scanner(System.in);
f_menu();
        System.out.println("Input the first product");
        p1= keyboard.nextInt();
        System.out.println("Input the second product");
        p2= keyboard.nextInt();
        System.out.println("Input the third product");
        p3= keyboard.nextInt();
        System.out.println("Input the fourth product");
        p4= keyboard.nextInt();
        System.out.println("Input the five product");
        p5= keyboard.nextInt();
        System.out.println("input destiny (1 north america) (2= central america) (3= south america) (4= europa) (5= asia)");
        destiny= keyboard.nextInt();
        total_bill= p1+p2+p3+p4+p5+f_parcel_services(destiny);
        System.out.println("The total bill is:"+total_bill);
    }

    public static void f_menu(){
        //DESCRIPTION: This function show the menu
        System.out.println("----------------------------------");
        System.out.println("          soft calculate          ");
        System.out.println("      version 1.0 2020 april 1    ");
        System.out.println("       maker: Nicolas Morales     ");
        System.out.println("----------------------------------");
    }

    public static int f_parcel_services(int p_destiny){
        //DESCRIPTION: This program calculate the shipping cost of the ten different products
        int valor = 0;
        if (p_destiny== 1) {
          valor= 11;

        } else if (p_destiny== 2){
            valor= 10;

        } else if (p_destiny== 3){
            valor = 12;

        } else if (p_destiny== 4){
            valor= 24;

        } else if (p_destiny== 5) {
            valor = 27;
        } else {
            System.err.println("ERROR: Destiny not found");

        }
        return valor;
    }
}
