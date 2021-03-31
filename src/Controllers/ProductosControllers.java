
package Controllers;

import Models.Productos;
import Models.ProductosDao;
import Models.Tables;
import Views.PanelAdmin;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class ProductosControllers implements ActionListener, MouseListener, KeyListener {

    private Productos prod;
    private ProductosDao prodDao;
    private PanelAdmin views;
    DefaultTableModel modelo = new DefaultTableModel();

    public ProductosControllers(Productos prod, ProductosDao prodDao, PanelAdmin views) {
        this.prod = prod;
        this.prodDao = prodDao;
        this.views = views;
        this.views.btnRegistrarProd.addActionListener(this); 
        this.views.TableProd.addMouseListener(this);
        this.views.btnModificarProd.addActionListener(this);
        this.views.JMenuEliminarProd.addActionListener(this);
        this.views.btnNuevoProd.addActionListener(this);
        this.views.JMenuReingresarProd.addActionListener(this);
        this.views.txtBuscarProd.addKeyListener(this);
        this.views.JLabelProductos.addMouseListener(this);
        listarProductos();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btnRegistrarProd) {
           if (views.txtNombreProd.getText().equals("") || views.txtParteProd.getText().equals("")
                   || views.txtMarcaProd.getText().equals("") || views.txtDescripcionProd.getText().equals("")
                   || views.txtCantidadProd.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
           }else{
               prod.setNombre(views.txtNombreProd.getText());
               prod.setParte(views.txtParteProd.getText());
               prod.setMarca(views.txtMarcaProd.getText());
               prod.setDescripcion(views.txtDescripcionProd.getText());
               prod.setCantidad(Integer.parseInt(views.txtCantidadProd.getText()));
               if (prodDao.registrar(prod)) {
                   limpiarTable();
                   listarProductos();
                   limpiar();
                   JOptionPane.showMessageDialog(null, "¡Producto registrado con éxito!");
               }else{
                   JOptionPane.showMessageDialog(null, "Error al registrar el producto");
               }
           }
       }else if (e.getSource() == views.btnModificarProd) {
           if (views.txtNombreProd.getText().equals("") || views.txtParteProd.getText().equals("")
                   || views.txtMarcaProd.getText().equals("") || views.txtDescripcionProd.getText().equals("")
                   || views.txtCantidadProd.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
           }else{
               prod.setNombre(views.txtNombreProd.getText());
               prod.setParte(views.txtParteProd.getText());
               prod.setMarca(views.txtMarcaProd.getText());
               prod.setDescripcion(views.txtDescripcionProd.getText());
               prod.setCantidad(Integer.parseInt(views.txtCantidadProd.getText()));
               prod.setID(Integer.parseInt(views.txtIDProd.getText()));
               if (prodDao.modificar(prod)) {
                   limpiarTable();
                   listarProductos();
                   limpiar();
                   JOptionPane.showMessageDialog(null, "¡Producto modificado con éxito!");
               }else{
                   JOptionPane.showMessageDialog(null, "Error al modificar el producto");
               }
           }
       }else if(e.getSource() == views.JMenuEliminarProd) {
           if(views.txtIDProd.getText().equals("")) {
               JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar");
           }else{
               int id = Integer.parseInt(views.txtIDProd.getText());
               if (prodDao.accion("Sin stock", id)) {
                   limpiarTable();
                   listarProductos();
                   limpiar();
                   JOptionPane.showMessageDialog(null, "Producto eliminado");
               }else{
                   JOptionPane.showMessageDialog(null, "Error al eliminar producto");
               }
           }
       }else if(e.getSource() == views.JMenuReingresarProd){
           if(views.txtIDProd.getText().equals("")) {
               JOptionPane.showMessageDialog(null, "Seleccione una fila para reingresar");
           }else{
               int id = Integer.parseInt(views.txtIDProd.getText());
               if (prodDao.accion("En stock", id)) {
                   limpiarTable();
                   listarProductos();
                   limpiar();
                   JOptionPane.showMessageDialog(null, "Producto reingresado");
               }else{
                   JOptionPane.showMessageDialog(null, "Error al reingresar el producto");
               }
           }
       }else {
           limpiar();
       }
    }
    
    public void listarProductos(){
        Tables color = new Tables();
        views.TableProd.setDefaultRenderer(views.TableProd.getColumnClass(0), color);
        List <Productos> lista = prodDao.ListaProductos(views.txtBuscarProd.getText());
        modelo = (DefaultTableModel) views.TableProd.getModel();
        Object[] ob = new Object[7];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getID();
            ob[1] = lista.get(i).getNombre();
            ob[2] = lista.get(i).getParte();
            ob[3] = lista.get(i).getMarca();
            ob[4] = lista.get(i).getDescripcion();
            ob[5] = lista.get(i).getCantidad();
            ob[6] = lista.get(i).getStatus();
            modelo.addRow(ob);
        }
        views.TableProd.setModel(modelo);
        JTableHeader header = views.TableProd.getTableHeader();
        header.setOpaque(false);
        header.setBackground(Color.blue);
        header.setForeground(Color.white);
    }
    
    public void limpiarTable() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == views.TableProd){
            int fila = views.TableProd.rowAtPoint(e.getPoint());
            views.txtIDProd.setText(views.TableProd.getValueAt(fila, 0).toString());
            views.txtNombreProd.setText(views.TableProd.getValueAt(fila, 1).toString());
            views.txtParteProd.setText(views.TableProd.getValueAt(fila, 2).toString());
            views.txtMarcaProd.setText(views.TableProd.getValueAt(fila, 3).toString());
            views.txtDescripcionProd.setText(views.TableProd.getValueAt(fila, 4).toString());
            views.txtCantidadProd.setText(views.TableProd.getValueAt(fila, 5).toString());
            views.btnRegistrarProd.setEnabled(false);
         }else if(e.getSource() == views.JLabelProductos) { /* Linkear el menú con el tab */
            views.jTabbedPane1.setSelectedIndex(2);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getSource() == views.txtBuscarProd) {
            limpiarTable();
            listarProductos();
        }
    }
    
    private void limpiar () {
        views.txtIDProd.setText("");
        views.txtNombreProd.setText("");
        views.txtParteProd.setText("");
        views.txtMarcaProd.setText("");
        views.txtDescripcionProd.setText("");
        views.txtCantidadProd.setText("");
        views.btnRegistrarProd.setEnabled(true);
    }
    
}
