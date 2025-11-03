import Clases.Categoria;
import DAO.CategoriaDAO;
import Clases.Marca;
import DAO.MarcaDAO;
import Clases.Producto;
import DAO.ProductoDAO;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegistroPed extends javax.swing.JFrame {

    private Map<String, Integer> CategoriaMap = new HashMap<>();
    private Map<String, Integer> MarcaMap = new HashMap<>();
    
    public RegistroPed() {
        initComponents();
        llenarComboBoxCategoria();
        llenarComboBoxMarca();
    }
    
      private boolean validarCampos() {
        return CategoriaBox.getSelectedItem() != null &&
               MarcaBox.getSelectedItem() != null &&
               !nombretxt.getText().isEmpty() &&
               !PrecioCtxt.getText().isEmpty() &&
               !PrecioVtxt.getText().isEmpty() &&
               !PrecioMtxt.getText().isEmpty() &&
               !numerotxt.getText().isEmpty();
    }
      
      private void llenarComboBoxCategoria() {
    try {
        CategoriaDAO categoriaDAO = new CategoriaDAO();
        List<Categoria> listaCategorias = categoriaDAO.ObtenerCategorias(); 

        CategoriaBox.removeAllItems(); 
        CategoriaMap.clear();

        for (Categoria c : listaCategorias) {
            CategoriaBox.addItem(c.getNombre()); 
            CategoriaMap.put(c.getNombre(), c.getIdCategoria()); 
        }
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error al llenar el combo box de categorías: " + e.getMessage());
    }
}

      private void llenarComboBoxMarca() {
    try {
        MarcaDAO marcaDAO = new MarcaDAO();
        List<Marca> listaMarcas = marcaDAO.ObtenerMarcas(); 

        MarcaBox.removeAllItems(); 
        MarcaMap.clear(); 

        for (Marca m : listaMarcas) {
            MarcaBox.addItem(m.getNombre());
            MarcaMap.put(m.getNombre(), m.getIdMarca()); 
        }
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error al llenar el combo box de marcas: " + e.getMessage());
    }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        PrecioVtxt = new javax.swing.JTextField();
        PrecioMtxt = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        numerotxt = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        nombretxt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        PrecioCtxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        BotonGuardarC = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CategoriaBox = new javax.swing.JComboBox<>();
        MarcaBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        PrecioVtxt.setBackground(new java.awt.Color(255, 255, 255));
        PrecioVtxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        PrecioVtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecioVtxtActionPerformed(evt);
            }
        });

        PrecioMtxt.setBackground(new java.awt.Color(255, 255, 255));
        PrecioMtxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        PrecioMtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecioMtxtActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Cantidad");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre del producto:");

        numerotxt.setBackground(new java.awt.Color(255, 255, 255));
        numerotxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        numerotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numerotxtActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Precio Compra");

        nombretxt.setBackground(new java.awt.Color(255, 255, 255));
        nombretxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nombretxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombretxtActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Precio venta");

        jPanel10.setBackground(new java.awt.Color(255, 0, 51));
        jPanel10.setForeground(new java.awt.Color(255, 51, 51));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Agregar productos");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(jLabel5)
                .addContainerGap(194, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(21, 21, 21))
        );

        PrecioCtxt.setBackground(new java.awt.Color(255, 255, 255));
        PrecioCtxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        PrecioCtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecioCtxtActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Precio merma");

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
        jLabel2.setText("Categoria");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Marca");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonGuardarC, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(274, 274, 274))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addGap(137, 137, 137))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(130, 130, 130))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel18)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(numerotxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                                    .addComponent(nombretxt, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PrecioCtxt, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(CategoriaBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(69, 69, 69)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PrecioVtxt)
                            .addComponent(PrecioMtxt)
                            .addComponent(MarcaBox, 0, 251, Short.MAX_VALUE))
                        .addGap(62, 62, 62))))
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
                    .addComponent(CategoriaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MarcaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrecioVtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel10))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrecioCtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrecioMtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addComponent(numerotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(BotonGuardarC, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
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
        ProductoDAO productoDAO = new ProductoDAO();
        int nuevoCodigo = productoDAO.obtenerUltimoIdProducto() + 1;
        String categoriaSeleccionada = (String) CategoriaBox.getSelectedItem();
        int idCategoria = CategoriaMap.get(categoriaSeleccionada);

        String marcaSeleccionada = (String) MarcaBox.getSelectedItem();
        int idMarca = MarcaMap.get(marcaSeleccionada);

        Producto producto = new Producto(
            nuevoCodigo, nombretxt.getText(), idMarca, idCategoria,
            Double.parseDouble(PrecioCtxt.getText()),
            Double.parseDouble(PrecioVtxt.getText()),
            Double.parseDouble(PrecioMtxt.getText()),
            Integer.parseInt(numerotxt.getText())
        );

        if (productoDAO.insertarProducto(producto)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Producto registrado con éxito.");
            this.dispose();
            Productos productos = new Productos();
            productos.setLocationRelativeTo(this);
            productos.setVisible(true);
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Error al registrar producto.");
        }
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
    }//GEN-LAST:event_BotonGuardarCActionPerformed

    private void PrecioCtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecioCtxtActionPerformed

    }//GEN-LAST:event_PrecioCtxtActionPerformed

    private void nombretxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombretxtActionPerformed

    }//GEN-LAST:event_nombretxtActionPerformed

    private void numerotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numerotxtActionPerformed

    }//GEN-LAST:event_numerotxtActionPerformed

    private void PrecioMtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecioMtxtActionPerformed

    }//GEN-LAST:event_PrecioMtxtActionPerformed

    private void PrecioVtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecioVtxtActionPerformed

    }//GEN-LAST:event_PrecioVtxtActionPerformed

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
    private javax.swing.JComboBox<String> CategoriaBox;
    private javax.swing.JComboBox<String> MarcaBox;
    private javax.swing.JTextField PrecioCtxt;
    private javax.swing.JTextField PrecioMtxt;
    private javax.swing.JTextField PrecioVtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField nombretxt;
    private javax.swing.JTextField numerotxt;
    // End of variables declaration//GEN-END:variables
}
