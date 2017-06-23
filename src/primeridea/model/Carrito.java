/*
 * CPC SISTEMAS
 */
package primeridea.model;

/**
 *
 * @author gandhi.aguirre
 */
public interface Carrito {
    public void agregarAlCarrito(Producto producto);
    public void eliminarDelCarrito(Producto producto);
    public void vaciarCarrito();
    public double calcularTotalCarrito();
    public void verProductosDeCarrito();
}
