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

    private Registro reg;

    public ControlRegistro() {
    }

    public ControlRegistro( Registro reg) {
        this.reg = reg;
        reg.setVisible(true);
        reg.setLocationRelativeTo(null);
        

    }

    public void start() {

        reg.getBtnRegister().addActionListener(l -> registrarUsuario());
        

    }

    public void registrarUsuario() {

        try {

            String cedula = reg.getTxtCed().getText();
            String usuario = reg.getTxtUser().getText();
            String contraseña = reg.getTxtPass().getText();

            ModeloUsuario user = new ModeloUsuario(cedula, usuario, contraseña);

            try {

                if (user.grabar()) {

                    JOptionPane.showMessageDialog(reg, "Usuario Guardado Correctamente!");

                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(reg, "Error");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(reg, "¡Llene todos los campos correctamente para guardar su información !");
        }
          
        JOptionPane.showMessageDialog(null, "Se ha registrado correctamente el usuario con sus datos");
        
    }

    

    
    
    
    

    
}
