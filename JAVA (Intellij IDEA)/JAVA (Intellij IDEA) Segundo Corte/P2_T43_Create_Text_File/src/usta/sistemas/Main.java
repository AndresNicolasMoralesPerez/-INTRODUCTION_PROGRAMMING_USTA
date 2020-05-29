package usta.sistemas;

import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
	/*Author: Andres Nicolas Morales Perez
	Date: 2020-MAY-28
	Description: Create text file
	 */
	try{

        PrintWriter admin_files = new PrintWriter("D:/Daniel.txt");
        admin_files.println("first line");
        admin_files.println("second line");
        admin_files.close();

    }catch (Exception e){
        System.err.println("ERR: The software is finish because:");
        e.printStackTrace(); //Show error (engineer)
    }
    }
}
