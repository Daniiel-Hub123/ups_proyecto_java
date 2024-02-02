/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import org.postgresql.util.Base64;
/**
 *
 * @author danie
 */
public class ModeloPregunta extends Pregunta{

    private static ConexionPG con = new ConexionPG();
    
    public ModeloPregunta() {
    }

    public ModeloPregunta(String id_pregunta, String descripcion, String region, String provincia, String dificultad, String respuesta, String incorrecta_1, String incorrecta_2, String incorrecta_3, Image imagen) {
        super(id_pregunta, descripcion, region, provincia, dificultad, respuesta, incorrecta_1, incorrecta_2, incorrecta_3, imagen);
    }
    
     public ModeloPregunta(String descripcion, String region, String provincia, String dificultad, String respuesta, String incorrecta_1, String incorrecta_2, String incorrecta_3) {
        super(descripcion, region, provincia, dificultad, respuesta, incorrecta_1, incorrecta_2, incorrecta_3);
    }   

    public ModeloPregunta(String id_pregunta) {
        super(id_pregunta);
    }
    
     
     
    //Mètodos para operar las preguntas
    

    public boolean registrarPreguntaNueva(){
        
        String foto64 = null;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        
        try {
        BufferedImage bi = imgBimage(getImagen());
        
        ImageIO.write(bi,"PNG", bos);
      
        byte[] imgb = bos.toByteArray();
        foto64 = org.postgresql.util.Base64.encodeBytes(imgb);
          } catch (IOException ex) {
            System.out.println(ex.getMessage());;
        }
        String sql;
        sql = "INSERT INTO public.pregunta(\n" +
"	descripcion, region, provincia, dificultad, respuesta, incorrecta_1, incorrecta_2, incorrecta_3, imagen)\n" +
"	VALUES ('"+getDescripcion()+"', '"+getRegion()+"', '"+getProvincia()+"', '"+getDificultad()+"', '"+getRespuesta()+"', '"+getIncorrecta_1()+"', '"+getIncorrecta_2()+"', '"+getIncorrecta_3()+"', '"+foto64+"');";
        if (con.noQuery(sql) == null) {
            return true;
        } else {
            return false;
        }
    }
    
    
    
       private BufferedImage imgBimage(Image img){
        
        if (img instanceof BufferedImage){
            return (BufferedImage)img;
        }
        BufferedImage bi = new BufferedImage(
                img.getWidth(null),img.getHeight(null),BufferedImage.TYPE_INT_ARGB
        );
        
        Graphics2D bGR = bi.createGraphics();
        bGR.drawImage(img, 0, 0,null);
        bGR.dispose();
        return bi;        
    } 
    
    
     public static List<Pregunta> listarPreguntas(){
        try {
            String query="SELECT * FROM pregunta ORDER BY 1 ASC";
            ResultSet rs= con.query(query);
            List<Pregunta> lista = new ArrayList<Pregunta>();
            byte[] bf;
            while(rs.next()){
                Pregunta p = new Pregunta();
                p.setId_pregunta(rs.getString("id_pregunta"));
                p.setDescripcion(rs.getString("descripcion"));
                p.setRegion(rs.getString("region"));
                p.setProvincia(rs.getString("provincia"));
                p.setDificultad(rs.getString("dificultad"));
                p.setRespuesta(rs.getString("respuesta"));
                p.setIncorrecta_1(rs.getString("incorrecta_1"));
                p.setIncorrecta_2(rs.getString("incorrecta_2"));
                p.setIncorrecta_3(rs.getString("incorrecta_3"));
                      
                bf=rs.getBytes("imagen");
                
                if(bf!=null){
                    bf=Base64.decode(bf,0,bf.length);
                    try {
                        
                        p.setImagen(obtenImagen(bf));
                        
                    } catch (IOException ex) {
                        
                        p.setImagen(null);
                        Logger.getLogger(ModeloPregunta.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                 p.setImagen(null);
                }
                lista.add(p);
            }        
            rs.close();
            return lista;           
        } catch (SQLException ex) {
            Logger.getLogger(ModeloPregunta.class.getName()).log(Level.SEVERE, null, ex);
           return null;
        }   
}   
    
   
     
     
    public static Image obtenImagen(byte[] bytes)throws IOException{
        ByteArrayInputStream bis= new ByteArrayInputStream(bytes);
        Iterator it= ImageIO.getImageReadersByFormatName("png");
        ImageReader reader = (ImageReader)it.next();
        Object source = bis;
        ImageInputStream iis = ImageIO.createImageInputStream(source);
        reader.setInput(iis,true);
        ImageReadParam param = reader.getDefaultReadParam();
        param.setSourceSubsampling(1, 1, 0, 0);
        return reader.read(0,param);
    }
     
     
    public boolean editarPregunta(String id){
        
        String foto64 = null;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        
        try {
        BufferedImage bi = imgBimage(getImagen());
        
        ImageIO.write(bi,"PNG", bos);
      
        byte[] imgb = bos.toByteArray();
        foto64 = org.postgresql.util.Base64.encodeBytes(imgb);
          } catch (IOException ex) {
            System.out.println(ex.getMessage());;
        }
        String sql;
        sql = "UPDATE public.pregunta\n" +
"	SET descripcion='"+getDescripcion()+"', region='"+getRegion()+"', provincia='"+getProvincia()+"', dificultad='"+getDificultad()+"', respuesta='"+getRespuesta()+"',"
                + " incorrecta_1='"+getIncorrecta_1()+"', incorrecta_2='"+getIncorrecta_2()+"', incorrecta_3='"+getIncorrecta_3()+"', imagen='"+foto64+"'\n" +
"	WHERE id_pregunta = '"+id+"';";
        if (con.noQuery(sql) == null) {
            return true;
        } else {
            return false;
        }
    }  
     
    public boolean eliminarPregunta() {

        String sql = "Delete from public.pregunta "
                + "WHERE id_pregunta='" + getId_pregunta() + "'; ";
        if (con.noQuery(sql) == null) {
            return true;
        } else {
            return false;
        }

    }


     
 
    //Mètodo para traer una pregunta aletoria dentro de los registros de la base de datos
     public static List<Pregunta> preguntaAleatoria(){
        try {
            String query="SELECT * "
                    + "FROM pregunta "
                    + "ORDER BY RANDOM() "
                    + "LIMIT 10";
            ResultSet rs= con.query(query);
            List<Pregunta> lista = new ArrayList<Pregunta>();
            byte[] bf;
            while(rs.next()){
                Pregunta p = new Pregunta();
                p.setId_pregunta(rs.getString("id_pregunta"));
                p.setDescripcion(rs.getString("descripcion"));
                p.setRegion(rs.getString("region"));
                p.setProvincia(rs.getString("provincia"));
                p.setDificultad(rs.getString("dificultad"));
                p.setRespuesta(rs.getString("respuesta"));
                p.setIncorrecta_1(rs.getString("incorrecta_1"));
                p.setIncorrecta_2(rs.getString("incorrecta_2"));
                p.setIncorrecta_3(rs.getString("incorrecta_3"));
                      
                bf=rs.getBytes("imagen");
                
                if(bf!=null){
                    bf=Base64.decode(bf,0,bf.length);
                    try {
                        
                        p.setImagen(obtenImagen(bf));
                        
                    } catch (IOException ex) {
                        
                        p.setImagen(null);
                        Logger.getLogger(ModeloPregunta.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                 p.setImagen(null);
                }
                lista.add(p);
            }        
            rs.close();
            return lista;           
        } catch (SQLException ex) {
            Logger.getLogger(ModeloPregunta.class.getName()).log(Level.SEVERE, null, ex);
           return null;
        }   
}   











    
}
