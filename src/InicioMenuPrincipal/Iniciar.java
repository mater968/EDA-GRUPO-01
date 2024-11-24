package InicioMenuPrincipal;

import GestionElecciones.CrearEleccion;
import java.util.ArrayList;

public class Iniciar extends javax.swing.JFrame {

//    private ArrayList<Usuario> listaUsuarios;
    /**
     * Creates new form GUI
     */
    public Iniciar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo_sis_label = new javax.swing.JLabel();
        contrase_label = new javax.swing.JLabel();
        usuario_label = new javax.swing.JLabel();
        usuario_TextField = new javax.swing.JTextField();
        iniciar_sesion_Button = new javax.swing.JButton();
        contrase_PasswordField = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo_sis_label.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        titulo_sis_label.setText("SISTEMA ELECTORAL");
        titulo_sis_label.setToolTipText("");

        contrase_label.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        contrase_label.setText("Contraseña:");

        usuario_label.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        usuario_label.setText("Usuario:");

        usuario_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrincipalUsuario(evt);
            }
        });

        iniciar_sesion_Button.setText("Iniciar sesion");
        iniciar_sesion_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciar(evt);
            }
        });

        contrase_PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrincipalContraseña(evt);
            }
        });

        jButton1.setText("Registrarse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Registrarse_BTN(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(163, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usuario_label, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contrase_label, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usuario_TextField)
                            .addComponent(contrase_PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(134, 134, 134))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(titulo_sis_label)
                        .addGap(144, 144, 144))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(74, 74, 74)
                        .addComponent(iniciar_sesion_Button)
                        .addGap(215, 215, 215))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(titulo_sis_label, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuario_label, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuario_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contrase_label, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contrase_PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iniciar_sesion_Button)
                    .addComponent(jButton1))
                .addGap(107, 107, 107))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrincipalUsuario(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrincipalUsuario
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrincipalUsuario

    private void btnIniciar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciar
        String usuario = usuario_TextField.getText();
        String password = new String(contrase_PasswordField.getPassword());

// Verificar credenciales de admin
        if (usuario.equals("admin") && password.equals("123")) {
            //CrearEleccion eleccion = new CrearEleccion(); // Crear instancia de la nueva ventana
            Menu menu = new Menu();
            menu.setVisible(true); // Mostrar la nueva ventana
            this.dispose();
        } else {
            // Verificar en la lista de usuarios registrados
            ArrayList<Usuario> listaUsuarios = Registrar.listaUsuarios;

            boolean loginExitoso = false;

            // Verificar si el usuario y la contraseña están en la lista
            for (Usuario u : listaUsuarios) {
                if (u.getNombreUsuario().equals(usuario) && u.getContraseña().equals(password)) {
                    loginExitoso = true;
                    break; // Si se encuentra, salir del bucle
                }
            }

            if (loginExitoso) {
                Menu menu = new Menu();
                menu.setVisible(true); // Mostrar la nueva ventana
                this.dispose(); // Cerrar la ventana actual
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Error de usuario o contraseña", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnIniciar

    private void Registrarse_BTN(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Registrarse_BTN
        // TODO add your handling code here:
        // Crear una instancia de la nueva ventana (VentanaSecundaria)
        Registrar ventana = new Registrar();
        // Hacer visible la nueva ventana
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Registrarse_BTN

    private void txtPrincipalContraseña(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrincipalContraseña
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrincipalContraseña

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
            java.util.logging.Logger.getLogger(Iniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Iniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Iniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Iniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Iniciar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField contrase_PasswordField;
    private javax.swing.JLabel contrase_label;
    private javax.swing.JButton iniciar_sesion_Button;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel titulo_sis_label;
    private javax.swing.JTextField usuario_TextField;
    private javax.swing.JLabel usuario_label;
    // End of variables declaration//GEN-END:variables
}
