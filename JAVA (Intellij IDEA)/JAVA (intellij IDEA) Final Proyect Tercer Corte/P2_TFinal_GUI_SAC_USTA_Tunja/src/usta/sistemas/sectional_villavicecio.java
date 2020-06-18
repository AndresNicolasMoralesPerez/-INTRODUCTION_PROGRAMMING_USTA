package usta.sistemas;

import javax.swing.*;
import java.awt.*;

class form_sectional_villavicencio extends JFrame {
    public form_sectional_villavicencio() {
        setLayout(new BorderLayout());
        //panel superior
        JPanel panel_superior = new JPanel();
        JLabel label_menu = new JLabel("Sectional USTA Villavicencio", SwingConstants.CENTER);
        label_menu.setFont(new Font("Cooper Black", 0, 20));
        label_menu.setBackground(Color.black);
        panel_superior.add(label_menu);
        panel_superior.setBackground(Color.black);
        //panel central
        JPanel panel_central = new JPanel();
        JLabel label_maker4 = new JLabel("<html>En esta Sede, actualmente se ofrecen a nivel de Pregrado en la modalidad presencial,<br/>" +
                " los programas de Administración de Empresas Agropecuarias,<br/>" +
                " Arquitectura, Contaduría Pública, Derecho, entre otras<html>", SwingConstants.CENTER);
        label_maker4.setFont(new Font("Cooper Black", 0, 20));
        panel_central.add(label_maker4);
        label_maker4.setBackground(Color.orange);
        panel_central.setBackground(Color.orange);
        //agregamos los paneles al formulario
        add(panel_superior, BorderLayout.NORTH);
        add(panel_central, BorderLayout.CENTER);
        //parametros del formulario

        setVisible(true);
        setResizable(false);
        setBounds(0, 0, 900, 200);
        setLocationRelativeTo(null);
    }
}