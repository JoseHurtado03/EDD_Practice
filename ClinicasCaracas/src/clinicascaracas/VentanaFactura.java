/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicascaracas;

public class VentanaFactura extends javax.swing.JFrame {

    public static VentanaRegistrar vReg;
    
    public VentanaFactura(VentanaRegistrar vReg) {
        initComponents();
        VentanaFactura.vReg = vReg;
        this.setLocationRelativeTo(null);
        nameF.setText(vReg.nameP);
        last_nameF.setText(VentanaRegistrar.last_nameP);
        dniF.setText(Integer.toString(VentanaRegistrar.dniP));
        ageF.setText(Integer.toString(VentanaRegistrar.ageP));
        estudioF.setText(VentanaRegistrar.estudioP);
        boolean seguro = vReg.seguroP;
        String sexo = vReg.sexoP;
        Funciones func = new Funciones();
        int precio = func.calcularPrecio(VentanaRegistrar.estudioP);
        int descuento = func.descuentoSeguro(seguro) + func.descuentoTerceraEdad(sexo, VentanaRegistrar.ageP);
        int total = func.CalculoTotal(precio, descuento);
        totalF.setText(Integer.toString(total));
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
        jLabel3 = new javax.swing.JLabel();
        last_nameF = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dniF = new javax.swing.JLabel();
        ageF = new javax.swing.JLabel();
        estudioF = new javax.swing.JLabel();
        totalF = new javax.swing.JLabel();
        nameF = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Factura");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel2.setText("??Compra realizada exitosamente!");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 160, -1));

        jLabel3.setText("Apellido");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        last_nameF.setText("jLabel4");
        jPanel1.add(last_nameF, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 170, -1));

        jLabel5.setText("C??dula");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel6.setText("Edad");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel7.setText("Tipo de estudio");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel8.setText("TOTAL");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel9.setText("Nombre");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        dniF.setText("jLabel4");
        jPanel1.add(dniF, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 170, -1));

        ageF.setText("jLabel4");
        jPanel1.add(ageF, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 170, -1));

        estudioF.setText("jLabel4");
        jPanel1.add(estudioF, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 120, -1));

        totalF.setText("jLabel4");
        jPanel1.add(totalF, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 120, 30));

        nameF.setText("jLabel4");
        jPanel1.add(nameF, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 170, -1));

        jLabel15.setText("$");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 30, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VentanaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaFactura(vReg).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageF;
    private javax.swing.JLabel dniF;
    private javax.swing.JLabel estudioF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel last_nameF;
    private javax.swing.JLabel nameF;
    private javax.swing.JLabel totalF;
    // End of variables declaration//GEN-END:variables
}
