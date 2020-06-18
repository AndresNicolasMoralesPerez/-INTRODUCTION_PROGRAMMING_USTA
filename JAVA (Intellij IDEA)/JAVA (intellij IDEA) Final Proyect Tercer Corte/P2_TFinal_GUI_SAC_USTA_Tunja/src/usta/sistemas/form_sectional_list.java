package usta.sistemas;

import javax.swing.*;
import java.awt.*;

public class form_sectional_list extends JFrame {
    public form_sectional_list() {
        setLayout(new BorderLayout());
        //panel superior
        JPanel panel_superior = new JPanel();
        JLabel label_menu = new JLabel("List All Sectionals", SwingConstants.CENTER);
        label_menu.setFont(new Font("Cooper Black", 0, 20));
        label_menu.setBackground(Color.black);
        panel_superior.add(label_menu);
        panel_superior.setBackground(Color.black);
        //panel central
        JPanel panel_central = new JPanel();
        JLabel label_maker1 = new JLabel();
        label_maker1.setText("<html>Tunja<br/>" +
                "Bogota<br/>" +
                "Medellin<br/>" +
                "Bucaramanga<br/>" +
                "Villavicecncio</html>");
        label_maker1.setFont(new Font("Cooper Black", 0, 30));
        label_maker1.setBackground(Color.orange);
        panel_central.setBackground(Color.orange);
        panel_central.add(label_maker1);
        //agregamos los paneles al formulario
        add(panel_superior, BorderLayout.NORTH);
        add(panel_central, BorderLayout.CENTER);
        //parametros del formulario

        setVisible(true);
        setResizable(false);
        setBounds(0, 0, 500, 300);
        setLocationRelativeTo(null);
    }
}

