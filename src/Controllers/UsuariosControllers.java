
package Controllers;

import Models.Tables;
import Models.UsuarioDao;
import Models.Usuarios;
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

public class UsuariosControllers implements ActionListener, MouseListener, KeyListener{
    
    private Usuarios us;
    private UsuarioDao usDao;
    private PanelAdmin views;
    DefaultTableModel modelo = new DefaultTableModel();
    
    public UsuariosControllers(Usuarios us, UsuarioDao usDao, PanelAdmin views) {
        this.us = us;
        this.usDao = usDao;
        this.views = views;
        this.views.btnRegistrarUser.addActionListener(this); 
        this.views.TableUsers.addMouseListener(this);
        this.views.btnModificarUser.addActionListener(this);
        this.views.JMenuEliminarUser.addActionListener(this);
        this.views.btnNuevoUser.addActionListener(this);
        this.views.JMenuReingresarUser.addActionListener(this);
        this.views.txtBuscarUsers.addKeyListener(this);
        this.views.JLabelUsuarios.addMouseListener(this);
        listarUsuarios();
    }

    public UsuariosControllers(PanelAdmin aThis) {
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource() == views.btnRegistrarUser) {
           if (views.txtNombreUser.getText().equals("") 
                   || views.txtUsuarioUser.getText().equals("")
                   || String.valueOf(views.txtClaveUser.getPassword()).equals("")) {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
           }else{
               us.setNombre(views.txtNombreUser.getText());
               us.setUsuario(views.txtUsuarioUser.getText());
               us.setClave(String.valueOf(views.txtClaveUser.getPassword()));
               us.setRol(views.cbxRolUser.getSelectedItem().toString());
               if (usDao.registrar(us)) {
                   limpiarTable();
                   listarUsuarios();
                   limpiar();
                   JOptionPane.showMessageDialog(null, "Usuario registrado con éxito");
               }else{
                   JOptionPane.showMessageDialog(null, "Error al registrar el usuario");
               }
           }
       }else if (e.getSource() == views.btnModificarUser) {
           if (views.txtNombreUser.getText().equals("") 
                   || views.txtUsuarioUser.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
           }else{
               us.setNombre(views.txtNombreUser.getText());
               us.setUsuario(views.txtUsuarioUser.getText());
               us.setRol(views.cbxRolUser.getSelectedItem().toString());
               us.setID(Integer.parseInt(views.txtIDUser.getText()));
               if (usDao.modificar(us)) {
                   limpiarTable();
                   listarUsuarios();
                   limpiar();
                   JOptionPane.showMessageDialog(null, "Usuario modificado con éxito");
               }else{
                   JOptionPane.showMessageDialog(null, "Error al modificar el usuario");
               }
           }
       }else if(e.getSource() == views.JMenuEliminarUser){
           if(views.txtIDUser.getText().equals("")) {
               JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar");
           }else{
               int id = Integer.parseInt(views.txtIDUser.getText());
               if (usDao.accion("Inactivo", id)) {
                   limpiarTable();
                   listarUsuarios();
                   limpiar();
                   JOptionPane.showMessageDialog(null, "Usuario eliminado");
               }else{
                   JOptionPane.showMessageDialog(null, "Error al eliminar usuario");
               }
           }
       }else if(e.getSource() == views.JMenuReingresarUser){
           if(views.txtIDUser.getText().equals("")) {
               JOptionPane.showMessageDialog(null, "Seleccione una fila para reingresar");
           }else{
               int id = Integer.parseInt(views.txtIDUser.getText());
               if (usDao.accion("Activo", id)) {
                   limpiarTable();
                   listarUsuarios();
                   limpiar();
                   JOptionPane.showMessageDialog(null, "Usuario reingresado");
               }else{
                   JOptionPane.showMessageDialog(null, "Error al reingresar el usuario");
               }
           }
       }else {
           limpiar();
       }
    }
    
    public void listarUsuarios(){
        Tables color = new Tables();
        views.TableUsers.setDefaultRenderer(views.TableUsers.getColumnClass(0), color);
        List <Usuarios> lista = usDao.ListaUsuarios(views.txtBuscarUsers.getText());
        modelo = (DefaultTableModel) views.TableUsers.getModel();
        Object[] ob = new Object[5];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getID();
            ob[1] = lista.get(i).getNombre();
            ob[2] = lista.get(i).getUsuario();
            ob[3] = lista.get(i).getRol();
            ob[4] = lista.get(i).getStatus();
            modelo.addRow(ob);
        }
        views.TableUsers.setModel(modelo);
        JTableHeader header = views.TableUsers.getTableHeader();
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
    public void mouseClicked(MouseEvent e) { /* Al dar clic en una fila se llenan los text field con la info */
        if (e.getSource() == views.TableUsers){
            int fila = views.TableUsers.rowAtPoint(e.getPoint());
            views.txtIDUser.setText(views.TableUsers.getValueAt(fila, 0).toString());
            views.txtNombreUser.setText(views.TableUsers.getValueAt(fila, 1).toString());
            views.txtUsuarioUser.setText(views.TableUsers.getValueAt(fila, 2).toString());
            views.cbxRolUser.setSelectedItem(views.TableUsers.getValueAt(fila, 3).toString());
            views.txtClaveUser.setEnabled(false);
            views.btnRegistrarUser.setEnabled(false);
         }else if(e.getSource() == views.JLabelUsuarios) { /* Linkear el menú con el tab */
            views.jTabbedPane1.setSelectedIndex(1);
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
        if (e.getSource() == views.txtBuscarUsers) {
            limpiarTable();
            listarUsuarios();
        }
    }
    private void limpiar () {
        views.txtIDUser.setText("");
        views.txtNombreUser.setText("");
        views.txtUsuarioUser.setText("");
        views.txtClaveUser.setText("");
        views.txtClaveUser.setEnabled(true);
        views.btnRegistrarUser.setEnabled(true);
    }
}
