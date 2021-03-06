/*
 * CPC SISTEMAS
 */
package primeridea.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import primeridea.model.Producto;

/**
 *
 * @author gandhi.aguirre
 */
public class MenuConsultaCarrito extends VentanaPersonalizada {
    private List<Producto> productos; 
    private ActionListener origen; 
    private double totalCarrito; 

    /**
     * Creates new form MenuConsultaCarrito
     */
    public MenuConsultaCarrito(List<Producto> productos, double totalCarrito, ActionListener origen) {
        super("Tienda - Carrito");
        this.productos = productos;
        this.origen = origen; 
        this.totalCarrito = totalCarrito; 
        mostrarTotal();
        cargarProductos(productos);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(6, 6));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void definirElementosPropios() {
        initComponents();
    }
    
    public void cargarProductos(List<Producto> productos){
        for(Producto producto : productos){
            JButton nBoton = new JButton(producto.toString());
            nBoton.setName("D,"+producto.getNombre());
            nBoton.addActionListener(origen);
            jPanel1.add(nBoton);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setProductos(List<Producto> productos, double totalCarrito) {
        this.productos = productos;
        this.totalCarrito = totalCarrito; 
        jPanel1.removeAll();
        mostrarTotal();
        cargarProductos(productos);
    }

    private void mostrarTotal() {
        jPanel1.add(new JLabel("Costo total: "+totalCarrito));
    }
}
