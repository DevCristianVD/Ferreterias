
public class inicio extends javax.swing.JFrame {

    
    public inicio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BotonProductos = new javax.swing.JButton();
        BotonEmpleados = new javax.swing.JButton();
        BotonClientes = new javax.swing.JButton();
        BotonCategorias = new javax.swing.JButton();
        BotonPedidos = new javax.swing.JButton();
        BotonFacturas = new javax.swing.JButton();
        BotonVehiculos = new javax.swing.JButton();
        BotonParentesco = new javax.swing.JButton();
        BotonMarcas = new javax.swing.JButton();
        BotonMermas = new javax.swing.JButton();
        BotonAbonos = new javax.swing.JButton();
        BotonCreditos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 0, 51));
        jPanel1.setForeground(new java.awt.Color(255, 51, 51));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenido a ferreweb");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel2.setText("Bienvenido a ferreweb");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(168, 168, 168))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(191, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(164, 164, 164)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(15, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(21, 21, 21)))
        );

        BotonProductos.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        BotonProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/caja.png"))); // NOI18N
        BotonProductos.setText("Productos");
        BotonProductos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 2, true));
        BotonProductos.setContentAreaFilled(false);
        BotonProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonProductosActionPerformed(evt);
            }
        });

        BotonEmpleados.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        BotonEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/persona.png"))); // NOI18N
        BotonEmpleados.setText("Empleado");
        BotonEmpleados.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 2, true));
        BotonEmpleados.setContentAreaFilled(false);
        BotonEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEmpleadosActionPerformed(evt);
            }
        });

        BotonClientes.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        BotonClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/persona.png"))); // NOI18N
        BotonClientes.setText("Clientes");
        BotonClientes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 2, true));
        BotonClientes.setContentAreaFilled(false);
        BotonClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonClientesActionPerformed(evt);
            }
        });

        BotonCategorias.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        BotonCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/categorias.png"))); // NOI18N
        BotonCategorias.setText("Categorias");
        BotonCategorias.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 2, true));
        BotonCategorias.setContentAreaFilled(false);
        BotonCategorias.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCategoriasActionPerformed(evt);
            }
        });

        BotonPedidos.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        BotonPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/caja+.png"))); // NOI18N
        BotonPedidos.setText("Pedidos");
        BotonPedidos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 2, true));
        BotonPedidos.setContentAreaFilled(false);
        BotonPedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPedidosActionPerformed(evt);
            }
        });

        BotonFacturas.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        BotonFacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/factura.png"))); // NOI18N
        BotonFacturas.setText("Facturas");
        BotonFacturas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 2, true));
        BotonFacturas.setContentAreaFilled(false);
        BotonFacturas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFacturasActionPerformed(evt);
            }
        });

        BotonVehiculos.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        BotonVehiculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Carro.png"))); // NOI18N
        BotonVehiculos.setText("Vehiculos ");
        BotonVehiculos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 2, true));
        BotonVehiculos.setContentAreaFilled(false);
        BotonVehiculos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVehiculosActionPerformed(evt);
            }
        });

        BotonParentesco.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        BotonParentesco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/personas.png"))); // NOI18N
        BotonParentesco.setText("Parentesco ");
        BotonParentesco.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 2, true));
        BotonParentesco.setContentAreaFilled(false);
        BotonParentesco.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonParentesco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonParentescoActionPerformed(evt);
            }
        });

        BotonMarcas.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        BotonMarcas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/categories.png"))); // NOI18N
        BotonMarcas.setText("Marcas");
        BotonMarcas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 2, true));
        BotonMarcas.setContentAreaFilled(false);
        BotonMarcas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonMarcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMarcasActionPerformed(evt);
            }
        });

        BotonMermas.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        BotonMermas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reutilizacion.png"))); // NOI18N
        BotonMermas.setText("Mermas");
        BotonMermas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 2, true));
        BotonMermas.setContentAreaFilled(false);
        BotonMermas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonMermas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMermasActionPerformed(evt);
            }
        });

        BotonAbonos.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        BotonAbonos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alcancia.png"))); // NOI18N
        BotonAbonos.setText("Abonos");
        BotonAbonos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 2, true));
        BotonAbonos.setContentAreaFilled(false);
        BotonAbonos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonAbonos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAbonosActionPerformed(evt);
            }
        });

        BotonCreditos.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        BotonCreditos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/money.png"))); // NOI18N
        BotonCreditos.setText("Credito");
        BotonCreditos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 2, true));
        BotonCreditos.setContentAreaFilled(false);
        BotonCreditos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCreditosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BotonProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonMermas, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(BotonPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BotonFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BotonParentesco, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BotonAbonos, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonMermas, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonParentesco, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonAbonos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 656, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 441, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonMarcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMarcasActionPerformed
        this.dispose();
        Marcas mar=new Marcas();
        mar.setLocationRelativeTo(this);
        mar.setVisible(true);
    }//GEN-LAST:event_BotonMarcasActionPerformed

    private void BotonVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVehiculosActionPerformed
        this.dispose();
        vehiculos vh=new vehiculos();
        vh.setLocationRelativeTo(this);
        vh.setVisible(true);
    }//GEN-LAST:event_BotonVehiculosActionPerformed

    private void BotonProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonProductosActionPerformed
        this.dispose();
        Productos PR=new Productos();
        PR.setLocationRelativeTo(this);
        PR.setVisible(true);
    }//GEN-LAST:event_BotonProductosActionPerformed

    private void BotonCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCategoriasActionPerformed
        this.dispose();
        CategoriaG Cat=new CategoriaG();
        Cat.setLocationRelativeTo(this);
        Cat.setVisible(true);
    }//GEN-LAST:event_BotonCategoriasActionPerformed

    private void BotonMermasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMermasActionPerformed
        this.dispose();
        Mermas merma=new Mermas();
        merma.setLocationRelativeTo(this);
        merma.setVisible(true);
    }//GEN-LAST:event_BotonMermasActionPerformed

    private void BotonCreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCreditosActionPerformed
        
    }//GEN-LAST:event_BotonCreditosActionPerformed

    private void BotonAbonosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAbonosActionPerformed
    
    }//GEN-LAST:event_BotonAbonosActionPerformed

    private void BotonParentescoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonParentescoActionPerformed
    parentescoG parent=new parentescoG();
    parent.setLocationRelativeTo(this);
    this.dispose();
    parent.setVisible(true); 
    }//GEN-LAST:event_BotonParentescoActionPerformed

    private void BotonFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFacturasActionPerformed
    Facturas FAC=new Facturas();
    FAC.setLocationRelativeTo(this);
    this.dispose();
    FAC.setVisible(true); 
    }//GEN-LAST:event_BotonFacturasActionPerformed

    private void BotonPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPedidosActionPerformed
    Pedidos ped=new Pedidos();
    ped.setLocationRelativeTo(this);
    this.dispose();
    ped.setVisible(true);
    }//GEN-LAST:event_BotonPedidosActionPerformed

    private void BotonClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonClientesActionPerformed
    Clientes Cli=new Clientes();
    Cli.setLocationRelativeTo(this);
    this.dispose();
    Cli.setVisible(true); 
    }//GEN-LAST:event_BotonClientesActionPerformed

    private void BotonEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEmpleadosActionPerformed
    Empleados Emp=new Empleados();
    Emp.setLocationRelativeTo(this);
    this.dispose();
    Emp.setVisible(true);
    }//GEN-LAST:event_BotonEmpleadosActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAbonos;
    private javax.swing.JButton BotonCategorias;
    private javax.swing.JButton BotonClientes;
    private javax.swing.JButton BotonCreditos;
    private javax.swing.JButton BotonEmpleados;
    private javax.swing.JButton BotonFacturas;
    private javax.swing.JButton BotonMarcas;
    private javax.swing.JButton BotonMermas;
    private javax.swing.JButton BotonParentesco;
    private javax.swing.JButton BotonPedidos;
    private javax.swing.JButton BotonProductos;
    private javax.swing.JButton BotonVehiculos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
