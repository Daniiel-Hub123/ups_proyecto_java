/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.ModeloUsuario;
import modelo.Usuario;
import vista.Login;
import vista.Menu;
import vista.Registro;
import vista.VentanaPrincipal;
import vista.VentanaPreguntas;
import vista.RegistroPregunta;

/**
 *
 * @author danie
 */
public class ControlLogin {

    private Login login;

    public ControlLogin(Login login) {
        this.login = login;
        login.setFocusable(true);
        login.setLocationRelativeTo(null);
        login.setVisible(true);
        
    }

    public void start() {

        login.getBtnRegistrarse().addActionListener(l -> ventanaRegistro());
        login.getBtnEntrar().addActionListener(l -> Login());

    }

    public void Login() {

        ArrayList<Usuario> lista = new ArrayList<>();

        lista = ModeloUsuario.loginUsuarios(login.getTxtUser().getText());

        if (!lista.isEmpty()) {

            VentanaPrincipal inicio = new VentanaPrincipal();
            Menu menu = new Menu();
            login.dispose();
            ControlVistaInicio cvi = new ControlVistaInicio(inicio, lista, menu);

            if (lista.get(0).getCedula().equals("0150447605")) {

                cvi.start();

            } else {

                cvi.ocultarOpcion();
                cvi.start();
            }

        } else {

            JOptionPane.showMessageDialog(login, "Datos incorrectos, intentelo de nuevo");

        }

    }

    public void ventanaRegistro() {
         
        login.dispose();
        
        Registro r = new Registro(login);
        
        ControlRegistro cr = new ControlRegistro(r);
        
        cr.start();
        
    }


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
