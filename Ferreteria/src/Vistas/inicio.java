package Vistas;

import PanelFacturas.PanelFacturas;
import Paneles.PanelCategorias;
import Paneles.PanelClientes;
import Paneles.PanelEmpleados;
import Paneles.PanelMarcas;
import Paneles.PanelParentescos;
import Paneles.PanelProductos;
import Paneles.PanelVehiculos;
import Paneles.PanelPedidos;


public class inicio extends javax.swing.JFrame {

    public inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
                
        //Recuperamos el nombre desde la Sesión Global
        String nombre = Clases.Session.getInstance().getUserName();
        String rol = Clases.Session.getInstance().getRole();
        
        //Lo ponemos en la etiqueta (puedes darle formato)
        if (nombre != null) {
            lblNombreUsuario.setText(nombre);
            // O si quieres que se vea más completo:
            // lblNombreUsuario.setText(nombre + " - " + rol);
        }
        
        // ------------------------------------------
        
        // Aquí llamas a tu método de seguridad (si ya lo pusiste)
        configurarVistaPorRol();
    }
    
    // Método para cambiar el contenido del panel derecho (panelContenido)
    private void cambiarVista(javax.swing.JPanel nuevaVista) {
        // Ajustamos el tamaño del nuevo panel al del contenedor
        nuevaVista.setSize(jPanel2.getWidth(), jPanel2.getHeight());
        nuevaVista.setLocation(0, 0);
        
        // Limpiamos y agregamos
        jPanel2.removeAll();
        jPanel2.add(nuevaVista, java.awt.BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();
    }
    
    public void configurarVistaPorRol() {
        // 1. Recuperamos la sesión (el Singleton)
        Clases.Session sesion = Clases.Session.getInstance();
        
        // Verificamos si hay alguien logueado (por seguridad)
        if (!sesion.isLoggedIn()) {
            // Si no hay sesión, cerramos esto y mandamos al Login
            this.dispose();
            new Login().setVisible(true);
            return;
        }

        // 2. Obtenemos los datos de la sesión
        String rol = sesion.getRole();     // "EMPLEADO" o "CLIENTE"
        String nombre = sesion.getUserName();

        // 3. (Opcional) Ponemos el nombre en el título o etiqueta para que se vea bonito
        if (lblNombreUsuario != null) {
             lblNombreUsuario.setText("Bienvenido: " + nombre);
        }

        // 4. REGLAS DE SEGURIDAD
        // Si el usuario es CLIENTE, ocultamos los botones administrativos
        if ("CLIENTE".equals(rol)) {
            
            btnEmpleado.setVisible(false);   
            btnCliente.setVisible(false);
            btnProducto.setVisible(false);   
            btnVehiculo.setVisible(false);
            btnFactura.setVisible(true);
            btnCategoria.setVisible(false);
            btnParentesco.setVisible(false);
            btnMarca.setVisible(false);            
            btnPedido.setVisible(true); 
            
            
        } else if ("EMPLEADO".equals(rol)) {
            // El empleado ve todo, así que nos aseguramos que estén visibles
            btnEmpleado.setVisible(true);
            btnFactura.setVisible(true);
            btnVehiculo.setVisible(true);
            btnMarca.setVisible(true);
            btnCategoria.setVisible(true);
            btnParentesco.setVisible(true);
            btnCliente.setVisible(true);
        }
    }   
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnCliente = new javax.swing.JButton();
        btnEmpleado = new javax.swing.JButton();
        btnPedido = new javax.swing.JButton();
        btnProducto = new javax.swing.JButton();
        btnVehiculo = new javax.swing.JButton();
        btnCategoria = new javax.swing.JButton();
        btnFactura = new javax.swing.JButton();
        btnParentesco = new javax.swing.JButton();
        btnMarca = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lblNombreUsuario = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 0, 51));

        btnCliente.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnCliente.setText("Clientes");
        btnCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnCliente.setContentAreaFilled(false);
        btnCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        btnEmpleado.setBackground(new java.awt.Color(255, 255, 0));
        btnEmpleado.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnEmpleado.setText("Empleado");
        btnEmpleado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnEmpleado.setContentAreaFilled(false);
        btnEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadoActionPerformed(evt);
            }
        });

        btnPedido.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnPedido.setForeground(new java.awt.Color(255, 255, 255));
        btnPedido.setText("Pedido");
        btnPedido.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnPedido.setContentAreaFilled(false);
        btnPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidoActionPerformed(evt);
            }
        });

        btnProducto.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnProducto.setText("Productos");
        btnProducto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnProducto.setContentAreaFilled(false);
        btnProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoActionPerformed(evt);
            }
        });

        btnVehiculo.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnVehiculo.setForeground(new java.awt.Color(255, 255, 255));
        btnVehiculo.setText("Vehiculos");
        btnVehiculo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnVehiculo.setContentAreaFilled(false);
        btnVehiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVehiculoActionPerformed(evt);
            }
        });

        btnCategoria.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnCategoria.setForeground(new java.awt.Color(255, 255, 255));
        btnCategoria.setText("Categorias");
        btnCategoria.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnCategoria.setContentAreaFilled(false);
        btnCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriaActionPerformed(evt);
            }
        });

        btnFactura.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnFactura.setForeground(new java.awt.Color(255, 255, 255));
        btnFactura.setText("Facturas");
        btnFactura.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnFactura.setContentAreaFilled(false);
        btnFactura.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturaActionPerformed(evt);
            }
        });

        btnParentesco.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnParentesco.setForeground(new java.awt.Color(255, 255, 255));
        btnParentesco.setText("Parentesco");
        btnParentesco.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnParentesco.setContentAreaFilled(false);
        btnParentesco.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnParentesco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParentescoActionPerformed(evt);
            }
        });

        btnMarca.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnMarca.setForeground(new java.awt.Color(255, 255, 255));
        btnMarca.setText("Marcas");
        btnMarca.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnMarca.setContentAreaFilled(false);
        btnMarca.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarcaActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/personas.png"))); // NOI18N

        lblNombreUsuario.setText("jLabel1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnParentesco, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addComponent(lblNombreUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(lblNombreUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEmpleado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPedido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVehiculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFactura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCategoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnParentesco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMarca)
                .addGap(52, 52, 52))
        );

        jPanel1.setBackground(new java.awt.Color(255, 0, 51));
        jPanel1.setForeground(new java.awt.Color(255, 51, 51));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bienvenido a ferreweb");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jLabel2)
                .addContainerGap(248, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
    cambiarVista(new PanelClientes());
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadoActionPerformed
        cambiarVista(new PanelEmpleados());
    }//GEN-LAST:event_btnEmpleadoActionPerformed

    private void btnPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidoActionPerformed
        cambiarVista(new PanelPedidos());
    }//GEN-LAST:event_btnPedidoActionPerformed

    private void btnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoActionPerformed
        cambiarVista(new PanelProductos());
    }//GEN-LAST:event_btnProductoActionPerformed

    private void btnVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVehiculoActionPerformed
        cambiarVista(new PanelVehiculos());
    }//GEN-LAST:event_btnVehiculoActionPerformed

    private void btnCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaActionPerformed
        cambiarVista(new PanelCategorias());
    }//GEN-LAST:event_btnCategoriaActionPerformed

    private void btnFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturaActionPerformed
        cambiarVista(new PanelFacturas());
    }//GEN-LAST:event_btnFacturaActionPerformed

    private void btnParentescoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParentescoActionPerformed
        cambiarVista(new PanelParentescos());
    }//GEN-LAST:event_btnParentescoActionPerformed

    private void btnMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarcaActionPerformed
        cambiarVista(new PanelMarcas());
    }//GEN-LAST:event_btnMarcaActionPerformed

    
    
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
    private javax.swing.JButton btnCategoria;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnEmpleado;
    private javax.swing.JButton btnFactura;
    private javax.swing.JButton btnMarca;
    private javax.swing.JButton btnParentesco;
    private javax.swing.JButton btnPedido;
    private javax.swing.JButton btnProducto;
    private javax.swing.JButton btnVehiculo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
