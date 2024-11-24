/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author dtazu
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jbtn_anularCita = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jmi_verUsuarios = new javax.swing.JMenuItem();
        jmi_verMedicos = new javax.swing.JMenuItem();
        jmi_verEspecialidades = new javax.swing.JMenuItem();
        jmi_eliminarUsuario = new javax.swing.JMenuItem();
        jmi_eliminarMedico = new javax.swing.JMenuItem();
        jmi_eliminarEspecialidad = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Centro Médico");
        setBackground(new java.awt.Color(167, 219, 216));
        setPreferredSize(new java.awt.Dimension(900, 600));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(167, 219, 216));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Reservar Cita");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 200, 100));

        jbtn_anularCita.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtn_anularCita.setText("Anular Cita");
        jbtn_anularCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_anularCitaActionPerformed(evt);
            }
        });
        jPanel1.add(jbtn_anularCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, 200, 100));

        jbtn_horaDisponible.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtn_horaDisponible.setText("Horas Disponibles");
        jbtn_horaDisponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_horaDisponibleActionPerformed(evt);
            }
        });
        jPanel1.add(jbtn_horaDisponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 200, 100));

        jMenuBar1.setPreferredSize(new java.awt.Dimension(116, 30));

        jMenu1.setText("Opciones");

        jMenuItem2.setText("Registrar Usuario");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Registrar Médico");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Registrar Especialidad");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jmi_verUsuarios.setText("Ver Usuarios");
        jmi_verUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_verUsuariosActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_verUsuarios);

        jmi_verMedicos.setText("Ver Médicos");
        jmi_verMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_verMedicosActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_verMedicos);

        jmi_verEspecialidades.setText("Ver Especialidades");
        jmi_verEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_verEspecialidadesActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_verEspecialidades);

        jmi_eliminarUsuario.setText("Eliminar Usuario");
        jmi_eliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_eliminarUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_eliminarUsuario);

        jmi_eliminarMedico.setText("Eliminar Médico");
        jmi_eliminarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_eliminarMedicoActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_eliminarMedico);

        jmi_eliminarEspecialidad.setText("Eliminar Especialidad");
        jmi_eliminarEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_eliminarEspecialidadActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_eliminarEspecialidad);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        
        RegistrarUsuario ru = new RegistrarUsuario();
        ru.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        
        RegistrarMedico rm = new RegistrarMedico();
        rm.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        RegistrarEspecialidad re = new RegistrarEspecialidad();
        re.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jbtn_horaDisponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_horaDisponibleActionPerformed
        // TODO add your handling code here:
       HoraDisponible hb = new HoraDisponible();
       hb.setVisible(true);
        
    }//GEN-LAST:event_jbtn_horaDisponibleActionPerformed

    private void jmi_verMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_verMedicosActionPerformed
        // TODO add your handling code here:
        
        ListarMedicos lm = new ListarMedicos();
        lm.setVisible(true);
    }//GEN-LAST:event_jmi_verMedicosActionPerformed

    private void jmi_eliminarEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_eliminarEspecialidadActionPerformed
        // TODO add your handling code here:
        EliminarEspecialidad ee = new EliminarEspecialidad();
        ee.setVisible(true);
    }//GEN-LAST:event_jmi_eliminarEspecialidadActionPerformed

    private void jmi_verUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_verUsuariosActionPerformed
        // TODO add your handling code here:
        
        ListarUsuarios lu = new ListarUsuarios();
        lu.setVisible(true);
    }//GEN-LAST:event_jmi_verUsuariosActionPerformed

    private void jmi_verEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_verEspecialidadesActionPerformed
        // TODO add your handling code here:
        
        VerEspecialidades ve = new VerEspecialidades();
        ve.setVisible(true);
    }//GEN-LAST:event_jmi_verEspecialidadesActionPerformed

    private void jmi_eliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_eliminarUsuarioActionPerformed
        // TODO add your handling code here:
        
        EliminarUsuario eu = new EliminarUsuario();
        eu.setVisible(true);
    }//GEN-LAST:event_jmi_eliminarUsuarioActionPerformed

    private void jmi_eliminarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_eliminarMedicoActionPerformed
        // TODO add your handling code here:
        EliminarMedico em = new EliminarMedico();
        em.setVisible(true);
    }//GEN-LAST:event_jmi_eliminarMedicoActionPerformed

    private void jbtn_anularCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_anularCitaActionPerformed
        // TODO add your handling code here:
        AnularCita ac = new AnularCita();
        ac.setVisible(true);
        
    }//GEN-LAST:event_jbtn_anularCitaActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtn_anularCita;
    private javax.swing.JMenuItem jmi_eliminarEspecialidad;
    private javax.swing.JMenuItem jmi_eliminarMedico;
    private javax.swing.JMenuItem jmi_eliminarUsuario;
    private javax.swing.JMenuItem jmi_verEspecialidades;
    private javax.swing.JMenuItem jmi_verMedicos;
    private javax.swing.JMenuItem jmi_verUsuarios;
    // End of variables declaration//GEN-END:variables
}
