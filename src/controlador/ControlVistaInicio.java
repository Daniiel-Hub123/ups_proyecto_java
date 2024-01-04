/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.Dimension;
import modelo.ModeloVistaInicio;
import vista.VistaInicio;
import vista.Menu;

/**
 *
 * @author danie
 */
public class ControlVistaInicio {

    private VistaInicio inicio;
    private ModeloVistaInicio minicio;
    private Menu menu;

    public ControlVistaInicio(VistaInicio inicio, ModeloVistaInicio minicio, Menu menu) {
        this.inicio = inicio;
        this.minicio = minicio;
        this.menu = menu;
        inicio.setTitle("JUEGO DE PREGUNTAS");
        inicio.setLocationRelativeTo(null);
        inicio.setVisible(true);
        menu.setTitle("Menu Principal");

    }

    public void start() {

        inicio.getBtnMenu().addActionListener(l -> ventanaMenu());
        menu.getBtncerrar().addActionListener(l -> cerrarMenu());

    }

    public void ventanaMenu() {

        inicio.getDesktopPane().add(menu);
        Dimension desktopSize = inicio.getDesktopPane().getSize();
        Dimension FrameSize = menu.getSize();
        menu.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        menu.show();
        menu.setVisible(true);

    }

    public void cerrarMenu() {

        menu.dispose();

    }

}
