import Clases.Empleado;
import DAO.EmpleadoDAO;
import Clases.Parentesco;
import DAO.ParentescoDAO;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegistroEmpleado extends javax.swing.JFrame {

    private Map<String, Integer> parentescoMap = new HashMap<>();
    
    public RegistroEmpleado() {
        initComponents();
        llenarComboBoxParentesco();
    }
    
      private boolean validarCampos() {
    return !nombretxt.getText().isEmpty() &&
           !apellidotxt.getText().isEmpty() &&
           !apellido2txt.getText().isEmpty() &&
           !telefontxt.getText().isEmpty() &&
           !fechaNtxt.getText().isEmpty() &&
           !domiciliotxt.getText().isEmpty() &&
           !Nocasatxt.getText().isEmpty() &&
           !localidadtxt.getText().isEmpty() &&
           Horariobox.getSelectedItem() != null && // Validar que se haya seleccionado un horario
           !FechaIntxt.getText().isEmpty() &&
           !nombreCtxt.getText().isEmpty() &&
           Parbox.getSelectedItem() != null && // Validar que se haya seleccionado un parentesco
           !telefonoC.getText().isEmpty();
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        apellido2txt = new javax.swing.JTextField();
        Nocasatxt = new javax.swing.JTextField();
        telefontxt = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        localidadtxt = new javax.swing.JTextField();
        fechaNtxt = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        nombretxt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        apellidotxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        domiciliotxt = new javax.swing.JTextField();
        BotonGuardarC = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        Horariobox = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        nombreCtxt = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        FechaIntxt = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        Parbox = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        telefonoC = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        apellido2txt.setBackground(new java.awt.Color(255, 255, 255));
        apellido2txt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        apellido2txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellido2txtActionPerformed(evt);
            }
        });

        Nocasatxt.setBackground(new java.awt.Color(255, 255, 255));
        Nocasatxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Nocasatxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NocasatxtActionPerformed(evt);
            }
        });

        telefontxt.setBackground(new java.awt.Color(255, 255, 255));
        telefontxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        telefontxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefontxtActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Fecha nacimiento");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre:");

        localidadtxt.setBackground(new java.awt.Color(255, 255, 255));
        localidadtxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        localidadtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localidadtxtActionPerformed(evt);
            }
        });

        fechaNtxt.setBackground(new java.awt.Color(255, 255, 255));
        fechaNtxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        fechaNtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaNtxtActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("No. casa");

        jLabel16.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Primer apellido:");

        nombretxt.setBackground(new java.awt.Color(255, 255, 255));
        nombretxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nombretxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombretxtActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Localidad");

        jLabel14.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Segundo apellido:");

        jPanel10.setBackground(new java.awt.Color(255, 0, 51));
        jPanel10.setForeground(new java.awt.Color(255, 51, 51));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Registro de empleados");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(154, 154, 154))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        apellidotxt.setBackground(new java.awt.Color(255, 255, 255));
        apellidotxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        apellidotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidotxtActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Telefono");

        jLabel13.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Horario");

        domiciliotxt.setBackground(new java.awt.Color(255, 255, 255));
        domiciliotxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        domiciliotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                domiciliotxtActionPerformed(evt);
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

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Domicilio");

        Horariobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matutino", "Vespertino", "Nocturno" }));

        jLabel19.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Parentesco");

        nombreCtxt.setBackground(new java.awt.Color(255, 255, 255));
        nombreCtxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nombreCtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreCtxtActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Fecha ingreso");

        FechaIntxt.setBackground(new java.awt.Color(255, 255, 255));
        FechaIntxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        FechaIntxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaIntxtActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Nombre de contacto");

        Parbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParboxActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Telefono");

        telefonoC.setBackground(new java.awt.Color(255, 255, 255));
        telefonoC.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        telefonoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Nocasatxt))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(domiciliotxt))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechaNtxt))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(telefontxt))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(apellido2txt))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(apellidotxt))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel15))
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Horariobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(localidadtxt))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombreCtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                            .addComponent(telefonoC))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel11)))
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(Parbox, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonGuardarC, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(271, 271, 271))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(490, Short.MAX_VALUE)
                    .addComponent(jLabel20)
                    .addGap(88, 88, 88)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(418, Short.MAX_VALUE)
                    .addComponent(FechaIntxt, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(19, 19, 19)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(473, Short.MAX_VALUE)
                    .addComponent(jLabel21)
                    .addGap(58, 58, 58)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(apellidotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(apellido2txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(telefontxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nombreCtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(fechaNtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(domiciliotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Parbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(Nocasatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(localidadtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefonoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(Horariobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BotonGuardarC, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(118, 118, 118)
                    .addComponent(jLabel20)
                    .addContainerGap(373, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(158, 158, 158)
                    .addComponent(FechaIntxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(330, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(195, 195, 195)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(296, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void apellido2txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellido2txtActionPerformed
        
    }//GEN-LAST:event_apellido2txtActionPerformed

    private void NocasatxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NocasatxtActionPerformed
        
    }//GEN-LAST:event_NocasatxtActionPerformed

    private void telefontxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefontxtActionPerformed
        
    }//GEN-LAST:event_telefontxtActionPerformed

    private void localidadtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localidadtxtActionPerformed
        
    }//GEN-LAST:event_localidadtxtActionPerformed

    private void fechaNtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaNtxtActionPerformed
        
    }//GEN-LAST:event_fechaNtxtActionPerformed

    private void nombretxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombretxtActionPerformed
        
    }//GEN-LAST:event_nombretxtActionPerformed

    private void apellidotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidotxtActionPerformed
        
    }//GEN-LAST:event_apellidotxtActionPerformed

    private void domiciliotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_domiciliotxtActionPerformed
        
    }//GEN-LAST:event_domiciliotxtActionPerformed

    private void BotonGuardarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarCActionPerformed
        if (!validarCampos()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
        return;
    }

    try {
        EmpleadoDAO empleadoDAO = new EmpleadoDAO();
        int nuevoCodigo = empleadoDAO.obtenerUltimoIdEmpleado() + 1;

        // Obtener el ID del parentesco seleccionado
        String parentescoSeleccionado = (String) Parbox.getSelectedItem();
        int idParentesco = parentescoMap.get(parentescoSeleccionado); // Buscar el ID en el mapa

        Empleado empleado = new Empleado(
            nuevoCodigo, nombretxt.getText(), apellidotxt.getText(), apellido2txt.getText(),
            telefontxt.getText(), fechaNtxt.getText(), domiciliotxt.getText(), Nocasatxt.getText(),
            localidadtxt.getText(), (String) Horariobox.getSelectedItem(), FechaIntxt.getText(),
            nombreCtxt.getText(), Integer.toString(idParentesco), telefonoC.getText() // Usar el ID en lugar del nombre
        );

        if (empleadoDAO.insertarEmpleado(empleado)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Empleado registrado con éxito.");
            this.dispose();
            Empleados empleados = new Empleados(); 
            empleados.setLocationRelativeTo(null); 
            empleados.setVisible(true); 
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Error al registrar empleado.");
        }
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
    }//GEN-LAST:event_BotonGuardarCActionPerformed

    private void nombreCtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreCtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreCtxtActionPerformed

    private void FechaIntxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaIntxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaIntxtActionPerformed

    private void telefonoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoCActionPerformed

    private void llenarComboBoxParentesco() {
     try {
        ParentescoDAO parentescoDAO = new ParentescoDAO();
        List<Parentesco> listaParentescos = parentescoDAO.obtenerParentescos(); // Modifica el DAO para devolver objetos completos

        Parbox.removeAllItems(); // Limpiar el combo box
        parentescoMap.clear(); // Limpiar el mapa

        for (Parentesco p : listaParentescos) {
            Parbox.addItem(p.getNombre()); // Agrega el nombre al combo box
            parentescoMap.put(p.getNombre(), p.getIdParentesco()); // Relaciona el nombre con su ID
        }
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error al llenar el combo box: " + e.getMessage());
    }
}
    
    private void ParboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParboxActionPerformed
    String seleccionado = (String) Parbox.getSelectedItem();
    System.out.println("Seleccionaste: " + seleccionado);
    }//GEN-LAST:event_ParboxActionPerformed

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
    private javax.swing.JTextField FechaIntxt;
    private javax.swing.JComboBox<String> Horariobox;
    private javax.swing.JTextField Nocasatxt;
    private javax.swing.JComboBox<String> Parbox;
    private javax.swing.JTextField apellido2txt;
    private javax.swing.JTextField apellidotxt;
    private javax.swing.JTextField domiciliotxt;
    private javax.swing.JTextField fechaNtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField localidadtxt;
    private javax.swing.JTextField nombreCtxt;
    private javax.swing.JTextField nombretxt;
    private javax.swing.JTextField telefonoC;
    private javax.swing.JTextField telefontxt;
    // End of variables declaration//GEN-END:variables
}
