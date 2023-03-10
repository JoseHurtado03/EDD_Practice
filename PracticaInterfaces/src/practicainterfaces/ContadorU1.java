/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicainterfaces;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ContadorU1 extends javax.swing.JFrame {

    /**
     * Creates new form ContadorU1
     */
    public ContadorU1() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
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
        contador = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        input = new javax.swing.JTextField();
        sumar = new javax.swing.JButton();
        restar = new javax.swing.JButton();
        multiplicador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));

        jLabel1.setText("Contador");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        jLabel2.setText("Valor del contador");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        contador.setText("0");
        getContentPane().add(contador, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, -1));

        jLabel4.setText("Ingrese un n??mero:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });
        getContentPane().add(input, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 270, -1));

        sumar.setText("Sumar");
        sumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumarActionPerformed(evt);
            }
        });
        getContentPane().add(sumar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, -1, -1));

        restar.setText("Restar");
        restar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restarActionPerformed(evt);
            }
        });
        getContentPane().add(restar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, -1, -1));

        multiplicador.setText("Abrir Multiplicador");
        multiplicador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicadorActionPerformed(evt);
            }
        });
        getContentPane().add(multiplicador, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputActionPerformed

    private void sumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumarActionPerformed
        int num;
        try{
            num = Integer.parseInt(input.getText());
            Contador counter = Global.getCounter();
            counter.sumar(num);
            contador.setText(Integer.toString(counter.getNumero()));
            Global.setCounter(counter);
            input.setText(" ");
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "??ERROR! El input no es un n??mero");
        }
    }//GEN-LAST:event_sumarActionPerformed

    private void restarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restarActionPerformed
        int num = helpers.validarNumero(input.getText());
        Contador counter = Global.getCounter();
        if (num != 0) counter.restar(num);
        contador.setText(Integer.toString(counter.getNumero()));
        input.setText(" ");
    }//GEN-LAST:event_restarActionPerformed

    private void multiplicadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicadorActionPerformed
        this.setVisible(false);
        MultiplicadorU1 ventanaMultiplicador = new MultiplicadorU1();
        ventanaMultiplicador.setVisible(true);
    }//GEN-LAST:event_multiplicadorActionPerformed

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
            java.util.logging.Logger.getLogger(ContadorU1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContadorU1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContadorU1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContadorU1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContadorU1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contador;
    private javax.swing.JTextField input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton multiplicador;
    private javax.swing.JButton restar;
    private javax.swing.JButton sumar;
    // End of variables declaration//GEN-END:variables
}
