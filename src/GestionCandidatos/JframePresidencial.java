package GestionCandidatos;


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import InicioMenuPrincipal.Menu;
import mesaElectoral.MesaVotacion;


public class JframePresidencial extends javax.swing.JFrame {

    private ColaGenerica colaPresidente;
    private DefaultTableModel modelo;

    private Presidente[] presidentes = new Presidente[50]; // Usamos un array fijo de tamaño 50
    private int contadorPresidentes = 0; // Contador para saber cuántos presidentes hay
//    private ActaElectoral actaElectoral;
    private Gestion gestion = new Gestion(); // Instancia de la clase Gestion que manejará los presidentes

//    Gestion gestion = new Gestion(); // Instancia de la clase Gestion que manejará los presidentes
//    private DefaultTableModel modelo; // Modelo de la tabla para mostrar los presidentes
    public JframePresidencial() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Las celdas no son editables
            }
        };

        colaPresidente = new ColaGenerica(50); // Tamaño de la cola
        modelo.addColumn("DNI");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Partido Político");
        tblPresidentes.setModel(modelo);

        cargarPresidentes(); // Carga los presidentes al iniciaractaElectoral = new ActaElectoral();
        setTitle("Elección Presidencial");
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Las celdas no son editables
            }
        };

        colaPresidente = new ColaGenerica(50); // Tamaño de la cola
        modelo.addColumn("DNI");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Partido Político");
        tblPresidentes.setModel(modelo);

        cargarPresidentes(); // Carga los presidentes al iniciar
    }

    // Sobreescribe setVisible para recargar la tabla al mostrar la ventana
    @Override
    public void setVisible(boolean visible) {
        if (visible) {
            cargarPresidentes();
        }
        super.setVisible(visible);
    }

    private void cargarPresidentes() {
        for (int i = 0; i < contadorPresidentes; i++) {
            Presidente presidente = presidentes[i];
            String[] fila = {presidente.getDni(), presidente.getNombre(), presidente.getApellido(), presidente.getPartidoPolitico()};
            modelo.addRow(fila);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        txtPartidoPolitico = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtDni = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPresidentes = new javax.swing.JTable();
        crearMiembro = new javax.swing.JButton();
        BtnMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("Partido politico:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel2.setText("Apellido:");

        jLabel3.setText("DNI:");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificar(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar(evt);
            }
        });

        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAgregar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre)
                    .addComponent(txtApellido)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addGap(0, 16, Short.MAX_VALUE))
                    .addComponent(txtPartidoPolitico)
                    .addComponent(txtDni))
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPartidoPolitico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jLabel5.setText("GESTION DE DATOS PRESIDENCIALES");

        tblPresidentes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblPresidentes);

        crearMiembro.setText("Crear o iniciar mesa");
        crearMiembro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearMiembroActionPerformed(evt);
            }
        });

        BtnMenu.setText("Volver al menú");
        BtnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtnMenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(crearMiembro)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crearMiembro)
                    .addComponent(BtnMenu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar
        String dni = txtDni.getText();
    String nombre = txtNombre.getText();
    String apellido = txtApellido.getText();
    String partido = txtPartidoPolitico.getText();

    // Crear un nuevo presidente con los datos ingresados
    Presidente presidente = new Presidente(dni, nombre, apellido, partido);

    // Obtiene el índice de la fila seleccionada en la tabla
    int selectedIndex = this.tblPresidentes.getSelectedRow();

    if (selectedIndex >= 0) {  // Si se seleccionó una fila para modificar
        // Actualiza el presidente en la lista de gestión
//        gestion.actualizar(presidente);  // Suponiendo que tienes un método para actualizar

        // Actualiza los valores en la tabla
        modelo.setValueAt(presidente.getDni(), selectedIndex, 0);
        modelo.setValueAt(presidente.getNombre(), selectedIndex, 1);
        modelo.setValueAt(presidente.getApellido(), selectedIndex, 2);
        modelo.setValueAt(presidente.getPartidoPolitico(), selectedIndex, 3);
    } else {
        // Si no hay fila seleccionada, agrega uno nuevo
        gestion.insertar(presidente);
        colaPresidente.agregar(presidente);

        // Agregar el candidato al registro global
        RegistroCandidatos.getInstance().agregarCandidato(nombre + " " + apellido + " | " + partido);

        // Actualiza la tabla con los datos del presidente
        modelo.addRow(new Object[]{dni, nombre, apellido, partido});
    }

    // Limpiar los campos después de agregar o modificar
    limpiarCampos();
    }//GEN-LAST:event_btnAgregar

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed

//    private int selecteedMemberIndex =-1;

    private void btnModificar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificar
        // Obtiene el índice de la fila seleccionada en la tabla
    int selectedIndex = this.tblPresidentes.getSelectedRow();

    if (selectedIndex >= 0) {  // Verifica que se haya seleccionado una fila
        // Obtiene el DNI del presidente desde la primera columna de la fila seleccionada
        String dniPresidente = modelo.getValueAt(selectedIndex, 0).toString();

        // Busca el presidente por su DNI en la lista de presidentes
        Presidente presidente = gestion.buscar(dniPresidente);

        if (presidente != null) {  // Si se encuentra al presidente
            // Establece los valores de los campos de texto con los datos del presidente
            txtDni.setText(presidente.getDni());
            txtNombre.setText(presidente.getNombre());
            txtApellido.setText(presidente.getApellido());
            txtPartidoPolitico.setText(presidente.getPartidoPolitico());
        }
    }
    }//GEN-LAST:event_btnModificar

    private void limpiarCampos() {
        this.txtDni.setText(""); // Limpia el campo de DNI de regional
        this.txtNombre.setText(""); // Limpia el campo de nombre de regional
        this.txtApellido.setText(""); // Limpia el campo de apellido de regional
        this.txtPartidoPolitico.setText(""); // Limpia el campo de partido político de regional
        cargarPresidentes(); // Recarga los regionales en la tabla
    }

    private void btnEliminar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar
        int filaSeleccionada = tblPresidentes.getSelectedRow();
        if (filaSeleccionada >= 0) {
            String dni = modelo.getValueAt(filaSeleccionada, 0).toString();
            gestion.eliminar(dni); // Elimina de la lista enlazada
            modelo.removeRow(filaSeleccionada); // Elimina de la tabla
        }

    }//GEN-LAST:event_btnEliminar

//    public ArrayList<String> obtenerNombresConPartido() {
//        ArrayList<String> nombresConPartido = new ArrayList<>();
//        for (int i = 0; i < modelo.getRowCount(); i++) {
//            String nombre = modelo.getValueAt(i, 1).toString();
//            String apellido = modelo.getValueAt(i, 2).toString();
//            String partidoPolitico = modelo.getValueAt(i, 3).toString();
//
//            String item = nombre + " " + apellido + " | " + partidoPolitico;
//            nombresConPartido.add(item);
//        }
//        return nombresConPartido;
//    }


    private void crearMiembroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearMiembroActionPerformed
        // Mostrar un mensaje de confirmación antes de continuar
    int respuesta = JOptionPane.showConfirmDialog(this, "¿Seguro que desea continuar?", "Confirmación", JOptionPane.YES_NO_OPTION);

    // Si el usuario selecciona "Sí" (respuesta == JOptionPane.YES_OPTION)
    if (respuesta == JOptionPane.YES_OPTION) {
        // Crear una instancia de la nueva ventana (VentanaSecundaria)
        MesaVotacion ventana = new MesaVotacion();

        // Hacer visible la nueva ventana
        ventana.setVisible(true);

        // Cerrar la ventana actual (opcional)
        this.dispose();
    }
    }//GEN-LAST:event_crearMiembroActionPerformed

    private void BtnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMenuActionPerformed
        Menu m = new Menu();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnMenuActionPerformed

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
            java.util.logging.Logger.getLogger(JframePresidencial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JframePresidencial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JframePresidencial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JframePresidencial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JframePresidencial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnMenu;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton crearMiembro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPresidentes;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPartidoPolitico;
    // End of variables declaration//GEN-END:variables
}
