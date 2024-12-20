
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import conexion.*;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import javax.swing.JButton;
import javax.swing.JLabel;

public class UserUI extends javax.swing.JFrame {

    private Connection conn = null;
    private DAO dao = new DAO();

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
        crearBotonesTablas();
    }

    public void crearBotonesTablas() {
        try {
            DatabaseMetaData metaData = conn.getMetaData();

            String catalogo = null;
            String esquema = null;
            String patronTabla = "%";
            String[] tipos = {"TABLE"};

            try (ResultSet tablas = metaData.getTables(catalogo, esquema, patronTabla, tipos)) {

                while (tablas.next()) {
                    String nombreTabla = tablas.getString("TABLE_NAME");

                    String query = "SELECT * FROM " + nombreTabla + ";";

                    try (PreparedStatement preparedStatement = conn.prepareStatement(query)) {
                        
                        ResultSet resultSet = preparedStatement.executeQuery();
                        
                        System.out.println("Si");
                        JButton btn = new JButton(nombreTabla);
                        btn.setPreferredSize(new Dimension(150, 80));
                        panelBtn.add(btn);
                        
                        btn.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                
                            }
                        });
                        
                    } catch (SQLException e) {
                    }

                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void crearTxtBox(){
        
    }

    public UserUI() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DatosUsuario = new javax.swing.JPanel();
        btnUser = new javax.swing.JButton();
        txtName = new javax.swing.JLabel();
        txtTipeUser = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelBtn = new javax.swing.JPanel();
        PanelUniversal = new javax.swing.JPanel();
        contenedorTextos = new javax.swing.JPanel();
        cajas = new javax.swing.JPanel();
        panelABCC = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaUniversal = new javax.swing.JTable();
        btnBorrar = new javax.swing.JButton();
        btnResetear = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        DatosUsuario.setBackground(new java.awt.Color(204, 204, 204));
        DatosUsuario.setMinimumSize(new java.awt.Dimension(200, 100));
        DatosUsuario.setPreferredSize(new java.awt.Dimension(200, 500));

        btnUser.setIcon(new javax.swing.ImageIcon("C:\\Quinto_Semestre\\taller_base_de_datos\\user_Página 6.png")); // NOI18N
        btnUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnUser.setBorderPainted(false);
        btnUser.setContentAreaFilled(false);

        txtName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtName.setText("Name");

        txtTipeUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTipeUser.setText("tipeUser");

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));

        panelBtn.setBackground(new java.awt.Color(204, 204, 204));
        panelBtn.setLayout(new java.awt.GridLayout(0, 1));
        jScrollPane1.setViewportView(panelBtn);

        javax.swing.GroupLayout DatosUsuarioLayout = new javax.swing.GroupLayout(DatosUsuario);
        DatosUsuario.setLayout(DatosUsuarioLayout);
        DatosUsuarioLayout.setHorizontalGroup(
            DatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtTipeUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(DatosUsuarioLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(btnUser, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        DatosUsuarioLayout.setVerticalGroup(
            DatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DatosUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnUser, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTipeUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE))
        );

        getContentPane().add(DatosUsuario, java.awt.BorderLayout.LINE_START);

        PanelUniversal.setBackground(new java.awt.Color(255, 255, 255));

        contenedorTextos.setBackground(new java.awt.Color(255, 255, 255));
        contenedorTextos.setMinimumSize(new java.awt.Dimension(100, 150));

        cajas.setBackground(new java.awt.Color(255, 255, 255));
        cajas.setLayout(new java.awt.GridLayout(8, 2));

        panelABCC.setBackground(new java.awt.Color(255, 255, 255));
        panelABCC.setMinimumSize(new java.awt.Dimension(100, 100));

        tablaUniversal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaUniversal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaUniversal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaUniversalMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaUniversal);

        btnBorrar.setIcon(new javax.swing.ImageIcon("C:\\Quinto_Semestre\\taller_base_de_datos\\dibujo_Página 2.png")); // NOI18N
        btnBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnResetear.setIcon(new javax.swing.ImageIcon("C:\\Quinto_Semestre\\taller_base_de_datos\\dibujo_Página 5.png")); // NOI18N
        btnResetear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnCrear.setIcon(new javax.swing.ImageIcon("C:\\Quinto_Semestre\\taller_base_de_datos\\dibujo_Página 3.png")); // NOI18N
        btnCrear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnActualizar.setIcon(new javax.swing.ImageIcon("C:\\Quinto_Semestre\\taller_base_de_datos\\dibujo_Página 4.png")); // NOI18N
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon("C:\\Quinto_Semestre\\taller_base_de_datos\\dibujo_Página 1.png")); // NOI18N
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelABCCLayout = new javax.swing.GroupLayout(panelABCC);
        panelABCC.setLayout(panelABCCLayout);
        panelABCCLayout.setHorizontalGroup(
            panelABCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelABCCLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnCrear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnResetear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBorrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar)
                .addGap(17, 17, 17))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        panelABCCLayout.setVerticalGroup(
            panelABCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelABCCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelABCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBorrar)
                    .addComponent(btnResetear)
                    .addComponent(btnCrear)
                    .addComponent(btnActualizar)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout contenedorTextosLayout = new javax.swing.GroupLayout(contenedorTextos);
        contenedorTextos.setLayout(contenedorTextosLayout);
        contenedorTextosLayout.setHorizontalGroup(
            contenedorTextosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorTextosLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(cajas, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addComponent(panelABCC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contenedorTextosLayout.setVerticalGroup(
            contenedorTextosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorTextosLayout.createSequentialGroup()
                .addComponent(cajas, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelABCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelUniversalLayout = new javax.swing.GroupLayout(PanelUniversal);
        PanelUniversal.setLayout(PanelUniversalLayout);
        PanelUniversalLayout.setHorizontalGroup(
            PanelUniversalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorTextos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelUniversalLayout.setVerticalGroup(
            PanelUniversalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUniversalLayout.createSequentialGroup()
                .addComponent(contenedorTextos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(PanelUniversal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        System.out.println("Busquedas");

        //dao.busquedas(comando, conn);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void tablaUniversalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaUniversalMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaUniversalMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserUI().setVisible(true);

            }
        });
    }

    private void setSize(int MAXIMIZED_BOTH) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DatosUsuario;
    private javax.swing.JPanel PanelUniversal;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnResetear;
    private javax.swing.JButton btnUser;
    private javax.swing.JPanel cajas;
    private javax.swing.JPanel contenedorTextos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelABCC;
    private javax.swing.JPanel panelBtn;
    private javax.swing.JTable tablaUniversal;
    private javax.swing.JLabel txtName;
    private javax.swing.JLabel txtTipeUser;
    // End of variables declaration//GEN-END:variables
}
