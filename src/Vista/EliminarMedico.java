/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.Metodos;
import Modelo.Medico;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author benja
 */
public class EliminarMedico extends javax.swing.JFrame {

    /**
     * Creates new form EliminarMedico
     */
    public EliminarMedico() {
        initComponents();
        setSize(900,600);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtxt_rutMedico = new javax.swing.JTextField();
        jbtn_buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbl_medicos = new javax.swing.JTable();
        jbtn_eliminar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Eliminando Médico");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(224, 228, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Eliminar Médico");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 60));

        jPanel2.setBackground(new java.awt.Color(167, 219, 216));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("RUT Médico");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));
        jPanel2.add(jtxt_rutMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 310, 30));

        jbtn_buscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtn_buscar.setText("Buscar");
        jbtn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_buscarActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, -1, -1));

        jtbl_medicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RUT", "Nombre", "Correo", "Telefono", "Especialidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtbl_medicos);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 720, 110));

        jbtn_eliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtn_eliminar.setText("Eliminar");
        jbtn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_eliminarActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, -1, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 900, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jbtn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_buscarActionPerformed
        // TODO add your handling code here:
        
        String rut, nombre, correo;
        int telefono, idEspecialidad;
        
        Metodos metodos = new Metodos();
        DefaultTableModel modelo = (DefaultTableModel) this.jtbl_medicos.getModel();
        
        modelo.setRowCount(0);
        
        ArrayList<Medico> lista = metodos.buscarMedico(this.jtxt_rutMedico.getText());
        
        for (Medico medico : lista) {
            rut = medico.getNumRut();
            nombre = medico.getNombre();
            correo = medico.getCorreo();
            telefono = medico.getNumTelefono();
            idEspecialidad = medico.getIdEspecialidad();
            
            modelo.addRow(new Object [] {rut,nombre,correo,telefono,idEspecialidad});
        }
        
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Médico no exise en los registros","No Encontrado",0);
        }

    }//GEN-LAST:event_jbtn_buscarActionPerformed

    private void jbtn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_eliminarActionPerformed
        // TODO add your handling code here:
        
        String rut;
        
        rut = this.jtxt_rutMedico.getText();
        
        Metodos metodos = new Metodos();
        
        int opcion = JOptionPane.showConfirmDialog(this, "¿Seguro desea Eliminar?","Eliminar",0 );
        
        if (opcion == 0) {
            metodos.eliminarMedico(rut);
            JOptionPane.showMessageDialog(null, "Médico Eliminado","Eliminar",1);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Acción Eliminar Médico Cancelada","Eliminar",2);
        }
    }//GEN-LAST:event_jbtn_eliminarActionPerformed

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
            java.util.logging.Logger.getLogger(EliminarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtn_buscar;
    private javax.swing.JButton jbtn_eliminar;
    private javax.swing.JTable jtbl_medicos;
    private javax.swing.JTextField jtxt_rutMedico;
    // End of variables declaration//GEN-END:variables
}
