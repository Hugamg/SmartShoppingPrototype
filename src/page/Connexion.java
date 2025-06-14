package page;

import main.MainFrame;
import controller.Connexion_Controller;



public class Connexion extends javax.swing.JPanel {
    
    // Appel du La Frame principal
    private MainFrame mainJFrame;
    
    
    // Contrôleurs
    private Connexion_Controller verif;
    

    // Variables
    public int id_utilisateur;

//---------------------------------------------------------------------------------
    
    
    
    // Constructeur
    public Connexion(MainFrame newJFrame) {
        mainJFrame = newJFrame;
        verif = new Connexion_Controller(mainJFrame.getBDD());
        initComponents();

    }

//---------------------------------------------------------------------------------
    
    // Méthodes et events
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Identifiant_field = new java.awt.TextField();
        Password_field = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Button_Reset = new javax.swing.JButton();
        Button_Connexion = new javax.swing.JButton();
        Button_Créercompte = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Page de connexion");
        jLabel1.setToolTipText("");

        Password_field.setText("jPasswordField1");

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Password :");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Identifiant :");
        jLabel3.setToolTipText("");

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
        Button_Connexion.setText("Connexion");
        Button_Connexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ConnexionActionPerformed(evt);
            }
        });

        Button_Créercompte.setBackground(new java.awt.Color(204, 204, 204));
        Button_Créercompte.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14)); // NOI18N
        Button_Créercompte.setText("Création de compte");
        Button_Créercompte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CréercompteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(335, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 98, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(297, 297, 297)
                        .addComponent(Button_Créercompte, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Button_Connexion, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(189, 189, 189)
                                .addComponent(Button_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Identifiant_field, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)
                                    .addComponent(Password_field, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(Button_Créercompte, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Identifiant_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Password_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_Connexion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(134, 134, 134))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Button_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ResetActionPerformed
        // TODO add your handling code here:
        Identifiant_field.setText("");
        Password_field.setText("");
        
    }//GEN-LAST:event_Button_ResetActionPerformed

    private void Button_ConnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ConnexionActionPerformed
        // TODO add your handling code here:
        
        System.out.println("Bouton Connexion cliqué");  // DEBUG
        
        String identifiant =Identifiant_field.getText();
        String mdp =new String(Password_field.getPassword());
        
        if(identifiant.isEmpty() && mdp.isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(this, 
            "Un des deux champs est vides : Identifiant / mot de passe", 
            "Veuillez remplir les champs", 
            javax.swing.JOptionPane.ERROR_MESSAGE);
            
            
            return;
        }
        
        System.out.println("Identifiant saisi : " + identifiant);
        System.out.println("Mot de passe saisi : " + mdp);
        
        // Vérification de la connexion
        boolean Connected = verif.Verifier_Connexion(identifiant, mdp);
        
        
        System.out.println("Résultat de la connexion : " + Connected);

        if (Connected) {
            id_utilisateur = verif.Get_Id_Utilisateur();  // Récupérer l'ID de l'utilisateur connecté
            System.out.println(id_utilisateur);
            if(id_utilisateur != -1){
                javax.swing.JOptionPane.showMessageDialog(this, 
                    "Connexion réussie !", 
                    "Succès", 
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    // Mettre à jour l'état de la connexion
                    mainJFrame.setId_Utilisateur(id_utilisateur);
                    mainJFrame.setUserConnected(true);
                    mainJFrame.SwithPanel("paged_Accueil");
            }
        }else {
            javax.swing.JOptionPane.showMessageDialog(this, 
                "Identifiant ou mot de passe incorrect", 
                "Erreur de connexion", 
                javax.swing.JOptionPane.ERROR_MESSAGE);
                Password_field.setText("");
            }
    }//GEN-LAST:event_Button_ConnexionActionPerformed

    private void Button_CréercompteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CréercompteActionPerformed
        // TODO add your handling code here:
        mainJFrame.SwithPanel("pageCreation_de_compte");
        
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_Button_CréercompteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Connexion;
    private javax.swing.JButton Button_Créercompte;
    private javax.swing.JButton Button_Reset;
    private java.awt.TextField Identifiant_field;
    private javax.swing.JPasswordField Password_field;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
