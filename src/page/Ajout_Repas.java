package page; 


import main.MainFrame;
import controller.Repas_Controller;
import controller.Repas_Recette_Controller;
import entity.Type_Repas_Item;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;




public class Ajout_Repas extends javax.swing.JPanel {
    
    // Appel du La Frame principal
    private MainFrame mainJFrame;
    
    
    // Contrôleurs
    private Repas_Recette_Controller repas_recette_controller;
    private Repas_Controller repas_controller;
    
    
    // Interfaces
    private DefaultTableModel recette_table;
    private DefaultComboBoxModel<Type_Repas_Item> repas_type;
    private DefaultListModel<String> recette_list = new DefaultListModel();

    
//------------------------------------------------------------------------------------------------------
    
    
    
    // Constructeur
    public Ajout_Repas(MainFrame newJFrame) {
        mainJFrame = newJFrame;
        repas_recette_controller = new Repas_Recette_Controller(mainJFrame.getBDD());
        repas_controller = new Repas_Controller(mainJFrame.getBDD());
        
        initComponents();
        
        repas_type = repas_controller.Lister_Type_Repas();
        recette_table = repas_recette_controller.Lister_Recette_Repas();    
    }
    
//---------------------------------------------------------------------------------
    
    // Méthodes et events

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Date_field = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Type_combobox = new javax.swing.JComboBox<>();
        Personne_field = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Liste_recette_ajoute = new javax.swing.JList<>();
        Enregister_button = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table_Recette = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Smart Shopping");
        jLabel2.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 10)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Date :");
        jLabel1.setToolTipText("");

        Date_field.setText("yyyy-MM-dd");
        Date_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Date_fieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Ajout Repas");
        jLabel4.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 10)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Type :");
        jLabel5.setToolTipText("");

        Type_combobox.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Type_comboboxAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        Personne_field.setText("0");
        Personne_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Personne_fieldActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 10)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Type Repas :");
        jLabel6.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText(" Recettes Ajoutés :");
        jLabel7.setToolTipText("");

        Liste_recette_ajoute.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Liste_recette_ajoute.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Liste_recette_ajouteAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane4.setViewportView(Liste_recette_ajoute);

        Enregister_button.setBackground(new java.awt.Color(204, 204, 204));
        Enregister_button.setText("Enregistrer");
        Enregister_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Enregister_buttonActionPerformed(evt);
            }
        });

        Table_Recette.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Sélectionner", "Nom Recette", "Ingrédient (1 personnes)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table_Recette.setColumnSelectionAllowed(true);
        Table_Recette.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        Table_Recette.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        Table_Recette.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Table_RecetteAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(Table_Recette);
        Table_Recette.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (Table_Recette.getColumnModel().getColumnCount() > 0) {
            Table_Recette.getColumnModel().getColumn(1).setResizable(false);
            Table_Recette.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel12.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText(" Recettes :");
        jLabel12.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 10)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Personne :");
        jLabel8.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Type_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Personne_field, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Enregister_button, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(Date_field, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(678, 678, 678)
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(431, 431, 431)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Date_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Type_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Personne_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(Enregister_button, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 43, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Enregister_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Enregister_buttonActionPerformed
        // TODO add your handling code here:
        // Etape 2 : On récupère le jtextfield de la date et on vérifie si une date est bien rentré. Si ce n'est pas le cas on retourne que le champ est mal remplie. Ainsi on n'effectue pas l'insertion dans la bdd
        String date  = Date_field.getText().trim();
        if (date.isEmpty()){ //si date est vide 
        JOptionPane.showMessageDialog(null, "Veuillez saisir une date.", "Champ manquant", JOptionPane.WARNING_MESSAGE);
        return;
        }
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // Création d'un parseur pour le format année/mois/jour
        sdf.setLenient(false);// désactive le ùode lenient qui force le parseur à rejeter les dates impossibles
        Date parsedDate=null;
        try {
            parsedDate = sdf.parse(date); 
            System.out.println("Date valide : " + parsedDate);
            // → Ici tu continues avec l'insertion dans la BDD
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Format de date invalide. Utilisez yyyy-MM-dd.", "Erreur de format", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Convertir java.util.Date en java.sql.Date pour l'utiliser dans la base de données
        java.sql.Date sqlDate = new java.sql.Date(parsedDate.getTime());
        System.out.println(date);
             
        
        
        // Etape 3 ; On récupère l'éléments sélectionner dans jboxcombo
        int idTypeRepas = -1; // Valeur par défaut
        Type_Repas_Item type_repas= (Type_Repas_Item) Type_combobox.getSelectedItem();
        if (type_repas != null) {
        idTypeRepas = type_repas.getId();  // Tu récupères directement l’ID ici
        }

        // Etape 4 : Je récupère l'élément du jtextfield du nombre de personne et je vérifie si c'est bien un entier. Si ce n'est pas le cas je retourne une erreur
        String personne1 = Personne_field.getText().trim();
        if (personne1.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Veuillez saisir le nombre de personne.", "Champ manquant", JOptionPane.WARNING_MESSAGE);
        return;
        }
        
        int personne = -1;
        try {
            personne = Integer.parseInt(personne1); // Convertit en entier
            System.out.println("Nombre de personnes : " + personne);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Le nombre de personnes doit être un entier.", "Erreur de format", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // On récupère l'id de l'utilisteur
        int id_utilisateur = mainJFrame.getId_Utilisateur(); 

        // On récupère les éléments de notre liste de recette
        List <Integer> indexrecette = repas_recette_controller.Maj_Selection_Recette(Table_Recette, recette_list); 

        // Si un utilisateur est connecté
        if (mainJFrame.isUserConnected){
            repas_controller.Inserer_Nouveau_Repas(sqlDate, personne, id_utilisateur, idTypeRepas); // On ajoute le repas dans la table "repas"
            int id_repas= repas_recette_controller.Get_Id_Repas(id_utilisateur, sqlDate, idTypeRepas); // On récupère l'id du repas créer
            
            // Pour chaque recette on ajoute une ligne à la table repas_recette 
            for(int element : indexrecette){ 
                int id_recette = element; //On transforme l'élément en id 
                repas_recette_controller.Associer_Repas_Recette(id_repas,id_recette); //On associe chaque recette au repas   
            }
            javax.swing.JOptionPane.showMessageDialog(this, 
                    "Repas ajouté avec succès!", 
                    "Ajouter un nouveau repas", 
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
                
                Date_field.setText("");
                Personne_field.setText("");
        }else{
            javax.swing.JOptionPane.showMessageDialog(this, 
                "Vous devez être connecté en tant qu'utilisateur pour pouvoir créer des repas", 
                "Erreur de connexion", 
                javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Enregister_buttonActionPerformed

    private void Table_RecetteAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Table_RecetteAncestorAdded

        Table_Recette.removeAll();
        Table_Recette.setModel(recette_table);
        // Mettre à jour l'interface utilisateur
        
        Table_Recette.getModel().addTableModelListener(e -> {
        DefaultListModel<String> recetteliste = (DefaultListModel<String>) Liste_recette_ajoute.getModel();
        repas_recette_controller.Maj_Selection_Recette(Table_Recette, recetteliste);
    });

        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_Table_RecetteAncestorAdded

    private void Type_comboboxAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Type_comboboxAncestorAdded
        // TODO add your handling code here:
        Type_combobox.removeAllItems();
        Type_combobox.setModel(repas_type);
    }//GEN-LAST:event_Type_comboboxAncestorAdded

    private void Date_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Date_fieldActionPerformed
        // TODO add your handling code here:
        Date_field.setText("");
    }//GEN-LAST:event_Date_fieldActionPerformed

    private void Liste_recette_ajouteAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Liste_recette_ajouteAncestorAdded
        // TODO add your handling code here:
        DefaultListModel<String> recetteliste = new DefaultListModel();
        Liste_recette_ajoute.setModel(recetteliste);
        List<Integer> idsSelectionnes = repas_recette_controller.Maj_Selection_Recette(Table_Recette, recetteliste);
    }//GEN-LAST:event_Liste_recette_ajouteAncestorAdded

    private void Personne_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Personne_fieldActionPerformed
        // TODO add your handling code here:
        Personne_field.setText("");
    }//GEN-LAST:event_Personne_fieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Date_field;
    private javax.swing.JButton Enregister_button;
    private javax.swing.JList<String> Liste_recette_ajoute;
    private javax.swing.JTextField Personne_field;
    private javax.swing.JTable Table_Recette;
    private javax.swing.JComboBox<Type_Repas_Item> Type_combobox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables

}
