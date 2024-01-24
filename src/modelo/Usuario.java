/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author danie
 */
public class Usuario {

    private String cedula;
    private String user;
    private String pass;
    private int ranking;
    private double puntuacion;

    public Usuario() {
    }

    //Contructor para login
    public Usuario(String id, String user, String pass) {
        this.cedula = id;
        this.user = user;
        this.pass = pass;
    }

    //Constructor para información completa del Usuario
    public Usuario(String id, String user, String pass, int ranking, double puntuacion) {
        this.cedula = id;
        this.user = user;
        this.pass = pass;
        this.ranking = ranking;
        this.puntuacion = puntuacion;
    }

    //Constructor para informacion de la ventana de Ranking
    public Usuario(String id, int ranking, double puntuacion) {
        this.cedula = id;
        this.ranking = ranking;
        this.puntuacion = puntuacion;
    }

    
    
    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public double getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(double puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

}
