
package Controllers;

import Models.Articulos;
import Models.ArticulosDao;
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

public class ArticulosControllers implements ActionListener, MouseListener, KeyListener {
    private Articulos art;
    private ArticulosDao artDao;
    private PanelAdmin views;
    DefaultTableModel modelo = new DefaultTableModel();

    public ArticulosControllers(Articulos art, ArticulosDao artDao, PanelAdmin views) {
        this.art = art;
        this.artDao = artDao;
        this.views = views;
        this.views.btnRegistrarArt.addActionListener(this);
        this.views.btnModificarArt.addActionListener(this);
        this.views.btnNuevoArt.addActionListener(this);
        this.views.TableArt.addMouseListener(this);
        this.views.JMenuEliminarArt.addActionListener(this);
        this.views.JMenuReingresarArt.addActionListener(this);
        this.views.txtBuscarArt.addKeyListener(this);
        this.views.JLabelEquipos.addMouseListener(this);
        listarArticulos();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btnRegistrarArt) {
            if (views.txtEquipoArt.getText().equals("") || views.txtNombreArt.getText().equals("") 
                    || views.txtMarcaArt.getText().equals("") || views.txtModeloArt.getText().equals("")
                    || views.txtSerieArt.getText().equals("") || views.txtCantidadArt.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Todos los campos son requeridos");
            }else {
                art.setEquipo(views.txtEquipoArt.getText());
                art.setNombre(views.txtNombreArt.getText());
                art.setMarca(views.txtMarcaArt.getText());
                art.setModelo(views.txtModeloArt.getText());
                art.setSerie(views.txtSerieArt.getText());
                art.setCantidad(Integer.parseInt(views.txtCantidadArt.getText()));
                if (artDao.registrar(art)) {
                    limpiarTable();
                    listarArticulos();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "¡Artículo registrado con éxito!");
                }else {
                    JOptionPane.showMessageDialog(null, "Error al registrar artículo");
                }
            }
        }else if (e.getSource() == views.btnModificarArt) {
            if (views.txtIDArt.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Selecciona un artículo");
            }else {
                if (views.txtEquipoArt.getText().equals("") || views.txtNombreArt.getText().equals("") 
                    || views.txtMarcaArt.getText().equals("") || views.txtModeloArt.getText().equals("")
                    || views.txtSerieArt.getText().equals("") || views.txtCantidadArt.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Todos los campos son requeridos");
            }else {
                art.setEquipo(views.txtEquipoArt.getText());
                art.setNombre(views.txtNombreArt.getText());
                art.setMarca(views.txtMarcaArt.getText());
                art.setModelo(views.txtModeloArt.getText());
                art.setSerie(views.txtSerieArt.getText());
                art.setCantidad(Integer.parseInt(views.txtCantidadArt.getText()));
                art.setID(Integer.parseInt(views.txtIDArt.getText()));
                if (artDao.modificar(art)) {
                    limpiarTable();
                    listarArticulos();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "¡Artículo modificado con éxito!");
                }else {
                    JOptionPane.showMessageDialog(null, "Error al modificar artículo");
                }
            }
            }
        }else if (e.getSource() == views.JMenuEliminarArt) {
            if (views.txtIDArt.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Selecciona un artículo");
            }else {
               int id = Integer.parseInt(views.txtIDArt.getText());
               if (artDao.accion("Sin stock", id)) {
                   limpiarTable();
                   listarArticulos();
                   limpiar();
                   JOptionPane.showMessageDialog(null, "Artículo sin stock");
               }else{
                   JOptionPane.showMessageDialog(null, "Error al eliminar artículo");
               }
            }
        }else if (e.getSource() == views.JMenuReingresarArt) {
            if (views.txtIDArt.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Selecciona un artículo");
            }else {
               int id = Integer.parseInt(views.txtIDArt.getText());
               if (artDao.accion("En stock", id)) {
                   limpiarTable();
                   listarArticulos();
                   limpiar();
                   JOptionPane.showMessageDialog(null, "Artículo reingresado");
               }else{
                   JOptionPane.showMessageDialog(null, "Error al reingresar artículo");
               }
            }
        }else {
            limpiar();
        }
    }
    
    public void listarArticulos(){
        Tables color = new Tables();
        views.TableArt.setDefaultRenderer(views.TableArt.getColumnClass(0), color);
        List <Articulos> lista = artDao.ListaArticulos(views.txtBuscarArt.getText());
        modelo = (DefaultTableModel) views.TableArt.getModel();
        Object[] ob = new Object[8];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getID();
            ob[1] = lista.get(i).getEquipo();
            ob[2] = lista.get(i).getNombre();
            ob[3] = lista.get(i).getMarca();
            ob[4] = lista.get(i).getModelo();
            ob[5] = lista.get(i).getSerie();
            ob[6] = lista.get(i).getCantidad();
            ob[7] = lista.get(i).getStatus();
            modelo.addRow(ob);
        }
        views.TableArt.setModel(modelo);
        JTableHeader header = views.TableArt.getTableHeader();
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
        if (e.getSource() == views.TableArt){
            int fila = views.TableArt.rowAtPoint(e.getPoint());
            views.txtIDArt.setText(views.TableArt.getValueAt(fila, 0).toString());
            views.txtEquipoArt.setText(views.TableArt.getValueAt(fila, 1).toString());
            views.txtNombreArt.setText(views.TableArt.getValueAt(fila, 2).toString());
            views.txtMarcaArt.setText(views.TableArt.getValueAt(fila, 3).toString());
            views.txtModeloArt.setText(views.TableArt.getValueAt(fila, 4).toString());
            views.txtSerieArt.setText(views.TableArt.getValueAt(fila, 5).toString());
            views.txtCantidadArt.setText(views.TableArt.getValueAt(fila, 6).toString());
            views.btnRegistrarArt.setEnabled(false);
         }else if(e.getSource() == views.JLabelEquipos) {
            views.jTabbedPane1.setSelectedIndex(0);
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
    
    private void limpiar(){
        views.txtEquipoArt.setText("");
        views.txtNombreArt.setText("");
        views.txtMarcaArt.setText("");
        views.txtModeloArt.setText("");
        views.txtSerieArt.setText("");
        views.txtCantidadArt.setText("");
        views.txtIDArt.setText("");
        views.btnRegistrarArt.setEnabled(true);
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getSource() == views.txtBuscarArt){
            limpiarTable();
            listarArticulos();
        }
    }
    
}
