/*
 * CPC SISTEMAS
 */
package primeridea.gui;

import java.awt.Image;
import java.awt.event.ActionListener;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

/**
 *
 * @author gandhi.aguirre
 */
public abstract class VentanaPersonalizada extends JFrame implements ActionListener{
    protected String titulo; 
    
    public VentanaPersonalizada(String titulo){
        super(titulo);
        definirElementos();
    }
    
    public void definirElementos(){
        definirElementosPropios();
        this.setBounds(100, 100, 400, 400);
        try{
            setIconImage(ImageIO.read(new File("F:\\PRACTICAS\\ETS-POO\\PrimerIdea\\src\\resources\\bolsa.gif")));
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public abstract void definirElementosPropios();
}
