
package Controllers;

import Views.PanelAdmin;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ConfigControllers implements MouseListener{

    private PanelAdmin views;

    public ConfigControllers(PanelAdmin views) {
        this.views = views;
        this.views.JLabelRefacciones.addMouseListener(this);
        this.views.JLabelEquipos.addMouseListener(this);
        this.views.JLabelProductos.addMouseListener(this);
        this.views.JLabelUsuarios.addMouseListener(this);
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        }

    @Override
    public void mousePressed(MouseEvent e) {
       }

    @Override
    public void mouseReleased(MouseEvent e) {
       }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == views.JLabelRefacciones){
            views.JPanelRefacciones.setBackground(new Color(131,144,142));
        }else if (e.getSource() == views.JLabelProductos){
            views.JPanelProductos.setBackground(new Color(131,144,142));
        }else if (e.getSource() == views.JLabelEquipos){
            views.JPanelEquipos.setBackground(new Color(131,144,142));
        }else if (e.getSource() == views.JLabelUsuarios){
            views.JPanelUsuarios.setBackground(new Color(131,144,142));
        }
       }

    @Override
    public void mouseExited(MouseEvent e) {
         if (e.getSource() == views.JLabelRefacciones){
            views.JPanelRefacciones.setBackground(new Color(0,102,153));
        }else if (e.getSource() == views.JLabelProductos){
            views.JPanelProductos.setBackground(new Color(0,102,153));
        }else if (e.getSource() == views.JLabelEquipos){
            views.JPanelEquipos.setBackground(new Color(0,102,153));
        }else if (e.getSource() == views.JLabelUsuarios){
            views.JPanelUsuarios.setBackground(new Color(0,102,153));
        }
       }
}

    