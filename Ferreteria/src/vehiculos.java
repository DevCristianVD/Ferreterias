import Clases.Vehiculo;
import DAO.VehiculoDAO;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class vehiculos extends javax.swing.JFrame {

   DefaultTableModel modeloTabla = new DefaultTableModel();
   
    public vehiculos() {
        initComponents();
        String[] encabezadosTabla=new String[]{"ID_VEHICULO","MODELO","PESO_SOPORTADO","ID_CLIENTE","ESTATUS"};
        modeloTabla.setColumnIdentifiers(encabezadosTabla);
        TablaVehiculo.setModel(modeloTabla);
        llenar_tabla();
        
    }

    public void llenar_tabla()
    {
      modeloTabla.setRowCount(0); 

    try {
        VehiculoDAO vehiculoDAO = new VehiculoDAO();
        List<Vehiculo> listaVehiculos = vehiculoDAO.obtenerVehiculos(); 

        for (Vehiculo v : listaVehiculos) {
            Object[] fila = {v.getIdVehiculo(), v.getModelo(), v.getPesoSoportado(), v.getIdEmpleado(), v.getEstatus()};
            modeloTabla.addRow(fila); 
        }
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error al llenar la tabla: " + e.getMessage());
    }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        BotonAgregarC = new javax.swing.JButton();
        BotonActualizarC = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaVehiculo = new javax.swing.JTable();
        regresarBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel10.setBackground(new java.awt.Color(255, 0, 51));
        jPanel10.setForeground(new java.awt.Color(255, 51, 51));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Vehiculos");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(299, 299, 299))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        BotonAgregarC.setBackground(new java.awt.Color(255, 255, 255));
        BotonAgregarC.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        BotonAgregarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG2/add.png"))); // NOI18N
        BotonAgregarC.setText("Agregar");
        BotonAgregarC.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 2, true));
        BotonAgregarC.setContentAreaFilled(false);
        BotonAgregarC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonAgregarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarCActionPerformed(evt);
            }
        });

        BotonActualizarC.setBackground(new java.awt.Color(255, 255, 255));
        BotonActualizarC.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        BotonActualizarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG2/update.png"))); // NOI18N
        BotonActualizarC.setText("Actualizar");
        BotonActualizarC.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 2, true));
        BotonActualizarC.setContentAreaFilled(false);
        BotonActualizarC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonActualizarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActualizarCActionPerformed(evt);
            }
        });

        TablaVehiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        TablaVehiculo.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        TablaVehiculo.setSelectionBackground(new java.awt.Color(255, 102, 102));
        jScrollPane1.setViewportView(TablaVehiculo);

        regresarBoton.setBackground(new java.awt.Color(255, 255, 255));
        regresarBoton.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        regresarBoton.setText("Regresar");
        regresarBoton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 2, true));
        regresarBoton.setContentAreaFilled(false);
        regresarBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regresarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addComponent(regresarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(BotonAgregarC, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonActualizarC, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonActualizarC, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonAgregarC))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(regresarBoton)
                .addGap(29, 29, 29))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAgregarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarCActionPerformed
        this.dispose();
        RegistroVeh AVEH=new RegistroVeh();
        AVEH.setLocationRelativeTo(this);
        AVEH.setVisible(true);        
    }//GEN-LAST:event_BotonAgregarCActionPerformed

    private void BotonActualizarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActualizarCActionPerformed
         int filaSeleccionada = TablaVehiculo.getSelectedRow(); 

        if (filaSeleccionada != -1) { 
            int id_categoria = (int) TablaVehiculo.getValueAt(filaSeleccionada, 0); // Obtiene ID
            String nombre = (String) TablaVehiculo.getValueAt(filaSeleccionada, 1);  // Obtiene Nombre

            this.dispose();
            ActualizarParentesco ACP = new ActualizarParentesco(id_categoria, nombre);
            ACP.setLocationRelativeTo(this);
            ACP.setVisible(true);
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Seleccione un registro para actualizar.");
        }
    }//GEN-LAST:event_BotonActualizarCActionPerformed

    private void regresarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarBotonActionPerformed
        this.dispose();
        inicio Inicio=new inicio();
        Inicio.setLocationRelativeTo(this);
        Inicio.setVisible(true);
    }//GEN-LAST:event_regresarBotonActionPerformed


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
            java.util.logging.Logger.getLogger(parentescoG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(parentescoG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(parentescoG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(parentescoG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new parentescoG().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonActualizarC;
    private javax.swing.JButton BotonAgregarC;
    private javax.swing.JTable TablaVehiculo;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton regresarBoton;
    // End of variables declaration//GEN-END:variables
}
