/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package Vista;

import Controlador.Metodos;
import Modelo.Horario;
import Modelo.Medico;
import javax.swing.JOptionPane;

/**
 *
 * @author Dixon Tapia Aguilera
 */
public class IngresarHorario extends javax.swing.JFrame {

    Metodos me = new Metodos();
    /** Creates new form IngresarHorario */
    public IngresarHorario() {
        initComponents();
        setSize(900,600);
        setResizable(false);
        setLocationRelativeTo(null);
        me.RellenarCombo("MEDICO", "NOMBRE_MEDICO", jcbx_medico);
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
        jLabel2 = new javax.swing.JLabel();
        jcbx_medico = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxt_dia = new javax.swing.JTextField();
        jtxt_mes = new javax.swing.JTextField();
        jtxt_ano = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtxt_hora = new javax.swing.JTextField();
        jbtn_guardar = new javax.swing.JButton();
        jbtn_cancelar = new javax.swing.JButton();
        jtxt_rutMedico = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ingresando horarios");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(224, 228, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Ingresar Horario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 60));

        jPanel2.setBackground(new java.awt.Color(167, 219, 216));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Médico:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));

        jcbx_medico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Seleccione --" }));
        jcbx_medico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbx_medicoActionPerformed(evt);
            }
        });
        jPanel2.add(jcbx_medico, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 310, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Día:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Mes:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Año:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, -1, -1));
        jPanel2.add(jtxt_dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 90, 30));
        jPanel2.add(jtxt_mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 90, 30));
        jPanel2.add(jtxt_ano, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 90, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Hora:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, -1, -1));
        jPanel2.add(jtxt_hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 280, 90, 30));

        jbtn_guardar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtn_guardar.setText("Guardar");
        jbtn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_guardarActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, -1, -1));

        jbtn_cancelar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtn_cancelar.setText("Cancelar");
        jbtn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_cancelarActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, -1, -1));
        jPanel2.add(jtxt_rutMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 310, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("RUT Médico:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 900, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_cancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jbtn_cancelarActionPerformed

    private void jcbx_medicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbx_medicoActionPerformed
        // TODO add your handling code here:
        Metodos metodos = new Metodos();
        String rut,nombre;
        
        nombre = (String) jcbx_medico.getSelectedItem();
        rut = metodos.obtenerRutMedico(nombre);
        this.jtxt_rutMedico.setText(rut);
        
        
        
    }//GEN-LAST:event_jcbx_medicoActionPerformed

    private void jbtn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_guardarActionPerformed
        // TODO add your handling code here:
        Metodos metodos = new Metodos();
        Horario horario = new Horario();
        
        int dia = Integer.parseInt(this.jtxt_dia.getText());
        int mes = Integer.parseInt(this.jtxt_mes.getText());
        int ano = Integer.parseInt(this.jtxt_ano.getText());
        String hora = this.jtxt_hora.getText();
        String rut = this.jtxt_rutMedico.getText();
        String estado = "1";
        
        horario.setDia(dia);
        horario.setMes(mes);
        horario.setAno(ano);
        horario.setHora(hora);
        horario.setNumRut(rut);
        horario.setEstado(estado);
        
        metodos.agregarHoras(horario);
        
        JOptionPane.showMessageDialog(null, "Hora registrada correctamente!","Hora Registrada",0);
    }//GEN-LAST:event_jbtn_guardarActionPerformed

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
            java.util.logging.Logger.getLogger(IngresarHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresarHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresarHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresarHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresarHorario().setVisible(true);
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtn_cancelar;
    private javax.swing.JButton jbtn_guardar;
    private javax.swing.JComboBox<String> jcbx_medico;
    private javax.swing.JTextField jtxt_ano;
    private javax.swing.JTextField jtxt_dia;
    private javax.swing.JTextField jtxt_hora;
    private javax.swing.JTextField jtxt_mes;
    private javax.swing.JTextField jtxt_rutMedico;
    // End of variables declaration//GEN-END:variables

}
