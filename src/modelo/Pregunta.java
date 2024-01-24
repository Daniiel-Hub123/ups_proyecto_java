/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.awt.Image;

/**
 *
 * @author danie
 */
public class Pregunta {
    
    //Atributos de clase pregunta
    private String id_pregunta;
    private String descripcion;
    private String region;
    private String provincia;
    private String dificultad;
    private String respuesta;
    private String incorrecta_1;
    private String incorrecta_2;
    private String incorrecta_3;
    private Image imagen;

    //Constructores
    public Pregunta() {
    }

    public Pregunta(String id_pregunta, String descripcion, String region, String provincia, String dificultad, String respuesta, String incorrecta_1, String incorrecta_2, String incorrecta_3, Image imagen) {
        this.id_pregunta = id_pregunta;
        this.descripcion = descripcion;
        this.region = region;
        this.provincia = provincia;
        this.dificultad = dificultad;
        this.respuesta = respuesta;
        this.incorrecta_1 = incorrecta_1;
        this.incorrecta_2 = incorrecta_2;
        this.incorrecta_3 = incorrecta_3;
        this.imagen = imagen;
    }

    public Pregunta(String descripcion, String region, String provincia, String dificultad, String respuesta, String incorrecta_1, String incorrecta_2, String incorrecta_3) {
        this.descripcion = descripcion;
        this.region = region;
        this.provincia = provincia;
        this.dificultad = dificultad;
        this.respuesta = respuesta;
        this.incorrecta_1 = incorrecta_1;
        this.incorrecta_2 = incorrecta_2;
        this.incorrecta_3 = incorrecta_3;
    }

    public Pregunta(String id_pregunta) {
        this.id_pregunta = id_pregunta;
    }

    
    
    //Getters & Setters
    public String getId_pregunta() {
        return id_pregunta;
    }

    public void setId_pregunta(String id_pregunta) {
        this.id_pregunta = id_pregunta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getIncorrecta_1() {
        return incorrecta_1;
    }

    public void setIncorrecta_1(String incorrecta_1) {
        this.incorrecta_1 = incorrecta_1;
    }

    public String getIncorrecta_2() {
        return incorrecta_2;
    }

    public void setIncorrecta_2(String incorrecta_2) {
        this.incorrecta_2 = incorrecta_2;
    }

    public String getIncorrecta_3() {
        return incorrecta_3;
    }

    public void setIncorrecta_3(String incorrecta_3) {
        this.incorrecta_3 = incorrecta_3;
    }

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }
    
    
    
    
    
    
    
    
}
