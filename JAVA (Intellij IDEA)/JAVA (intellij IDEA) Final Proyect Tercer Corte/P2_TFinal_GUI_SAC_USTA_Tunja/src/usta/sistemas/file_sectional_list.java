package usta.sistemas;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class file_sectional_list {
    //AUTHOR: Andres Nicolas Morales Perez
    //DATE: 2020-06-09
    //DESCRIPTION: this class creates and show data of a file d:/sectionals.txt

    public static boolean f_add_student(String p_Ciudad, String p_Departamento, String p_Direccion) {
        //description: this method create new line into a file d:/sectionals.txt
        boolean result;
        try {
            File myFile1 = new File("d:/sectionals.txt");
            if (myFile1.exists()) {
                //instanciamos el archivo con TRUE para agregar nuevas lineas.
                FileWriter myFile2 = new FileWriter(myFile1, true);
                //cargar la data del archivo en memoria
                BufferedWriter dataMyFile = new BufferedWriter(myFile2);
                dataMyFile.write("\n" + p_Ciudad + "|" + p_Departamento + "|" + p_Direccion);
                dataMyFile.close();
                result = true;
            } else {
                result = false;
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static String[][] f_all_data_sectional_list() {
        //description: this method returns all data (all lines) of file d:/sectionals.txt
        String[][] matrix_sectioals;
        String linea_texto, linea_tmp;
        int row = 0, total_lines = 0, separador1, separador2;
        try {
            File myFile = new File("d:/sectionals.txt");
            if (myFile.exists()) {
                Scanner myFile2 = new Scanner(myFile);
                while (myFile2.hasNextLine()) {
                    total_lines++;
                    myFile2.nextLine();
                }
                myFile2.close();
                myFile2 = null;
                matrix_sectioals = new String[total_lines][3];
                myFile2 = new Scanner(myFile);
                while (myFile2.hasNextLine()) {
                    linea_texto = myFile2.nextLine();
                    separador1 = linea_texto.indexOf("|");
                    if (separador1 != -1) {  //garantizamos que la linea de texto tenga datos
                        matrix_sectioals[row][0] = linea_texto.substring(0, separador1);  //solo el nombre de la ciudad
                        linea_tmp = linea_texto.substring(separador1 + 1);
                        separador2 = linea_tmp.indexOf("|");
                        matrix_sectioals[row][1] = linea_tmp.substring(0, separador2);   //solo el Departamento
                        matrix_sectioals[row][2] = linea_tmp.substring(separador2 + 1);   //solo la Direccion
                        row++;
                    }
                }
                myFile2.close();
                return matrix_sectioals;
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
