/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author rolan
 */
public class RegpacienteInternalFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form RegpacienteInternalFrame
     */
    private Controlador.PacienteControlador pacienteControlador;
    public RegpacienteInternalFrame() {
        initComponents();
        pacienteControlador=new Controlador.PacienteControlador(this);
        jButton1.addActionListener(pacienteControlador);
        jButton2.addActionListener(pacienteControlador);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_identificacion = new javax.swing.JTextField();
        txt_nombres = new javax.swing.JTextField();
        txt_apellidos = new javax.swing.JTextField();
        rdb_masculino = new javax.swing.JRadioButton();
        rdb_femenino = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Dtd_fecha_nacimiento = new com.toedter.calendar.JDateChooser();

        setTitle("Registro de pacientes");

        jLabel1.setText("Identificación:");

        jLabel2.setText("Nombres:");

        jLabel3.setText("Apellidos:");

        jLabel4.setText("Fecha de nacimiento:");

        jLabel5.setText("Genero:");

        txt_identificacion.setName("IdentificacionTxt"); // NOI18N
        txt_identificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_identificacionActionPerformed(evt);
            }
        });

        txt_nombres.setName("NombresTxt"); // NOI18N

        txt_apellidos.setName("ApellidosTxt"); // NOI18N

        buttonGroup1.add(rdb_masculino);
        rdb_masculino.setText("M");
        rdb_masculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_masculinoActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdb_femenino);
        rdb_femenino.setText("F");

        jButton1.setText("Registrar");
        jButton1.setName("RegistrarBtn"); // NOI18N

        jButton2.setText("Nuevo");
        jButton2.setName("NuevoBtn"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdb_masculino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdb_femenino)
                .addContainerGap(202, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nombres, javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txt_apellidos, javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txt_identificacion)
                            .addComponent(Dtd_fecha_nacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(txt_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Dtd_fecha_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdb_masculino)
                        .addComponent(rdb_femenino)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_identificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_identificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_identificacionActionPerformed

    private void rdb_masculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_masculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdb_masculinoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public com.toedter.calendar.JDateChooser Dtd_fecha_nacimiento;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JRadioButton rdb_femenino;
    public javax.swing.JRadioButton rdb_masculino;
    public javax.swing.JTextField txt_apellidos;
    public javax.swing.JTextField txt_identificacion;
    public javax.swing.JTextField txt_nombres;
    // End of variables declaration//GEN-END:variables
}
