package usta.sistemas;

import javax.swing.*;
import java.awt.*;

public class form_acercade extends JFrame {
    public form_acercade() {
        setLayout(new BorderLayout());
        //panel superior
        JPanel panel_superior = new JPanel();
        JLabel label_menu = new JLabel("Acerca de", SwingConstants.CENTER);
        label_menu.setFont(new Font("Cooper Black", 0, 20));
        this.getContentPane().setBackground(Color.black);
        label_menu.setBackground(Color.black);
        panel_superior.add(label_menu);
        panel_superior.setBackground(Color.black);
        //panel central
        JPanel panel_central = new JPanel();
        JLabel label_maker = new JLabel("<html>This software was make by Andres Nicolas Morales Perez,<br/>" +
                " im student of Santo tomas University,<br/>" +
                " Im sistems eingineering in process<html><br/>" +
                "e-mail: andres.moralesp@usantoto.edu.co<br/>" +
                "                      :D                    ", SwingConstants.CENTER);
        label_maker.setFont(new Font("Cooper Black", 0, 30));
        label_maker.setBackground(Color.orange);
        panel_central.setBackground(Color.orange);
        panel_central.add(label_maker);
        //agregamos los paneles al formulario
        add(panel_superior, BorderLayout.NORTH);
        add(panel_central, BorderLayout.CENTER);
        //parametros del formulario

        setVisible(true);
        setResizable(false);
        setBounds(0, 0, 900, 300);
        setLocationRelativeTo(null);
    }
}
