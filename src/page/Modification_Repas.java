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



public class Modification_Repas extends javax.swing.JPanel {
    
    // Appel du La Frame principal
    private MainFrame mainJFrame;
    
    
    // Contrôleurs
    private Repas_Recette_Controller repas_recette_controller;
    private Repas_Controller repas_controller;
    
    // Objets
    private DefaultTableModel recette_table;
    private DefaultListModel<String> recette_list = new DefaultListModel();

    
    // Variables
    private int id_un_repas;

    
//--------------------------------------------------------------------------------------------------
    
    
    
    // Constructeur
    
    public Modification_Repas(MainFrame newJFrame) {
        mainJFrame = newJFrame;
        repas_recette_controller = new Repas_Recette_Controller(mainJFrame.getBDD());
        repas_controller = new Repas_Controller(mainJFrame.getBDD());
        initComponents();
        
    }


    
//--------------------------------------------------------------------------------------------------
    
    
    // Méthodes et Events
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Date_field = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Personne_field = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table_Recette = new javax.swing.JTable();
        Type_combobox = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        Liste_recette_ajoute = new javax.swing.JList<>();
        Enregister_button = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Smart Shopping");
        jLabel2.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 10)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Date :");
        jLabel1.setToolTipText("");

        Date_field.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Date_fieldAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Modification Repas");
        jLabel4.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 10)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Type :");
        jLabel5.setToolTipText("");

        Personne_field.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Personne_fieldAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 10)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Personne :");
        jLabel6.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText(" Recettes Ajoutés :");
        jLabel7.setToolTipText("");

        jLabel12.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText(" Recettes :");
        jLabel12.setToolTipText("");

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

        Type_combobox.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Type_comboboxAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(Date_field, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(741, 741, 741)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(258, 258, 258)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(269, 269, 269)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Type_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Personne_field, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Enregister_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1031, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Date_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Personne_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Type_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Enregister_button, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(240, 240, 240)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(378, Short.MAX_VALUE)))
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
            .addGap(0, 671, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Table_RecetteAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Table_RecetteAncestorAdded

        recette_table = repas_recette_controller.Lister_Recette_Repas_Avec_Selection(id_un_repas);
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

    private void Liste_recette_ajouteAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Liste_recette_ajouteAncestorAdded
        // TODO add your handling code here:
        DefaultListModel<String> recetteliste = new DefaultListModel();
        Liste_recette_ajoute.setModel(recetteliste);
        List<Integer> idSelectionnes = repas_recette_controller.Maj_Selection_Recette(Table_Recette, recetteliste);
    }//GEN-LAST:event_Liste_recette_ajouteAncestorAdded

    private void Enregister_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Enregister_buttonActionPerformed
        // TODO add your handling code here:
        
        // Etape 1: On récupère le jtextfield de la date et on vérifie si une date est bien rentré. Si ce n'est pas le cas on retourne que le champ est mal remplie. Ainsi on n'effectue pas l'insertion dans la bdd

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
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Format de date invalide. Utilisez yyyy-MM-dd.", "Erreur de format", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Convertir java.util.Date en java.sql.Date pour l'utiliser dans la base de données
        java.sql.Date sqlDate = new java.sql.Date(parsedDate.getTime());
        System.out.println(date);
             
        
        
        // Etape 2 ; On récupère l'éléments sélectionner dans jboxcombo
        int idTypeRepas = -1; // Valeur par défaut
        Type_Repas_Item type_repas= (Type_Repas_Item) Type_combobox.getSelectedItem();
        if (type_repas != null) {
        idTypeRepas = type_repas.getId();  // Tu récupères directement l’ID ici
        System.out.println("ID du type de repas sélectionné : " + idTypeRepas);
        }

        // Etape 3 : Je récupère l'élément du jtextfield du nombre de personne et je vérifie si c'est bien un entier. Si ce n'est pas le cas je retourne une erreur
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
        
        // Etape 4 : On récupère l'id de l'utilisteur
        int id_utilisateur = mainJFrame.getId_Utilisateur(); 
        
        // Etape 5 : On récupère l'id du repas sur lequel on travail
        id_un_repas = mainJFrame.getId_Repas();

        // Etape 6 : On récupère les éléments de notre liste de recette et on modifie la ligne
        List <Integer> indexrecette = repas_recette_controller.Maj_Selection_Recette(Table_Recette, recette_list); 

        // Si un utilisateur est connecté
        if (mainJFrame.isUserConnected){
            repas_controller.Modifier_Un_Repas(sqlDate, personne, id_utilisateur, idTypeRepas, id_un_repas ); // On ajoute le repas dans la table "repas"
            
            // Pour chaque recette on ajoute une ligne à la table repas_recette 
            for(int element : indexrecette){ 
                int id_recette = element; //On transforme l'élément en id 
                repas_recette_controller.Modifier_Repas_Recette(id_un_repas,id_recette); //On associe chaque recette au repas
            }
            javax.swing.JOptionPane.showMessageDialog(this, 
            "Repas modifier avec succès! "
                    + "Retour à la page de Liste de Repas", 
            "Ajouter un nouveau repas", 
            javax.swing.JOptionPane.INFORMATION_MESSAGE);
            
            mainJFrame.SwithPanel("pageListeRepas");
        
        
                
        }else{
            javax.swing.JOptionPane.showMessageDialog(this, 
                "Vous devez être connecté en tant qu'utilisateur pour pouvoir créer des repas", 
                "Erreur de connexion", 
                javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Enregister_buttonActionPerformed

    private void Date_fieldAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Date_fieldAncestorAdded
        // TODO add your handling code here:
        id_un_repas = mainJFrame.getId_Repas();
        System.out.println("Voici le repas sélectionné : " + id_un_repas);
        String date = repas_controller.Lister_Date_Un_Repas(id_un_repas); 
        System.out.println("Voici la date du repas : " + date);
        Date_field.setText(date);
    }//GEN-LAST:event_Date_fieldAncestorAdded

    private void Type_comboboxAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Type_comboboxAncestorAdded
        // TODO add your handling code here:
        id_un_repas = mainJFrame.getId_Repas();
        Type_combobox.removeAllItems();
        repas_controller.Initialiser_ComboBox_Avec_Selection(Type_combobox, id_un_repas);
    }//GEN-LAST:event_Type_comboboxAncestorAdded

    private void Personne_fieldAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Personne_fieldAncestorAdded
        // TODO add your handling code here:
        id_un_repas = mainJFrame.getId_Repas();
        String type = repas_controller.Lister_Personne_Un_Repas(id_un_repas);
        Personne_field.setText(type);
    }//GEN-LAST:event_Personne_fieldAncestorAdded

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField Date_field;
    public javax.swing.JButton Enregister_button;
    public javax.swing.JList<String> Liste_recette_ajoute;
    public javax.swing.JTextField Personne_field;
    public javax.swing.JTable Table_Recette;
    public javax.swing.JComboBox<Type_Repas_Item> Type_combobox;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
