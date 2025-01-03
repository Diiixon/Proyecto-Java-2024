/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package Vista;

import Controlador.Metodos;
import Modelo.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author Dixon Tapia Aguilera
 */
public class ActualizarUsuario extends javax.swing.JFrame {

    /** Creates new form ActualizarUsuario */
    public ActualizarUsuario() {
        initComponents();
        setSize(900, 600);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jbtn_buscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jtxt_buscarRut = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxt_nombre = new javax.swing.JTextField();
        jtxt_dia = new javax.swing.JTextField();
        jtxt_correo = new javax.swing.JTextField();
        jtxt_telefono = new javax.swing.JTextField();
        jtxt_mes = new javax.swing.JTextField();
        jtxt_ano = new javax.swing.JTextField();
        jbtn_actualizar = new javax.swing.JButton();
        jbtn_cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Actualizando Usuario");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(224, 228, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Actualizar Datos Usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 60));

        jPanel2.setBackground(new java.awt.Color(167, 219, 216));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtn_buscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtn_buscar.setText("Buscar");
        jbtn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_buscarActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("RUT:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));
        jPanel2.add(jtxt_buscarRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 310, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Nombre: ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Fecha Nacimiento:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Correo:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Teléfono:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, -1, -1));
        jPanel2.add(jtxt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 310, 30));
        jPanel2.add(jtxt_dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 90, 30));
        jPanel2.add(jtxt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 310, 30));
        jPanel2.add(jtxt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 310, 30));
        jPanel2.add(jtxt_mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 90, 30));
        jPanel2.add(jtxt_ano, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 90, 30));

        jbtn_actualizar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtn_actualizar.setText("Actualizar");
        jbtn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_actualizarActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, -1, -1));

        jbtn_cancelar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtn_cancelar.setText("Cancelar");
        jbtn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_cancelarActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 900, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_cancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jbtn_cancelarActionPerformed

    private void jbtn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_buscarActionPerformed
        // TODO add your handling code here:
        
        String rut = this.jtxt_buscarRut.getText();
        
        Metodos metodos = new Metodos();
        
        Usuario usuario = metodos.buscarUsuario(rut);
        
        if (usuario.getNumRut() != "") {
            
            String nombre = usuario.getNombre();
            int dia = usuario.getDia();
            int mes = usuario.getMes();
            int ano = usuario.getAno();
            String correo = usuario.getCorreo();
            int telefono = usuario.getNumTelefono();
            
            this.jtxt_nombre.setText(nombre);
            this.jtxt_dia.setText(String.valueOf(dia));
            this.jtxt_mes.setText(String.valueOf(mes));
            this.jtxt_ano.setText(String.valueOf(ano));
            this.jtxt_correo.setText(correo);
            this.jtxt_telefono.setText(String.valueOf(telefono));
            this.jtxt_buscarRut.setEnabled(false);
            
        }else{
            JOptionPane.showMessageDialog(this, "Persona no Existe", "Actualizar", 2);
            this.jtxt_buscarRut.setText("");
            this.jtxt_buscarRut.requestFocus();
        }
        
    }//GEN-LAST:event_jbtn_buscarActionPerformed

    private void jbtn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_actualizarActionPerformed
        // TODO add your handling code here:
        
        String rut,nombre,correo;
        int dia, mes, ano, telefono;
        
        rut = this.jtxt_buscarRut.getText();
        nombre = this.jtxt_nombre.getText();
        dia = Integer.parseInt(this.jtxt_dia.getText());
        mes = Integer.parseInt(this.jtxt_mes.getText());
        ano = Integer.parseInt(this.jtxt_ano.getText());
        correo = this.jtxt_correo.getText();
        telefono = Integer.parseInt(this.jtxt_telefono.getText());
        
        Usuario usuario = new Usuario(dia, mes, ano, rut, nombre, correo, telefono);
        Metodos metodos = new Metodos();
        metodos.actualizarUsuario(usuario);
        JOptionPane.showMessageDialog(this,"Actualizar Datos", "Actualizar",2);
        this.jtxt_buscarRut.setText("");
        this.jtxt_nombre.setText("");
        this.jtxt_dia.setText("");
        this.jtxt_mes.setText("");
        this.jtxt_ano.setText("");
        this.jtxt_correo.setText("");
        this.jtxt_telefono.setText("");
        this.jtxt_buscarRut.setEnabled(true);
        this.jtxt_buscarRut.requestFocus();
           
    }//GEN-LAST:event_jbtn_actualizarActionPerformed

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
            java.util.logging.Logger.getLogger(ActualizarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActualizarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActualizarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActualizarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActualizarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtn_actualizar;
    private javax.swing.JButton jbtn_buscar;
    private javax.swing.JButton jbtn_cancelar;
    private javax.swing.JTextField jtxt_ano;
    private javax.swing.JTextField jtxt_buscarRut;
    private javax.swing.JTextField jtxt_correo;
    private javax.swing.JTextField jtxt_dia;
    private javax.swing.JTextField jtxt_mes;
    private javax.swing.JTextField jtxt_nombre;
    private javax.swing.JTextField jtxt_telefono;
    // End of variables declaration//GEN-END:variables

}
