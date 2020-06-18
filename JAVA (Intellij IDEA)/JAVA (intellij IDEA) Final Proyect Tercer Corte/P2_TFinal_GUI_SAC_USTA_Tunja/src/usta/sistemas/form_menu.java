package usta.sistemas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form_menu extends JFrame {
    //this is constructor (se ejecuta cada vez que yo llame esta clase)

    public form_menu() {
        //etiqueta de nombre del software
        JLabel label_menu = new JLabel("SAC versión JAVA", SwingConstants.CENTER);
        label_menu.setFont(new Font("Cooper Black", 1, 30));
        label_menu.setBounds(0, 10, 600, 50);
        add(label_menu);
        this.getContentPane().setBackground(Color.black);
        //etiqueta de quien lo creo.
        JLabel label_maker = new JLabel("Create by: \nAndres Nicolas Morales Perez", SwingConstants.LEFT);
        label_maker.setBounds(5, 300, 590, 20);
        label_maker.setFont(new Font("Cooper Black", 0, 18));
        add(label_maker);
        JButton boton_iniciar = new JButton("iniciar");
        boton_iniciar.setBounds(250, 200, 100, 50);
        boton_iniciar.setFont(new Font("Cooper Black", 0, 18));
        boton_iniciar.setBackground(Color.orange);
        //crearle una acción para cuando le de clic
        boton_iniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //crear una instancia del formulario principal
                form_principal form_principal1 = new form_principal();
            }
        });
        add(boton_iniciar);
        //propiedades del formulario
        setLayout(null);
        setVisible(true);
        setResizable(false);
        setBounds(0, 0, 600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

