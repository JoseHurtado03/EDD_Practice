/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class WindowU1 extends javax.swing.JFrame {
    static DoubleList students;

    /**
     * Creates new form WindowU1
     */
    public WindowU1() {
        initComponents();
        this.setLocationRelativeTo(null);
        Function func = new Function();
        students = func.readData();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        screen = new javax.swing.JTextArea();
        printStudentsList = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        searchStudentB = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Colegio Fe y Alegría");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jLabel2.setText("Consulte la información de los estudiantes");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 250, -1));

        screen.setBackground(new java.awt.Color(0, 0, 0));
        screen.setColumns(20);
        screen.setForeground(new java.awt.Color(0, 0, 0));
        screen.setRows(5);
        screen.setEnabled(false);
        jScrollPane1.setViewportView(screen);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 280, 160));

        printStudentsList.setText("Ver Estudiantes");
        printStudentsList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printStudentsListActionPerformed(evt);
            }
        });
        jPanel1.add(printStudentsList, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));

        jLabel3.setText("registrados de la institución.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        exit.setText("Salir");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, -1, -1));

        searchStudentB.setText("Buscar Estudiante");
        searchStudentB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchStudentBActionPerformed(evt);
            }
        });
        jPanel1.add(searchStudentB, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 140, -1));

        jButton2.setText("Ver Promedio General");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void printStudentsListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printStudentsListActionPerformed

        String information = students.printList();
        screen.setText(information);
    }//GEN-LAST:event_printStudentsListActionPerformed

    private void searchStudentBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchStudentBActionPerformed
        String studentName = JOptionPane.showInputDialog("Ingrese el nombre del estudiante");
        screen.setText(students.searchStudent(studentName));
    }//GEN-LAST:event_searchStudentBActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

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
            java.util.logging.Logger.getLogger(WindowU1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WindowU1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WindowU1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WindowU1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WindowU1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton printStudentsList;
    private javax.swing.JTextArea screen;
    private javax.swing.JButton searchStudentB;
    // End of variables declaration//GEN-END:variables
}