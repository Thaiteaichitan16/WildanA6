/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Form;
import Lib.OPetugas;
/**
 *
 * @author Lenovo
 */
public class Utama extends javax.swing.JFrame {

    /** Creates new form Utama */
    public Utama() {
        initComponents();
        ngaran.setText(OPetugas.getNama_petugas().toString());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        ngaran = new javax.swing.JMenu();
        Petugas = new javax.swing.JMenu();
        Kelas = new javax.swing.JMenu();
        Spp = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ngaran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ngaranMouseClicked(evt);
            }
        });
        ngaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ngaranActionPerformed(evt);
            }
        });
        jMenuBar1.add(ngaran);

        Petugas.setText("Petugas");
        Petugas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PetugasMouseClicked(evt);
            }
        });
        jMenuBar1.add(Petugas);

        Kelas.setText("Kelas");
        Kelas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KelasMouseClicked(evt);
            }
        });
        jMenuBar1.add(Kelas);

        Spp.setText("Spp");
        Spp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SppMouseClicked(evt);
            }
        });
        jMenuBar1.add(Spp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1008, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PetugasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PetugasMouseClicked
        // TODO add your handling code here:
        Petugas PS = new Petugas();
        desktopPane.add(PS);
        PS.setVisible(true);
    }//GEN-LAST:event_PetugasMouseClicked

    private void KelasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KelasMouseClicked
        // TODO add your handling code here:
        Kelas KS = new Kelas();
        desktopPane.add(KS);
        KS.setVisible(true);
    }//GEN-LAST:event_KelasMouseClicked

    private void SppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SppMouseClicked
        // TODO add your handling code here:
        Spp SP = new Spp();
        desktopPane.add(SP);
        SP.setVisible(true);
    }//GEN-LAST:event_SppMouseClicked

    private void ngaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ngaranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ngaranActionPerformed

    private void ngaranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ngaranMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ngaranMouseClicked

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
            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Utama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Kelas;
    private javax.swing.JMenu Petugas;
    private javax.swing.JMenu Spp;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu ngaran;
    // End of variables declaration//GEN-END:variables

}
