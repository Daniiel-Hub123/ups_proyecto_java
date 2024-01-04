/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import javax.swing.JOptionPane;
import modelo.ModeloUsuario;
import vista.Registro;

/**
 *
 * @author danie
 */
public class ControlRegistro {

    private ModeloUsuario mu = new ModeloUsuario();
    private Registro reg = new Registro();

    public ControlRegistro() {
    }

    public ControlRegistro(ModeloUsuario mu, Registro reg) {
        this.mu = mu;
        this.reg = reg;
        reg.setTitle("REGISTRO DE DATOS");
        reg.setLocationRelativeTo(null);
        reg.setVisible(true);

    }

    public void start() {

        reg.getBtnRegistrarse().addActionListener(l -> registrarUsuario());
        

    }

    public void registrarUsuario() {

        JOptionPane.showMessageDialog(null, "Se ha registrado correctamente el usuario con sus datos");
        
    }

    


    
}
