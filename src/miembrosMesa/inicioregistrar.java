package miembrosMesa;

import TDA.Cola;
import TDA.ListaEnlazada;
import TDA.Nodo;
import InicioPantallaVotacion.InicioVotante;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import InicioMenuPrincipal.Menu;

public class inicioregistrar extends javax.swing.JFrame {

    private GestionMesa gestion;
    private ListaEnlazada<Miembro> listaPersistente; // Lista para persistir los datos
    private Cola<Miembro> colaTabla; // Cola para operaciones temporales
    private DefaultTableModel modelo;

    public inicioregistrar() {
        initComponents();

        gestion = new GestionMesa();
        setTitle("Miembros de mesa");
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        modelo.addColumn("DNI");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("APELLIDO");
        modelo.addColumn("TIPO DE MIEMBRO");

        this.tblMiembrosMesa.setModel(modelo);

        listaPersistente = new ListaEnlazada<>(); // Inicializa la lista para persistencia
        colaTabla = new Cola<>(100); // Cola con capacidad inicial de 100 elementos
        cargarMiembrosMesa();

    }

// Sobreescribe setVisible para mantener los datos cuando se muestra nuevamente
    @Override
    public void setVisible(boolean visible) {
        if (visible) {
            actualizarTabla(); // Actualiza la tabla con los datos existentes
        }
        super.setVisible(visible);
    }

    private void cargarMiembrosMesa() {
        if (listaPersistente.size() > 0) {
            return; // Si ya hay datos, no recargar
        }
        Nodo<Miembro> actual = gestion.getMiembros().GetFirst();
        while (actual != null) {
            Miembro miembro = actual.getValue();
            listaPersistente.addLast(miembro); // Almacena en la lista
            colaTabla.enqueue(miembro); // También agrega a la cola
            actual = actual.getNext();
        }
    }

    private void actualizarTabla() {
        modelo.setRowCount(0); // Limpia la tabla

        Nodo<Miembro> actual = listaPersistente.GetFirst();
        while (actual != null) {
            Miembro miembro = actual.getValue();
            modelo.addRow(new Object[]{miembro.getDni(), miembro.getNombre(), miembro.getApellidos(), miembro.getTipo()});
            actual = actual.getNext();
        }
    }

    public ListaEnlazada<Miembro> getMiembros() {
        return gestion.getMiembros(); // Devuelve la lista de miembros gestionados
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMiembrosMesa = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombreMesa = new javax.swing.JTextField();
        txtApellidoMesa = new javax.swing.JTextField();
        cmbTipoMesa = new javax.swing.JComboBox<>();
        passContraMesa = new javax.swing.JPasswordField();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtDniMesa = new javax.swing.JTextField();
        btnMenu = new javax.swing.JButton();
        BtnVotar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CREAR MIEMBROS DE MESA");

        tblMiembrosMesa.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblMiembrosMesa);

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellidos:");

        jLabel4.setText("Tipo de miembro:");

        jLabel6.setText("Clave de acceso:");

        txtNombreMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreMesaActionPerformed(evt);
            }
        });

        txtApellidoMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoMesaActionPerformed(evt);
            }
        });

        cmbTipoMesa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "presidente", "secretario", "vocal" }));
        cmbTipoMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoMesaActionPerformed(evt);
            }
        });

        passContraMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passContraMesaActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMM(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarMM(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarMM(evt);
            }
        });

        jLabel7.setText("Dni:");

        txtDniMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniMesaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addGap(33, 33, 33)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnModificar)
                        .addGap(28, 28, 28)
                        .addComponent(btnEliminar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombreMesa)
                            .addComponent(txtApellidoMesa)
                            .addComponent(cmbTipoMesa, 0, 125, Short.MAX_VALUE)
                            .addComponent(passContraMesa)
                            .addComponent(txtDniMesa))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDniMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellidoMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbTipoMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(passContraMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar))
                .addGap(24, 24, 24))
        );

        btnMenu.setText("Volver al menú");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenu(evt);
            }
        });

        BtnVotar.setText("Pantalla de votación");
        BtnVotar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVotarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btnMenu)
                        .addGap(81, 81, 81)
                        .addComponent(jLabel1)
                        .addGap(37, 37, 37)
                        .addComponent(BtnVotar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(BtnVotar))
                    .addComponent(btnMenu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreMesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreMesaActionPerformed

    private void txtApellidoMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoMesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoMesaActionPerformed

    private void cmbTipoMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoMesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTipoMesaActionPerformed

    private void passContraMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passContraMesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passContraMesaActionPerformed

    private void btnAgregarMM(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMM
        String dni = txtDniMesa.getText().trim();
        String nombre = txtNombreMesa.getText();
        String apellidos = txtApellidoMesa.getText();
        Tipo tipo = Tipo.valueOf(cmbTipoMesa.getSelectedItem().toString());
        String clave = new String(passContraMesa.getPassword()).trim();
        String mesa = "1"; // Aquí puedes asignar el número de mesa correspondiente

        // Validar que todos los campos estén completos
        if (dni.isEmpty() || nombre.isEmpty() || apellidos.isEmpty() || clave.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, llena todos los campos.");
            return;
        }
        // Crear un nuevo miembro
        Miembro nuevoMiembro = new Miembro(dni, nombre, apellidos, tipo, clave, mesa);
        // Verificar si ya existe en GestionDatos
        ListaEnlazada<Miembro> miembros = GestionDatos.getInstance().getMiembros();
        Nodo<Miembro> actual = miembros.GetFirst();
        while (actual != null) {
            Miembro miembroExistente = actual.getValue();
            if (miembroExistente.getDni().equals(dni)) {
                JOptionPane.showMessageDialog(this, "Ya existe un miembro con este DNI.");
                return;
            }
            actual = actual.getNext();
        }
        // Agregar el nuevo miembro a GestionDatos
        GestionDatos.getInstance().agregarMiembro(nuevoMiembro);
        // También agregar a la lista local y actualizar la tabla
        listaPersistente.addLast(nuevoMiembro);
        actualizarTabla();
        // Confirmar éxito
        JOptionPane.showMessageDialog(this, "Miembro registrado con éxito.");
        // Limpiar los campos de entrada
        txtDniMesa.setText("");
        txtNombreMesa.setText("");
        txtApellidoMesa.setText("");
        passContraMesa.setText("");
        cmbTipoMesa.setSelectedIndex(0);
    }//GEN-LAST:event_btnAgregarMM
//    private int selectedMemberIndex = -1;
    private void btnModificarMM(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarMM
   int filaSeleccionada = tblMiembrosMesa.getSelectedRow();

    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(this, "Selecciona un miembro de la tabla para modificar.");
        return;
    }

    // Llenar los campos con los datos del miembro seleccionado
    String dni = modelo.getValueAt(filaSeleccionada, 0).toString();
    String nombre = modelo.getValueAt(filaSeleccionada, 1).toString();
    String apellidos = modelo.getValueAt(filaSeleccionada, 2).toString();
    String tipo = modelo.getValueAt(filaSeleccionada, 3).toString();

    // Llenar los campos con los datos del miembro
    txtDniMesa.setText(dni);
    txtNombreMesa.setText(nombre);
    txtApellidoMesa.setText(apellidos);
    cmbTipoMesa.setSelectedItem(tipo);

    // Cuando se da clic en "Modificar" nuevamente para guardar los cambios
    btnModificar.addActionListener(e -> {
        // Obtener los valores modificados
        String nuevoDni = txtDniMesa.getText().trim();
        String nuevoNombre = txtNombreMesa.getText();
        String nuevoApellido = txtApellidoMesa.getText();
        String nuevoTipo = cmbTipoMesa.getSelectedItem().toString();

        // Actualizar el miembro en la tabla con los nuevos valores
        modelo.setValueAt(nuevoDni, filaSeleccionada, 0);
        modelo.setValueAt(nuevoNombre, filaSeleccionada, 1);
        modelo.setValueAt(nuevoApellido, filaSeleccionada, 2);
        modelo.setValueAt(nuevoTipo, filaSeleccionada, 3);

        // Actualizar el miembro en la lista persistente
        Nodo<Miembro> actual = listaPersistente.GetFirst();
        while (actual != null) {
            Miembro miembro = actual.getValue();
            if (miembro.getDni().equals(dni)) {
                miembro.setDni(nuevoDni);
                miembro.setNombre(nuevoNombre);
                miembro.setApellidos(nuevoApellido);
                miembro.setTipo(Tipo.valueOf(nuevoTipo));

                // Confirmar éxito
                JOptionPane.showMessageDialog(this, "Miembro modificado con éxito.");

                // Limpiar los campos de entrada SOLO después de la modificación exitosa
                txtDniMesa.setText("");
                txtNombreMesa.setText("");
                txtApellidoMesa.setText("");
                cmbTipoMesa.setSelectedIndex(0); // Restablecer combo box

                return;
            }
            actual = actual.getNext();
        }
    });

    }//GEN-LAST:event_btnModificarMM

    private void btnEliminarMM(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarMM
 int selectedIndex = tblMiembrosMesa.getSelectedRow();
    if (selectedIndex >= 0) {
        String dniMiembro = modelo.getValueAt(selectedIndex, 0).toString();

        ListaEnlazada<Miembro> nuevaLista = new ListaEnlazada<>();
        Nodo<Miembro> actual = listaPersistente.GetFirst();
        boolean encontrado = false;

        while (actual != null) {
            Miembro miembro = actual.getValue();
            if (!miembro.getDni().equals(dniMiembro)) {
                nuevaLista.addLast(miembro); // Copiar a la nueva lista si no coincide
            } else {
                encontrado = true;
            }
            actual = actual.getNext();
        }

        if (encontrado) {
            listaPersistente = nuevaLista; // Reemplazar la lista original
            actualizarTabla(); // Actualizar la tabla
            JOptionPane.showMessageDialog(this, "Miembro eliminado correctamente.");

            // Limpiar los campos de texto
            txtDniMesa.setText("");
            txtNombreMesa.setText("");
            txtApellidoMesa.setText("");
            passContraMesa.setText("");
            cmbTipoMesa.setSelectedIndex(0); // Si tienes un comboBox, reiniciar la selección
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró el miembro a eliminar.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Seleccione un miembro para eliminar.");
    }
    }//GEN-LAST:event_btnEliminarMM


    private void btnMenu(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenu
        // TODO add your handling code here:
        Menu ventanaRegistro2 = new Menu();
        ventanaRegistro2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMenu

    private void txtDniMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniMesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniMesaActionPerformed

    private void BtnVotarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVotarActionPerformed
        // TODO add your handling code here:
        InicioVotante v = new InicioVotante();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnVotarActionPerformed


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
            java.util.logging.Logger.getLogger(inicioregistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicioregistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicioregistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicioregistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicioregistrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnVotar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cmbTipoMesa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPasswordField passContraMesa;
    private javax.swing.JTable tblMiembrosMesa;
    private javax.swing.JTextField txtApellidoMesa;
    private javax.swing.JTextField txtDniMesa;
    private javax.swing.JTextField txtNombreMesa;
    // End of variables declaration//GEN-END:variables
}
