/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Brayan
 */
public class VentanaEditarProfesores extends javax.swing.JFrame {

    /**
     * Creates new form VentanaEDitar
     */
    Connection con;
    public VentanaEditarProfesores() {
        initComponents();
        setLocationRelativeTo(null);
        
         try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VentanaEditarProfesores.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Conexion No Exitosa...");
            
        }
    }
    
    private void limpiar(){
        tfBuscar.setText("");
        tfEditN.setText("");
        tfEditNP.setText("");
        tfEditNM.setText("");
        tfEditS.setText("");
        tfEditE.setText("");
        tfEditDireccion.setText("");
        tfEditNT.setText("");
        tfID.setText("");
    }
     
    void desbloquear(){
        tfBuscar.setEnabled(true);
        tfEditN.setEnabled(true);
        tfEditNP.setEnabled(true);
        tfEditNM.setEnabled(true);
        tfEditS.setEnabled(true);
        tfEditE.setEnabled(true);
        tfEditDireccion.setEnabled(true);
        tfEditNT.setEnabled(true);
        tfID.setEnabled(true);
    }
    
    void bloquear(){
        tfBuscar.setEnabled(false);
        tfEditN.setEnabled(false);
        tfEditNP.setEnabled(false);
        tfEditNM.setEnabled(false);
        tfEditS.setEnabled(false);
        tfEditE.setEnabled(false);
        tfEditDireccion.setEnabled(false);
        tfEditNT.setEnabled(false);
        tfID.setEnabled(false);
     }
    



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfBuscar = new javax.swing.JTextField();
        tfEditN = new javax.swing.JTextField();
        tfEditNP = new javax.swing.JTextField();
        tfEditNM = new javax.swing.JTextField();
        tfEditS = new javax.swing.JTextField();
        tfEditE = new javax.swing.JTextField();
        tfEditDireccion = new javax.swing.JTextField();
        tfEditNT = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnRegresarEdit = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        BtnAgregar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        tfID = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenu2.setText("jMenu2");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Matricula:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellido Paterno:");

        jLabel4.setText("Apellido Materno:");

        jLabel5.setText("Sexo:");

        jLabel6.setText("Edad:");

        jLabel7.setText("Direccion:");

        jLabel8.setText("Numero Telefonico:");

        tfBuscar.setEnabled(false);

        tfEditN.setEnabled(false);

        tfEditNP.setEnabled(false);

        tfEditNM.setEnabled(false);

        tfEditS.setEnabled(false);

        tfEditE.setEnabled(false);

        tfEditDireccion.setEnabled(false);

        tfEditNT.setEnabled(false);

        btnBuscar.setText("Buscar");
        btnBuscar.setEnabled(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnRegresarEdit.setText("Regresar");
        btnRegresarEdit.setEnabled(false);
        btnRegresarEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarEditActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");

        BtnAgregar.setText("Agregar");
        BtnAgregar.setEnabled(false);
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.setPreferredSize(new java.awt.Dimension(71, 23));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnConfirmar.setText("Confirmar");
        btnConfirmar.setEnabled(false);
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        tfID.setEnabled(false);

        jLabel9.setText("ID:");

        jMenu1.setText("Consultar");

        jMenuItem1.setText("Profesores");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setText("Salir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConfirmar)
                .addGap(54, 54, 54)
                .addComponent(BtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(btnRegresarEdit)
                .addGap(67, 67, 67))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfEditNT, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfEditDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfEditS, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfEditE, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfEditN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                .addComponent(tfEditNP, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfEditNM, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfEditN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfEditNP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tfEditNM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tfEditS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 14, Short.MAX_VALUE)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tfEditE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tfEditDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfEditNT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresarEdit)
                    .addComponent(BtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirmar))
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        tfBuscar.setEnabled(true);
        tfEditN.setEnabled(false);
        tfEditNP.setEnabled(false);
        tfEditNM.setEnabled(false);
        tfEditS.setEnabled(false);
        tfEditE.setEnabled(false);
        tfEditDireccion.setEnabled(false);
        tfEditNT.setEnabled(false);
        
        
        BtnAgregar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnRegresarEdit.setEnabled(true);
        btnNuevo.setEnabled(false);
        btnBuscar.setEnabled(true);
        btnEditar.setEnabled(false);
        btnConfirmar.setEnabled(false);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnRegresarEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarEditActionPerformed
        bloquear();
        
        BtnAgregar.setEnabled(false);
        btnEliminar.setEnabled(true);
        btnNuevo.setEnabled(true);
        btnEditar.setEnabled(true);
        btnBuscar.setEnabled(false);
        btnRegresarEdit.setEnabled(false);
        btnConfirmar.setEnabled(false);
        
        limpiar();
    }//GEN-LAST:event_btnRegresarEditActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.setVisible(false);
        ConsultaProfesores v = new ConsultaProfesores();
        v.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/BaseDeDatosFinal","root","mariobros25");          
        } catch (SQLException ex) {
            Logger.getLogger(VentanaEditarProfesores.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Conexion con la BD no Exitosa");
        }
        
        try {
            PreparedStatement pps = con.prepareStatement("INSERT INTO Profesores(Matricula,Nombre,ApellidoPaterno,ApellidoMaterno,Sexo,Edad,Direccion,NumeroTelefonico) VALUES(?,?,?,?,?,?,?,?)");
            pps.setString(1, tfBuscar.getText());
            pps.setString(2, tfEditN.getText());
            pps.setString(3, tfEditNP.getText());
            pps.setString(4, tfEditNM.getText());
            pps.setString(5, tfEditS.getText());
            pps.setString(6, tfEditE.getText());
            pps.setString(7, tfEditDireccion.getText());
            pps.setString(8, tfEditNT.getText());
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Guardados");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Datos no Guardados");
        }
        
        limpiar();
        bloquear();
        btnEditar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnBuscar.setEnabled(false);
        BtnAgregar.setEnabled(false);
        btnRegresarEdit.setEnabled(false);
        btnNuevo.setEnabled(true);
    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        desbloquear();
        tfID.setEnabled(false);
        
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnBuscar.setEnabled(false);
        BtnAgregar.setEnabled(true);
        btnRegresarEdit.setEnabled(true);
        btnNuevo.setEnabled(false);
        btnConfirmar.setEnabled(false);
        
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        this.setVisible(false);
        VentanaPrincipalM ventana = new VentanaPrincipalM();
        ventana.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        ResultSet rs = null;
        
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/BaseDeDatosFinal","root","mariobros25");          
        } catch (SQLException ex) {
            Logger.getLogger(VentanaEditarProfesores.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Conexion con la BD no Exitosa");
        }
        
        
        try{
            PreparedStatement pps = con.prepareStatement("SELECT * FROM Profesores WHERE Matricula = ?");
            pps.setString(1, tfBuscar.getText());
            
            rs = pps.executeQuery();
            
            desbloquear();
            
            if(rs.next()){
                tfID.setText(rs.getString("ID_Profesores"));
                tfBuscar.setText(rs.getString("Matricula"));
                tfEditN.setText(rs.getString("Nombre"));
                tfEditNP.setText(rs.getString("ApellidoPaterno"));
                tfEditNM.setText(rs.getString("ApellidoMaterno"));
                tfEditS.setText(rs.getString("Sexo"));
                tfEditE.setText(rs.getString("Edad"));
                tfEditDireccion.setText(rs.getString("Direccion"));
                tfEditNT.setText(rs.getString("NumeroTelefonico"));
                
                btnConfirmar.setEnabled(true);
                tfID.setEnabled(false);
                
            }else{
                
                limpiar();
                
                tfBuscar.setEnabled(true);
                tfEditN.setEnabled(false);
                tfEditNP.setEnabled(false);
                tfEditNM.setEnabled(false);
                tfEditS.setEnabled(false);
                tfEditE.setEnabled(false);
                tfEditDireccion.setEnabled(false);
                tfEditNT.setEnabled(false);
                tfID.setEnabled(false);
       
                BtnAgregar.setEnabled(false);
                btnEliminar.setEnabled(false);
                btnRegresarEdit.setEnabled(true);
                btnNuevo.setEnabled(false);
                btnEditar.setEnabled(false);
                btnConfirmar.setEnabled(false);
                btnBuscar.setEnabled(true);

                JOptionPane.showMessageDialog(null, "No existe un Profesor con esa Matricula ");

            }
            
        }catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Busqueda no encontrada");
        }
            
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/BaseDeDatosFinal","root","mariobros25");          
        } catch (SQLException ex) {
            Logger.getLogger(VentanaEditarProfesores.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Conexion con la BD no Exitosa");
        }
        
        try {
            PreparedStatement pps = con.prepareStatement("UPDATE Profesores SET Matricula=?, Nombre=?, ApellidoPaterno=?, ApellidoMaterno=?, Sexo=?, Edad=?, Direccion=?, NumeroTelefonico=? WHERE ID_Profesores=?");
            pps.setString(1, tfBuscar.getText());
            pps.setString(2, tfEditN.getText());
            pps.setString(3, tfEditNP.getText());
            pps.setString(4, tfEditNM.getText());
            pps.setString(5, tfEditS.getText());
            pps.setString(6, tfEditE.getText());
            pps.setString(7, tfEditDireccion.getText());
            pps.setString(8, tfEditNT.getText());
            pps.setString(9, tfID.getText());

            
            int res = pps.executeUpdate();
            
            if(res > 0){
                JOptionPane.showMessageDialog(null, "Profesor Modificado");
            }else{
                JOptionPane.showMessageDialog(null, "Profesor no Modificado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Datos no Guardados");
        }
        
        limpiar();
        bloquear();
        
        BtnAgregar.setEnabled(false);
        btnEliminar.setEnabled(true);
        btnRegresarEdit.setEnabled(false);
        btnNuevo.setEnabled(true);
        btnBuscar.setEnabled(false);
        btnEditar.setEnabled(true);
        btnConfirmar.setEnabled(false);
    }//GEN-LAST:event_btnConfirmarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaEditarProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEditarProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEditarProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEditarProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(VentanaEditarProfesores.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(VentanaEditarProfesores.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(VentanaEditarProfesores.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(VentanaEditarProfesores.class.getName()).log(Level.SEVERE, null, ex);
                }
                new VentanaEditarProfesores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRegresarEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JTextField tfBuscar;
    private javax.swing.JTextField tfEditDireccion;
    private javax.swing.JTextField tfEditE;
    private javax.swing.JTextField tfEditN;
    private javax.swing.JTextField tfEditNM;
    private javax.swing.JTextField tfEditNP;
    private javax.swing.JTextField tfEditNT;
    private javax.swing.JTextField tfEditS;
    private javax.swing.JTextField tfID;
    // End of variables declaration//GEN-END:variables
}