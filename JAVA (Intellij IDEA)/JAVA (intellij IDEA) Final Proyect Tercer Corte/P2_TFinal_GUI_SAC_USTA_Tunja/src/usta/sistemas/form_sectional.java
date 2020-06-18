package usta.sistemas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form_sectional extends JFrame {

    public form_sectional() {
        setTitle("SAC JAVA versión NM 1.0");
        setLayout(new BorderLayout());
        //panel superior
        JPanel panel_superior = new JPanel();
        JLabel label_menu = new JLabel("Sectionals USTA", SwingConstants.CENTER);
        label_menu.setFont(new Font("Cooper Black", 0, 20));
        panel_superior.setBackground(Color.black);
        panel_superior.add(label_menu);
        this.getContentPane().setBackground(Color.black);
        //panel izquierdo (donde van a estar los botones)
        JPanel panel_izquierdo = new JPanel();
        panel_izquierdo.setLayout(new GridLayout(5, 1));
        this.getContentPane().setBackground(Color.black);
        //creamos el tprimer boton (Tunja).
        JButton boton_sectional_tunja = new JButton("Tunja");
        boton_sectional_tunja.setBounds(0, 0, 50, 15);
        boton_sectional_tunja.setFont(new Font("Cooper Black", 0, 20));
        boton_sectional_tunja.setBackground(Color.orange);
        boton_sectional_tunja.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                form_sectional_tunja form_sectional1 = new form_sectional_tunja();
            }
        });
        panel_izquierdo.add(boton_sectional_tunja);
        //creamos el segundo boton (Bogota).
        JButton boton_sectional_bogota = new JButton("Bogota");
        boton_sectional_bogota.setBounds(0, 0, 50, 15);
        boton_sectional_bogota.setFont(new Font("Cooper Black", 0, 20));
        boton_sectional_bogota.setBackground(Color.orange);
        boton_sectional_bogota.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                form_sectional_bogota form_sectional1 = new form_sectional_bogota();
            }
        });
        panel_izquierdo.add(boton_sectional_bogota);
        //creamos el segundo boton (Medellin).
        JButton boton_sectional_medellin = new JButton("Medellin");
        boton_sectional_medellin.setBounds(0, 0, 50, 15);
        boton_sectional_medellin.setFont(new Font("Cooper Black", 0, 20));
        boton_sectional_medellin.setBackground(Color.orange);
        boton_sectional_medellin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                form_sectional_medellin form_sectional1 = new form_sectional_medellin();
            }
        });
        panel_izquierdo.add(boton_sectional_medellin);
        //creamos el segundo boton (Bucaramanga).
        JButton boton_sectional_bucaramanga = new JButton("Bucaramanga");
        boton_sectional_bucaramanga.setBounds(0, 0, 50, 15);
        boton_sectional_bucaramanga.setFont(new Font("Cooper Black", 0, 20));
        boton_sectional_bucaramanga.setBackground(Color.orange);
        boton_sectional_bucaramanga.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                form_sectional_bucaramanga form_sectional1 = new form_sectional_bucaramanga();
            }
        });
        panel_izquierdo.add(boton_sectional_bucaramanga);
        //creamos el segundo boton (Villavicecio).
        JButton boton_sectional_villavicecio = new JButton("Villavicecio");
        boton_sectional_villavicecio.setBounds(0, 0, 50, 15);
        boton_sectional_villavicecio.setFont(new Font("Cooper Black", 0, 20));
        boton_sectional_villavicecio.setBackground(Color.orange);
        boton_sectional_villavicecio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                form_sectional_villavicencio form_sectional1 = new form_sectional_villavicencio();
            }
        });
        panel_izquierdo.add(boton_sectional_villavicecio);

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
}
