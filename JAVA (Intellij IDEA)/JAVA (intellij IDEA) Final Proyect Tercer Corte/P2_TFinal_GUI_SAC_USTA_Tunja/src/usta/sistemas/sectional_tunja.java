package usta.sistemas;

import javafx.scene.control.Labeled;

import javax.swing.*;
        import java.awt.*;

class form_sectional_tunja extends JFrame {
    public form_sectional_tunja() {
        setLayout(new BorderLayout());
        //panel superior
        JPanel panel_superior = new JPanel();
        JLabel label_menu = new JLabel("Sectional USTA Tunja", SwingConstants.CENTER);
        label_menu.setFont(new Font("Cooper Black", 0, 20));
        label_menu.setBackground(Color.black);
        panel_superior.add(label_menu);
        panel_superior.setBackground(Color.black);
        //panel central
        JPanel panel_central = new JPanel();
        JLabel label_maker1 = new JLabel();
        label_maker1.setText("<html>La Universidad Santo Tomás, Primer Claustro Universitario de Colombia<br/>,fue fundada por la Orden de Predicadores (O. P.)" +
                "<br/>el 13 de junio de 1580 En 1608 se fundó el Colegio Santo Tomás<br/>y posteriormente se fusionó con la Universidad de Estudios Generales." +
                "<br/>Nació así el Colegio-Universidad Santo Tomás que posteriormente se llamaría Universidad Tomística.</html>");
        label_maker1.setFont(new Font("Cooper Black", 0, 20));
        label_maker1.setBackground(Color.orange);
        panel_central.setBackground(Color.orange);
        panel_central.add(label_maker1);
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


