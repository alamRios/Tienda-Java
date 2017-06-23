/*
 * CPC SISTEMAS
 */
package primeridea.model;

/**
 *
 * @author gandhi.aguirre
 */
public class Electronico extends Producto{
    private int diasGarantia; 
    
    public Electronico(String nombre, double costo, int diasGarantia){
        super(nombre, costo);
        this.diasGarantia = diasGarantia; 
    }

    public int getDiasGarantia() {
        return diasGarantia;
    }

    public void setDiasGarantia(int diasGarantia) {
        this.diasGarantia = diasGarantia;
    }
    
    @Override
    public String toString(){
        return "NOMBRE: "+nombre+" - COSTO: "+costo+" - GARANTIA: "+diasGarantia+" dias";
    }
}
