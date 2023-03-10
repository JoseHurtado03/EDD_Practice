/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urbanización;

/**
 *
 * @author Usuario
 */
public class Window extends javax.swing.JFrame {
    public static AsociacionVecinos av;

    /**
     * Creates new form Window
     */
    public Window() {
        initComponents();
        this.setLocationRelativeTo(null);
        av = new AsociacionVecinos();
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
        jLabel2 = new javax.swing.JLabel();
        dniVecino = new javax.swing.JTextField();
        BuscarVecino = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        dniVecinoApto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Apto = new javax.swing.JTextField();
        BuscarAptoVecino = new javax.swing.JButton();
        BuscarEdificio = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Asociación de Vecinos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 210, -1));

        jLabel2.setText("Buscar un vecino (Introduzca su n° de cédula)");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        dniVecino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dniVecinoActionPerformed(evt);
            }
        });
        jPanel1.add(dniVecino, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 104, 260, 20));

        BuscarVecino.setText("Buscar");
        BuscarVecino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarVecinoActionPerformed(evt);
            }
        });
        jPanel1.add(BuscarVecino, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, 30));

        jLabel3.setText("Buscar el Apto. de un vecino (Introduzca el n° de cédula) ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        dniVecinoApto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dniVecinoAptoActionPerformed(evt);
            }
        });
        jPanel1.add(dniVecinoApto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 260, 20));

        jLabel4.setText("Buscar el edificio de un Apto. (Introduzca el n° de apto.)");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));
        jPanel1.add(Apto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 260, 20));

        BuscarAptoVecino.setText("Buscar");
        BuscarAptoVecino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarAptoVecinoActionPerformed(evt);
            }
        });
        jPanel1.add(BuscarAptoVecino, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, -1, 30));

        BuscarEdificio.setText("Buscar");
        jPanel1.add(BuscarEdificio, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, -1, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Urba.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, -40, 230, -1));

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jPanel1.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dniVecinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniVecinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dniVecinoActionPerformed

    private void BuscarVecinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarVecinoActionPerformed

        av.searchVecino(Integer.parseInt(dniVecino.getText()));
    }//GEN-LAST:event_BuscarVecinoActionPerformed

    private void dniVecinoAptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniVecinoAptoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dniVecinoAptoActionPerformed

    private void BuscarAptoVecinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarAptoVecinoActionPerformed
        
        av.searchApto(Integer.parseInt(dniVecinoApto.getText()));
    }//GEN-LAST:event_BuscarAptoVecinoActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

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
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apto;
    private javax.swing.JButton BuscarAptoVecino;
    private javax.swing.JButton BuscarEdificio;
    private javax.swing.JButton BuscarVecino;
    private javax.swing.JButton Salir;
    private javax.swing.JTextField dniVecino;
    private javax.swing.JTextField dniVecinoApto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
