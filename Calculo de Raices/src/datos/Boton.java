package datos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;

public class Boton extends JButton{
    public Boton(Font letra){
        setBackground(new Color(0,162,155));
        setPreferredSize(new Dimension(200, 70));
        setFont(letra);
    }
}
