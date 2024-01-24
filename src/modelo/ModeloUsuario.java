/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author danie
 */
public class ModeloUsuario extends Usuario{

     private static ConexionPG con = new ConexionPG();
    
    public ModeloUsuario() {
    }

    public ModeloUsuario(String id, String user, String pass) {
        super(id, user, pass);
    }

    public ModeloUsuario(String id, String user, String pass, int ranking, double puntuacion) {
        super(id, user, pass, ranking, puntuacion);
    }

    public ModeloUsuario(String id, int ranking, double puntuacion) {
        super(id, ranking, puntuacion);
    }
    
    
    //Operaciones con los datos del Usuario
    
        //Método Login de Usuarios
        public static ArrayList<Usuario> loginUsuarios(String cedula){

        try {
            String query="SELECT * FROM USUARIO WHERE cedula = '"+cedula+"'  ORDER BY 1 ASC";
            
            ResultSet rs = con.query(query);
            ArrayList<Usuario> lista = new ArrayList<Usuario>();
            
            while(rs.next()){
                
                Usuario user = new Usuario();
                user.setCedula(rs.getString("cedula"));
                user.setUser(rs.getString("usuario"));
                user.setPass(rs.getString("contraseña"));
                user.setRanking(rs.getInt("ranking"));
                user.setPuntuacion(rs.getDouble("puntuacion"));
               
                lista.add(user);
            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    //Método para registrar usuarios
    public boolean grabar() {

        String sql;
        sql = "INSERT INTO public.usuario(\n"
                + "  cedula, usuario, \"contraseña\")\n"
                + "  VALUES ('" + getCedula() + "', '" + getUser() + "', '" + getPass() + "'); ";
        
        if (con.noQuery(sql) == null) {
            return true;
        } else {
            return false;
        }

    }

    //Método para editar información de usuario
    public boolean editar() {

        String nsql;
        nsql = "UPDATE public.usuario\n"
                + "	SET usuario='" + getUser() + "', \"contraseña\"='" + getPass() + "'"
                + "	WHERE \"contraseña\"='" + getCedula() + "';";

        if (con.noQuery(nsql) == null) {
            return true;
        } else {
            System.out.println("Error");
            return false;
        }
    }

    //Método para eliminar cierto usuario
    public boolean eliminar() {

        String sql = "Delete from public.usuario "
                + "WHERE cedula='" + getCedula() + "'; ";

        if (con.noQuery(sql) == null) {

            return true;

        } else {

            return false;

        }

    }

}
