/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicascaracas;

public class VentanaRegistrar extends javax.swing.JFrame {

    /**
     * Creates new form VentanaRegistrar
     */
    public static String nameP = "";
    public static String last_nameP = "";
    public static int dniP = 0;
    public static int ageP = 0;
    public static String sexoP = "";
    public static Boolean seguroP = false;
    public static String estudioP = "";
    
    public VentanaRegistrar() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nameIn = new javax.swing.JTextField();
        last_nameIn = new javax.swing.JTextField();
        dniIn = new javax.swing.JTextField();
        ageIn = new javax.swing.JTextField();
        sexoIn = new javax.swing.JTextField();
        seguroIn = new javax.swing.JTextField();
        estudioIn = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ingresarDatos = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Por favor, ingrese los siguientes datos para solicitar la realización de");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 400, 30));

        jLabel2.setText(" un estudio de radiología.");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("UNIDAD DE RADIOLOGÍA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        nameIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameInActionPerformed(evt);
            }
        });
        jPanel1.add(nameIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 150, -1));
        jPanel1.add(last_nameIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 150, -1));
        jPanel1.add(dniIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 320, -1));
        jPanel1.add(ageIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 320, -1));
        jPanel1.add(sexoIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 320, -1));
        jPanel1.add(seguroIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 280, -1));
        jPanel1.add(estudioIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 280, -1));

        jLabel4.setText("Cédula");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jLabel5.setText("Nombre");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel6.setText("Edad");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel7.setText("Sexo");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jLabel8.setText("¿Posee seguro?");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        jLabel9.setText("Tipo de estudio");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        jLabel10.setText("Apellido");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, -1));

        ingresarDatos.setText("Ingresar");
        ingresarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarDatosActionPerformed(evt);
            }
        });
        jPanel1.add(ingresarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 320, 470));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameInActionPerformed

    private void ingresarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarDatosActionPerformed
        String name = nameIn.getText();
        String last_name = last_nameIn.getText();
        int dni = Integer.parseInt(dniIn.getText());
        int age = Integer.parseInt(ageIn.getText());
        String sexo = sexoIn.getText();
        boolean seguro = false;
        if (seguroIn.getText().equals("y")){
            seguro = true;
        } 
        String estudio = estudioIn.getText();
        Cliente cliente = new Cliente(name, last_name, dni, age, sexo, seguro, estudio);
        ListaClientes clientes = new ListaClientes();
        clientes.insertBegin(cliente);
       
        VentanaRegistrar.nameP = nameIn.getText();
        VentanaRegistrar.last_nameP = last_nameIn.getText();
        VentanaRegistrar.dniP = Integer.parseInt(dniIn.getText());
        VentanaRegistrar.ageP = Integer.parseInt(ageIn.getText());
        VentanaRegistrar.sexoP = sexoIn.getText();
        VentanaRegistrar.seguroP = seguro;
        VentanaRegistrar.estudioP = estudioIn.getText();
        this.setVisible(false);
        VentanaFactura windowF = new VentanaFactura(this);
        windowF.setVisible(true);
    }//GEN-LAST:event_ingresarDatosActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaRegistrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageIn;
    private javax.swing.JTextField dniIn;
    private javax.swing.JTextField estudioIn;
    private javax.swing.JButton ingresarDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField last_nameIn;
    private javax.swing.JTextField nameIn;
    private javax.swing.JTextField seguroIn;
    private javax.swing.JTextField sexoIn;
    // End of variables declaration//GEN-END:variables

}
