/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.Metodos;
import Modelo.Especialidad;
import Modelo.Horario;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author benja
 */
public class HoraDisponible extends javax.swing.JFrame {

    /**
     * Creates new form HoraDisponible
     */
    Metodos me = new Metodos();
    public HoraDisponible() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtb_Disponible = new javax.swing.JTable();
        jbtn_Mostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(224, 228, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(224, 228, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Reserva de Citas");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 900, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Horas Disponibles");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 60));

        jPanel4.setBackground(new java.awt.Color(167, 219, 216));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtb_Disponible.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Hora", "Rut Doctor", "Estado"
            }
        ));
        jScrollPane1.setViewportView(jtb_Disponible);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 710, 160));

        jbtn_Mostrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtn_Mostrar.setText("Mostrar");
        jbtn_Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_MostrarActionPerformed(evt);
            }
        });
        jPanel4.add(jbtn_Mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 900, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_MostrarActionPerformed
        // TODO add your handling code here:
        
        String numrut,estado,hora;
        int dia,mes,ano;
        
        DefaultTableModel modelo = (DefaultTableModel) this.jtb_Disponible.getModel();
        
        ArrayList<Horario> lista = me.obtenerHorarios();
        
        for (Horario horario : lista) {
            numrut = horario.getNumRut();
            estado = horario.getEstado();
            hora = horario.getHora();
            dia = horario.getDia();
            mes = horario.getMes();
            ano = horario.getAno();
            
            if (estado == "1") {
                estado = "Dispobible"; 
            }else{
                estado = "Reservado";
            }
            
            modelo.addRow(new Object [] {dia+"/"+mes+"/"+ano,hora,numrut,estado});
        }
        
       
        
        

        
        
        
        
         
        
    }//GEN-LAST:event_jbtn_MostrarActionPerformed

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
            java.util.logging.Logger.getLogger(HoraDisponible.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HoraDisponible.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HoraDisponible.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HoraDisponible.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HoraDisponible().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtn_Mostrar;
    private javax.swing.JTable jtb_Disponible;
    // End of variables declaration//GEN-END:variables
}
