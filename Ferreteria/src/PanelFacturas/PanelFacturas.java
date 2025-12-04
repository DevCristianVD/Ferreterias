package PanelFacturas;

import Clases.Pedido;
import Clases.Session;
import DAO.PedidoDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class PanelFacturas extends javax.swing.JPanel {

    DefaultTableModel modelo;
    
    public PanelFacturas() {
        initComponents();
        configurarTabla();
        llenarTabla();
    }

    private void configurarTabla() {
        // Mostramos solo lo necesario para identificar el pedido
        modelo = new DefaultTableModel(new String[]{"ID Pedido", "Total", "Estado"}, 0) {
            @Override public boolean isCellEditable(int row, int col) { return false; }
        };
        tablaPedidosFacturar.setModel(modelo);
    }

    public void llenarTabla() {
        modelo.setRowCount(0);
        PedidoDAO dao = new PedidoDAO();
        List<Pedido> lista;
        
        // Si es CLIENTE, solo ve los suyos. Si es EMPLEADO, ve todos.
        if ("CLIENTE".equals(Session.getInstance().getRole())) {
            lista = dao.obtenerPedidosPorCliente(Session.getInstance().getUserId());
        } else {
            lista = dao.obtenerTodosLosPedidos();
        }

        for (Pedido p : lista) {
            modelo.addRow(new Object[]{
                p.getIdPedido(),
                String.format("$ %.2f", p.getTotal()),
                "Pendiente" // O el estado real si lo tienes en BD
            });
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPedidosFacturar = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 30)); // NOI18N
        jLabel5.setText("Facturas");

        tablaPedidosFacturar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        tablaPedidosFacturar.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tablaPedidosFacturar.setSelectionBackground(new java.awt.Color(255, 102, 102));
        jScrollPane1.setViewportView(tablaPedidosFacturar);

        btnAgregar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG2/add.png"))); // NOI18N
        btnAgregar.setText("Generar Factura");
        btnAgregar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 2, true));
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(271, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(303, 303, 303))
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(287, Short.MAX_VALUE)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(8, 8, 8)
                    .addComponent(jLabel5)
                    .addGap(34, 34, 34)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(78, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int fila = tablaPedidosFacturar.getSelectedRow();
        
        if (fila >= 0) {
            int idPedido = (int) tablaPedidosFacturar.getValueAt(fila, 0);
            double total = Double.parseDouble(
                tablaPedidosFacturar.getValueAt(fila, 1).toString().replace("$", "").replace(",", "").trim()
            );
            
            // Abrir la vista previa de la factura
            javax.swing.JFrame frame = (javax.swing.JFrame) javax.swing.SwingUtilities.getWindowAncestor(this);
            Dialogs.VistaFactura factura = new Dialogs.VistaFactura(frame, true, idPedido, total);
            factura.setVisible(true);
            
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un pedido para facturar.");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPedidosFacturar;
    // End of variables declaration//GEN-END:variables
}
