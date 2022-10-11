package datos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame{
    private JPanel panelSuperior, panelIzquierdo;
    public Ventana(){
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setSize(1000, 700);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);

        panelSuperior = new JPanel();
        panelSuperior.setBackground(new Color(84,231,224));
        panelSuperior.setPreferredSize(new Dimension(getWidth(), 100));
        add(panelSuperior, BorderLayout.NORTH);

        panelIzquierdo = new JPanel();
        panelIzquierdo.setBackground(new Color(160,246,224));
        panelIzquierdo.setPreferredSize(new Dimension(200, getHeight()));
        add(panelIzquierdo, BorderLayout.WEST);
    }
}
