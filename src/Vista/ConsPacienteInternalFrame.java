/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rolan
 */
public class ConsPacienteInternalFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form ConsPacienteInternalFrame
     */
    public Controlador.GestorPacienteControlador gestorPacienteControlador;
    private DefaultTableModel tabla;
    public ConsPacienteInternalFrame() {
        initComponents();
        gestorPacienteControlador=new Controlador.GestorPacienteControlador(this);
        String titulosTabla[]={"Identificación","Nombre","Apellidos","Fecha Nacimiento","Genero"};
        tabla=new DefaultTableModel(null,titulosTabla);
        Tbl_datos.setModel(tabla);
        btn_aceptar.addActionListener(gestorPacienteControlador);
    }

    public DefaultTableModel getTableModel(){
        return tabla;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        rdb_identificacion = new javax.swing.JRadioButton();
        rdb_nombres = new javax.swing.JRadioButton();
        rdb_apellidos = new javax.swing.JRadioButton();
        rdb_genero = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        txt_valor = new javax.swing.JTextField();
        btn_aceptar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_datos = new javax.swing.JTable();

        setTitle("Consultar paciente");

        buttonGroup1.add(rdb_identificacion);
        rdb_identificacion.setText("Identificación");

        buttonGroup1.add(rdb_nombres);
        rdb_nombres.setText("Nombres");

        buttonGroup1.add(rdb_apellidos);
        rdb_apellidos.setText("Apellidos");
        rdb_apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_apellidosActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdb_genero);
        rdb_genero.setText("Genero");

        jLabel1.setText("Valor a buscar");

        txt_valor.setName("ValorTxt"); // NOI18N
        txt_valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_valorActionPerformed(evt);
            }
        });

        btn_aceptar.setText("Aceptar");
        btn_aceptar.setName("AceptarBtn"); // NOI18N

        Tbl_datos.setModel(new javax.swing.table.DefaultTableModel(
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
        Tbl_datos.setName("ResultadosTbl"); // NOI18N
        jScrollPane1.setViewportView(Tbl_datos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rdb_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdb_nombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdb_apellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdb_genero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txt_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_aceptar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdb_identificacion)
                    .addComponent(rdb_nombres)
                    .addComponent(rdb_apellidos)
                    .addComponent(rdb_genero))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_aceptar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdb_apellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_apellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdb_apellidosActionPerformed

    private void txt_valorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_valorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_valorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable Tbl_datos;
    public javax.swing.JButton btn_aceptar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JRadioButton rdb_apellidos;
    public javax.swing.JRadioButton rdb_genero;
    public javax.swing.JRadioButton rdb_identificacion;
    public javax.swing.JRadioButton rdb_nombres;
    public javax.swing.JTextField txt_valor;
    // End of variables declaration//GEN-END:variables
}
