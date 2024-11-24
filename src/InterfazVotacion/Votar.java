package InterfazVotacion;

import conteoVotos.Conteo;
import GestionCandidatos.RegistroCandidatos;
import InicioPantallaVotacion.InicioVotante;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import mesaElectoral.MesaVotacion;

public class Votar extends javax.swing.JFrame {

    private Map<String, Integer> votos = new HashMap<>(); // Registro de votos

    private Conteo conteoFrame;

    public Votar() {
        initComponents();
        cargarCandidatosSeparadosEnComboBox();
        cargarNumerosMesaEnComboBox();

        // Crear y mostrar la ventana del conteo
        conteoFrame = new Conteo();
        conteoFrame.setVisible(false);
    }

    private void cargarCandidatosSeparadosEnComboBox() {
        cmbSeleccionados.removeAllItems(); // Limpia el JComboBox

        ArrayList<String> candidatos = RegistroCandidatos.getInstance().obtenerCandidatos();
        for (String candidato : candidatos) {
            cmbSeleccionados.addItem(candidato);

            // Asegúrate de no reinicializar el mapa de votos si ya contiene el candidato
            if (!votos.containsKey(candidato)) {
                votos.put(candidato, 0); // Inicializa el contador en 0
            }
        }

        // Agregar opciones adicionales
        if (!votos.containsKey("Voto en blanco")) {
            cmbSeleccionados.addItem("Voto en blanco");
            votos.put("Voto en blanco", 0);
        }

        if (!votos.containsKey("Voto nulo")) {
            cmbSeleccionados.addItem("Voto nulo");
            votos.put("Voto nulo", 0);
        }
    }

    public void cargarNumerosMesaEnComboBox() {
        MesaVotacion mesaVotacion = MesaVotacion.getInstance(); // Usar la instancia única
        List<String> numerosMesa = mesaVotacion.obtenerNumerosMesa();

        cmbMesaElegir.removeAllItems();
        for (String numero : numerosMesa) {
            cmbMesaElegir.addItem(numero);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        cmbSeleccionados = new javax.swing.JComboBox<>();
        btnVotar = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        cmbMesaElegir = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbSeleccionados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        cmbSeleccionados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSeleccionadosActionPerformed(evt);
            }
        });

        btnVotar.setText("Votar");
        btnVotar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVotarActionPerformed(evt);
            }
        });

        btnCerrarSesion.setText("Cerrar Sesion");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        cmbMesaElegir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        cmbMesaElegir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMesaElegirActionPerformed(evt);
            }
        });

        jLabel1.setText("Numero de mesa");

        jLabel2.setText("Candidato");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("VOTACION");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnCerrarSesion)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(cmbSeleccionados, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbMesaElegir, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(btnVotar)))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCerrarSesion)
                    .addComponent(jLabel3))
                .addGap(2, 2, 2)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbMesaElegir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbSeleccionados, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnVotar)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVotarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVotarActionPerformed
        // Obtener el candidato seleccionado
        String candidatoSeleccionado = (String) cmbSeleccionados.getSelectedItem();

        if (candidatoSeleccionado == null) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un candidato.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Incrementar el voto del candidato seleccionado
        votos.put(candidatoSeleccionado, votos.get(candidatoSeleccionado) + 1);

        // Mensaje de confirmación
        JOptionPane.showMessageDialog(this, "¡Voto registrado para " + candidatoSeleccionado + "!", "Votación exitosa", JOptionPane.INFORMATION_MESSAGE);

        // Actualizar la tabla de conteo en tiempo real
        conteoFrame.actualizarTabla(votos);
        mostrarResultados();
    }//GEN-LAST:event_btnVotarActionPerformed

    private void mostrarResultados() {
        System.out.println("Resultados de la votación:");
        for (Map.Entry<String, Integer> entry : votos.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " votos");
        }
    }


    private void cmbSeleccionadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSeleccionadosActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cmbSeleccionadosActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        // TODO add your handling code here:
        InicioVotante eleccion = new InicioVotante(); // Crear instancia de la nueva ventana
        eleccion.setVisible(true); // Mostrar la nueva ventana
        this.dispose(); // Cerrar la ventana actual
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void cmbMesaElegirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMesaElegirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMesaElegirActionPerformed

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
            java.util.logging.Logger.getLogger(Votar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Votar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Votar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Votar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Votar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnVotar;
    private javax.swing.JComboBox<String> cmbMesaElegir;
    private javax.swing.JComboBox<String> cmbSeleccionados;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
