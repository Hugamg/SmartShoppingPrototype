package page;


import controller.Paged_accueil_Controller;
import controller.Repas_Controller;
import entity.Ingredient_Item;
import entity.Type_Ingredient_Item;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import main.MainFrame;




public class Paged_accueil extends javax.swing.JPanel {
    
    // Appel du La Frame principal
    private MainFrame mainJFrame;
    
    
    // Contrôleurs
    private Paged_accueil_Controller accueil_controller;
    private Repas_Controller repas_controller;
    
    
    // Objets
    private DefaultComboBoxModel repas_date;
    private DefaultComboBoxModel<Type_Ingredient_Item> ingredient_type;
    
    
    // Interfaces
    private ArrayList<Ingredient_Item> listeTousIngredients; // contient tous les ingrédients
    private ArrayList<Ingredient_Item> listeIngredientsRecuperes; // ceux sélectionnés
    private DefaultTableModel modelTableTous;
    private DefaultTableModel modelTableRecuperes;

//---------------------------------------------------------------------------------------------------------------
    
    
    
    // Constructeur
    public Paged_accueil(MainFrame newJFrame) {
        mainJFrame = newJFrame;
        accueil_controller = new Paged_accueil_Controller(mainJFrame.getBDD());
        repas_controller = new Repas_Controller(mainJFrame.getBDD());
        
 
        initComponents();
        
        ingredient_type = accueil_controller.Lister_Type_Ingredient();
        chargerIngredient();
        chargerTypeIngredient();
   
    }
    
    
    
//----------------------------------------------------------------------------------------------------------------
    
    //Méthodes et Events

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Filtre_Date1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        Filtre_Date2 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Type_combobox = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table_ingredient_recup = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        Table_ingredient_nec = new javax.swing.JTable();

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Smart Shopping");
        jLabel2.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Accueil");
        jLabel6.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 10)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("à");
        jLabel1.setToolTipText("");

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

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 10)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Filtre date :");
        jLabel3.setToolTipText("");

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

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Liste de courses");
        jLabel7.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Ingrédient en ma possession");
        jLabel8.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 10)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Filtre type d'ingrédient :");
        jLabel4.setToolTipText("");

        Type_combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Type_comboboxActionPerformed(evt);
            }
        });

        Table_ingredient_recup.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Sélectionner", "Nom Ingrédient", "Quantité(s)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table_ingredient_recup.setColumnSelectionAllowed(true);
        Table_ingredient_recup.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        Table_ingredient_recup.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jScrollPane2.setViewportView(Table_ingredient_recup);
        Table_ingredient_recup.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (Table_ingredient_recup.getColumnModel().getColumnCount() > 0) {
            Table_ingredient_recup.getColumnModel().getColumn(1).setResizable(false);
            Table_ingredient_recup.getColumnModel().getColumn(2).setResizable(false);
        }

        Table_ingredient_nec.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Sélectionner", "Nom Ingrédient", "Quantité(s)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table_ingredient_nec.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        Table_ingredient_nec.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jScrollPane3.setViewportView(Table_ingredient_nec);
        Table_ingredient_nec.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (Table_ingredient_nec.getColumnModel().getColumnCount() > 0) {
            Table_ingredient_nec.getColumnModel().getColumn(1).setResizable(false);
            Table_ingredient_nec.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Filtre_Date1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Filtre_Date2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(Type_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(402, 402, 402))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(440, 440, 440)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(55, 55, 55)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(569, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Filtre_Date1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Filtre_Date2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(38, 38, 38)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Type_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(266, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(90, 90, 90)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Filtre_Date1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Filtre_Date1ActionPerformed
        // TODO add your handling code here:
        chargerIngredient();
    }//GEN-LAST:event_Filtre_Date1ActionPerformed

    private void Filtre_Date2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Filtre_Date2ActionPerformed
        // TODO add your handling code here:
        chargerIngredient();
    }//GEN-LAST:event_Filtre_Date2ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void Filtre_Date1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Filtre_Date1AncestorAdded
        // TODO add your handling code here:
       
        int id_utilisateur = mainJFrame.getId_Utilisateur();
        repas_date = repas_controller.Lister_Date_Repas(id_utilisateur);
        
        Filtre_Date1.removeAllItems();
        Filtre_Date1.setModel(repas_date);
        
        // Sélectionne la date du jour si elle est dans le modèle
        String dateAujourdhui = new SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date());
        Filtre_Date1.setSelectedItem(dateAujourdhui);
    }//GEN-LAST:event_Filtre_Date1AncestorAdded

    private void Filtre_Date2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Filtre_Date2AncestorAdded
        // TODO add your handling code here:
        int id_utilisateur = mainJFrame.getId_Utilisateur();
        repas_date = repas_controller.Lister_Date_Repas(id_utilisateur);
        
        Filtre_Date2.removeAllItems();
        Filtre_Date2.setModel(repas_date);
        
        // Sélectionne la date du jour si elle est dans le modèle
        String dateAujourdhui = new SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date());
        Filtre_Date2.setSelectedItem(dateAujourdhui);
    }//GEN-LAST:event_Filtre_Date2AncestorAdded

    private void Type_comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Type_comboboxActionPerformed
        // TODO add your handling code here:
        chargerIngredient();
    }//GEN-LAST:event_Type_comboboxActionPerformed

    private void chargerIngredient() {
 
        int id_utilisateur = mainJFrame.getId_Utilisateur();
        
        String date1 = (String) Filtre_Date1.getSelectedItem();
        String date2 = (String) Filtre_Date2.getSelectedItem();
        
        // Etape 3 ; On récupère l'éléments sélectionner dans jboxcombo
        int idTypeIngredient= -1; // Valeur par défaut
        Type_Ingredient_Item type_ingredient= (Type_Ingredient_Item) Type_combobox.getSelectedItem();
        if (type_ingredient != null) {
        idTypeIngredient = type_ingredient.getId();  // Tu récupères directement l’ID ici
        System.out.println("ID du type de repas sélectionné : " + idTypeIngredient);
        }
        
        // Initialisation des listes
        listeTousIngredients = accueil_controller.Get_Tous_Ingredient(id_utilisateur, date1, date2, idTypeIngredient);
        listeIngredientsRecuperes = new ArrayList<>();
        
        
        //On vient créer nos deux modèles pour nos tableaux 
        
        // Modèle pour les ingrédients disponibles
        modelTableTous  = new DefaultTableModel(new Object[]{"Sélectionner", "Nom Ingrédient", "Quantité"}, 0) {
            public Class<?> getColumnClass(int columnIndex) {
                return columnIndex == 0 ? Boolean.class : String.class;
            }
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return columnIndex == 0;
            }
        };

        
        // Modèle pour les ingrédients récupérés
        modelTableRecuperes  = new DefaultTableModel(new Object[]{"Sélectionner", "Nom Ingrédient", "Quantité"}, 0) {
            public Class<?> getColumnClass(int columnIndex) {
                return columnIndex == 0 ? Boolean.class : String.class;
            }
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return columnIndex == 0;
            }
        };

        // Remplir le premier tableau
        for (Ingredient_Item item : listeTousIngredients) {
            modelTableTous.addRow(new Object[]{false, item.getIngredientNom(), item.getQuantite()}); //On ajoute les ingrédients items
        }
        
        Table_ingredient_nec.setModel(modelTableTous);
        Table_ingredient_recup.setModel(modelTableRecuperes);
    
        // Ajouter écouteur d’événement
        TableModelListener listener = e -> {
            int row = e.getFirstRow();
            int col = e.getColumn();

        if (col == 0 && e.getSource() == modelTableTous) {
            boolean selected = (boolean) modelTableTous.getValueAt(row, 0);
            String nom = (String) modelTableTous.getValueAt(row, 1);

            if (selected) {
                Ingredient_Item item = listeTousIngredients.get(row); // On récupère la ligne qui est sélectionné
                listeIngredientsRecuperes.add(item); // On ajoute la ligne dans le tableau des ingrédient récupérés qui est sélectionné
                listeTousIngredients.remove(item); // On retire donc la ligne dans le tableau des ingrédient à récupérer qui est sélectionné
                modelTableTous.removeRow(row);
                modelTableRecuperes.addRow(new Object[]{true, item.getIngredientNom(), item.getQuantite()});
            }
        } else if (col == 0 && e.getSource() == modelTableRecuperes) {
            boolean deselected = !(boolean) modelTableRecuperes.getValueAt(row, 0);
            if (deselected) {
                String nom = (String) modelTableRecuperes.getValueAt(row, 1);
                Ingredient_Item item = listeIngredientsRecuperes.get(row);
                listeTousIngredients.add(item);
                listeIngredientsRecuperes.remove(item);
                modelTableRecuperes.removeRow(row);
                modelTableTous.addRow(new Object[]{false, item.getIngredientNom(), item.getQuantite()});
            }
        }
        };

        modelTableTous.addTableModelListener(listener);
        modelTableRecuperes.addTableModelListener(listener);
            this.revalidate();
            this.repaint();

    }
    
    public void chargerTypeIngredient(){
        Type_combobox.removeAllItems();
        Type_combobox.setModel(ingredient_type);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Filtre_Date1;
    private javax.swing.JComboBox<String> Filtre_Date2;
    private javax.swing.JTable Table_ingredient_nec;
    private javax.swing.JTable Table_ingredient_recup;
    private javax.swing.JComboBox<Type_Ingredient_Item> Type_combobox;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
