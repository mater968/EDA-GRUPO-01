package GestionCandidatos;

import RegistroActaElectoral.ActaElectoral;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import InicioMenuPrincipal.Menu;
import mesaElectoral.MesaVotacion;


public class JframeMunicipal extends javax.swing.JFrame {

    private ColaGenerica colaMunicipal;
    private DefaultTableModel modelo;

    private Municipal[] municipales = new Municipal[50]; // Usamos un array fijo de tamaño 50
    private int contadorMunicipales = 0; // Contador para saber cuántos municipales hay
    private ActaElectoral actaElectoral;
    private GestionMunicipal gestion2 = new GestionMunicipal(); // Instancia de la clase Gestion que manejará los municipales

    /**
     * Creates new form JframeMunicipal
     */
    public JframeMunicipal() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Las celdas no son editables
            }
        };

        colaMunicipal = new ColaGenerica(50); // Tamaño de la cola
        modelo.addColumn("DNI");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Partido Político");
        tblMunicipal.setModel(modelo);

        cargarMunicipales(); // Carga los municipales al iniciar
        actaElectoral = new ActaElectoral();
        setTitle("Elección Municipal");
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Las celdas no son editables
            }
        };

        colaMunicipal = new ColaGenerica(50); // Tamaño de la cola
        modelo.addColumn("DNI");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Partido Político");
        tblMunicipal.setModel(modelo);

        cargarMunicipales(); // Carga los presidentes al iniciar
    }

    // Sobreescribe setVisible para recargar los datos cada vez que se muestra la ventana
    @Override
    public void setVisible(boolean visible) {
        if (visible) {
            cargarMunicipales();
        }
        super.setVisible(visible);
    }

    private void cargarMunicipales() {
        for (int i = 0; i < contadorMunicipales; i++) {
            Municipal municipal = municipales[i];
            String[] fila = {municipal.getDni(), municipal.getNombre(), municipal.getApellido(), municipal.getPartidoPolitico()};
            modelo.addRow(fila);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtNombreMunicipal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtApellidoMunicipal = new javax.swing.JTextField();
        btnAgregarMunicipal = new javax.swing.JButton();
        btnModificarMunicipal = new javax.swing.JButton();
        btnEliminarMunicipal = new javax.swing.JButton();
        txtDniMunicipal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPartidoPoliticoMunicipal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMunicipal = new javax.swing.JTable();
        BtnCrearMesa = new javax.swing.JButton();
        BtnMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("Partido politico:");

        jLabel1.setText("Nombre:");

        jLabel2.setText("Apellido:");

        btnAgregarMunicipal.setText("Agregar");
        btnAgregarMunicipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMunicipalActionPerformed(evt);
            }
        });

        btnModificarMunicipal.setText("Modificar");
        btnModificarMunicipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarMunicipalActionPerformed(evt);
            }
        });

        btnEliminarMunicipal.setText("Eliminar");
        btnEliminarMunicipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarMunicipalActionPerformed(evt);
            }
        });

        jLabel3.setText("DNI:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAgregarMunicipal)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnModificarMunicipal)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminarMunicipal))
                            .addComponent(txtPartidoPoliticoMunicipal, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDniMunicipal)
                            .addComponent(txtNombreMunicipal)
                            .addComponent(txtApellidoMunicipal))
                        .addGap(6, 6, 6))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDniMunicipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreMunicipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtApellidoMunicipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPartidoPoliticoMunicipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarMunicipal)
                    .addComponent(btnModificarMunicipal)
                    .addComponent(btnEliminarMunicipal))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel5.setText("GESTION DE DATOS MUNICIPALES");

        tblMunicipal.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblMunicipal);

        BtnCrearMesa.setText("Crear o iniciar mesa");
        BtnCrearMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCrearMesaActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(191, 191, 191))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(BtnMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnCrearMesa)
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCrearMesa)
                    .addComponent(BtnMenu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnAgregarMunicipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMunicipalActionPerformed
        String dni = txtDniMunicipal.getText();
    String nombre = txtNombreMunicipal.getText();
    String apellido = txtApellidoMunicipal.getText();
    String partido = txtPartidoPoliticoMunicipal.getText();

    // Crear un objeto Municipal con los datos ingresados
    Municipal municipal = new Municipal(dni, nombre, apellido, partido);

    // Obtiene el índice de la fila seleccionada en la tabla
    int selectedIndex = this.tblMunicipal.getSelectedRow();

    if (selectedIndex >= 0) {  // Si hay una fila seleccionada para modificar
        // Actualiza el municipal en la lista de gestión
//        gestion2.actualizar(municipal);  // Método de actualización en tu lista o base de datos

        // Actualiza los valores en la tabla
        modelo.setValueAt(municipal.getDni(), selectedIndex, 0);
        modelo.setValueAt(municipal.getNombre(), selectedIndex, 1);
        modelo.setValueAt(municipal.getApellido(), selectedIndex, 2);
        modelo.setValueAt(municipal.getPartidoPolitico(), selectedIndex, 3);
    } else {
        // Si no hay fila seleccionada, agrega uno nuevo
        gestion2.insertar(municipal);
        colaMunicipal.agregar(municipal);

        // Agregar el candidato al registro global
        RegistroCandidatos.getInstance().agregarCandidato(nombre + " " + apellido + " | " + partido);

        // Actualiza la tabla con los datos del municipal
        modelo.addRow(new Object[]{dni, nombre, apellido, partido});
    }

    // Limpiar los campos después de agregar o modificar
    limpiarCampos();
    }//GEN-LAST:event_btnAgregarMunicipalActionPerformed

//    private int selectedMemberIndex = -1;
    private void btnModificarMunicipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarMunicipalActionPerformed
        // Obtiene el índice de la fila seleccionada en la tabla
    int selectedIndex = this.tblMunicipal.getSelectedRow();

    if (selectedIndex >= 0) {  // Verifica que se haya seleccionado una fila
        // Obtiene el DNI del municipal desde la primera columna de la fila seleccionada
        String dniMunicipal = modelo.getValueAt(selectedIndex, 0).toString();

        // Busca el municipal por su DNI en la lista de municipales
        Municipal municipal = gestion2.buscar(dniMunicipal);

        if (municipal != null) {  // Si se encuentra al municipal
            // Establece los valores de los campos de texto con los datos del municipal
            txtDniMunicipal.setText(municipal.getDni());
            txtNombreMunicipal.setText(municipal.getNombre());
            txtApellidoMunicipal.setText(municipal.getApellido());
            txtPartidoPoliticoMunicipal.setText(municipal.getPartidoPolitico());
        }
    }
    }//GEN-LAST:event_btnModificarMunicipalActionPerformed

    private void limpiarCampos() {
        this.txtDniMunicipal.setText("");
        this.txtNombreMunicipal.setText("");
        this.txtApellidoMunicipal.setText("");
        this.txtPartidoPoliticoMunicipal.setText("");
        cargarMunicipales();
    }

    private void btnEliminarMunicipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarMunicipalActionPerformed
        int filaSeleccionada = tblMunicipal.getSelectedRow();
        if (filaSeleccionada >= 0) {
            String dni = modelo.getValueAt(filaSeleccionada, 0).toString();
            gestion2.eliminar(dni); // Elimina de la lista enlazada
            modelo.removeRow(filaSeleccionada); // Elimina de la tabla
        }
    }//GEN-LAST:event_btnEliminarMunicipalActionPerformed

    private void BtnCrearMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCrearMesaActionPerformed
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
    }//GEN-LAST:event_BtnCrearMesaActionPerformed

    private void BtnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMenuActionPerformed
        // TODO add your handling code here:
        Menu m = new Menu();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnMenuActionPerformed

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
            java.util.logging.Logger.getLogger(JframeMunicipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JframeMunicipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JframeMunicipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JframeMunicipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JframeMunicipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCrearMesa;
    private javax.swing.JButton BtnMenu;
    private javax.swing.JButton btnAgregarMunicipal;
    private javax.swing.JButton btnEliminarMunicipal;
    private javax.swing.JButton btnModificarMunicipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMunicipal;
    private javax.swing.JTextField txtApellidoMunicipal;
    private javax.swing.JTextField txtDniMunicipal;
    private javax.swing.JTextField txtNombreMunicipal;
    private javax.swing.JTextField txtPartidoPoliticoMunicipal;
    // End of variables declaration//GEN-END:variables
}
