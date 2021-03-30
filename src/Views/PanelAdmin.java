
package Views;   

import Controllers.ArticulosControllers;
import Controllers.ConfigControllers;
import Controllers.ProductosControllers;
import Controllers.RefaccionesControllers;
import Controllers.UsuariosControllers;
import Models.Articulos;
import Models.ArticulosDao;
import Models.Productos;
import Models.ProductosDao;
import Models.Refacciones;
import Models.RefaccionesDao;
import Models.UsuarioDao;
import Models.Usuarios;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PanelAdmin extends javax.swing.JFrame {
    Usuarios us = new Usuarios();
    UsuarioDao usDao = new UsuarioDao();
    Articulos art = new Articulos();
    ArticulosDao artDao = new ArticulosDao();
    Refacciones ref = new Refacciones();
    RefaccionesDao refDao = new RefaccionesDao();
    Productos prod = new Productos();
    ProductosDao prodDao = new ProductosDao();
    
    public PanelAdmin() {
        initComponents();
        ConfigControllers config = new ConfigControllers(this);
        UsuariosControllers users = new UsuariosControllers(us, usDao, this);
        ArticulosControllers articulo = new ArticulosControllers(art, artDao,this);
        RefaccionesControllers refacciones = new RefaccionesControllers(ref, refDao, this);
        ProductosControllers productos = new ProductosControllers(prod, prodDao, this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane3 = new javax.swing.JTabbedPane();
        JPopupUsuarios = new javax.swing.JPopupMenu();
        JMenuEliminarUser = new javax.swing.JMenuItem();
        JMenuReingresarUser = new javax.swing.JMenuItem();
        jPopupArt = new javax.swing.JPopupMenu();
        JMenuEliminarArt = new javax.swing.JMenuItem();
        JMenuReingresarArt = new javax.swing.JMenuItem();
        jPopupProd = new javax.swing.JPopupMenu();
        JMenuEliminarProd = new javax.swing.JMenuItem();
        JMenuReingresarProd = new javax.swing.JMenuItem();
        jPopupRef = new javax.swing.JPopupMenu();
        JMenuEliminarRef = new javax.swing.JMenuItem();
        JMenuReingresarRef = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        JPanelRefacciones = new javax.swing.JPanel();
        JLabelRefacciones = new javax.swing.JLabel();
        JPanelProductos = new javax.swing.JPanel();
        JLabelProductos = new javax.swing.JLabel();
        JPanelEquipos = new javax.swing.JPanel();
        JLabelEquipos = new javax.swing.JLabel();
        JPanelUsuarios = new javax.swing.JPanel();
        JLabelUsuarios = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtBuscarArt = new javax.swing.JTextField();
        txtIDArt = new javax.swing.JTextField();
        txtEquipoArt = new javax.swing.JTextField();
        txtNombreArt = new javax.swing.JTextField();
        txtMarcaArt = new javax.swing.JTextField();
        txtModeloArt = new javax.swing.JTextField();
        txtSerieArt = new javax.swing.JTextField();
        txtCantidadArt = new javax.swing.JTextField();
        btnRegistrarArt = new javax.swing.JButton();
        btnNuevoArt = new javax.swing.JButton();
        btnModificarArt = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        PaginadoArt = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableArt = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNombreUser = new javax.swing.JTextField();
        txtUsuarioUser = new javax.swing.JTextField();
        btnRegistrarUser = new javax.swing.JButton();
        btnNuevoUser = new javax.swing.JButton();
        btnModificarUser = new javax.swing.JButton();
        txtClaveUser = new javax.swing.JPasswordField();
        cbxRolUser = new javax.swing.JComboBox<>();
        txtIDUser = new javax.swing.JTextField();
        txtBuscarUsers = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableUsers = new javax.swing.JTable();
        PaginadoUser = new javax.swing.JPanel();
        FondoProductos = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txtIDProd = new javax.swing.JTextField();
        txtNombreProd = new javax.swing.JTextField();
        txtMarcaProd = new javax.swing.JTextField();
        txtParteProd = new javax.swing.JTextField();
        txtCantidadProd = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcionProd = new javax.swing.JTextArea();
        txtBuscarProd = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        btnNuevoProd = new javax.swing.JButton();
        btnRegistrarProd = new javax.swing.JButton();
        btnModificarProd = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        TableProd = new javax.swing.JTable();
        PaginadoProd = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        txtIDRef = new javax.swing.JTextField();
        txtNombreRef = new javax.swing.JTextField();
        txtParteRef = new javax.swing.JTextField();
        txtMarcaRef = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtDescripcionRef = new javax.swing.JTextArea();
        txtCantidadRef = new javax.swing.JTextField();
        btnNuevoRef = new javax.swing.JButton();
        btnRegistrarRef = new javax.swing.JButton();
        btnModificarRef = new javax.swing.JButton();
        txtBuscarRef = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        TableRef = new javax.swing.JTable();
        jPanel18 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtBuscarArticulo = new javax.swing.JTextField();
        btnBuscarArticulo = new javax.swing.JButton();
        JLabelImgLupa = new javax.swing.JLabel();

        JMenuEliminarUser.setText("Eliminar");
        JPopupUsuarios.add(JMenuEliminarUser);

        JMenuReingresarUser.setText("Reingresar");
        JPopupUsuarios.add(JMenuReingresarUser);

        JMenuEliminarArt.setText("Eliminar");
        jPopupArt.add(JMenuEliminarArt);

        JMenuReingresarArt.setText("Reingresar");
        jPopupArt.add(JMenuReingresarArt);

        JMenuEliminarProd.setText("Eliminar");
        jPopupProd.add(JMenuEliminarProd);

        JMenuReingresarProd.setText("Reingresar");
        jPopupProd.add(JMenuReingresarProd);

        JMenuEliminarRef.setText("Eliminar");
        jPopupRef.add(JMenuEliminarRef);

        JMenuReingresarRef.setText("Reingresar");
        jPopupRef.add(JMenuReingresarRef);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPanelRefacciones.setBackground(new java.awt.Color(0, 102, 153));
        JPanelRefacciones.setForeground(new java.awt.Color(0, 102, 153));

        JLabelRefacciones.setBackground(new java.awt.Color(0, 102, 153));
        JLabelRefacciones.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        JLabelRefacciones.setForeground(new java.awt.Color(255, 255, 255));
        JLabelRefacciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelRefacciones.setText("Refacciones");

        javax.swing.GroupLayout JPanelRefaccionesLayout = new javax.swing.GroupLayout(JPanelRefacciones);
        JPanelRefacciones.setLayout(JPanelRefaccionesLayout);
        JPanelRefaccionesLayout.setHorizontalGroup(
            JPanelRefaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelRefaccionesLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(JLabelRefacciones, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        JPanelRefaccionesLayout.setVerticalGroup(
            JPanelRefaccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelRefaccionesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JLabelRefacciones, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(JPanelRefacciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 200, -1));

        JPanelProductos.setBackground(new java.awt.Color(0, 102, 153));
        JPanelProductos.setForeground(new java.awt.Color(0, 102, 153));

        JLabelProductos.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        JLabelProductos.setForeground(new java.awt.Color(255, 255, 255));
        JLabelProductos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelProductos.setText("Productos");

        javax.swing.GroupLayout JPanelProductosLayout = new javax.swing.GroupLayout(JPanelProductos);
        JPanelProductos.setLayout(JPanelProductosLayout);
        JPanelProductosLayout.setHorizontalGroup(
            JPanelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelProductosLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(JLabelProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        JPanelProductosLayout.setVerticalGroup(
            JPanelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLabelProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel1.add(JPanelProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 200, -1));

        JPanelEquipos.setBackground(new java.awt.Color(0, 102, 153));
        JPanelEquipos.setForeground(new java.awt.Color(0, 102, 153));

        JLabelEquipos.setBackground(new java.awt.Color(0, 102, 204));
        JLabelEquipos.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        JLabelEquipos.setForeground(new java.awt.Color(255, 255, 255));
        JLabelEquipos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelEquipos.setText("Equipos");

        javax.swing.GroupLayout JPanelEquiposLayout = new javax.swing.GroupLayout(JPanelEquipos);
        JPanelEquipos.setLayout(JPanelEquiposLayout);
        JPanelEquiposLayout.setHorizontalGroup(
            JPanelEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelEquiposLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(JLabelEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        JPanelEquiposLayout.setVerticalGroup(
            JPanelEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelEquiposLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(JLabelEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(JPanelEquipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 200, -1));

        JPanelUsuarios.setBackground(new java.awt.Color(0, 102, 153));
        JPanelUsuarios.setForeground(new java.awt.Color(0, 102, 153));

        JLabelUsuarios.setBackground(new java.awt.Color(0, 102, 204));
        JLabelUsuarios.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        JLabelUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        JLabelUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelUsuarios.setText("Usuarios");

        javax.swing.GroupLayout JPanelUsuariosLayout = new javax.swing.GroupLayout(JPanelUsuarios);
        JPanelUsuarios.setLayout(JPanelUsuariosLayout);
        JPanelUsuariosLayout.setHorizontalGroup(
            JPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelUsuariosLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(JLabelUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        JPanelUsuariosLayout.setVerticalGroup(
            JPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelUsuariosLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(JLabelUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(JPanelUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 200, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 200, 550));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes para el proyecto/siys_128-removebg-preview.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 200, 100));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 100));

        jTabbedPane1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jTabbedPane1ComponentAdded(evt);
            }
        });
        jTabbedPane1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTabbedPane1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setForeground(new java.awt.Color(0, 102, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Equipos"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Equipo");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Marca");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Modelo");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Número de serie");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Cantidad");

        txtBuscarArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarArtActionPerformed(evt);
            }
        });

        txtIDArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDArtActionPerformed(evt);
            }
        });

        txtEquipoArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEquipoArtActionPerformed(evt);
            }
        });

        txtNombreArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreArtActionPerformed(evt);
            }
        });

        txtCantidadArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadArtActionPerformed(evt);
            }
        });

        btnRegistrarArt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRegistrarArt.setText("Registrar");
        btnRegistrarArt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistrarArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarArtActionPerformed(evt);
            }
        });

        btnNuevoArt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNuevoArt.setText("Nuevo");
        btnNuevoArt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnModificarArt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnModificarArt.setText("Modificar");
        btnModificarArt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Nombre");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes para el proyecto/buscar.png"))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("ID");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnNuevoArt, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnRegistrarArt, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btnModificarArt, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscarArt, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSerieArt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantidadArt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtModeloArt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMarcaArt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreArt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEquipoArt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIDArt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscarArt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDArt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEquipoArt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreArt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMarcaArt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModeloArt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSerieArt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 19, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidadArt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarArt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarArt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevoArt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 390, 490));

        PaginadoArt.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout PaginadoArtLayout = new javax.swing.GroupLayout(PaginadoArt);
        PaginadoArt.setLayout(PaginadoArtLayout);
        PaginadoArtLayout.setHorizontalGroup(
            PaginadoArtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        PaginadoArtLayout.setVerticalGroup(
            PaginadoArtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel4.add(PaginadoArt, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, 640, 50));

        TableArt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Equipo", "Nombre", "Marca", "Modelo", "# Serie", "Cantidad", "Status"
            }
        ));
        TableArt.setComponentPopupMenu(jPopupArt);
        TableArt.setGridColor(new java.awt.Color(153, 153, 153));
        TableArt.setSelectionBackground(new java.awt.Color(0, 102, 255));
        jScrollPane3.setViewportView(TableArt);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 20, 640, -1));

        jTabbedPane1.addTab("Equipos", jPanel4);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(153, 153, 153));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuarios"));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Nombre");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Usuario");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Clave");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Rol");

        txtNombreUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreUserActionPerformed(evt);
            }
        });

        btnRegistrarUser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRegistrarUser.setText("Registrar");
        btnRegistrarUser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnNuevoUser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNuevoUser.setText("Nuevo");
        btnNuevoUser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNuevoUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoUserActionPerformed(evt);
            }
        });

        btnModificarUser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnModificarUser.setText("Modificar");
        btnModificarUser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtClaveUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClaveUserActionPerformed(evt);
            }
        });

        cbxRolUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Residente", "Ingeniero", "Gerente" }));

        txtIDUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDUserActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes para el proyecto/buscar.png"))); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsuarioUser, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(txtNombreUser, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(txtClaveUser, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(cbxRolUser, 0, 195, Short.MAX_VALUE))
                        .addGap(39, 39, 39))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(btnNuevoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addComponent(btnRegistrarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(btnModificarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscarUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(txtIDUser, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(txtBuscarUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreUser, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsuarioUser, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtClaveUser, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxRolUser, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(txtIDUser, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 420, 400));

        TableUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Usuario", "Rol", "Status"
            }
        ));
        TableUsers.setComponentPopupMenu(JPopupUsuarios);
        TableUsers.setGridColor(new java.awt.Color(153, 153, 153));
        TableUsers.setRowHeight(20);
        TableUsers.setSelectionBackground(new java.awt.Color(0, 102, 255));
        jScrollPane2.setViewportView(TableUsers);

        jPanel8.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 610, 430));

        PaginadoUser.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout PaginadoUserLayout = new javax.swing.GroupLayout(PaginadoUser);
        PaginadoUser.setLayout(PaginadoUserLayout);
        PaginadoUserLayout.setHorizontalGroup(
            PaginadoUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        PaginadoUserLayout.setVerticalGroup(
            PaginadoUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel8.add(PaginadoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 460, 610, 50));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1095, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 1095, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 522, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Usuarios", jPanel7);

        FondoProductos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBackground(new java.awt.Color(153, 153, 153));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder("Productos"));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("ID");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setText("Nombre");

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel31.setText("Marca");

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setText("Número de parte");

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel33.setText("Descripción");

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setText("Cantidad");

        txtIDProd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtIDProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDProdActionPerformed(evt);
            }
        });

        txtNombreProd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNombreProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreProdActionPerformed(evt);
            }
        });

        txtMarcaProd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtMarcaProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaProdActionPerformed(evt);
            }
        });

        txtParteProd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtParteProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtParteProdActionPerformed(evt);
            }
        });

        txtCantidadProd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCantidadProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadProdActionPerformed(evt);
            }
        });

        txtDescripcionProd.setColumns(20);
        txtDescripcionProd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtDescripcionProd.setRows(5);
        jScrollPane1.setViewportView(txtDescripcionProd);

        txtBuscarProd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes para el proyecto/buscar.png"))); // NOI18N
        jLabel35.setText("jLabel35");

        btnNuevoProd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNuevoProd.setText("Nuevo");
        btnNuevoProd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnRegistrarProd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRegistrarProd.setText("Registrar");
        btnRegistrarProd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnModificarProd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnModificarProd.setText("Modificar");
        btnModificarProd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34)
                    .addComponent(btnNuevoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel15Layout.createSequentialGroup()
                        .addComponent(btnRegistrarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModificarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCantidadProd, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtParteProd, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMarcaProd, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreProd, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIDProd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBuscarProd))
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel12))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(txtIDProd, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addComponent(txtNombreProd, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addComponent(txtMarcaProd, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(txtParteProd, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addGap(32, 32, 32))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(txtCantidadProd, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                                .addGap(29, 29, 29)))))
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        FondoProductos.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 21, -1, -1));

        TableProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "# Parte", "Marca", "Descripción", "Cantidad", "Status"
            }
        ));
        TableProd.setComponentPopupMenu(jPopupProd);
        TableProd.setGridColor(new java.awt.Color(153, 153, 153));
        TableProd.setSelectionBackground(new java.awt.Color(0, 102, 255));
        jScrollPane8.setViewportView(TableProd);

        FondoProductos.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(469, 21, 620, 420));

        PaginadoProd.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout PaginadoProdLayout = new javax.swing.GroupLayout(PaginadoProd);
        PaginadoProd.setLayout(PaginadoProdLayout);
        PaginadoProdLayout.setHorizontalGroup(
            PaginadoProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PaginadoProdLayout.setVerticalGroup(
            PaginadoProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        FondoProductos.add(PaginadoProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, 620, 50));

        jTabbedPane1.addTab("Productos", FondoProductos);

        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel17.setBackground(new java.awt.Color(153, 153, 153));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder("Refacciones"));

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36.setText("ID");

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel37.setText("Nombre");

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel38.setText("Número de parte");

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel39.setText("Marca");

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel40.setText("Descripción");

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel41.setText("Cantidad");

        txtIDRef.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtIDRef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDRefActionPerformed(evt);
            }
        });

        txtNombreRef.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtParteRef.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtMarcaRef.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtDescripcionRef.setColumns(20);
        txtDescripcionRef.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtDescripcionRef.setRows(5);
        jScrollPane9.setViewportView(txtDescripcionRef);

        txtCantidadRef.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        btnNuevoRef.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNuevoRef.setText("Nuevo");
        btnNuevoRef.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNuevoRef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoRefActionPerformed(evt);
            }
        });

        btnRegistrarRef.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRegistrarRef.setText("Registrar");
        btnRegistrarRef.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistrarRef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarRefActionPerformed(evt);
            }
        });

        btnModificarRef.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnModificarRef.setText("Modificar");
        btnModificarRef.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtBuscarRef.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes para el proyecto/buscar.png"))); // NOI18N
        jLabel43.setText("jLabel43");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscarRef, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(btnNuevoRef, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(btnRegistrarRef, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnModificarRef, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel17Layout.createSequentialGroup()
                                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel37)
                                            .addComponent(jLabel41))
                                        .addGap(56, 56, 56))
                                    .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCantidadRef, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtParteRef, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtNombreRef, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtIDRef, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtMarcaRef, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarRef, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(txtIDRef, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombreRef, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel36)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel37)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtParteRef, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMarcaRef, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidadRef, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41))
                .addGap(37, 37, 37)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevoRef, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarRef, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarRef, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        jPanel16.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 430, 490));

        TableRef.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "# Parte", "Marca", "Descripcion", "Cantidad", "Status"
            }
        ));
        TableRef.setComponentPopupMenu(jPopupRef);
        TableRef.setGridColor(new java.awt.Color(153, 153, 153));
        jScrollPane10.setViewportView(TableRef);

        jPanel16.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 620, 420));

        jPanel18.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel16.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 460, 620, 50));

        jTabbedPane1.addTab("Refacciones", jPanel16);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 1100, 550));

        jPanel3.setBackground(new java.awt.Color(0, 102, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBuscarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarArticuloActionPerformed(evt);
            }
        });
        jPanel3.add(txtBuscarArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 300, 35));

        btnBuscarArticulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBuscarArticulo.setText("Buscar");
        btnBuscarArticulo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(btnBuscarArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, 70, 36));

        JLabelImgLupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes para el proyecto/buscar.png"))); // NOI18N
        JLabelImgLupa.setText("jLabel1");
        jPanel3.add(JLabelImgLupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 40, 35));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1100, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarArticuloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarArticuloActionPerformed

    private void jTabbedPane1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTabbedPane1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1AncestorAdded

    private void jTabbedPane1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTabbedPane1ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1ComponentAdded

    private void txtIDUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDUserActionPerformed

    private void txtClaveUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClaveUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClaveUserActionPerformed

    private void btnNuevoUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoUserActionPerformed

    private void txtNombreUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreUserActionPerformed

    private void btnRegistrarArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarArtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarArtActionPerformed

    private void txtCantidadArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadArtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadArtActionPerformed

    private void txtNombreArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreArtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreArtActionPerformed

    private void txtEquipoArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEquipoArtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEquipoArtActionPerformed

    private void txtIDArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDArtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDArtActionPerformed

    private void txtBuscarArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarArtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarArtActionPerformed

    private void txtIDProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDProdActionPerformed

    private void txtNombreProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreProdActionPerformed

    private void txtMarcaProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaProdActionPerformed

    private void txtParteProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtParteProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtParteProdActionPerformed

    private void txtCantidadProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadProdActionPerformed

    private void txtIDRefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDRefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDRefActionPerformed

    private void btnRegistrarRefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarRefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarRefActionPerformed

    private void btnNuevoRefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoRefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoRefActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PanelAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        String usuario = "root";
        String clave = "";
        String url = "jdbc:mysql://localhost:4444/inventario";
        Connection con;
        Statement stmt;
        ResultSet rs;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
                    
                    /* Create and display the form */
                    } catch (ClassNotFoundException ex) {
            Logger.getLogger(PanelAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel FondoProductos;
    public javax.swing.JLabel JLabelEquipos;
    private javax.swing.JLabel JLabelImgLupa;
    public javax.swing.JLabel JLabelProductos;
    public javax.swing.JLabel JLabelRefacciones;
    public javax.swing.JLabel JLabelUsuarios;
    public javax.swing.JMenuItem JMenuEliminarArt;
    public javax.swing.JMenuItem JMenuEliminarProd;
    public javax.swing.JMenuItem JMenuEliminarRef;
    public javax.swing.JMenuItem JMenuEliminarUser;
    public javax.swing.JMenuItem JMenuReingresarArt;
    public javax.swing.JMenuItem JMenuReingresarProd;
    public javax.swing.JMenuItem JMenuReingresarRef;
    public javax.swing.JMenuItem JMenuReingresarUser;
    public javax.swing.JPanel JPanelEquipos;
    public javax.swing.JPanel JPanelProductos;
    public javax.swing.JPanel JPanelRefacciones;
    public javax.swing.JPanel JPanelUsuarios;
    private javax.swing.JPopupMenu JPopupUsuarios;
    public javax.swing.JPanel PaginadoArt;
    public javax.swing.JPanel PaginadoProd;
    private javax.swing.JPanel PaginadoUser;
    public javax.swing.JTable TableArt;
    public javax.swing.JTable TableProd;
    public javax.swing.JTable TableRef;
    public javax.swing.JTable TableUsers;
    private javax.swing.JButton btnBuscarArticulo;
    public javax.swing.JButton btnModificarArt;
    public javax.swing.JButton btnModificarProd;
    public javax.swing.JButton btnModificarRef;
    public javax.swing.JButton btnModificarUser;
    public javax.swing.JButton btnNuevoArt;
    public javax.swing.JButton btnNuevoProd;
    public javax.swing.JButton btnNuevoRef;
    public javax.swing.JButton btnNuevoUser;
    public javax.swing.JButton btnRegistrarArt;
    public javax.swing.JButton btnRegistrarProd;
    public javax.swing.JButton btnRegistrarRef;
    public javax.swing.JButton btnRegistrarUser;
    public javax.swing.JComboBox<String> cbxRolUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    public javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPopupMenu jPopupArt;
    private javax.swing.JPopupMenu jPopupProd;
    public javax.swing.JPopupMenu jPopupRef;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    public javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    public javax.swing.JTextField txtBuscarArt;
    private javax.swing.JTextField txtBuscarArticulo;
    public javax.swing.JTextField txtBuscarProd;
    public javax.swing.JTextField txtBuscarRef;
    public javax.swing.JTextField txtBuscarUsers;
    public javax.swing.JTextField txtCantidadArt;
    public javax.swing.JTextField txtCantidadProd;
    public javax.swing.JTextField txtCantidadRef;
    public javax.swing.JPasswordField txtClaveUser;
    public javax.swing.JTextArea txtDescripcionProd;
    public javax.swing.JTextArea txtDescripcionRef;
    public javax.swing.JTextField txtEquipoArt;
    public javax.swing.JTextField txtIDArt;
    public javax.swing.JTextField txtIDProd;
    public javax.swing.JTextField txtIDRef;
    public javax.swing.JTextField txtIDUser;
    public javax.swing.JTextField txtMarcaArt;
    public javax.swing.JTextField txtMarcaProd;
    public javax.swing.JTextField txtMarcaRef;
    public javax.swing.JTextField txtModeloArt;
    public javax.swing.JTextField txtNombreArt;
    public javax.swing.JTextField txtNombreProd;
    public javax.swing.JTextField txtNombreRef;
    public javax.swing.JTextField txtNombreUser;
    public javax.swing.JTextField txtParteProd;
    public javax.swing.JTextField txtParteRef;
    public javax.swing.JTextField txtSerieArt;
    public javax.swing.JTextField txtUsuarioUser;
    // End of variables declaration//GEN-END:variables


}
