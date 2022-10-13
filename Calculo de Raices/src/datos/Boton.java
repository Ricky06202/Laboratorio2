package datos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Boton extends JButton{
    public Boton(Font letra){
        setBackground(new Color(0,162,155));
        setForeground(Color.white);
        setPreferredSize(new Dimension(200, 70));
        setFocusPainted(false);
        setBorderPainted(false);
        setFont(letra);
        setVerticalAlignment(JButton.TOP);
        addMouseListener(new AccionesMouse(this, new Color(20,164,255), 
        new Color(0,162,155)));
    }

    class AccionesMouse implements MouseListener{
    
        private Color colorEntered, colorExited;
        private JButton boton;
        
        public AccionesMouse(JButton boton, Color colorEntered, Color colorExited) {
            this.boton = boton;
            this.colorEntered = colorEntered;
            this.colorExited = colorExited;
        }
    
        @Override
        public void mouseClicked(MouseEvent arg0) {
            // TODO Auto-generated method stub
            
        }
    
        @Override
        public void mouseEntered(MouseEvent arg0) {
            boton.setBackground(colorEntered);
            
        }
    
        @Override
        public void mouseExited(MouseEvent arg0) {
            boton.setBackground(colorExited);
            
        }
    
        @Override
        public void mousePressed(MouseEvent arg0) {
            // TODO Auto-generated method stub
            
        }
    
        @Override
        public void mouseReleased(MouseEvent arg0) {
            // TODO Auto-generated method stub
            
        }
    
    }
}

