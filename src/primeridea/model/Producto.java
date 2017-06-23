/*
 * CPC SISTEMAS
 */
package primeridea.model;

/**
 *
 * @author gandhi.aguirre
 */
public class Producto {
    protected String nombre; 
    protected double costo; 
    
    public Producto(String nombre, double costo){
        this.nombre = nombre; 
        this.costo = costo; 
    }
    public Producto(){
        this("",0);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
    @Override
    public String toString(){
        return "NOMBRE: "+nombre+" - COSTO: "+costo;
    }
}
