
package avaliacaoempresas;

public class CadastrarUsuario extends javax.swing.JFrame {

    public CadastrarUsuario() {
        initComponents();
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
        nomeUser = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnCadUser = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/IM.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 171, 801);

        nomeUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeUserActionPerformed(evt);
            }
        });
        getContentPane().add(nomeUser);
        nomeUser.setBounds(300, 190, 300, 22);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(300, 250, 300, 22);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(300, 310, 300, 22);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(300, 380, 300, 22);

        jLabel2.setText("Nome completo:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(300, 170, 130, 16);

        jLabel3.setText("email:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(300, 230, 32, 16);

        jLabel4.setText("Celular: ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(300, 290, 80, 16);

        jLabel5.setText("Nome de usuário:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(300, 360, 130, 16);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(301, 450, 300, 22);

        jLabel6.setText("Cie uma senha:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(300, 430, 100, 16);

        btnCadUser.setText("Cadastrar");
        getContentPane().add(btnCadUser);
        btnCadUser.setBounds(420, 500, 100, 23);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Cadastrar usuário");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(350, 40, 180, 20);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/review (1).png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(630, 100, 530, 360);

        jMenuBar1.setBorder(null);

        jMenu1.setText("      Início    ");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("    Cadastrar Empresa      ");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeUserActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField nomeUser;
    // End of variables declaration//GEN-END:variables
}
