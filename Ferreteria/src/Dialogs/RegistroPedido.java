package Dialogs;

import Clases.Producto;
import Clases.Session;
import DAO.PedidoDAO;
import DAO.ProductoDAO;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class RegistroPedido extends javax.swing.JDialog {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(RegistroPedido.class.getName());
    private DefaultTableModel modeloCarrito;
    private DefaultComboBoxModel<String> modeloComboBusqueda;
    private List<Producto> productosEncontrados = new ArrayList<>();
    private Producto productoSeleccionado = null;
    private double totalCompra = 0.0;
    
    public RegistroPedido(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(parent);
        configurarComponentes();
        cargarDatosClienteLogueado();
    }
    
    // --- AGREGAR ESTE MÉTODO ---
    private void cargarDatosClienteLogueado() {
        Clases.Session sesion = Clases.Session.getInstance();
        
        // Solo si es CLIENTE intentamos llenar datos
        if ("CLIENTE".equals(sesion.getRole())) {
            try {
                // 1. Buscamos los datos completos en la BD usando el ID de sesión
                DAO.ClienteDAO dao = new DAO.ClienteDAO();
                Clases.Cliente c = dao.obtenerClientePorId(sesion.getUserId());
                
                if (c != null) {
                    // 2. Llenamos los campos automáticamente
                    txtClienteNombre.setText(c.getNombre() + " " + c.getPrimerApellido());
                    txtCalle.setText(c.getDomicilio()); // Asumiendo que 'domicilio' es la calle
                    txtNumero.setText(c.getNumero());
                    txtCP.setText(c.getCp());
                    
                    // Opcional: Bloquear nombre para que no compren a nombre de otro
                    txtClienteNombre.setEnabled(false);
                }
            } catch (Exception e) {
                System.out.println("No se pudieron cargar los datos del cliente: " + e.getMessage());
            }
        } else {
            // Si es EMPLEADO, dejamos los campos vacíos o habilitados para que él escriba
            txtClienteNombre.setEnabled(true); 
        }
    }

    private void configurarComponentes() {
        // 1. Configurar Tabla del Carrito
        modeloCarrito = new DefaultTableModel(
            new Object[]{"ID", "Producto", "Precio U.", "Cant.", "Subtotal"}, 0
        ) {
            @Override // Tabla no editable
            public boolean isCellEditable(int row, int column) { return false; }
        };
        tablaCarrito.setModel(modeloCarrito);

        // 2. Configurar ComboBox de Resultados (ADAPTADO)
        modeloComboBusqueda = new DefaultComboBoxModel<>();
        listaResultados.setModel(modeloComboBusqueda);

        // 3. Evento de búsqueda al escribir en el campo de texto
        txtBuscarProducto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                buscarProductos(txtBuscarProducto.getText());
            }
        });
        
        // 4. Evento al seleccionar un ítem del ComboBox (ADAPTADO)
        listaResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // Si hay selección válida, cargamos el producto
                if (listaResultados.getSelectedIndex() != -1) {
                    seleccionarProducto(listaResultados.getSelectedIndex());
                }
            }
        });
        
        // 5. Pre-cargar datos del cliente si es Cliente
        if ("CLIENTE".equals(Session.getInstance().getRole())) {
            if (txtClienteNombre != null) { // Validación por si acaso
                txtClienteNombre.setText(Session.getInstance().getUserName());
                txtClienteNombre.setEnabled(false);
            }
        }
    }

    // --- LÓGICA DE BÚSQUEDA (El filtro "cl = clavos") ---
    private void buscarProductos(String texto) {
        modeloComboBusqueda.removeAllElements();
        productosEncontrados.clear();
        productoSeleccionado = null;
        
        if (texto.trim().isEmpty()) return;

        try {
            ProductoDAO dao = new ProductoDAO();
            productosEncontrados = dao.buscarProductosPorNombre(texto); 
            
            for (Producto p : productosEncontrados) {
                String item = p.getNombre() + " - $" + p.getPrecioVenta() + " (Stock: " + p.getCantidad() + ")";
                modeloComboBusqueda.addElement(item);
            }
            
            // Truco visual: Si hay resultados, desplegamos el combo automáticamente
            if (modeloComboBusqueda.getSize() > 0) {
                listaResultados.showPopup();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void seleccionarProducto(int index) {
        if (index >= 0 && index < productosEncontrados.size()) {
            productoSeleccionado = productosEncontrados.get(index);
            // Al seleccionar, pasamos el foco a la cantidad para escribir rápido
            txtCantidad.requestFocus();
            txtCantidad.selectAll();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscarProducto = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCarrito = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtClienteNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCalle = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCP = new javax.swing.JTextField();
        lblTotal = new javax.swing.JLabel();
        btnFinalizar = new javax.swing.JButton();
        listaResultados = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setText("Producto:");

        txtCantidad.setText("1");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setText("Cantidad:");

        btnAgregar.setBackground(new java.awt.Color(255, 0, 51));
        btnAgregar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar al pedido");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        tablaCarrito.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaCarrito);

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setText("Datos de la entrega");

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setText("Cliente:");

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel5.setText("Calle");

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel6.setText("N.o");

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel7.setText("Codigo Postal");

        lblTotal.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblTotal.setText("Total a pagar: $0.0");

        btnFinalizar.setBackground(new java.awt.Color(255, 0, 0));
        btnFinalizar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnFinalizar.setForeground(new java.awt.Color(255, 255, 255));
        btnFinalizar.setText("Finalizar Compra");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        listaResultados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtBuscarProducto, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtCantidad, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(listaResultados, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnAgregar)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addGap(18, 18, 18)))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(204, 204, 204)
                                        .addComponent(lblTotal))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(129, 129, 129)
                                        .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtClienteNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCP, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(86, 86, 86)
                                        .addComponent(jLabel7)))
                                .addGap(42, 42, 42))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(156, 156, 156))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(listaResultados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtClienteNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (productoSeleccionado == null) {
            JOptionPane.showMessageDialog(this, "Seleccione un producto del buscador.");
            return;
        }
        
        try {
            int cantidad = Integer.parseInt(txtCantidad.getText());
            if (cantidad <= 0) throw new NumberFormatException();
            
            // Validar Stock
            if (cantidad > productoSeleccionado.getCantidad()) {
                JOptionPane.showMessageDialog(this, "Stock insuficiente. Disponible: " + productoSeleccionado.getCantidad());
                return;
            }

            double subtotal = productoSeleccionado.getPrecioVenta() * cantidad;
            
            // Agregar a la tabla
            modeloCarrito.addRow(new Object[]{
                productoSeleccionado.getIdProducto(),
                productoSeleccionado.getNombre(),
                productoSeleccionado.getPrecioVenta(),
                cantidad,
                subtotal
            });
            
            // Actualizar Total
            totalCompra += subtotal;
            lblTotal.setText("Total: $" + String.format("%.2f", totalCompra));
            
            // Limpiar para el siguiente
            txtBuscarProducto.setText("");
            modeloComboBusqueda.removeAllElements(); // Limpiamos el combo
            txtCantidad.setText("1");
            txtBuscarProducto.requestFocus();
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Cantidad inválida.");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        if (modeloCarrito.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "El carrito está vacío.");
            return;
        }
        
        // Validar dirección solo si el campo existe y no está vacío
        if (txtCalle.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "La dirección de entrega es obligatoria.");
            return;
        }

        try {
            PedidoDAO dao = new PedidoDAO();
            int nuevoIdPedido = dao.obtenerUltimoIdPedido() + 1;
            int idCliente = Session.getInstance().getUserId(); 
            
            // 1. Insertar Encabezado
            // Nota: Tu DAO actual pide (id, idCliente, total). 
            // Si quieres guardar dirección, debes modificar el DAO. Por ahora usamos el que tienes.
            if (dao.insertarPedidoEncabezado(nuevoIdPedido, idCliente, totalCompra)) {
                
                // 2. Insertar Detalles
                for (int i = 0; i < modeloCarrito.getRowCount(); i++) {
                    int idProd = (int) modeloCarrito.getValueAt(i, 0);
                    // Convertimos a Double y Int con seguridad
                    double precio = Double.parseDouble(modeloCarrito.getValueAt(i, 2).toString());
                    int cant = Integer.parseInt(modeloCarrito.getValueAt(i, 3).toString());
                    
                    dao.insertarPedidoDetalle(nuevoIdPedido, idProd, cant, precio);
                    
                    // Opcional: Aquí deberías llamar a productoDAO.actualizarCantidad(idProd, -cant) 
                    // para restar del inventario real.
                }
                
                JOptionPane.showMessageDialog(this, "¡Pedido realizado con éxito!\nFolio: " + nuevoIdPedido);
                this.dispose(); 
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al guardar pedido: " + e.getMessage());
        }
    }//GEN-LAST:event_btnFinalizarActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                RegistroPedido dialog = new RegistroPedido(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JComboBox<String> listaResultados;
    private javax.swing.JTable tablaCarrito;
    private javax.swing.JTextField txtBuscarProducto;
    private javax.swing.JTextField txtCP;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtClienteNombre;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
