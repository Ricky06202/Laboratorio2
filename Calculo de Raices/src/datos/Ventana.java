package datos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame{
    private JPanel panelSuperior, panelIzquierdo, panelCentral;
    private JButton botonPrincipal, botonDatos, botonTabla;
    private JLabel textoTitulo;
    private JButton botonCerrar, botonMinimizar, botonMaximizar;
    private JPanel panelAccionesVentana;
    private boolean estaMaximizado = false;
    private Dimension tamanoVentana;
    private JPanel panelPrincipal, panelDatos, panelTabla;
    private JLabel textoMetodos, textoMetodos2, textoCreadoPor, textoIntegrantes, textoIntegrantes2;
    private JLabel textoA, textoB, textoError;
    private JTextField campoA, campoB, campoError;
    private JPanel panelCampos;

    private Font letraMenu = new Font("Forte", Font.PLAIN, 40),
    letraTitulo = new Font("Cooper", Font.BOLD, 60), 
    letraSubTitulo = new Font("Cooper", Font.BOLD, 40), 
    letraTexto = new Font("Maiandra GD", Font.PLAIN, 20), 
    letraBoton = new Font("Matura MT Script Capitals", Font.PLAIN, 20),
    letraBotonAccionVentana = new Font("Bauhaus 93", Font.PLAIN, 20);

    public Ventana(){
        inicializarVentana();
        inicializarPanelIzquierdo();
        inicializarPanelSuperior();
        inicializarPanelCentral();

        setVisible(true);

    }
    private void inicializarPanelCentral() {
        panelCentral = new JPanel();
        panelCentral.setOpaque(false);
        add(panelCentral, BorderLayout.CENTER);
        inicializarPanelPrincipal();
        panelDatos = new JPanel();
        panelDatos.setAlignmentY(JPanel.CENTER_ALIGNMENT);
        panelDatos.setAlignmentX(JPanel.CENTER_ALIGNMENT);
        panelDatos.setOpaque(false);

        panelCampos = new JPanel();
        panelCampos.setLayout(new GridLayout(3, 2, 20, 20));
        panelCampos.setOpaque(false);

        textoA = new JLabel("Ingrese el Punto A");
        textoA.setFont(letraTexto);

        textoB = new JLabel("Ingrese el Punto B");
        textoB.setFont(letraTexto);

        textoError = new JLabel("Ingrese el Margen de Error(%)");
        textoError.setFont(letraTexto);

    }
    private void inicializarPanelPrincipal() {
        panelPrincipal = new JPanel();
        panelPrincipal.setOpaque(false);
        var centrado = new GridLayout(8,1);

        panelPrincipal.setLayout(centrado);

        textoMetodos = new JLabel("Usando los metodos de Bisección,");
        textoMetodos.setFont(letraSubTitulo);
        textoMetodos.setHorizontalAlignment(JLabel.CENTER);

        textoMetodos2 = new JLabel("Regla Falsa y Secante");
        textoMetodos2.setFont(letraSubTitulo);
        textoMetodos2.setHorizontalAlignment(JLabel.CENTER);

        textoCreadoPor = new JLabel("Creado por:");
        textoCreadoPor.setFont(letraTexto);
        textoCreadoPor.setHorizontalAlignment(JLabel.CENTER);

        textoIntegrantes = new JLabel("Ricardo Sanjur");
        textoIntegrantes.setFont(letraTexto);
        textoIntegrantes.setHorizontalAlignment(JLabel.CENTER);

        textoIntegrantes2 = new JLabel("Thaís Samudio");
        textoIntegrantes2.setFont(letraTexto);
        textoIntegrantes2.setHorizontalAlignment(JLabel.CENTER);

        panelPrincipal.add(new JLabel());
        panelPrincipal.add(new JLabel());
        panelPrincipal.add(new JLabel());
        panelPrincipal.add(textoMetodos);
        panelPrincipal.add(textoMetodos2);
        panelPrincipal.add(textoCreadoPor);
        panelPrincipal.add(textoIntegrantes);
        panelPrincipal.add(textoIntegrantes2);
    }
    /**
     * 
     */
    private void inicializarPanelSuperior() {
        textoTitulo = new JLabel("Cálculo de Raíces");
        textoTitulo.setFont(letraTitulo);
        textoTitulo.setHorizontalAlignment(JLabel.CENTER);
        textoTitulo.setForeground(new Color(73,105,255));

        panelAccionesVentana = new JPanel();
        panelAccionesVentana.setBackground(new Color(63,150,221));
        panelAccionesVentana.setLayout(new FlowLayout(FlowLayout.RIGHT,0,0));
        panelAccionesVentana.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

        botonCerrar = new BotonChico(letraBotonAccionVentana);
        botonCerrar.setText("X");
        botonCerrar.addActionListener((e) -> dispose());

        botonMaximizar = new BotonChico(letraBotonAccionVentana);
        botonMaximizar.setText("O");
        botonMaximizar.addActionListener((e) -> {
            if(estaMaximizado){
                setSize(tamanoVentana);
                setLocationRelativeTo(null);
            }
            else    
                setExtendedState(MAXIMIZED_BOTH);
            estaMaximizado = !estaMaximizado;
        });

        botonMinimizar = new BotonChico(letraBotonAccionVentana);
        botonMinimizar.setText("—");
        botonMinimizar.addActionListener((e) -> setState(ICONIFIED));

        panelAccionesVentana.add(botonCerrar);
        panelAccionesVentana.add(botonMaximizar);
        panelAccionesVentana.add(botonMinimizar);

        panelSuperior.add(textoTitulo, BorderLayout.CENTER);
        panelSuperior.add(panelAccionesVentana, BorderLayout.NORTH);

    }
    private void inicializarPanelIzquierdo() {
        botonPrincipal = new Boton(letraMenu);
        botonPrincipal.setText("Principal");

        botonDatos = new Boton(letraMenu);
        botonDatos.setText("Datos");

        botonTabla = new Boton(letraMenu);
        botonTabla.setText("Tabla");

        panelIzquierdo.add(new JLabel());
        panelIzquierdo.add(new JLabel());
        panelIzquierdo.add(botonPrincipal);
        panelIzquierdo.add(botonDatos);
        panelIzquierdo.add(botonTabla);
        
    }
    private void inicializarVentana() {
        setUndecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        tamanoVentana = new Dimension(1000,700);
        setSize(tamanoVentana);
        setMinimumSize(getSize());
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);

        panelSuperior = new JPanel();
        panelSuperior.setBackground(new Color(84,231,224));
        panelSuperior.setPreferredSize(new Dimension(getWidth(), 100));
        panelSuperior.setLayout(new BorderLayout());
        panelSuperior.setMinimumSize(panelSuperior.getSize());
        add(panelSuperior, BorderLayout.NORTH);

        panelIzquierdo = new JPanel();
        panelIzquierdo.setBackground(new Color(160,246,224));
        panelIzquierdo.setPreferredSize(new Dimension(200, getHeight()));
        panelIzquierdo.setLayout(new GridLayout(7,1,0,20));
        panelIzquierdo.setMinimumSize(panelIzquierdo.getSize());
        add(panelIzquierdo, BorderLayout.WEST);
    }
}
