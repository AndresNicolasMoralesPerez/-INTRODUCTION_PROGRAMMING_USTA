package usta.sistemas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form_principal extends JFrame {
    public form_principal() {
        setTitle("SAC JAVA versión NM 1.0");
        setLayout(new BorderLayout());
        //panel superior
        JPanel panel_superior = new JPanel();
        JLabel label_menu = new JLabel("Menú principal", SwingConstants.CENTER);
        label_menu.setFont(new Font("Cooper Black", 0, 20));
        panel_superior.setBackground(Color.black);
        panel_superior.add(label_menu);
        this.getContentPane().setBackground(Color.black);
        JLabel Label_central = new JLabel();
        Label_central.setIcon(new ImageIcon("https://es.wikipedia.org/wiki/Universidad_Santo_Tom%C3%A1s_(Colombia)#/media/Archivo:EscudoUsta.png", String.valueOf(SwingConstants.CENTER)));
        //        //panel izquierdo (donde van a estar los botones)
        JPanel panel_izquierdo = new JPanel();
        panel_izquierdo.setLayout(new GridLayout(5, 1));
        this.getContentPane().setBackground(Color.black);
        //creamos el primer boton
        JButton boton_formulario1 = new JButton("New Student");
        boton_formulario1.setBounds(0, 0, 50, 30);
        boton_formulario1.setFont(new Font("Cooper Black", 0, 20));
        boton_formulario1.setBackground(Color.orange);
        boton_formulario1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //Aqui va el boton de el primer formulario.
                form_estudent form_estudent1 = new form_estudent();
            }
        });
        panel_izquierdo.add(boton_formulario1);
        //creamos el segundo boton
        JButton boton_formulario2 = new JButton("List all students");
        boton_formulario2.setBounds(0, 0, 80, 15);
        boton_formulario2.setFont(new Font("Cooper Black", 0, 20));
        boton_formulario2.setBackground(Color.orange);
        boton_formulario2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                f_abrir_form_show_all_student(actionEvent);
            }
        });
        panel_izquierdo.add(boton_formulario2);

        //creamos el tercer boton (sectional).
        JButton boton_sectional = new JButton("Sectional");
        boton_sectional.setBounds(0, 0, 50, 15);
        boton_sectional.setFont(new Font("Cooper Black", 0, 20));
        boton_sectional.setBackground(Color.orange);
        boton_sectional.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                form_sectional form_sectional1 = new form_sectional();
            }
        });
        panel_izquierdo.add(boton_sectional);

        //creamos el cuarto boton (sectional list).
        JButton boton_sectional_list = new JButton("Sectional List");
        boton_sectional_list.setBounds(0, 0, 50, 15);
        boton_sectional_list.setFont(new Font("Cooper Black", 0, 20));
        boton_sectional_list.setBackground(Color.orange);
        boton_sectional_list.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                form_sectional_list form_sectional_list1 = new form_sectional_list();
            }
        });
        panel_izquierdo.add(boton_sectional_list);

        //creamos el quinto boton (acercade).
        JButton boton_acercade = new JButton("Acerca de...");
        boton_acercade.setBounds(0, 0, 50, 15);
        boton_acercade.setFont(new Font("Cooper Black", 0, 20));
        boton_acercade.setBackground(Color.orange);
        boton_acercade.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                form_acercade form_acercade1 = new form_acercade();
            }
        });
        panel_izquierdo.add(boton_acercade);
        // creamos el panel inferior
        JPanel panel_inferior = new JPanel();
        panel_inferior.add(new JLabel("Creado por: Andres Nicolas Morales Perez "));
        panel_inferior.setFont(new Font("Cooper Black", 0, 20));
        panel_inferior.setBackground(Color.orange);
        //agregar los paneles al formulario (jframe).
        add(panel_superior, BorderLayout.NORTH);
        add(panel_izquierdo, BorderLayout.WEST);
        add(panel_inferior, BorderLayout.SOUTH);


        //parametros generales del formularios
        setVisible(true);
        setResizable(false);
        setBounds(0, 0, 600, 400);
        setLocationRelativeTo(null);
    }

    private void f_abrir_form_show_all_student(java.awt.event.ActionEvent evt) {
        form_show_all_student form_show_all_student1 = new form_show_all_student(this);
    }

}
