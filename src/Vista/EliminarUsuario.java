/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package Vista;

import Controlador.Metodos;
import javax.swing.JOptionPane;

/**
 *
 * @author Dixon Tapia Aguilera
 */
public class EliminarUsuario extends javax.swing.JFrame {

    /** Creates new form EliminarUsuario */
    public EliminarUsuario() {
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtxt_rutUsuario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbtn_eliminar = new javax.swing.JButton();
        jbtn_cancelar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Eliminando Usuario");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(224, 228, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Eliminar Usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 60));

        jPanel2.setBackground(new java.awt.Color(167, 219, 216));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("RUT Usuario:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));

        jtxt_rutUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_rutUsuarioActionPerformed(evt);
            }
        });
        jPanel2.add(jtxt_rutUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 310, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Nombre", "Correo", "Teléfono", "Fecha Nacimiento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 690, 110));

        jbtn_eliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtn_eliminar.setText("Eliminar");
        jbtn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_eliminarActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, -1, -1));

        jbtn_cancelar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtn_cancelar.setText("Cancelar");
        jPanel2.add(jbtn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 900, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxt_rutUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_rutUsuarioActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jtxt_rutUsuarioActionPerformed

    private void jbtn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_eliminarActionPerformed
        // TODO add your handling code here:
        
        String rut;
        
        rut = this.jtxt_rutUsuario.getText();
        
        Metodos metodos = new Metodos();
        
        int opcion = JOptionPane.showConfirmDialog(this,"¿Seguro desea Eliminar?","Eliminar", 0);
        
        if (opcion == 0) {
            metodos.eliminarUsuario(rut);
            JOptionPane.showMessageDialog(null,"Usuario Eliminado", "Eliminar",1);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Acción Eliminar Usuario Cancelada","Eliminar",2);
        }
        
    }//GEN-LAST:event_jbtn_eliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(EliminarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtn_cancelar;
    private javax.swing.JButton jbtn_eliminar;
    private javax.swing.JTextField jtxt_rutUsuario;
    // End of variables declaration//GEN-END:variables

}
