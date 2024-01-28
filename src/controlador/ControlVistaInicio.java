/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.Dimension;
import java.util.ArrayList;
import modelo.ModeloUsuario;
import modelo.ModeloVistaInicio;
import vista.VentanaPrincipal;
import vista.Menu;
import vista.Preguntapr;
import vista.RegistroPregunta;
import vista.VentanaPreguntas;

/**
 *
 * @author danie
 */
public class ControlVistaInicio {

    private VentanaPrincipal inicio;
    private ArrayList user;
    private Menu menu;

    public ControlVistaInicio(VentanaPrincipal inicio, ArrayList user, Menu menu) {
        this.inicio = inicio;
        this.user = user;
        this.menu = menu;
        inicio.setTitle("JUEGO DE PREGUNTAS");
        inicio.setLocationRelativeTo(null);
        inicio.setVisible(true);
        menu.setTitle("Menu Principal");

    }

    public void start() {

        inicio.getItemP().addActionListener(l -> ventanaAdmin());
        inicio.getBtnQuiz().addActionListener(l -> ventanaMenu());
        menu.getBtnSalir().addActionListener(l -> cerrarMenu());
        menu.getBtnJugar().addActionListener(l->abrirTest());

    }

    public void ocultarOpcion() {

        inicio.getItemAdmin().setVisible(false);

    }

    public void ventanaMenu() {

        inicio.getPanelVentana().add(menu);
        Dimension desktopSize = inicio.getPanelVentana().getSize();
        Dimension FrameSize = menu.getSize();
        menu.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        menu.show();
        menu.setVisible(true);
        

    }

    public void cerrarMenu() {

        menu.dispose();

    }

    public void ventanaAdmin() {


        VentanaPreguntas vp = new VentanaPreguntas();
        RegistroPregunta rp = new RegistroPregunta();
        ControlPreguntas cp = new ControlPreguntas(vp, rp,inicio.getPanelVentana());

        cp.start();

    }

    //Método para abrir  la ventana
    public void abrirTest() {
        
        Preguntapr rp = new Preguntapr();
        
        ControlQuiz cq = new ControlQuiz(menu, rp, inicio.getPanelVentana());
 
        cq.start();
        
        
 }

    //Método para codificar el Test de 10 preguntas
    public void Test(){
    
    
    
    
    
    
    
    }
    
}
