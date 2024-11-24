package mesaElectoral;

import TDA.Cola;
import TDA.ListaEnlazada;
import TDA.Nodo;
import InicioPantallaVotacion.InicioVotante;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import InicioMenuPrincipal.Menu;
import miembrosMesa.Miembro;
import miembrosMesa.inicioregistrar;
import InterfazVotacion.Votar;

public class MesaVotacion extends javax.swing.JFrame {

    private GestionMesasElectorales gestionMesas;
    private DefaultTableModel modeloTabla;
    private Votar votarFrame;
    private static MesaVotacion instanciaUnica;

    public MesaVotacion() {
        initComponents();

        // Utiliza la instancia compartida de GestionMesasElectorales
        gestionMesas = IniciarTabla.getGestionMesas();

        // Configuramos el modelo de la tabla
        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Ubicación");
        modeloTabla.addColumn("Número Mesa");
        //modeloTabla.addColumn("Miembros");  // Nueva columna para los miembros
        tblMesaElectoral.setModel(modeloTabla);  // tblMesaElectoral es el JTable

        // Actualizar la tabla al inicio para mostrar las mesas existentes
        actualizarTabla();  // Aquí se asegura de que la tabla siempre esté actualizada al abrir la ventana

    }

    public static MesaVotacion getInstance() {
        if (instanciaUnica == null) {
            instanciaUnica = new MesaVotacion();
        }
        return instanciaUnica;
    }

    private void actualizarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tblMesaElectoral.getModel();
        modelo.setRowCount(0);  // Limpiar la tabla

        // Recorrer las mesas y agregar sus datos
        for (Nodo<MesaElectoral> nodoMesa = gestionMesas.getMesas().GetFirst(); nodoMesa != null; nodoMesa = nodoMesa.getNext()) {
            MesaElectoral mesa = nodoMesa.getValue();

            // Limitar el número de miembros a 3 por mesa
            ListaEnlazada<String> miembros = mesa.getMiembros();
            String miembrosStr = "";

            // Recorrer los miembros de la mesa y concatenarlos
            Nodo<String> current = miembros.GetFirst();
            int miembrosContados = 0;
            while (current != null && miembrosContados < 3) {
                if (!miembrosStr.isEmpty()) {
                    miembrosStr += ", ";  // Separar con coma
                }
                miembrosStr += current.getValue();
                current = current.getNext();
                miembrosContados++;
            }

            // Añadir la fila a la tabla con la información de la mesa
            modelo.addRow(new Object[]{
                mesa.getId(),
                mesa.getUbicacion(),
                mesa.getNumeroMesa(),
                miembrosStr
            });
        }
    }

    // Método para limpiar los campos de texto
    private void limpiarCampos() {
        txtIdMesaElectoral.setText("");
        txtUbicacionMesaElectoral.setText("");
        txtNmesaMesaElectoral.setText("");
    }

    public void setVotarFrame(Votar votar) {
        this.votarFrame = votar;
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIdMesaElectoral = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtUbicacionMesaElectoral = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNmesaMesaElectoral = new javax.swing.JTextField();
        btnAgregarMesaElectoral = new javax.swing.JButton();
        btnModificarMesaElectoral = new javax.swing.JButton();
        btnEliminarMesaElectoral = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMesaElectoral = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        BtnMenu = new javax.swing.JButton();
        BtnMiembro = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID:");

        jLabel2.setText("Ubicación:");

        jLabel3.setText("N. de mesa:");

        btnAgregarMesaElectoral.setText("Agregar");
        btnAgregarMesaElectoral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMesaElectoralActionPerformed(evt);
            }
        });

        btnModificarMesaElectoral.setText("Modificar");
        btnModificarMesaElectoral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarMesaElectoralActionPerformed(evt);
            }
        });

        btnEliminarMesaElectoral.setText("Eliminar");
        btnEliminarMesaElectoral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarMesaElectoralActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIdMesaElectoral)
                            .addComponent(txtUbicacionMesaElectoral)
                            .addComponent(txtNmesaMesaElectoral, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnAgregarMesaElectoral)
                        .addGap(32, 32, 32)
                        .addComponent(btnModificarMesaElectoral)
                        .addGap(31, 31, 31)
                        .addComponent(btnEliminarMesaElectoral)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdMesaElectoral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUbicacionMesaElectoral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNmesaMesaElectoral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarMesaElectoral)
                    .addComponent(btnModificarMesaElectoral)
                    .addComponent(btnEliminarMesaElectoral))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        tblMesaElectoral.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane2.setViewportView(tblMesaElectoral);

        jLabel4.setText("Mesa electorales");

        BtnMenu.setText("Regresar al menú");
        BtnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMenuActionPerformed(evt);
            }
        });

        BtnMiembro.setText("Crear miembro de mesa");
        BtnMiembro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMiembroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(BtnMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(82, 82, 82)
                .addComponent(BtnMiembro)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnMiembro)
                            .addComponent(BtnMenu))))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnAgregarMesaElectoralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMesaElectoralActionPerformed
       try {
        // Leer los datos desde los campos de texto
        int id = Integer.parseInt(txtIdMesaElectoral.getText());  // Leer ID
        String ubicacion = txtUbicacionMesaElectoral.getText();  // Leer ubicación
        int numeroMesa = Integer.parseInt(txtNmesaMesaElectoral.getText());  // Leer número de mesa

        // Crear la mesa electoral con los datos proporcionados
        gestionMesas.crearMesa(id, ubicacion, numeroMesa);

        // Obtener los miembros registrados desde el paquete de miembros
        Cola<Miembro> miembrosCola = gestionMesas.getColaMiembros();

        // Asignar hasta 3 miembros a la mesa electoral recién creada
        int miembrosAsignados = 0;
        while (!miembrosCola.isEmpty() && miembrosAsignados < 3) {
            Miembro miembro = miembrosCola.dequeue();  // Extraer miembro de la cola
            if (miembro != null) {
                // Asignar miembro a la mesa (nombre y apellidos)
                String nombreCompleto = miembro.getNombre() + " " + miembro.getApellidos();
                gestionMesas.asignarMiembro(id, nombreCompleto);  // Asignar el miembro a la mesa
                miembrosAsignados++;
            }
        }

        // Actualizar la tabla con las mesas y sus miembros
        actualizarTabla();

        // Limpiar los campos de texto después de agregar la mesa
        limpiarCampos();

        JOptionPane.showMessageDialog(this, "Mesa electoral agregada con éxito.");
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese valores válidos.");
    }
    }//GEN-LAST:event_btnAgregarMesaElectoralActionPerformed
private boolean isModificar = false;  
    private void btnModificarMesaElectoralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarMesaElectoralActionPerformed
       // Obtiene el índice de la fila seleccionada en la tabla
    int selectedIndex = this.tblMesaElectoral.getSelectedRow();

    if (selectedIndex >= 0) {  // Verifica que se haya seleccionado una fila
        // Obtiene los datos de la fila seleccionada
        int idMesa = (int) modeloTabla.getValueAt(selectedIndex, 0);  // Obtener ID
        String ubicacion = (String) modeloTabla.getValueAt(selectedIndex, 1);  // Obtener Ubicación
        int numeroMesa = (int) modeloTabla.getValueAt(selectedIndex, 2);  // Obtener número de mesa

        // Rellenar los campos de texto con los datos de la fila seleccionada
        txtIdMesaElectoral.setText(String.valueOf(idMesa));
        txtUbicacionMesaElectoral.setText(ubicacion);
        txtNmesaMesaElectoral.setText(String.valueOf(numeroMesa));

        // Cambiar el comportamiento del botón a "Actualizar"
        btnModificarMesaElectoral.setText("Actualizar Mesa Electoral");

        // Cambiar el evento del botón "Actualizar" para que guarde los cambios
        btnModificarMesaElectoral.removeActionListener(btnModificarMesaElectoral.getActionListeners()[0]);
        btnModificarMesaElectoral.addActionListener(e -> {
            // Obtener los valores modificados
            int nuevoId = Integer.parseInt(txtIdMesaElectoral.getText());
            String nuevaUbicacion = txtUbicacionMesaElectoral.getText();
            int nuevoNumeroMesa = Integer.parseInt(txtNmesaMesaElectoral.getText());

            // Actualizar los datos de la mesa en la tabla
            modeloTabla.setValueAt(nuevoId, selectedIndex, 0);
            modeloTabla.setValueAt(nuevaUbicacion, selectedIndex, 1);
            modeloTabla.setValueAt(nuevoNumeroMesa, selectedIndex, 2);

            // Actualizar la mesa en la base de datos o sistema
            gestionMesas.modificarMesa(nuevoId, nuevaUbicacion, nuevoNumeroMesa);

            // Limpiar los campos de texto
            limpiarCampos();
            JOptionPane.showMessageDialog(this, "Mesa electoral modificada con éxito.");

            // Cambiar el texto del botón para que vuelva a ser "Modificar"
            btnModificarMesaElectoral.setText("Modificar Mesa Electoral");
        });

    } else {
        JOptionPane.showMessageDialog(this, "Seleccione una fila para modificar.");
    }
    }//GEN-LAST:event_btnModificarMesaElectoralActionPerformed

    private void btnEliminarMesaElectoralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarMesaElectoralActionPerformed
// Obtiene el índice de la fila seleccionada en la tabla
        int selectedIndex = this.tblMesaElectoral.getSelectedRow();

        if (selectedIndex >= 0) {  // Verifica que se haya seleccionado una fila
            // Elimina la fila de la tabla
            modeloTabla.removeRow(selectedIndex);

            // Limpiar los campos de texto
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una fila para eliminar.");
        }
    }//GEN-LAST:event_btnEliminarMesaElectoralActionPerformed

    private void BtnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMenuActionPerformed
        // TODO add your handling code here:
        Menu m = new Menu();
        m.setVisible(true);
        // Cerrar la ventana actual (opcional)
        this.dispose();
    }//GEN-LAST:event_BtnMenuActionPerformed

    private void BtnMiembroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMiembroActionPerformed
        // TODO add your handling code here:
        inicioregistrar ventanaRegistro = new inicioregistrar();
        ventanaRegistro.setVisible(true);
        // Cerrar la ventana actual (opcional)
        this.dispose();
    }//GEN-LAST:event_BtnMiembroActionPerformed

    public List<String> obtenerNumerosMesa() {
        List<String> numerosMesa = new ArrayList<>();
        DefaultTableModel modelo = (DefaultTableModel) tblMesaElectoral.getModel(); // Obtener el modelo de la tabla

        for (int i = 0; i < modelo.getRowCount(); i++) {
            numerosMesa.add(modelo.getValueAt(i, 2).toString()); // Columna "Número Mesa"
        }

        if (numerosMesa.isEmpty()) {
            System.out.println("No hay mesas registradas."); // Depuración
        }

        return numerosMesa;
    }

    public List<String> obtenerMiembrosPorNumeroMesa(String numeroMesa) {
        for (Nodo<MesaElectoral> nodoMesa = gestionMesas.getMesas().GetFirst(); nodoMesa != null; nodoMesa = nodoMesa.getNext()) {
            MesaElectoral mesa = nodoMesa.getValue();
            if (String.valueOf(mesa.getNumeroMesa()).equals(numeroMesa)) {
                ListaEnlazada<String> miembros = mesa.getMiembros();
                List<String> miembrosLista = new ArrayList<>();
                for (Nodo<String> nodoMiembro = miembros.GetFirst(); nodoMiembro != null; nodoMiembro = nodoMiembro.getNext()) {
                    miembrosLista.add(nodoMiembro.getValue());
                }
                return miembrosLista; // Retorna la lista de miembros
            }
        }
        return new ArrayList<>(); // Retorna una lista vacía si no encuentra la mesa
    }

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
            java.util.logging.Logger.getLogger(MesaVotacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MesaVotacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MesaVotacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MesaVotacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MesaVotacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnMenu;
    private javax.swing.JButton BtnMiembro;
    private javax.swing.JButton btnAgregarMesaElectoral;
    private javax.swing.JButton btnEliminarMesaElectoral;
    private javax.swing.JButton btnModificarMesaElectoral;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblMesaElectoral;
    private javax.swing.JTextField txtIdMesaElectoral;
    private javax.swing.JTextField txtNmesaMesaElectoral;
    private javax.swing.JTextField txtUbicacionMesaElectoral;
    // End of variables declaration//GEN-END:variables
}
