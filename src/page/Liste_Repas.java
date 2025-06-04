package page;

import controller.Repas_Controller;
import controller.Repas_Recette_Controller;
import java.text.SimpleDateFormat;
import main.MainFrame;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class Liste_Repas extends javax.swing.JPanel {
    
    // Appel du La Frame principal
    private MainFrame mainJFrame;
    
    
    // Contrôleurs
    private Repas_Controller repas_controller;
    
    
    // Interfaces
    private DefaultComboBoxModel repas_date;
    private DefaultTableModel repasTable;
    
    
    // Variables
    private int id_repas;
 
   
//-------------------------------------------------------------------------------------------
    
    
    
    
    // Constructeur
    public Liste_Repas(MainFrame newJFrame) {
        mainJFrame = newJFrame; 
        repas_controller = new Repas_Controller(mainJFrame.getBDD());
      
        initComponents();
        
        chargerListeRepas();
        
    }
        
//---------------------------------------------------------------------------------------------
  
    
    // Méthodes et Events
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Filtre_Date1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        Filtre_Date2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        BoutonAjout_ListeRepas = new javax.swing.JButton();
        BoutonSupprimer_ListeRepas = new javax.swing.JButton();
        BoutonModif_ListeRepas = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Repas_recette = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 10)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Filtre date :");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Smart Shopping");
        jLabel2.setToolTipText("");

        Filtre_Date1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Filtre_Date1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Filtre_Date1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        Filtre_Date1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Filtre_Date1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 10)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("à");
        jLabel4.setToolTipText("");

        Filtre_Date2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Filtre_Date2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Filtre_Date2AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        Filtre_Date2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Filtre_Date2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Liste de repas");
        jLabel5.setToolTipText("");

        BoutonAjout_ListeRepas.setText("Ajouter un Repas");
        BoutonAjout_ListeRepas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonAjout_ListeRepasActionPerformed(evt);
            }
        });

        BoutonSupprimer_ListeRepas.setText("Supprimer un Repas");
        BoutonSupprimer_ListeRepas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonSupprimer_ListeRepasActionPerformed(evt);
            }
        });

        BoutonModif_ListeRepas.setText("Modifier un Repas");
        BoutonModif_ListeRepas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonModif_ListeRepasActionPerformed(evt);
            }
        });

        Repas_recette.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Date du repas", "Type de repas", "Personne(s)", "Recette(s)"
            }
        ));
        Repas_recette.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Repas_recette.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Repas_recette.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Repas_recetteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Repas_recette);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(BoutonAjout_ListeRepas, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 867, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Filtre_Date1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Filtre_Date2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(464, 464, 464)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BoutonModif_ListeRepas, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BoutonSupprimer_ListeRepas, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(78, 78, 78))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(464, 464, 464))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(20, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1058, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(72, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Filtre_Date1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Filtre_Date2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 431, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BoutonSupprimer_ListeRepas)
                        .addComponent(BoutonModif_ListeRepas))
                    .addComponent(BoutonAjout_ListeRepas))
                .addGap(23, 23, 23))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(164, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(89, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1150, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 617, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Filtre_Date1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Filtre_Date1ActionPerformed
        // TODO add your handling code here:
        chargerListeRepas();
        
    }//GEN-LAST:event_Filtre_Date1ActionPerformed

    private void Filtre_Date2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Filtre_Date2ActionPerformed
        // TODO add your handling code here:
        chargerListeRepas();

    }//GEN-LAST:event_Filtre_Date2ActionPerformed

    private void BoutonAjout_ListeRepasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonAjout_ListeRepasActionPerformed
        // TODO add your handling code here:
           mainJFrame.SwithPanel("pageAjout_Repas");

            this.revalidate();
            this.repaint();
    }//GEN-LAST:event_BoutonAjout_ListeRepasActionPerformed

    private void BoutonSupprimer_ListeRepasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonSupprimer_ListeRepasActionPerformed
        // TODO add your handling code here:
        //Définir en premier le modèle de la table 

        int id = mainJFrame.getId_Repas();
        
        
        if(id <= 0){
                javax.swing.JOptionPane.showMessageDialog(this, 
                "Veuillez sélectionné un repas pour le supprimer", 
                "Erreur choix de repas", 
                javax.swing.JOptionPane.ERROR_MESSAGE);
        }else{
            // Demander une confirmation à l'utilisateur
            int confirm = JOptionPane.showConfirmDialog(
                this,
                "Êtes-vous sûr de vouloir supprimer cette ligne ?",
                "Confirmation de suppression",
                JOptionPane.YES_NO_OPTION
            );
            
            if (confirm == JOptionPane.YES_OPTION) {
                // Appeler la méthode suppressionRepas dans la BDD pour supprimer la recette
                boolean success = mainJFrame.getBDD().supprimerRepas(id);
                
                if (success) {
                    JOptionPane.showMessageDialog(this, "Ligne supprimée avec succès !");
                    
                    
                    // Mettre à jour l'interface utilisateur
                    this.revalidate();
                    this.repaint();
                }else {
                    JOptionPane.showMessageDialog(this, "La suppression a échoué dans la base de données.");
                }
            }
        }
        
        
    }//GEN-LAST:event_BoutonSupprimer_ListeRepasActionPerformed

    private void BoutonModif_ListeRepasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonModif_ListeRepasActionPerformed
        // TODO add your handling code here:
            int id = mainJFrame.getId_Repas();
            System.out.println(id);
            
            if(id <= 0){
                javax.swing.JOptionPane.showMessageDialog(this, 
                "Veuillez sélectionné un repas", 
                "Erreur choix de repas", 
                javax.swing.JOptionPane.ERROR_MESSAGE);
            }else{
            // Appel vers la fenêtre de modification du repas
            mainJFrame.SwithPanel("pageModification_Repas");
            }
    }//GEN-LAST:event_BoutonModif_ListeRepasActionPerformed

    private void Filtre_Date1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Filtre_Date1AncestorAdded
        // TODO add your handling code here:
        // TODO add your handling code here:
        int id_utilisateur = mainJFrame.getId_Utilisateur();
        repas_date = repas_controller.Lister_Date_Repas(id_utilisateur);
        
        Filtre_Date1.removeAllItems();
        Filtre_Date1.setModel(repas_date);
        
        // Sélectionne la date du jour si elle est dans le modèle
        String dateAujourdhui = new SimpleDateFormat("dd-MM-yyyy").format(new java.util.Date());
        Filtre_Date1.setSelectedItem(dateAujourdhui);
    }//GEN-LAST:event_Filtre_Date1AncestorAdded

    private void Filtre_Date2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Filtre_Date2AncestorAdded
        // TODO add your handling code here:
        int id_utilisateur = mainJFrame.getId_Utilisateur();
        repas_date = repas_controller.Lister_Date_Repas(id_utilisateur);
        
        Filtre_Date2.removeAllItems();
        Filtre_Date2.setModel(repas_date);
        
        // Sélectionne la date du jour si elle est dans le modèle
        String dateAujourdhui = new SimpleDateFormat("dd-MM-yyyy").format(new java.util.Date());
        Filtre_Date2.setSelectedItem(dateAujourdhui);
    }//GEN-LAST:event_Filtre_Date2AncestorAdded

    private void Repas_recetteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Repas_recetteMouseClicked
        int selectedRow = Repas_recette.getSelectedRow();
        if (selectedRow != -1) {
            id_repas = (int) Repas_recette.getValueAt(selectedRow, 0); // Colonne 0 = ID repas
            mainJFrame.setId_Repas(id_repas); // <-- tu définis bien ici l’ID
            int id_recup = mainJFrame.getId_Repas();
            System.out.println("Voici la valeur setter : " + id_recup);
        } else {
            JOptionPane.showMessageDialog(this, "Erreur : l'ID du repas est invalide.");
        }


    }//GEN-LAST:event_Repas_recetteMouseClicked
              
    private void chargerListeRepas() {
        String date1 = (String) Filtre_Date1.getSelectedItem();
        String date2 = (String) Filtre_Date2.getSelectedItem();
        int id_utilisateur = mainJFrame.getId_Utilisateur();

        if (date1 != null && date2 != null) {
            repasTable = repas_controller.Lister_Repas_Utilisateur(id_utilisateur, date1, date2);
            Repas_recette.setModel(repasTable);

            // Cacher la colonne ID (colonne 0)
            Repas_recette.getColumnModel().getColumn(0).setMinWidth(0);
            Repas_recette.getColumnModel().getColumn(0).setMaxWidth(0);
            Repas_recette.getColumnModel().getColumn(0).setWidth(0);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BoutonAjout_ListeRepas;
    private javax.swing.JButton BoutonModif_ListeRepas;
    private javax.swing.JButton BoutonSupprimer_ListeRepas;
    private javax.swing.JComboBox<String> Filtre_Date1;
    private javax.swing.JComboBox<String> Filtre_Date2;
    private javax.swing.JTable Repas_recette;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
