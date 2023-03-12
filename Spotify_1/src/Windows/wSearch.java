/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Windows;

import spotify.NodoArtist;
import static Windows.WelcomeWindow.artists;
import javax.swing.JOptionPane;
import spotify.NodoSong;

/**
 *
 * @author Usuario
 */
public class wSearch extends javax.swing.JFrame {

    /**
     * Creates new form wSearch
     */
    public wSearch() {
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

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        screen = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameAIn = new javax.swing.JTextField();
        nameSIn = new javax.swing.JTextField();
        YearIn = new javax.swing.JTextField();
        LangIn = new javax.swing.JTextField();
        searchArtist = new javax.swing.JButton();
        searchSong = new javax.swing.JButton();
        searchYear = new javax.swing.JButton();
        searchLanguage = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        screen.setBackground(new java.awt.Color(51, 51, 51));
        screen.setColumns(20);
        screen.setForeground(new java.awt.Color(51, 255, 0));
        screen.setRows(5);
        jScrollPane1.setViewportView(screen);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 570, 180));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Búsqueda");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Rellene el campo según la búsqueda que desea hacer para encontrar una canción");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));
        jPanel1.add(nameAIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 250, -1));
        jPanel1.add(nameSIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 230, -1));
        jPanel1.add(YearIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 280, -1));
        jPanel1.add(LangIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 310, -1));

        searchArtist.setText("Buscar por artista");
        searchArtist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchArtistActionPerformed(evt);
            }
        });
        jPanel1.add(searchArtist, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, -1, -1));

        searchSong.setText("Buscar por nombre");
        searchSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchSongActionPerformed(evt);
            }
        });
        jPanel1.add(searchSong, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, -1, -1));

        searchYear.setText("Buscar por año");
        searchYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchYearActionPerformed(evt);
            }
        });
        jPanel1.add(searchYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, -1, -1));

        searchLanguage.setText("Buscar por idioma");
        searchLanguage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchLanguageActionPerformed(evt);
            }
        });
        jPanel1.add(searchLanguage, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre del Artista:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre de la canción:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Año de salida:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Idioma:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        back.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        back.setText("Regresar");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 530, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/black.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 570));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchArtistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchArtistActionPerformed
        String nameA = nameAIn.getText();
        NodoArtist artist = artists.searchArtist(nameA);
        if (artist != null){
            screen.setText(artists.printArtist(artist));
        }else{
            JOptionPane.showMessageDialog(null, "Artista no encontrado");
        }
        nameAIn.setText("");
    }//GEN-LAST:event_searchArtistActionPerformed

    private void searchSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchSongActionPerformed
        String name = nameSIn.getText();
        NodoSong song = artists.searchSong(name);
        screen.setText(song.printSong());
        nameSIn.setText("");
    }//GEN-LAST:event_searchSongActionPerformed

    private void searchYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchYearActionPerformed

    private void searchLanguageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchLanguageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchLanguageActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        wMenu menu = new wMenu();
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(wSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(wSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(wSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(wSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new wSearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField LangIn;
    private javax.swing.JTextField YearIn;
    private javax.swing.JButton back;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameAIn;
    private javax.swing.JTextField nameSIn;
    private javax.swing.JTextArea screen;
    private javax.swing.JButton searchArtist;
    private javax.swing.JButton searchLanguage;
    private javax.swing.JButton searchSong;
    private javax.swing.JButton searchYear;
    // End of variables declaration//GEN-END:variables
}