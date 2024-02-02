/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import vista.Menu;
import vista.Preguntapr;
import vista.RegistroPregunta;
import vista.VentanaPreguntas;
import modelo.ModeloPregunta;
import modelo.Pregunta;
/**
 *
 * @author danie
 */
public class ControlQuiz {
    
    private static boolean ejecucion = true;
    
    private Menu vp;
    private Preguntapr rp;
    private JDesktopPane jdp;
    private ModeloPregunta mp;
    
    public ControlQuiz(Menu vp,Preguntapr rp,JDesktopPane jdp,ModeloPregunta mp) {
        
        this.vp = vp;
        this.rp = rp;
        this.jdp = jdp;
        this.mp = mp;
        vp.dispose();
        jdp.add(rp);
        Dimension desktopSize = jdp.getSize();
        Dimension FrameSize = rp.getSize();
        rp.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        rp.show();
        rp.setVisible(true);
        test();
    }
    
    

    
    
    public void test(){
        
        //Lista de 10 preguntas 
        ArrayList<Pregunta> pregunta = (ArrayList<Pregunta>) ModeloPregunta.preguntaAleatoria();
    
        int cont = 0;
        int barra = 0;
        
        // Crear un hilo para el ciclo repetitivo
        Thread cicloThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (true && i<=10) {  // Bucle repetitivo
                    if (ejecucion) {
                        System.out.println("Ejecutando ciclo...");
                        // Coloca aquí tu lógica de bucle repetitivo
                         

                            rp.getTxtDescripcion().setText("");
                            rp.getBtnOp1().setText("");
                            rp.getBtnOp1().setText("");
                            rp.getBtnOp1().setText("");
                            rp.getBtnOp4().setText("");
                            rp.getTxtRegion().setText("");
                               
                            rp.getTxtDescripcion().setText(pregunta.get(i).getDescripcion());
                            rp.getBtnOp1().setText(pregunta.get(i).getRespuesta());
                            rp.getBtnOp2().setText(pregunta.get(i).getIncorrecta_1());
                            rp.getBtnOp3().setText(pregunta.get(i).getIncorrecta_2());
                            rp.getBtnOp4().setText(pregunta.get(i).getIncorrecta_3());
                            rp.getTxtRegion().setText(pregunta.get(i).getRegion());
                            

                               Image img = pregunta.get(i).getImagen();
                               ImageIcon icon = new ImageIcon(img);
                               rp.getImagenPregunta().setIcon(null);
                               rp.getImagenPregunta().setIcon(icon);
                              

                              
                              try {
                                  Thread.sleep(5000);  // Pausa de 5 segundo
                                    int barra = rp.getBarraProgreso().getValue();
                                    rp.getBarraProgreso().setValue((barra + 10));
                              } catch (InterruptedException e) {
                                  e.printStackTrace();
                              }
                      
                             
          
                    }
                    i++;
  
                }
            }
        });

        // Agregar un ActionListener al botón
        rp.getBtnSiguiente().addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                ejecucion = !ejecucion;  // Cambiar el estado de ejecución del ciclo

                int barra = rp.getBarraProgreso().getValue();
                rp.getBarraProgreso().setValue((barra+10));
                
            }
        });

        // Iniciar el hilo del ciclo repetitivo
        cicloThread.start();


    }
        
    }
    

