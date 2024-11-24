package GestionElecciones;

import GestionCandidatos.JframeMunicipal;
import GestionCandidatos.JframePresidencial;
import GestionCandidatos.JframeRegional;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CrearEleccion extends javax.swing.JFrame {
    
    // Cambia a static para que se pueda acceder desde métodos estáticos
    private static ArrayList<Atributo> miembros = new ArrayList<>();

    Gestion gestion = new Gestion();

    private DefaultTableModel modelo;

    /**
     * Creates new form MantenimientoDeProfesoresVista
     */
    public CrearEleccion() {
        initComponents();

        modelo = new DefaultTableModel() {
            // Sobrescribe el método isCellEditable para hacer que todas las celdas no sean editables
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Devuelve false para hacer que las celdas no sean editables
            }
        };

        modelo.addColumn("ID");
        modelo.addColumn("inicio");
        modelo.addColumn("fin");
        modelo.addColumn("tipo");
        modelo.addColumn("cantidad");

        this.tblCreacion.setModel(modelo);
        Actualizar();

    }

    @Override
    public void setVisible(boolean visible) {
        if (visible) {
            Actualizar(); // Carga los miembros cada vez que se vuelve a mostrar
        }
        super.setVisible(visible); // Llama a la implementación original de setVisible
    }

    private void Actualizar() {
        // Limpiar todas las filas de la tabla antes de agregar los datos actualizados
        modelo.setRowCount(0);

        // Obtiene la lista de atributos almacenada en la clase CrearEleccion
        ArrayList<Atributo> crear = CrearEleccion.getMiembros();

        // Recorre cada elemento en `crear` y agrega sus datos a la tabla
        for (Atributo r : crear) {
            String[] fila = {
                String.valueOf(r.getId()), // ID
                r.getInicio(), // Inicio
                r.getFinall(), // Final
                r.getCategoria().toString(), // Categoría (convertido a cadena)
                r.getCantidad() // Cantidad
            };
            modelo.addRow(fila);
        }
    }

    // Método estático para obtener la lista de miembros
    public static ArrayList<Atributo> getMiembros() {
        return miembros;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        dialogoSelecFecha = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        txtFechaHoy = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtFechaHoy1 = new javax.swing.JTextField();
        txtFechaHoy2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtInicio = new javax.swing.JTextField();
        txtFinal = new javax.swing.JTextField();
        cmbCategoria = new javax.swing.JComboBox<>();
        bntGuardar = new javax.swing.JButton();
        bntEditar = new javax.swing.JButton();
        bntEliminar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        txtInicio1 = new javax.swing.JTextField();
        txtInicio2 = new javax.swing.JTextField();
        txtFinal1 = new javax.swing.JTextField();
        txtFinal2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCreacion = new javax.swing.JTable();
        btnContinuar = new javax.swing.JButton();

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

        jLabel6.setText("FECHA DE HOY");

        txtFechaHoy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaHoyActionPerformed(evt);
            }
        });

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtFechaHoy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaHoy1ActionPerformed(evt);
            }
        });

        txtFechaHoy2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaHoy2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogoSelecFechaLayout = new javax.swing.GroupLayout(dialogoSelecFecha.getContentPane());
        dialogoSelecFecha.getContentPane().setLayout(dialogoSelecFechaLayout);
        dialogoSelecFechaLayout.setHorizontalGroup(
            dialogoSelecFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoSelecFechaLayout.createSequentialGroup()
                .addGroup(dialogoSelecFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogoSelecFechaLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtFechaHoy, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFechaHoy1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFechaHoy2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dialogoSelecFechaLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(btnAceptar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar)))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        dialogoSelecFechaLayout.setVerticalGroup(
            dialogoSelecFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoSelecFechaLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(dialogoSelecFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtFechaHoy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaHoy1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaHoy2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(dialogoSelecFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("CREACION DE ELECCIONES");

        jLabel2.setText("Id:");

        jLabel3.setText("Fecha de Inicio");

        jLabel4.setText("Fecha de finalización");

        jLabel5.setText("Categoria:");

        txtId.setEditable(false);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id(evt);
            }
        });

        txtInicio.setToolTipText("");
        txtInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre(evt);
            }
        });

        txtFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellido(evt);
            }
        });

        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Presidencial", "Regional", "Municipal" }));
        cmbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoria(evt);
            }
        });

        bntGuardar.setText("Guardar");
        bntGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar(evt);
            }
        });

        bntEditar.setText("Editar");
        bntEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editar(evt);
            }
        });

        bntEliminar.setText("Eliminar");
        bntEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar(evt);
            }
        });

        jLabel7.setText("Cantidad:");

        txtInicio1.setToolTipText("");
        txtInicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInicio1nombre(evt);
            }
        });

        txtInicio2.setToolTipText("");
        txtInicio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInicio2nombre(evt);
            }
        });

        txtFinal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFinal1apellido(evt);
            }
        });

        txtFinal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFinal2apellido(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtInicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtInicio2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtFinal1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFinal2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(bntGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(bntEditar)
                        .addGap(18, 18, 18)
                        .addComponent(bntEliminar)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInicio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInicio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtFinal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFinal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntGuardar)
                    .addComponent(bntEditar)
                    .addComponent(bntEliminar))
                .addGap(28, 28, 28))
        );

        tblCreacion.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblCreacion);

        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(btnContinuar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE))))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnContinuar)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar
        // TODO add your handling code here:
        String idText = this.txtId.getText().trim(); // Trim para eliminar espacios en blanco al inicio y al final
        int id = idText.isEmpty() ? 0 : Integer.parseInt(idText);

        String nombre = this.txtInicio.getText().trim();
        String nombre1 = this.txtInicio1.getText().trim();
        String nombre2 = this.txtInicio2.getText().trim();
        String concatenadoInicio = nombre + " " + nombre1 + " " + nombre2;

        String final1 = this.txtFinal.getText().trim();
        String final2 = this.txtFinal1.getText().trim();
        String final3 = this.txtFinal2.getText().trim();
        String concatenadoFinal = final1 + " " + final2 + " " + final3;

        // Continuar con los demás campos
        Categoria categoria = Categoria.valueOf(this.cmbCategoria.getSelectedItem().toString());
        String cantidad = this.txtCantidad.getText().trim();

        Atributo atbt = new Atributo(id, concatenadoInicio, concatenadoFinal, categoria, cantidad);
// Buscar si el ID ya existe
        boolean actualizado = false;
        for (int i = 0; i < miembros.size(); i++) {
            if (miembros.get(i).getId() == id) {
                // Actualizar el atributo existente
                miembros.set(i, atbt);
                gestion.actualizar(atbt);
                actualizado = true;
                break;
            }
        }

        if (!actualizado) {
            // Si no se encontró el ID, añadir el nuevo atributo
            miembros.add(atbt);
            gestion.insertar(atbt);
        }

        JOptionPane.showMessageDialog(this, "Eleccion guardada!");

        limpiarCampos();
        Actualizar();
    }//GEN-LAST:event_guardar
    private void limpiarCampos() {
        this.txtId.setText("");
        this.txtInicio.setText("");
        this.txtInicio1.setText("");
        this.txtInicio2.setText("");
        this.txtFinal.setText("");
        this.txtFinal1.setText("");
        this.txtFinal2.setText("");
        this.txtCantidad.setText("");
    }
    private void nombre(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre

    private void categoria(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoria
        // TODO add your handling code here:
    }//GEN-LAST:event_categoria

    private void id(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id
        // TODO add your handling code here:
    }//GEN-LAST:event_id

    private void apellido(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellido
        // TODO add your handling code here:
    }//GEN-LAST:event_apellido

    private void editar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editar
        int selectedIndex = this.tblCreacion.getSelectedRow();

        if (selectedIndex >= 0) {
            int codigoAtributo = Integer.parseInt(modelo.getValueAt(selectedIndex, 0).toString());

            Atributo atributoo = gestion.buscar(codigoAtributo);

            if (atributoo != null) { // Esto indica si hemos encontrado el atributo
                // Asignar ID
                this.txtId.setText(String.valueOf(atributoo.getId()));

                // Dividir 'inicio' en partes y asignar a txtInicio, txtInicio1, txtInicio2
                String[] inicioParts = atributoo.getInicio().split(" ");
                if (inicioParts.length > 0) {
                    this.txtInicio.setText(inicioParts[0]); // Asignar el primer valor
                }
                if (inicioParts.length > 1) {
                    this.txtInicio1.setText(inicioParts[1]); // Asignar el segundo valor
                }
                if (inicioParts.length > 2) {
                    this.txtInicio2.setText(inicioParts[2]); // Asignar el tercer valor
                }

                // Dividir 'final' en partes y asignar a txtFinal, txtFinal1, txtFinal2
                String[] finalParts = atributoo.getFinall().split(" ");
                if (finalParts.length > 0) {
                    this.txtFinal.setText(finalParts[0]); // Asignar el primer valor
                }
                if (finalParts.length > 1) {
                    this.txtFinal1.setText(finalParts[1]); // Asignar el segundo valor
                }
                if (finalParts.length > 2) {
                    this.txtFinal2.setText(finalParts[2]); // Asignar el tercer valor
                }

                // Asignar la categoría y cantidad
                this.cmbCategoria.setSelectedItem(atributoo.getCategoria().toString());
                this.txtCantidad.setText(atributoo.getCantidad());
            }
        }

        dialogoSelecFecha.setSize(350, 350);
        dialogoSelecFecha.setLocation(100, 100);
        dialogoSelecFecha.setVisible(true);

    }//GEN-LAST:event_editar

    // Método de verificación de rango de fechas
    private boolean fechaEstaEnRango() {
        try {
            // Convertir la fecha de inicio en un número entero en formato YYYYMMDD
            int inicioAno = Integer.parseInt(txtInicio2.getText().trim());
            int inicioMes = Integer.parseInt(txtInicio1.getText().trim());
            int inicioDia = Integer.parseInt(txtInicio.getText().trim());
            int fechaInicio = inicioAno * 10000 + inicioMes * 100 + inicioDia;

            // Convertir la fecha de fin en un número entero en formato YYYYMMDD
            int finAno = Integer.parseInt(txtFinal2.getText().trim());
            int finMes = Integer.parseInt(txtFinal1.getText().trim());
            int finDia = Integer.parseInt(txtFinal.getText().trim());
            int fechaFin = finAno * 10000 + finMes * 100 + finDia;

            // Convertir la fecha de hoy en un número entero en formato YYYYMMDD
            int hoyAno = Integer.parseInt(txtFechaHoy2.getText().trim());
            int hoyMes = Integer.parseInt(txtFechaHoy1.getText().trim());
            int hoyDia = Integer.parseInt(txtFechaHoy.getText().trim());
            int fechaHoy = hoyAno * 10000 + hoyMes * 100 + hoyDia;

            // Verificar si la fecha de hoy está dentro del rango
            return fechaHoy >= fechaInicio && fechaHoy <= fechaFin;

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error: Asegúrate de que todos los campos contengan números válidos.");
            return false;
        }
    }


    private void eliminar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar
        // TODO add your handling code here:
        int selectedIndex = this.tblCreacion.getSelectedRow();

        if (selectedIndex >= 0) {
            int codigoAtributo = Integer.parseInt(modelo.getValueAt(selectedIndex, 0).toString());

            Atributo atributoo = gestion.buscar(codigoAtributo);

            if (atributoo != null) {
                gestion.remover(atributoo);

                Actualizar();
            }
        }
    }//GEN-LAST:event_eliminar

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed

        // Verificar si hay una fila seleccionada en la tabla
        int selectedRowIndex = this.tblCreacion.getSelectedRow();

        if (selectedRowIndex >= 0) {
            // Obtener la categoría de la fila seleccionada
            String categoriaSeleccionada = modelo.getValueAt(selectedRowIndex, 3).toString();

            // Dependiendo de la categoría, abrir la ventana correspondiente
            switch (categoriaSeleccionada) {
                case "Presidencial":
                    JframePresidencial ventanaPresidencial = new JframePresidencial();
                    ventanaPresidencial.setVisible(true);
                    break;
                case "Regional":
                    JframeRegional ventanaRegional = new JframeRegional();
                    ventanaRegional.setVisible(true);
                    break;
                case "Municipal":
                    JframeMunicipal ventanaMunicipal = new JframeMunicipal();
                    ventanaMunicipal.setVisible(true);
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "Categoría desconocida.");
                    return; // Salir del método si la categoría no es reconocida
            }

            // Cerrar la ventana actual
            this.dispose();
        } else {
            // Mostrar un mensaje si no se seleccionó ninguna fila
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una fila en la tabla antes de continuar.");
        }
    }//GEN-LAST:event_btnContinuarActionPerformed


    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        String diaHoyText = this.txtFechaHoy.getText().trim();  // Obtener el valor de txtFechaHoy

        // Asegurarse de que los campos de inicio y final no estén vacíos
        String inicioText = this.txtInicio.getText().trim();
        String finText = this.txtFinal.getText().trim();

        if (diaHoyText.isEmpty() || inicioText.isEmpty() || finText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese todos los días.");
            return;
        }

        try {
            // Convertir los valores a enteros (día como número)
            int diaHoy = Integer.parseInt(diaHoyText);
            int diaInicio = Integer.parseInt(inicioText);
            int diaFin = Integer.parseInt(finText);

            if (fechaEstaEnRango()) {
                JOptionPane.showMessageDialog(this, "La fecha de hoy está dentro del rango permitido.");
                editar(evt);  // Procede a editar si la fecha es válida
                dialogoSelecFecha.setVisible(false); // Cierra el diálogo
            } else {
                JOptionPane.showMessageDialog(this, "La fecha de hoy NO está dentro del rango permitido.");
            }
        } catch (NumberFormatException e) {
            // Si no se puede convertir el texto a número
            JOptionPane.showMessageDialog(this, "Por favor ingrese un número válido para el día.");
        }

    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtFechaHoyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaHoyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaHoyActionPerformed

    private void txtInicio1nombre(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInicio1nombre
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInicio1nombre

    private void txtInicio2nombre(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInicio2nombre
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInicio2nombre

    private void txtFinal1apellido(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFinal1apellido
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFinal1apellido

    private void txtFinal2apellido(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFinal2apellido
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFinal2apellido

    private void txtFechaHoy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaHoy1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaHoy1ActionPerformed

    private void txtFechaHoy2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaHoy2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaHoy2ActionPerformed

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
            java.util.logging.Logger.getLogger(CrearEleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearEleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearEleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearEleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CrearEleccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntEditar;
    private javax.swing.JButton bntEliminar;
    private javax.swing.JButton bntGuardar;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JDialog dialogoSelecFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblCreacion;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtFechaHoy;
    private javax.swing.JTextField txtFechaHoy1;
    private javax.swing.JTextField txtFechaHoy2;
    private javax.swing.JTextField txtFinal;
    private javax.swing.JTextField txtFinal1;
    private javax.swing.JTextField txtFinal2;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtInicio;
    private javax.swing.JTextField txtInicio1;
    private javax.swing.JTextField txtInicio2;
    // End of variables declaration//GEN-END:variables
}