package usta.sistemas;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean b_funciona=false;
        do{
            try {
                Scanner keyboard = new Scanner(System.in);
                System.out.println("Input the total people");
                int total_people = keyboard.nextInt();
                b_funciona = true;

            }catch (Exception e){
                System.err.println("ERR: This software allowed only number");
            }
        }while (b_funciona==false);
    }
}
