package Dialogs;

import Vistas.RegistroClientes;
import Clases.Empleado;
import DAO.EmpleadoDAO;
import Clases.Parentesco;
import DAO.ParentescoDAO;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

public class actualizarEmpleados extends javax.swing.JDialog {

    private Map<String, Integer> parentescoMap = new HashMap<>();
    private int idEmpleadoActual = -1; // -1 = Nuevo, >0 = Editar
    
    public actualizarEmpleados(java.awt.Frame parent, boolean modal, int idEmpleado) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(parent);
        this.idEmpleadoActual = idEmpleado;
        
        llenarComboBoxParentesco();
        configurarVista();
    }
    
     private void configurarVista() {
        if (idEmpleadoActual > 0) {
            // MODO EDICIÓN
            jLabel5.setText("Actualizar Empleado");
            BotonGuardarC.setText("Actualizar");
            cargarDatosEmpleado();
        } else {
            // MODO NUEVO
            jLabel5.setText("Registro de Empleados");
            BotonGuardarC.setText("Guardar");
        }
    }

    private void cargarDatosEmpleado() {
        try {
            EmpleadoDAO dao = new EmpleadoDAO();
            Empleado e = dao.obtenerEmpleadoPorId(idEmpleadoActual); // Necesitas este método en tu DAO
            
            if (e != null) {
                nombretxt.setText(e.getNombre());
                apellidotxt.setText(e.getPrimerApellido());
                apellido2txt.setText(e.getSegundoApellido());
                telefontxt.setText(e.getTelefono());
                fechaNtxt.setText(e.getFechaNacimiento());
                domiciliotxt.setText(e.getDomicilio());
                Nocasatxt.setText(e.getNumeroCasa());
                localidadtxt.setText(e.getLocalidad());
                Horariobox.setSelectedItem(e.getHorario());
                FechaIntxt2.setText(e.getFechaIngreso());
                nombreCtxt.setText(e.getNombreContacto());
                telefonoC.setText(e.getTelefonoContacto());
                
                // Seleccionar parentesco correcto en el combo
                // (Esto requiere que tu DAO devuelva el nombre del parentesco o buscar por ID)
                // Por simplicidad, aquí podrías necesitar ajustar según cómo guardas el parentesco
                
                // Campos Sensibles
                txtUsuario.setText(e.getUsuario());
                txtUsuario.setEnabled(false); // Bloqueado al editar
                txtContrasena.setText(""); // Vacía por seguridad
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar: " + ex.getMessage());
        }
    }

    private void llenarComboBoxParentesco() {
        try {
            ParentescoDAO parentescoDAO = new ParentescoDAO();
            List<Parentesco> lista = parentescoDAO.obtenerParentescos();
            
            Parbox.removeAllItems();
            parentescoMap.clear();
            
            for (Parentesco p : lista) {
                Parbox.addItem(p.getNombre());
                parentescoMap.put(p.getNombre(), p.getIdParentesco());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al cargar parentescos: " + e.getMessage());
        }
    }

    private boolean validarCampos() {
        // La contraseña es obligatoria solo si es NUEVO
        boolean passRequerida = (idEmpleadoActual == -1);
        String pass = new String(txtContrasena.getPassword());
        
        boolean camposLlenos = !nombretxt.getText().isEmpty() &&
                               !apellidotxt.getText().isEmpty() &&
                               !telefontxt.getText().isEmpty() &&
                               !txtUsuario.getText().isEmpty();
                               // ... puedes agregar los demás campos si son obligatorios
        
        if (passRequerida && pass.isEmpty()) return false;
        
        return camposLlenos;
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
        txtUsuario = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        Parbox = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        telefonoC = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        FechaIntxt2 = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JPasswordField();
        regresarBoton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        apellido2txt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        apellido2txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellido2txtActionPerformed(evt);
            }
        });

        Nocasatxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Nocasatxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NocasatxtActionPerformed(evt);
            }
        });

        telefontxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        telefontxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefontxtActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel18.setText("Fecha nacimiento");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Nombre:");

        localidadtxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        localidadtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localidadtxtActionPerformed(evt);
            }
        });

        fechaNtxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        fechaNtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaNtxtActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel17.setText("No. casa");

        jLabel16.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel16.setText("Primer apellido:");

        nombretxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nombretxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombretxtActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel15.setText("Localidad");

        jLabel14.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel14.setText("Segundo apellido:");

        jPanel10.setBackground(new java.awt.Color(255, 0, 51));
        jPanel10.setForeground(new java.awt.Color(255, 51, 51));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 30)); // NOI18N
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

        apellidotxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        apellidotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidotxtActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setText("Telefono");

        jLabel13.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel13.setText("Horario");

        domiciliotxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        domiciliotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                domiciliotxtActionPerformed(evt);
            }
        });

        BotonGuardarC.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        BotonGuardarC.setText("Guardar");
        BotonGuardarC.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 2, true));
        BotonGuardarC.setContentAreaFilled(false);
        BotonGuardarC.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonGuardarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarCActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setText("Domicilio");

        Horariobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matutino", "Vespertino", "Nocturno" }));

        jLabel19.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel19.setText("Parentesco");

        nombreCtxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nombreCtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreCtxtActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel20.setText("Contrasena");

        txtUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel21.setText("Nombre de contacto");

        Parbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParboxActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel11.setText("Telefono");

        telefonoC.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        telefonoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoCActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel22.setText("Usuario");

        jLabel23.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel23.setText("Fecha ingreso");

        FechaIntxt2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        FechaIntxt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaIntxt2ActionPerformed(evt);
            }
        });

        regresarBoton.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        regresarBoton.setText("Regresar");
        regresarBoton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 2, true));
        regresarBoton.setContentAreaFilled(false);
        regresarBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        regresarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonGuardarC, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(181, 181, 181)
                        .addComponent(regresarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
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
                        .addGap(50, 50, 50)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(telefonoC))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(18, 18, 18)
                                .addComponent(nombreCtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FechaIntxt2))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(18, 18, 18)
                                .addComponent(txtContrasena))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(18, 18, 18)
                                .addComponent(txtUsuario))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Parbox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(apellidotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(apellido2txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(FechaIntxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(telefontxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nombreCtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(fechaNtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Parbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(domiciliotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefonoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(Nocasatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(localidadtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(Horariobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(BotonGuardarC, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(regresarBoton))
                .addContainerGap(25, Short.MAX_VALUE))
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
            JOptionPane.showMessageDialog(this, "Complete los campos obligatorios.");
            return;
        }

        try {
            EmpleadoDAO dao = new EmpleadoDAO();
            Empleado emp = new Empleado();
            
            // Recolectar datos
            emp.setNombre(nombretxt.getText());
            emp.setPrimerApellido(apellidotxt.getText());
            emp.setSegundoApellido(apellido2txt.getText());
            emp.setTelefono(telefontxt.getText());
            emp.setFechaNacimiento(fechaNtxt.getText());
            emp.setDomicilio(domiciliotxt.getText());
            emp.setNumeroCasa(Nocasatxt.getText());
            emp.setLocalidad(localidadtxt.getText());
            emp.setHorario((String) Horariobox.getSelectedItem());
            emp.setFechaIngreso(FechaIntxt2.getText());
            emp.setNombreContacto(nombreCtxt.getText());
            emp.setTelefonoContacto(telefonoC.getText());
            emp.setUsuario(txtUsuario.getText());
            
            // Parentesco
            String parSeleccionado = (String) Parbox.getSelectedItem();
            if (parSeleccionado != null) {
                int idPar = parentescoMap.get(parSeleccionado);
                emp.setParentesco(String.valueOf(idPar)); 
            }
            
            // Contraseña
            String pass = new String(txtContrasena.getPassword());
            emp.setContrasena(pass);

            boolean exito = false;

            if (idEmpleadoActual == -1) {
                // --- NUEVO ---
                int nuevoId = dao.obtenerUltimoIdEmpleado() + 1;
                emp.setIdEmpleado(nuevoId);
                exito = dao.insertarEmpleado(emp);
            } else {
                // --- ACTUALIZAR ---
                emp.setIdEmpleado(idEmpleadoActual);
                // Asegúrate de tener este método en tu DAO
                exito = dao.actualizarEmpleado(emp); 
            }

            if (exito) {
                JOptionPane.showMessageDialog(this, "Guardado correctamente.");
                this.dispose(); // Cerrar diálogo
            } else {
                JOptionPane.showMessageDialog(this, "Error al guardar.");
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_BotonGuardarCActionPerformed

    private void nombreCtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreCtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreCtxtActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void telefonoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoCActionPerformed
    
    private void ParboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParboxActionPerformed
    String seleccionado = (String) Parbox.getSelectedItem();
    System.out.println("Seleccionaste: " + seleccionado);
    }//GEN-LAST:event_ParboxActionPerformed

    private void FechaIntxt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaIntxt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaIntxt2ActionPerformed

    private void regresarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarBotonActionPerformed
        this.dispose();
    }//GEN-LAST:event_regresarBotonActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonGuardarC;
    private javax.swing.JTextField FechaIntxt2;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField localidadtxt;
    private javax.swing.JTextField nombreCtxt;
    private javax.swing.JTextField nombretxt;
    private javax.swing.JButton regresarBoton;
    private javax.swing.JTextField telefonoC;
    private javax.swing.JTextField telefontxt;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
