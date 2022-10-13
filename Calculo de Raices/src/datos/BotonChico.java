package datos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

public class BotonChico extends Boton{

    public BotonChico(Font letra) {
        super(letra);
        setBackground(new Color(63,150,221));
        setForeground(Color.white);
        setPreferredSize(new Dimension(50,30));
        addMouseListener(new AccionesMouse(this, new Color(67, 172, 255), new Color(63,150,221)));
    }
    
}
