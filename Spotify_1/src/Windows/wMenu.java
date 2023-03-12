/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Windows;

/**
 *
 * @author Usuario
 */
public class wMenu extends javax.swing.JFrame {

    /**
     * Creates new form wMenu
     */
    public wMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        RegisterArtist = new javax.swing.JButton();
        registerSong = new javax.swing.JButton();
        Search = new javax.swing.JButton();
        Reproductor = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RegisterArtist.setText("Registrar Artista");
        RegisterArtist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterArtistActionPerformed(evt);
            }
        });
        jPanel1.add(RegisterArtist, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        registerSong.setText("Registrar Canción");
        registerSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerSongActionPerformed(evt);
            }
        });
        jPanel1.add(registerSong, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        Search.setText("BUSCAR");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        jPanel1.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, -1, -1));

        Reproductor.setText("REPRODUCIR");
        Reproductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReproductorActionPerformed(evt);
            }
        });
        jPanel1.add(Reproductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Menú Principal");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        exit.setText("SALIR");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/black.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 380));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void RegisterArtistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterArtistActionPerformed
        wRegisterArtist ra = new wRegisterArtist();
        this.setVisible(false);
        ra.setVisible(true);
    }//GEN-LAST:event_RegisterArtistActionPerformed

    private void registerSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerSongActionPerformed
        wRegisterSong rs = new wRegisterSong();
        this.setVisible(false);
        rs.setVisible(true);
    }//GEN-LAST:event_registerSongActionPerformed

    private void ReproductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReproductorActionPerformed
        wReproductor repro = new wReproductor();
        this.setVisible(false);
        repro.setVisible(true);
    }//GEN-LAST:event_ReproductorActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        wSearch search = new wSearch();
        this.setVisible(false);
        search.setVisible(true);
    }//GEN-LAST:event_SearchActionPerformed

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
            java.util.logging.Logger.getLogger(wMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(wMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(wMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(wMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new wMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RegisterArtist;
    private javax.swing.JButton Reproductor;
    private javax.swing.JButton Search;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton registerSong;
    // End of variables declaration//GEN-END:variables
}
