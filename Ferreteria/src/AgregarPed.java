import Clases.Cliente;
import DAO.ClienteDAO;
import DAO.PedidoDAO;
import Clases.Producto;
import DAO.ProductoDAO;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class AgregarPed extends javax.swing.JFrame {

   DefaultTableModel modeloTabla = new DefaultTableModel();
   
    public AgregarPed() {
        initComponents();
        String[] encabezadosTabla=new String[]{"ID_Producto","Nombre","Costo"};
        modeloTabla.setColumnIdentifiers(encabezadosTabla);
        Tablaproductos.setModel(modeloTabla);
        
        DefaultTableModel modeloLista = new DefaultTableModel(new String[]{"ID Producto", "Nombre", "Costo", "Cantidad", "Total"}, 0);
        TablaLista.setModel(modeloLista);
        
        TablaLista.getModel().addTableModelListener(e -> {
        if (e.getType() == javax.swing.event.TableModelEvent.UPDATE) {
            int fila = e.getFirstRow(); // Fila modificada
            int columna = e.getColumn(); // Columna modificada

            if (columna == 3) { // Si se modificó la columna de "Cantidad"
                try {
                    int cantidad = Integer.parseInt(TablaLista.getValueAt(fila, 3).toString());
                    double costo = Double.parseDouble(TablaLista.getValueAt(fila, 2).toString());
                    double total = cantidad * costo;
                    TablaLista.setValueAt(total, fila, 4); // Actualizar columna "Total"
                } catch (NumberFormatException ex) {
                    javax.swing.JOptionPane.showMessageDialog(this, "Ingrese un valor numérico válido en Cantidad.");
                    TablaLista.setValueAt(0, fila, 3); // Restablecer la cantidad si no es válida
                }
            }
        }
    });
        
        llenar_tabla();
        
    }

    public void llenar_tabla() {
    modeloTabla.setRowCount(0); // Limpiar tabla
    ProductoDAO productoDAO = new ProductoDAO();
    List<Producto> productos = null;

    try {
        productos = productoDAO.ObtenerProductos(); // Llamar al DAO para obtener la lista
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error al obtener productos: " + e.getMessage());
        return;
    }

    for (Producto producto : productos) {
        Object[] fila = {
            producto.getIdProducto(),
            producto.getNombre(),    
            producto.getPrecioVenta() 
        };
        modeloTabla.addRow(fila); 
    }
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tablaproductos = new javax.swing.JTable();
        regresarBoton = new javax.swing.JButton();
        BotonConfirmar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaLista = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        BotonListar1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel10.setBackground(new java.awt.Color(255, 0, 51));
        jPanel10.setForeground(new java.awt.Color(255, 51, 51));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Pedidos");

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

        Tablaproductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        Tablaproductos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        Tablaproductos.setSelectionBackground(new java.awt.Color(255, 102, 102));
        jScrollPane1.setViewportView(Tablaproductos);

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

        BotonConfirmar.setBackground(new java.awt.Color(255, 255, 255));
        BotonConfirmar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        BotonConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG2/add.png"))); // NOI18N
        BotonConfirmar.setText("Confirmar pedido");
        BotonConfirmar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 2, true));
        BotonConfirmar.setContentAreaFilled(false);
        BotonConfirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConfirmarActionPerformed(evt);
            }
        });

        TablaLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        TablaLista.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        TablaLista.setSelectionBackground(new java.awt.Color(255, 102, 102));
        jScrollPane2.setViewportView(TablaLista);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Mi lista de pedido");

        BotonListar1.setBackground(new java.awt.Color(255, 255, 255));
        BotonListar1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        BotonListar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG2/add.png"))); // NOI18N
        BotonListar1.setText("Agregar a la lista");
        BotonListar1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 2, true));
        BotonListar1.setContentAreaFilled(false);
        BotonListar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonListar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonListar1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Id cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BotonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(regresarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonListar1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonListar1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(regresarBoton)
                    .addComponent(BotonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarBotonActionPerformed
        this.dispose();
        inicio Inicio=new inicio();
        Inicio.setLocationRelativeTo(this);
        Inicio.setVisible(true);
    }//GEN-LAST:event_regresarBotonActionPerformed

    private void BotonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConfirmarActionPerformed
    // Validar que haya productos en la lista y que el campo ID no esté vacío
    DefaultTableModel modeloLista = (DefaultTableModel) TablaLista.getModel();
    if (modeloLista.getRowCount() == 0) {
        javax.swing.JOptionPane.showMessageDialog(this, "No hay productos en la lista.");
        return;
    }
    if (id.getText().isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Debe ingresar el ID del cliente.");
        return;
    }
    int idCliente;
    try {
        idCliente = Integer.parseInt(id.getText()); // Obtener el ID del cliente del JTextField
    } catch (NumberFormatException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "El ID del cliente debe ser un número válido.");
        return;
    }
    try {
        // Crear instancias de DAO
        PedidoDAO pedidoDAO = new PedidoDAO();
        ClienteDAO clienteDAO = new ClienteDAO();
        // Consultar datos del cliente
        Cliente cliente = clienteDAO.obtenerClientePorId(idCliente);
        if (cliente == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "No se encontró un cliente con el ID proporcionado.");
            return;
        }
        // Generar un nuevo ID de pedido
        int nuevoIdPedido = pedidoDAO.obtenerUltimoIdPedido() + 1;
        // Calcular el total del pedido
        double total = 0;
        for (int i = 0; i < modeloLista.getRowCount(); i++) {
            int cantidad = Integer.parseInt(modeloLista.getValueAt(i, 3).toString());
            double precio = Double.parseDouble(modeloLista.getValueAt(i, 2).toString());
            total += cantidad * precio;
        }
        // Insertar el encabezado del pedido
        pedidoDAO.insertarPedidoEncabezado(nuevoIdPedido, idCliente, total);
        // Insertar los detalles del pedido
        for (int i = 0; i < modeloLista.getRowCount(); i++) {
            int idProducto = Integer.parseInt(modeloLista.getValueAt(i, 0).toString());
            int cantidad = Integer.parseInt(modeloLista.getValueAt(i, 3).toString());
            double precio = Double.parseDouble(modeloLista.getValueAt(i, 2).toString());
            pedidoDAO.insertarPedidoDetalle(nuevoIdPedido, idProducto, cantidad, precio);
        }

        javax.swing.JOptionPane.showMessageDialog(this, "Pedido registrado con éxito.");
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error al confirmar pedido: " + e.getMessage());
      }
    }//GEN-LAST:event_BotonConfirmarActionPerformed

    private void BotonListar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonListar1ActionPerformed
        int filaSeleccionada = Tablaproductos.getSelectedRow(); // Verificar fila seleccionada
    if (filaSeleccionada != -1) {
        String idProducto = modeloTabla.getValueAt(filaSeleccionada, 0).toString();
        String nombre = modeloTabla.getValueAt(filaSeleccionada, 1).toString();
        String costo = modeloTabla.getValueAt(filaSeleccionada, 2).toString();
        // Verificar si el producto ya está en la lista
        boolean productoYaEnLista = false;
        for (int i = 0; i < TablaLista.getRowCount(); i++) {
            if (TablaLista.getValueAt(i, 0).toString().equals(idProducto)) {
                productoYaEnLista = true;
                break;
            }
        }
        if (!productoYaEnLista) {
            // Agrega el producto a la tabla lista
            DefaultTableModel modeloLista = (DefaultTableModel) TablaLista.getModel();
            modeloLista.addRow(new Object[]{idProducto, nombre, costo, 0, 0}); // Cantidad y total inicializados a 0
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "El producto ya está en la lista.");
        }
    } else {
        javax.swing.JOptionPane.showMessageDialog(this, "Seleccione un producto.");
    }
    }//GEN-LAST:event_BotonListar1ActionPerformed

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
    private javax.swing.JButton BotonConfirmar;
    private javax.swing.JButton BotonListar1;
    private javax.swing.JTable TablaLista;
    private javax.swing.JTable Tablaproductos;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton regresarBoton;
    // End of variables declaration//GEN-END:variables
}
