package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*Author: Andres Nicolas Morales Perez
	    Date: 2020 - April - 29
	    Description: Este software esta diseñado para asimilar una masquina dispensadora de bebidas calientes.
	 */
        f_menu();
        f_carta_de_bebidas();
        int option = f_opcion_bebida();
        while (option != 0) {
            if (option == 1) {
                f_Aromática();
            } else if (option == 2) {
                f_cafe_negro();
            } else if (option == 3) {
                f_cafe_en_leche();
            } else if (option == 4) {
                f_capuchino();
            } else if (option == 5) {
                f_mocachino();
            }
            option = f_opcion_bebida();
        }
    }

    public static void f_menu() {
        //This method show the menu of this software
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║       SoftMachineDrinks      ║");
        System.out.println("║     Version 1.0 20200429     ║");
        System.out.println("║  Created by: Nicolas Morales ║");
        System.out.println("╚══════════════════════════════╝");
    }

    public static void f_carta_de_bebidas() {
        //Este metodo muestra la carta de bebidas de la maquina
        System.out.println("╔════════════════════════════════════════════════════════════════════════╗");
        System.out.println("║       Producto       ║        Valor        ║     Tiempo (creación)     ║");
        System.out.println("║══════════════════════║═════════════════════║═══════════════════════════║");
        System.out.println("║      Aromática:      ║        1.300        ║        30 segundos        ║");
        System.out.println("║══════════════════════║═════════════════════║═══════════════════════════║");
        System.out.println("║      Café negro:     ║        1.000        ║        30 segundos        ║");
        System.out.println("║══════════════════════║═════════════════════║═══════════════════════════║");
        System.out.println("║    Café con leche:   ║        1.900        ║        45 segundos        ║");
        System.out.println("║══════════════════════║═════════════════════║═══════════════════════════║");
        System.out.println("║      Capuchino:      ║        2.500        ║        60 segundos        ║");
        System.out.println("║══════════════════════║═════════════════════║═══════════════════════════║");
        System.out.println("║      Mocachino:      ║        2.700        ║        70 segundos        ║");
        System.out.println("╚════════════════════════════════════════════════════════════════════════╝");
    }

    public static int f_opcion_bebida() {
        //Este metodo selecciona la bebida pregunta si quiere otra.
        System.out.println("inserte su bebida deseada : \n1-Aromática\n2- Café negro\n3- Café con leche\n4- Capuchino\n5- Mocachino:\n0- Para salir");
        Scanner keyboard = new Scanner(System.in);
        int option = keyboard.nextInt();
        while (option < 0 || option > 5) {
            System.err.println("ERROR: Esta opcion no existe.");
            System.out.println("inserte su bebida deseada : \n1-Aromática\n2- Café negro\n3- Café con leche\n4- Capuchino\n5- Mocachino:\n6- Para salir");
            option = keyboard.nextInt();
        }
        return option;
    }

    public static void f_Aromática() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingrese su dinero en la maquina");
        int dinero, cambio;
        dinero = keyboard.nextInt();
        while (dinero < 1300) {
            System.err.println("ERROR: Su dinero no es suficiente.");
            System.out.println("Ingrese el dinero faltante que es: ( " + (1300 - dinero) + " )");
            dinero += keyboard.nextInt();
        }
        System.out.println("Su bebida sera preparada en 30 segundos");
        cambio = (dinero - 1300);
        System.out.println("Su cambio es: " + cambio + " $");
    }

    public static void f_cafe_negro() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingrese su dinero en la maquina");
        int dinero, cambio;
        dinero = keyboard.nextInt();
        while (dinero < 1000) {
            System.err.println("ERROR: Su dinero no es suficiente.");
            System.out.println("Ingrese el dinero faltante que es: ( " + (1000 - dinero) + " )");
            dinero += keyboard.nextInt();
        }
        System.out.println("Su bebida sera preparada en 30 segundos");
        cambio = (dinero - 1000);
        System.out.println("Su cambio es: " + cambio + " $");
    }

    public static void f_cafe_en_leche() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingrese su dinero en la maquina");
        int dinero, cambio;
        dinero = keyboard.nextInt();
        while (dinero < 1900) {
            System.out.println("Ingrese el dinero faltante que es: ( " + (1900 - dinero) + " $)");
            System.out.println("Ingrese su dinero en la maquina");
            dinero += keyboard.nextInt();
        }
        System.out.println("Su bebida sera preparada en 45 segundos");
        cambio = (dinero - 1900);
        System.out.println("Su cambio es: " + cambio + " $");
    }

    public static void f_capuchino() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingrese su dinero en la maquina");
        int dinero, cambio;
        dinero = keyboard.nextInt();
        while (dinero < 2500) {
            System.err.println("ERROR: Su dinero no es suficiente.");
            System.out.println("Ingrese el dinero faltante que es: ( " + (2500 - dinero) + " $)");
            dinero += keyboard.nextInt();
        }
        System.out.println("Su bebida sera preparada en 60 segundos");
        cambio = (dinero - 2500);
        System.out.println("Su cambio es: " + cambio + " $");
    }

    public static void f_mocachino() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingrese su dinero en la maquina");
        int dinero, cambio;
        dinero = keyboard.nextInt();
        while (dinero < 2700) {
            System.err.println("ERROR: Su dinero no es suficiente.");
            System.out.println("Ingrese el dinero faltante que es: ( " + (2700 - dinero) + " $)");
            dinero += keyboard.nextInt();
        }
        System.out.println("Su bebida sera preparada en 70 segundos");
        cambio = (dinero - 2700);
        System.out.println("Su cambio es: " + cambio + " $");
    }
}