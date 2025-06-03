package page;

import bdd.*;
import main.MainFrame;



public class Creation_de_compte extends javax.swing.JPanel {
    
    // Appel du La Frame principal
    private MainFrame mainJFrame;
    
    
    // Appel de la classe "Requête BDD"
    private Requete_bdd requete;
    
    
//---------------------------------------------------------------------------------------------------
    
    

    // Constructeur
    public Creation_de_compte(MainFrame newJFrame, Requete_bdd requete2) {
        mainJFrame = newJFrame;
        requete = requete2;
        initComponents();
    }

    
//---------------------------------------------------------------------------------------------------
    
    // Méthodes et Events

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Confirm_mdp_field = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Button_Créercompte = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Mdp_field = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        Nom_field = new java.awt.TextField();
        Prenom_field = new java.awt.TextField();
        Mail_field = new java.awt.TextField();
        jLabel6 = new javax.swing.JLabel();
        Button_Reset = new javax.swing.JButton();
        Button_Connexion = new javax.swing.JButton();
        Button_Créercompte1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Création de compte");
        jLabel1.setToolTipText("");

        Confirm_mdp_field.setText("jPasswordField1");

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Mot de passe :");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Prénom :");
        jLabel3.setToolTipText("");

        Button_Créercompte.setBackground(new java.awt.Color(204, 204, 204));
        Button_Créercompte.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14)); // NOI18N
        Button_Créercompte.setText("Création du compte");
        Button_Créercompte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CréercompteActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Confirmer le nouveau mot de passe :");
        jLabel4.setToolTipText("");

        Mdp_field.setText("jPasswordField1");

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Nom :");
        jLabel5.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Identifiant :");
        jLabel6.setToolTipText("");

        Button_Reset.setBackground(new java.awt.Color(204, 204, 204));
        Button_Reset.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14)); // NOI18N
        Button_Reset.setText("Reset");
        Button_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ResetActionPerformed(evt);
            }
        });

        Button_Connexion.setBackground(new java.awt.Color(204, 204, 204));
        Button_Connexion.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14)); // NOI18N
        Button_Connexion.setText("Page de Connexion");
        Button_Connexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ConnexionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(427, 427, 427)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Confirm_mdp_field, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Button_Connexion, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Button_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(Button_Créercompte, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Mail_field, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Nom_field, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(313, 313, 313)
                                .addComponent(jLabel3)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Mdp_field, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Prenom_field, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(208, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(Button_Connexion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(115, 115, 115)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(85, 85, 85))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Prenom_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Mdp_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Nom_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Mail_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(67, 67, 67)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Confirm_mdp_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_Créercompte, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
        );

        Button_Créercompte1.setBackground(new java.awt.Color(204, 204, 204));
        Button_Créercompte1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14)); // NOI18N
        Button_Créercompte1.setText("Création de compte");
        Button_Créercompte1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Créercompte1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(487, 487, 487)
                    .addComponent(Button_Créercompte1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(488, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(302, 302, 302)
                    .addComponent(Button_Créercompte1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(303, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Button_CréercompteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CréercompteActionPerformed
        // TODO add your handling code here
        String nom = Nom_field.getText().trim();
        String prenom = Prenom_field.getText().trim();
        String identifiant = Mail_field.getText().trim();
        String mdp = new String(Mdp_field.getPassword()).trim();
        
        
        String confirmMdp = new String(Confirm_mdp_field.getPassword()).trim();

        if (!mdp.equals(confirmMdp)) {
            javax.swing.JOptionPane.showMessageDialog(this,
                "Les mots de passe ne correspondent pas.",
                "Erreur",
                javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(nom.isEmpty() && prenom.isEmpty() && identifiant.isEmpty() && mdp.isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(this, 
            "Un des champs est vides", 
            "Veuillez remplir les champs", 
            javax.swing.JOptionPane.ERROR_MESSAGE);
            
            return;
        }
        
        boolean Creer= requete.insertionUtilisateur(identifiant, nom, prenom, mdp);
        
        if(Creer){
            
            javax.swing.JOptionPane.showMessageDialog(this, "Compte créé avec succès !");
            mainJFrame.SwithPanel("pageConnexion");
            }else {
                javax.swing.JOptionPane.showMessageDialog(this, 
                "Erreur lors de la création du compte",
                "Veuillez contacter l'administrateur",
                javax.swing.JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_Button_CréercompteActionPerformed

    private void Button_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ResetActionPerformed
        // TODO add your handling code here:
        Nom_field.setText("");
        Prenom_field.setText("");
        Mail_field.setText("");
        Mdp_field.setText("");
        Confirm_mdp_field.setText("");
    }//GEN-LAST:event_Button_ResetActionPerformed

    private void Button_Créercompte1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Créercompte1ActionPerformed
        // TODO add your handling code here:
        mainJFrame.SwithPanel("pageCreation_de_compte");

        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_Button_Créercompte1ActionPerformed

    private void Button_ConnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ConnexionActionPerformed
        // TODO add your handling code here:
        mainJFrame.SwithPanel("pageConnexion");

        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_Button_ConnexionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Button_Connexion;
    public javax.swing.JButton Button_Créercompte;
    public javax.swing.JButton Button_Créercompte1;
    public javax.swing.JButton Button_Reset;
    public javax.swing.JPasswordField Confirm_mdp_field;
    public java.awt.TextField Mail_field;
    public javax.swing.JPasswordField Mdp_field;
    public java.awt.TextField Nom_field;
    public java.awt.TextField Prenom_field;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
