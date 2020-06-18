package usta.sistemas;

import javax.swing.*;
import java.awt.*;

public class form_show_all_data_sectionals extends JDialog {
    //AUTHOR: Andres Nicolas Morales Perez
    //DATE: 2020-06-09
    //DESCRIPTION: this class show all data of file d:/students.txt

    public form_show_all_data_sectionals(java.awt.Frame parent) {
        super(parent, true);
        setLayout(new BorderLayout());
        //panel superior
        JPanel panel_superior = new JPanel();
        JLabel label_menu = new JLabel("List of Sectionals", SwingConstants.CENTER);
        label_menu.setFont(new Font("Cooper Black", 0, 20));
        panel_superior.add(label_menu);
        panel_superior.setBackground(Color.black);
        //panel central
        String[] columnsNames = {"Cuidad", "Departamento", "Direccion"};
        file_sectional_list file_data_sectional1 = new file_sectional_list();
        JTable tabla_datos = new JTable(file_data_sectional1.f_all_data_sectional_list(), columnsNames);
        tabla_datos.setFont(new Font("Cooper Black", 0, 20));
        tabla_datos.setBounds(10, 50, 590, 300);
        JScrollPane panel_central = new JScrollPane(tabla_datos);
        //añadimos los dos paneles al formulario
        add(panel_superior, BorderLayout.NORTH);
        add(panel_central, BorderLayout.CENTER);
        //Parametros generales del formulario
        setSize(600, 400);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        pack(); // modal

    }

    public form_show_all_data_sectionals() {

    }
}

