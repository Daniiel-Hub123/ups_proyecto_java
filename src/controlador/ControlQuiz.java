/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.Dimension;
import javax.swing.JDesktopPane;
import vista.Menu;
import vista.Preguntapr;
import vista.RegistroPregunta;
import vista.VentanaPreguntas;

/**
 *
 * @author danie
 */
public class ControlQuiz {
    
    private Menu vp;
    private Preguntapr rp;
    private JDesktopPane jdp;
    
    public ControlQuiz(Menu vp,Preguntapr rp,JDesktopPane jdp) {
        
        this.vp = vp;
        this.rp = rp;
        this.jdp = jdp;
        vp.dispose();
        jdp.add(rp);
        Dimension desktopSize = jdp.getSize();
        Dimension FrameSize = rp.getSize();
        rp.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        rp.show();
        rp.setVisible(true);
        
    }
    
    public void start(){
    
        
        
    }
    
    
    
    
}
