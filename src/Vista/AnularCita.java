/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package Vista;

import Controlador.MetodoAnularCita;
import Modelo.Cita;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dixon Tapia Aguilera
 */
public class AnularCita extends javax.swing.JFrame {

    /** Creates new form AnularCita */
    public AnularCita() {
        initComponents();
        setSize(900,600);
        setResizable(false);
        setLocationRelativeTo(null);
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // </editor-fold>
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtxt_rutDelUsuario = new javax.swing.JTextField();
        jbtn_ok = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbl_citas = new javax.swing.JTable();
        jbtn_cancelar = new javax.swing.JButton();
        jbtn_anular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Anulando Cita");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(224, 228, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Anular Cita");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 60));

        jPanel2.setBackground(new java.awt.Color(167, 219, 216));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Ingrese Rut del Usuario:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 140, 50));

        jtxt_rutDelUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_rutDelUsuarioActionPerformed(evt);
            }
        });
        jPanel2.add(jtxt_rutDelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 290, 30));

        jbtn_ok.setText("OK");
        jbtn_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_okActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn_ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, -1, 30));

        jtbl_citas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Cita", "Rut Usuario", "Fecha Cita", "Hora Cita", "Rut Médico"
            }
        ));
        jScrollPane1.setViewportView(jtbl_citas);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 120, 740, 270));

        jbtn_cancelar.setText("CANCELAR");
        jbtn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_cancelarActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 440, 170, 50));

        jbtn_anular.setText("ANULAR CITA");
        jbtn_anular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_anularActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn_anular, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 170, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 900, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_anularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_anularActionPerformed
        // TODO add your handling code here:
    // Obtener el RUT del usuario desde el campo de texto
        String rutUsuario = jtxt_rutDelUsuario.getText();
        // Obtener la fila seleccionada en la tabla de citas
        int selectedRow = jtbl_citas.getSelectedRow();
        
        if (selectedRow != -1) {
            // Obtener el ID de la cita seleccionada
            int idCita = (int) jtbl_citas.getValueAt(selectedRow, 0);
            MetodoAnularCita metodos = new MetodoAnularCita();
            // Confirmar la acción de anulación
            int opcion = JOptionPane.showConfirmDialog(this, "¿Seguro desea anular la cita?", "Anular Cita", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                // Anular la cita
                metodos.anularCita(idCita);
                JOptionPane.showMessageDialog(this, "Cita anulada exitosamente.");
                // Recargar las citas del usuario
                cargarCitas(rutUsuario);
            } else {
                JOptionPane.showMessageDialog(this, "Acción de anulación cancelada.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una cita para anular.");
        }
    }//GEN-LAST:event_jbtn_anularActionPerformed

    private void jtxt_rutDelUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_rutDelUsuarioActionPerformed
        // TODO add your handling code here:
        cargarCitas(jtxt_rutDelUsuario.getText());
        
    }//GEN-LAST:event_jtxt_rutDelUsuarioActionPerformed

    private void jbtn_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_okActionPerformed
        // TODO add your handling code here:
        String rutUsuario = jtxt_rutDelUsuario.getText();

    // Si el RUT está vacío o inválido, muestra un mensaje
    if (rutUsuario.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Ingrese un RUT válido.");
        return;
    }

    // Llama a la función para cargar las citas del usuario
    cargarCitas(rutUsuario);

    // Si se necesita limpiar el RUT después de cargar las citas, puedes hacerlo aquí
    limpiarRut();
        
    }//GEN-LAST:event_jbtn_okActionPerformed

    private void jbtn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_cancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        
    }//GEN-LAST:event_jbtn_cancelarActionPerformed

    private void cargarCitas(String rutUsuario) {
        MetodoAnularCita metodos = new MetodoAnularCita();
        DefaultTableModel modelo = (DefaultTableModel) jtbl_citas.getModel();
        modelo.setRowCount(0);

        List<Cita> citas = metodos.obtenerCitasPorRut(rutUsuario);
        if (citas.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se registran citas para el RUT proporcionado.");
        } else {
            for (Cita cita : citas) {
                modelo.addRow(new Object[]{cita.getIdCita(), cita.getNumRutUsuario(), cita.getFechaCita(), cita.getHoraCita(), cita.getNumRutMedico()});
            }
        }
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
            java.util.logging.Logger.getLogger(AnularCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnularCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnularCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnularCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AnularCita().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtn_anular;
    private javax.swing.JButton jbtn_cancelar;
    private javax.swing.JButton jbtn_ok;
    private javax.swing.JTable jtbl_citas;
    private javax.swing.JTextField jtxt_rutDelUsuario;
    // End of variables declaration//GEN-END:variables

    private String limpiarRut() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
