
package Controllers;

import Models.Refacciones;
import Models.RefaccionesDao;
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

public class RefaccionesControllers implements ActionListener, MouseListener, KeyListener {

    private Refacciones ref;
    private RefaccionesDao refDao;
    private PanelAdmin views;
    DefaultTableModel modelo = new DefaultTableModel();

    public RefaccionesControllers(Refacciones ref, RefaccionesDao refDao, PanelAdmin views) {
        this.ref = ref;
        this.refDao = refDao;
        this.views = views;
        this.views.btnRegistrarRef.addActionListener(this); 
        this.views.TableRef.addMouseListener(this);
        this.views.btnModificarRef.addActionListener(this);
        this.views.JMenuEliminarRef.addActionListener(this);
        this.views.btnNuevoRef.addActionListener(this);
        this.views.JMenuReingresarRef.addActionListener(this);
        this.views.txtBuscarRef.addKeyListener(this);
        this.views.JLabelRefacciones.addMouseListener(this);
        listarRefacciones();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btnRegistrarRef) {
           if (views.txtNombreRef.getText().equals("") || views.txtParteRef.getText().equals("")
                   || views.txtMarcaRef.getText().equals("") || views.txtDescripcionRef.getText().equals("")
                   || views.txtCantidadRef.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
           }else{
               ref.setNombre(views.txtNombreRef.getText());
               ref.setParte(views.txtParteRef.getText());
               ref.setMarca(views.txtMarcaRef.getText());
               ref.setDescripcion(views.txtDescripcionRef.getText());
               ref.setCantidad(Integer.parseInt(views.txtCantidadRef.getText()));
               if (refDao.registrar(ref)) {
                   limpiarTable();
                   listarRefacciones();
                   limpiar();
                   JOptionPane.showMessageDialog(null, "Refaccion registrada con éxito");
               }else{
                   JOptionPane.showMessageDialog(null, "Error al registrar la refacción");
               }
           }
       }else if (e.getSource() == views.btnModificarRef) {
           if (views.txtNombreRef.getText().equals("") || views.txtParteRef.getText().equals("")
                   || views.txtMarcaRef.getText().equals("") || views.txtDescripcionRef.getText().equals("")
                   || views.txtCantidadRef.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
           }else{
               ref.setNombre(views.txtNombreRef.getText());
               ref.setParte(views.txtParteRef.getText());
               ref.setMarca(views.txtMarcaRef.getText());
               ref.setDescripcion(views.txtDescripcionRef.getText());
               ref.setCantidad(Integer.parseInt(views.txtCantidadRef.getText()));
               ref.setID(Integer.parseInt(views.txtIDRef.getText()));
               if (refDao.modificar(ref)) {
                   limpiarTable();
                   listarRefacciones();
                   limpiar();
                   JOptionPane.showMessageDialog(null, "¡Refacción modificada con éxito!");
               }else{
                   JOptionPane.showMessageDialog(null, "Error al modificar la refacción");
               }
           }
        }else if(e.getSource() == views.JMenuEliminarRef){
           if(views.txtIDRef.getText().equals("")) {
               JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar");
           }else{
               int id = Integer.parseInt(views.txtIDRef.getText());
               if (refDao.accion("Sin stock", id)) {
                   limpiarTable();
                   listarRefacciones();
                   limpiar();
                   JOptionPane.showMessageDialog(null, "Refacción eliminada");
               }else{
                   JOptionPane.showMessageDialog(null, "Error al eliminar refacción");
               }
           }
        }else if(e.getSource() == views.JMenuReingresarRef){
           if(views.txtIDRef.getText().equals("")) {
               JOptionPane.showMessageDialog(null, "Seleccione una fila para reingresar");
           }else{
               int id = Integer.parseInt(views.txtIDRef.getText());
               if (refDao.accion("En stock", id)) {
                   limpiarTable();
                   listarRefacciones();
                   limpiar();
                   JOptionPane.showMessageDialog(null, "Refacción reingresado");
               }else{
                   JOptionPane.showMessageDialog(null, "Error al reingresar la refacción");
               }
           }
       }else {
           limpiar();
       }
    }
    
    public void listarRefacciones(){
        Tables color = new Tables();
        views.TableRef.setDefaultRenderer(views.TableRef.getColumnClass(0), color);
        List <Refacciones> lista = refDao.ListaRefacciones(views.txtBuscarRef.getText());
        modelo = (DefaultTableModel) views.TableRef.getModel();
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
        views.TableRef.setModel(modelo);
        JTableHeader header = views.TableRef.getTableHeader();
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
        if (e.getSource() == views.TableRef){
            int fila = views.TableRef.rowAtPoint(e.getPoint());
            views.txtIDRef.setText(views.TableRef.getValueAt(fila, 0).toString());
            views.txtNombreRef.setText(views.TableRef.getValueAt(fila, 1).toString());
            views.txtParteRef.setText(views.TableRef.getValueAt(fila, 2).toString());
            views.txtMarcaRef.setText(views.TableRef.getValueAt(fila, 3).toString());
            views.txtDescripcionRef.setText(views.TableRef.getValueAt(fila, 4).toString());
            views.txtCantidadRef.setText(views.TableRef.getValueAt(fila, 5).toString());
            views.btnRegistrarRef.setEnabled(false);
         }else if(e.getSource() == views.JLabelRefacciones) { /* Linkear el menú con el tab */
            views.jTabbedPane1.setSelectedIndex(3);
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
        if (e.getSource() == views.txtBuscarRef) {
            limpiarTable();
            listarRefacciones();
        }
    }
    
    private void limpiar () {
        views.txtIDRef.setText("");
        views.txtNombreRef.setText("");
        views.txtParteRef.setText("");
        views.txtMarcaRef.setText("");
        views.txtDescripcionRef.setText("");
        views.txtCantidadRef.setText("");
        views.btnRegistrarRef.setEnabled(true);
    }
    
}
