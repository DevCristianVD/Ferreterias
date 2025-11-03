import Clases.Empleado;
import DAO.EmpleadoDAO;
import Clases.Vehiculo;
import DAO.VehiculoDAO;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegistroVeh extends javax.swing.JFrame {

    private Map<String, Integer> EmpleadoMap = new HashMap<>();
    
    public RegistroVeh() {
        initComponents();
        llenarComboBoxEmpleado();
    }
    
      private boolean validarCampos() {
        return EmpleadoBox.getSelectedItem() != null &&
               StatusBox.getSelectedItem() != null &&
               !marcatxt.getText().isEmpty() &&
               !pesoSoportadotxt.getText().isEmpty() &&
               !modelotxt.getText().isEmpty();
    }
      
      private void llenarComboBoxEmpleado() {
    try {
        EmpleadoDAO empleadoDAO = new EmpleadoDAO();
        List<Empleado> listaEmpleados = empleadoDAO.obtenerEmpleados(); 

        EmpleadoBox.removeAllItems(); 
        EmpleadoMap.clear(); 

        for (Empleado e : listaEmpleados) {
            EmpleadoBox.addItem(e.getNombreCompleto()); 
            EmpleadoMap.put(e.getNombreCompleto(), e.getIdEmpleado()); 
        }
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error al llenar el combo box de empleados: " + e.getMessage());
    }
}



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        modelotxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        marcatxt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        pesoSoportadotxt = new javax.swing.JTextField();
        BotonGuardarC = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        EmpleadoBox = new javax.swing.JComboBox<>();
        StatusBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        modelotxt.setBackground(new java.awt.Color(255, 255, 255));
        modelotxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        modelotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelotxtActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Marca");

        jLabel16.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Peso soportado");

        marcatxt.setBackground(new java.awt.Color(255, 255, 255));
        marcatxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        marcatxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcatxtActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Modelo");

        jPanel10.setBackground(new java.awt.Color(255, 0, 51));
        jPanel10.setForeground(new java.awt.Color(255, 51, 51));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Agregar vehiculo");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(197, 197, 197))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pesoSoportadotxt.setBackground(new java.awt.Color(255, 255, 255));
        pesoSoportadotxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pesoSoportadotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesoSoportadotxtActionPerformed(evt);
            }
        });

        BotonGuardarC.setBackground(new java.awt.Color(255, 255, 255));
        BotonGuardarC.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        BotonGuardarC.setText("Guardar");
        BotonGuardarC.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 2, true));
        BotonGuardarC.setContentAreaFilled(false);
        BotonGuardarC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonGuardarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarCActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Empleado");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Status");

        StatusBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponible", "En uso", "En mantenimiento" }));
        StatusBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(155, 155, 155))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel16)
                        .addGap(130, 459, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(marcatxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                                    .addComponent(pesoSoportadotxt, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(EmpleadoBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(69, 69, 69)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(modelotxt)
                            .addComponent(StatusBox, 0, 251, Short.MAX_VALUE))
                        .addGap(62, 62, 62))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addGap(158, 158, 158))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonGuardarC, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(286, 286, 286))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmpleadoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StatusBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marcatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modelotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addGap(21, 21, 21)
                .addComponent(pesoSoportadotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(BotonGuardarC, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonGuardarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarCActionPerformed
        if (!validarCampos()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
        return;
    }

    try {
        VehiculoDAO vehiculoDAO = new VehiculoDAO();
        int nuevoCodigo = vehiculoDAO.obtenerUltimoIdVehiculo() + 1;

        String empleadoSeleccionado = (String) EmpleadoBox.getSelectedItem();
        int idEmpleado = EmpleadoMap.get(empleadoSeleccionado);

        Vehiculo vehiculo = new Vehiculo(
            nuevoCodigo, modelotxt.getText(),
            Double.parseDouble(pesoSoportadotxt.getText()),
            idEmpleado, (String) StatusBox.getSelectedItem()
        );

        if (vehiculoDAO.insertarVehiculo(vehiculo)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Vehículo registrado con éxito.");
            this.dispose();
            vehiculos vehiculos = new vehiculos(); // Redirigir a la ventana de vehículos
            vehiculos.setLocationRelativeTo(this);
            vehiculos.setVisible(true);
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Error al registrar vehículo.");
        }
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
    }//GEN-LAST:event_BotonGuardarCActionPerformed

    private void pesoSoportadotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesoSoportadotxtActionPerformed

    }//GEN-LAST:event_pesoSoportadotxtActionPerformed

    private void marcatxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcatxtActionPerformed

    }//GEN-LAST:event_marcatxtActionPerformed

    private void modelotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelotxtActionPerformed

    }//GEN-LAST:event_modelotxtActionPerformed

    private void StatusBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StatusBoxActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonGuardarC;
    private javax.swing.JComboBox<String> EmpleadoBox;
    private javax.swing.JComboBox<String> StatusBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField marcatxt;
    private javax.swing.JTextField modelotxt;
    private javax.swing.JTextField pesoSoportadotxt;
    // End of variables declaration//GEN-END:variables
}
