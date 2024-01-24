/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import controlador.ControlLogin;
import vista.Login;

/**
 *
 * @author danie
 */
public class Principal {
    
    
    public static void main(String[] args) {

        Login login = new Login();
        login.setVisible(true);
        ControlLogin cl = new ControlLogin(login);

        cl.start();

    }

}
