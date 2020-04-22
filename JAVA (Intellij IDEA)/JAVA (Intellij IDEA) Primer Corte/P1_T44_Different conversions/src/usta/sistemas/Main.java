package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Andres Nicolas Morales Perez
	DATE: 29/03/2020
	DESCRIPTION: this software use the different methods of conversions
	 */
	Scanner keyboard= new Scanner(System.in);
	double C,F,K;
        System.out.println("use the different methods of conversions");
        System.out.println("Put the grados C para combertirlos a F");
        C= keyboard.nextDouble();
        System.out.println("Los grados F son:"+C*1.8+32);
        System.out.println("Agregue los grados F para combertirlos a C");
        F= keyboard.nextDouble();
        System.out.println("Los grados C son:"+(F-32)/1.8);
        System.out.println("Agregue los grados C para combetirlos a K");
        C= keyboard.nextDouble();
        System.out.println("Los grados K son;"+(C+273.15));
        System.out.println("Agrgue los grados K para combertirlos en C");
        K= keyboard.nextDouble();
        System.out.println("Los grados C son:"+(K-273.15));
    }
}
