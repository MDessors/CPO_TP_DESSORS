/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package premierinterfacegraphique_dessors_maxime;

/**
 *
 * @author maxCD
 */
public class PrincipalWindow extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalWindow
     */
    public PrincipalWindow() {
        initComponents();
        System.out.println("Hello My G");
        msg_bienvenue.setText("ME llamo Maxime");
        MSG_Resultat.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        msg_bienvenue = new javax.swing.JLabel();
        msg_goodbye = new javax.swing.JLabel();
        Bouton_Valide = new javax.swing.JButton();
        Zone_Prenom = new javax.swing.JTextField();
        INSERT_Prenom = new javax.swing.JLabel();
        MSG_Resultat = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        AUgmenter = new javax.swing.JButton();
        Salaire = new javax.swing.JTextField();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        msg_bienvenue.setText("HI MY NAME IS DIEGO!");

        msg_goodbye.setText("GOODBYE MY MEXICANS!");

        Bouton_Valide.setText("CLIQUER ICI");
        Bouton_Valide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bouton_ValideActionPerformed(evt);
            }
        });

        INSERT_Prenom.setText("Entree votre Prenom:");

        MSG_Resultat.setText("Resultat:");

        jLabel1.setText("Entree votre salaire:");

        AUgmenter.setText("AUgmenter le salaire");
        AUgmenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AUgmenterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(INSERT_Prenom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Zone_Prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(msg_goodbye)
                            .addComponent(msg_bienvenue)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(Bouton_Valide))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(MSG_Resultat)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Salaire, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AUgmenter)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(msg_bienvenue)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Zone_Prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(INSERT_Prenom))
                .addGap(42, 42, 42)
                .addComponent(Bouton_Valide)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(MSG_Resultat)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(AUgmenter)
                    .addComponent(Salaire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(msg_goodbye)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bouton_ValideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bouton_ValideActionPerformed
// TODO add your handling code here:
        msg_goodbye.setText("Au revoir au Mexicain");
        String a = Zone_Prenom.getText();
        MSG_Resultat.setText("Hola " + a);
                
        MSG_Resultat.setVisible(true);
    }//GEN-LAST:event_Bouton_ValideActionPerformed

    private void AUgmenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AUgmenterActionPerformed
        // TODO add your handling code here:
        String salaire = Salaire.getText();
        int salaire_entier = Integer.parseInt(salaire);
        salaire_entier++;
        Salaire.setText(salaire_entier+"");
    }//GEN-LAST:event_AUgmenterActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AUgmenter;
    private javax.swing.JButton Bouton_Valide;
    private javax.swing.JLabel INSERT_Prenom;
    private javax.swing.JLabel MSG_Resultat;
    private javax.swing.JTextField Salaire;
    private javax.swing.JTextField Zone_Prenom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel msg_bienvenue;
    private javax.swing.JLabel msg_goodbye;
    // End of variables declaration//GEN-END:variables
}