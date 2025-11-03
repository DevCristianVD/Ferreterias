import Clases.Merma;
import DAO.MermasDAO;
import Clases.Producto;
import DAO.ProductoDAO;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class AgregarMerma extends javax.swing.JFrame {

    DefaultTableModel modeloTabla = new DefaultTableModel();
    DefaultTableModel modeloMermas = new DefaultTableModel();
    
    public AgregarMerma() {
        initComponents();
        String[] encabezadosTabla=new String[]{"ID_PRODUCTO","NOMBRE","MARCA","PRECIO_ VENTA","EXISTENCIA"};
        modeloTabla.setColumnIdentifiers(encabezadosTabla);
        TablaProductos.setModel(modeloTabla);
        
        String[] encabezadosMermas = new String[]{"ID_PRODUCTO", "NOMBRE", "PRECIO_MERMA", "CANTIDAD"};
        modeloMermas.setColumnIdentifiers(encabezadosMermas);
        TablaMermas.setModel(modeloMermas);
        
        modeloMermas.addTableModelListener(e -> {
        if (e.getType() == javax.swing.event.TableModelEvent.UPDATE) {
        int fila = e.getFirstRow(); // Fila modificada
        int columna = e.getColumn(); // Columna modificada
        // Verifica si la columna editada es "Cantidad" (índice 3)
        if (columna == 3) {
            try {
                double cantidad = Double.parseDouble(modeloMermas.getValueAt(fila, columna).toString());
                if (cantidad < 0) {
                    javax.swing.JOptionPane.showMessageDialog(null, "La cantidad no puede ser negativa.");
                    modeloMermas.setValueAt(0, fila, columna); // Restablecer cantidad inválida a 0
                }
            } catch (NumberFormatException ex) {
                javax.swing.JOptionPane.showMessageDialog(null, "Ingrese un valor numérico válido.");
                modeloMermas.setValueAt(0, fila, columna); // Restablecer a 0 si el valor no es válido
            }
        }
        }
        });
        
        llenarTabla();
    }
    
    public boolean isCellEditable(int row, int column) {
        // Solo permite editar la columna "Cantidad" (columna 3, basada en índice)
        return column == 3; 
    }
    
    
    
    public void llenarTabla() {
        modeloTabla.setRowCount(0); // Limpiar la tabla
        ProductoDAO productoDAO = new ProductoDAO();
        try {
            List<Producto> productos = productoDAO.obtenerProductos();
            for (Producto producto : productos) {
                Object[] fila = {
                    producto.getIdProducto(),
                    producto.getNombre(),
                    producto.getIdMarca(),
                    producto.getPrecioVenta(),
                    producto.getCantidad()
                };
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BotonGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaMermas = new javax.swing.JTable();
        BotonAgregarMerma = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        regresarBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFocusCycleRoot(true);

        jPanel2.setBackground(new java.awt.Color(255, 0, 51));
        jPanel2.setForeground(new java.awt.Color(255, 51, 51));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Agregar Categoria");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(243, 243, 243))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(22, 22, 22))
        );

        BotonGuardar.setBackground(new java.awt.Color(255, 255, 255));
        BotonGuardar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        BotonGuardar.setText("Guardar");
        BotonGuardar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 2, true));
        BotonGuardar.setContentAreaFilled(false);
        BotonGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });

        TablaMermas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        TablaMermas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        TablaMermas.setSelectionBackground(new java.awt.Color(255, 102, 102));
        jScrollPane1.setViewportView(TablaMermas);

        BotonAgregarMerma.setBackground(new java.awt.Color(255, 255, 255));
        BotonAgregarMerma.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        BotonAgregarMerma.setText("Agregar a merma");
        BotonAgregarMerma.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 2, true));
        BotonAgregarMerma.setContentAreaFilled(false);
        BotonAgregarMerma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonAgregarMerma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarMermaActionPerformed(evt);
            }
        });

        TablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        TablaProductos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        TablaProductos.setSelectionBackground(new java.awt.Color(255, 102, 102));
        jScrollPane2.setViewportView(TablaProductos);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("TABLA MERMAS");

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
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(BotonAgregarMerma, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(313, 313, 313)
                .addComponent(BotonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(regresarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BotonAgregarMerma, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(regresarBoton)))
                .addGap(13, 13, 13))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(162, 162, 162)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(246, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
    MermasDAO mermaDAO = new MermasDAO();
    ProductoDAO productoDAO = new ProductoDAO();

    try {
        for (int i = 0; i < modeloMermas.getRowCount(); i++) {
            int idProducto = (int) modeloMermas.getValueAt(i, 0);
            String nombre = (String) modeloMermas.getValueAt(i, 1);
            double precioMerma = Double.parseDouble(modeloMermas.getValueAt(i, 2).toString());
            double cantidad = Double.parseDouble(modeloMermas.getValueAt(i, 3).toString());

            if (cantidad <= 0) {
                javax.swing.JOptionPane.showMessageDialog(this, "La cantidad para el producto " + nombre + " debe ser mayor a 0.");
                continue;
            }

            // Crear y guardar el registro de la merma
            Merma merma = new Merma(idProducto, nombre, precioMerma, cantidad);
            if (mermaDAO.insertarMerma(merma)) {
                // Actualizar el inventario restando la cantidad
                productoDAO.actualizarCantidad(idProducto, -cantidad);
            }
        }

        javax.swing.JOptionPane.showMessageDialog(this, "Mermas guardadas correctamente.");
        llenarTabla(); // Refrescar tabla de productos
        modeloMermas.setRowCount(0); // Limpiar tabla de mermas
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error al guardar las mermas: " + e.getMessage());
    }
    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void BotonAgregarMermaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarMermaActionPerformed
        int filaSeleccionada = TablaProductos.getSelectedRow();
        if (filaSeleccionada != -1) {
            int idProducto = (int) modeloTabla.getValueAt(filaSeleccionada, 0);
            String nombre = (String) modeloTabla.getValueAt(filaSeleccionada, 1);

            // Agregar el producto seleccionado a la tabla de mermas
            modeloMermas.addRow(new Object[]{idProducto, nombre, 0.0, 0.0}); // Precio y cantidad inicializados a 0
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Seleccione un producto para agregar a la tabla de mermas.");
        }
    }//GEN-LAST:event_BotonAgregarMermaActionPerformed

    private void regresarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarBotonActionPerformed
        this.dispose();
        Mermas MER=new Mermas();
        MER.setLocationRelativeTo(this);
        MER.setVisible(true);
    }//GEN-LAST:event_regresarBotonActionPerformed

  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarParentesco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAgregarMerma;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JTable TablaMermas;
    private javax.swing.JTable TablaProductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton regresarBoton;
    // End of variables declaration//GEN-END:variables
}
