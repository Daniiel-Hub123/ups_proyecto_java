/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.ModeloUsuario;
import modelo.ModeloVistaInicio;
import vista.Login;
import vista.Menu;
import vista.Registro;
import vista.VistaInicio;

/**
 *
 * @author danie
 */
public class ControlLogin {

    private Login login;

    public ControlLogin(Login login) {
        this.login = login;
        login.setTitle("ACCESO AL APLICATIVO");
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }

    public void start() {

        login.getBtnregistrarse().addActionListener(l -> ventanaRegistro());
        login.getBtnentrar().addActionListener(l -> ventanaPrincipal());

    }

    public void ventanaPrincipal() {

        VistaInicio inicio = new VistaInicio();
        ModeloVistaInicio minicio = new ModeloVistaInicio();
        Menu menu = new Menu();
        login.dispose();
        ControlVistaInicio cvi = new ControlVistaInicio(inicio, minicio, menu);

        cvi.start();

    }

    public void ventanaRegistro() {
        
        
        ModeloUsuario mu = new ModeloUsuario();
        Registro r = new Registro();
        
        ControlRegistro cr = new ControlRegistro(mu,r);
        
        cr.start();
        
    }


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
