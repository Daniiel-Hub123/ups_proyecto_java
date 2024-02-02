/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.Dimension;
import java.awt.Image;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import vista.RegistroPregunta;
import vista.VentanaPreguntas;
import modelo.ModeloPregunta;
import modelo.Pregunta;
import javax.xml.ws.Holder;
/**
 *
 * @author danie
 */
public class ControlPreguntas {
    
    private VentanaPreguntas vp;
    private RegistroPregunta rp;
    private JDesktopPane jdp;
    
    public ControlPreguntas(VentanaPreguntas vp,RegistroPregunta rp,JDesktopPane jdp) {
        this.vp = vp;
        this.rp = rp;
        this.jdp = jdp;
        jdp.add(vp);
        Dimension desktopSize = jdp.getSize();
        Dimension FrameSize = vp.getSize();
        vp.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        vp.show();
        vp.setVisible(true);
        cargaLista();
    }

    public void start() {
       
        
        vp.getBtnRegistrarP().addActionListener(l->iniciarRegistro());
        rp.getBtnRegistrar().addActionListener(l->nuevaPregunta());
        rp.getBtnExaminar().addActionListener(l->añadirFoto());
        rp.getBtnEditar().addActionListener(l->editarPregunta());
        vp.getBtnBorrar().addActionListener(l->eliminarPregunta());
        vp.getBtnEditarP().addActionListener(l-> rellenarCampos());
    }

    private void iniciarRegistro() {
        
        vaciarCampos();
        
        rp.setVisible(true);
        rp.setLocationRelativeTo(vp);
        rp.getBtnEditar().setVisible(false);
        rp.getBtnRegistrar().setVisible(true);        

        rp.getBtnRegistrar().setVisible(true);
        rp.getBtnEditar().setVisible(false);

        rp.getTitulo().setText("");
        rp.getTitulo().setText("REGISTRO DE PREGUNTA");        
         
    }

    private void vaciarCampos(){
    
        rp.getTxtId_Pregunta().setText("");
        rp.getTxtDescripcion().setText("");
        rp.getTxtRespuesta().setText("");
        rp.getTxtOpcion1().setText("");
        rp.getTxtOpcion2().setText("");
        rp.getTxtOpcion3().setText("");
        rp.getTxtDificultad().setSelectedIndex(0);
        rp.getTxtRegion().setSelectedIndex(0);
        rp.getTxtProvincia().setText("");
        rp.getImagenPregunta().setIcon(null);
    
    }
    

     private void iniciarActualizacion() {
        
        
        rp.setVisible(true);
        rp.setLocationRelativeTo(vp);
        rp.getBtnEditar().setVisible(true);
        rp.getBtnRegistrar().setVisible(false);        
    }   
    
    
    private void nuevaPregunta() {

        try {

        String descripcion = rp.getTxtDescripcion().getText();
        String region = (String) rp.getTxtRegion().getSelectedItem();
        String provincia = rp.getTxtProvincia().getText();
        String dificultad = (String) rp.getTxtDificultad().getSelectedItem();
        String respuesta = rp.getTxtRespuesta().getText();
        String opcion1 = rp.getTxtOpcion1().getText();
        String opcion2 = rp.getTxtOpcion2().getText();
        String opcion3 = rp.getTxtOpcion3().getText();
     
        ModeloPregunta pregunta = new ModeloPregunta(descripcion, region, provincia, dificultad, respuesta,opcion1,opcion2,opcion3);
       
            ImageIcon ic= (ImageIcon)rp.getImagenPregunta().getIcon();
            pregunta.setImagen(ic.getImage());

            try {

                if (pregunta.registrarPreguntaNueva()) {

                    JOptionPane.showMessageDialog(vp, "Pregunta Guardada Correctamente");
                    rp.setVisible(false);
                    cargaLista();
                    vp.setFocusable(true);
                    
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(vp, "Error");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(vp, "¡Llene todos los campos correctamente para guardar la pregunta!");
        }

    }

    private void añadirFoto() {
        
        JFileChooser jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int estado = jfc.showOpenDialog(null);
        if (estado==JFileChooser.APPROVE_OPTION) {
            try {
                Image icono = ImageIO.read(jfc.getSelectedFile()).getScaledInstance(
                        rp.getImagenPregunta().getWidth(),
                        rp.getImagenPregunta().getHeight(),
                        Image.SCALE_DEFAULT);
                rp.getImagenPregunta().setIcon(new ImageIcon(icono));
                rp.getImagenPregunta().updateUI();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(rp,"Error, intentelo de nuevo");
                java.util.logging.Logger.getLogger(ControlPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        } else {
        }
    
    }
        
        
        
    public void cargaLista() {

        vp.getTablaPreguntas().setDefaultRenderer(Object.class, new ImagenTabla());
        vp.getTablaPreguntas().setRowHeight(100);
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();

        DefaultTableModel tblModel;
        tblModel = (DefaultTableModel) vp.getTablaPreguntas().getModel();
        tblModel.setNumRows(0);
        List<Pregunta> lista = ModeloPregunta.listarPreguntas();
        int ncols = tblModel.getColumnCount();
        Holder<Integer> i = new Holder<>(0);
        lista.stream().forEach(p1 -> {

            tblModel.addRow(new Object[ncols]);
            vp.getTablaPreguntas().setValueAt(p1.getId_pregunta(), i.value, 0);
            vp.getTablaPreguntas().setValueAt(p1.getDescripcion(), i.value, 1);
            vp.getTablaPreguntas().setValueAt(p1.getRegion(), i.value, 2);
            vp.getTablaPreguntas().setValueAt(p1.getProvincia(), i.value, 3);
            vp.getTablaPreguntas().setValueAt(p1.getDificultad(), i.value, 4);
            vp.getTablaPreguntas().setValueAt(p1.getRespuesta(), i.value, 5);
            vp.getTablaPreguntas().setValueAt(p1.getIncorrecta_1(), i.value, 6);
            vp.getTablaPreguntas().setValueAt(p1.getIncorrecta_2(), i.value, 7);
            vp.getTablaPreguntas().setValueAt(p1.getIncorrecta_3(), i.value, 8);

            Image img = p1.getImagen();
            if (img != null) {
                Image newimg = img.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
                ImageIcon icon = new ImageIcon(newimg);
                renderer.setIcon(icon);
                vp.getTablaPreguntas().setValueAt(new JLabel(icon), i.value, 9);
            } else {
                vp.getTablaPreguntas().setValueAt(null, i.value, 9);
            }
            i.value++;

        });

    }


    private void editarPregunta() {
        
        rp.getBtnRegistrar().setVisible(false);
        rp.getBtnEditar().setVisible(true);

        int fila = vp.getTablaPreguntas().getSelectedRow();
        if (fila == -1) {

            JOptionPane.showMessageDialog(null, "Pregunta no Seleccionada");

        } else {


            
            
            
            
            
            
            
            
            
            
        }

    }

    public void rellenarCampos() {
          
        int fila = vp.getTablaPreguntas().getSelectedRow();
        
        if (fila == -1) {
            
            JOptionPane.showMessageDialog(vp,"Pregunta no seleccionada");
            
        } else {
            
            iniciarActualizacion();
            
            try {

                String codPregunta = (String) vp.getTablaPreguntas().getValueAt(fila, 0);
                String descripcion = (String) vp.getTablaPreguntas().getValueAt(fila, 1);
                String region = (String)vp.getTablaPreguntas().getValueAt(fila, 2);           
                String provincia = (String)vp.getTablaPreguntas().getValueAt(fila, 3);
                String dificultad = String.valueOf(vp.getTablaPreguntas().getValueAt(fila,4));
                String respuesta = String.valueOf(vp.getTablaPreguntas().getValueAt(fila,5));
                String opcion1 = String.valueOf(vp.getTablaPreguntas().getValueAt(fila,6));
                String opcion2 = String.valueOf(vp.getTablaPreguntas().getValueAt(fila,7));
                String opcion3 = String.valueOf(vp.getTablaPreguntas().getValueAt(fila,8));   
                
                rp.getTitulo().setText("");
                rp.getTitulo().setText("EDICIÓN DE PREGUNTA:");            
                rp.getTxtId_Pregunta().setText("ID: "+codPregunta);
                rp.getTxtDescripcion().setText(descripcion);
                
                
                switch (region) {
                    
                    case "Insular":
                        rp.getTxtRegion().setSelectedIndex(0);
                        break;
                        
                    case "Costa":    
                        rp.getTxtRegion().setSelectedIndex(1);
                        break;                       
                        
                    case "Sierra":  
                        rp.getTxtRegion().setSelectedIndex(2);
                        break;                       
                    
                    case "Amazonía":    
                        rp.getTxtRegion().setSelectedIndex(3);
                        break;                        

                }
                       
                rp.getTxtProvincia().setText(provincia);
                
                switch (region) {
                    
                    case "Fácil":
                        rp.getTxtDificultad().setSelectedIndex(0);
                        break;
                        
                    case "Intermedio":    
                        rp.getTxtDificultad().setSelectedIndex(1);
                        break;                       
                        
                    case "Difícil":  
                        rp.getTxtDificultad().setSelectedIndex(2);
                        break;                       
             
                }                
                
                rp.getTxtRespuesta().setText(respuesta);
                rp.getTxtOpcion1().setText(opcion1);
                rp.getTxtOpcion2().setText(opcion2);
                rp.getTxtOpcion3().setText(opcion3);
                               
                ImageIcon im1;
                JLabel jl =  (JLabel) vp.getTablaPreguntas().getValueAt(fila, 9);
                im1 = (ImageIcon) jl.getIcon();
              
                rp.getImagenPregunta().setIcon(null);
            
                Image im2 = im1.getImage().getScaledInstance(rp.getImagenPregunta().getWidth(), rp.getImagenPregunta().getHeight(), Image.SCALE_SMOOTH);
  
                ImageIcon im3 = new ImageIcon(im2);  
                 
                rp.getImagenPregunta().setIcon(im3);
           
                 } catch (Exception e) {
                     rp.getImagenPregunta().setIcon(null);
                     JOptionPane.showMessageDialog(rp,"La pregunta no tiene una imagen de portada");
                     
                }
            
            } 
        
        
    }



    //Eliminar pregunta de la base de datos
    private void eliminarPregunta() {

        int fila = vp.getTablaPreguntas().getSelectedRow();

        if (fila == -1) {

            JOptionPane.showMessageDialog(null, "Pregunta no seleccionada!");

        } else {

            int a = JOptionPane.showConfirmDialog(vp, "¿Esta seguro de eliminar esta pregunta?");

            if (a == JOptionPane.YES_OPTION) {

                String id_pregunta = (String) vp.getTablaPreguntas().getValueAt(fila, 0);

                ModeloPregunta mp = new ModeloPregunta(id_pregunta);

                if (mp.eliminarPregunta()) {

                    cargaLista();
                    
                    JOptionPane.showMessageDialog(vp, "Pregunta Eliminada Correctamente");

                }

            } else {

                cargaLista();

            }

        }

    
    
    }
    
    
}
