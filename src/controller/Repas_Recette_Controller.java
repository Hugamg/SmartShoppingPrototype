/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bdd.Requete_bdd;
import entity.Repas_Recette_Item;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author amagl
 */
public class Repas_Recette_Controller {
    private Requete_bdd requete;


    
    public Repas_Recette_Controller(Requete_bdd requete2){
        this.requete= requete2;
    }
    
   
    
    
    // Méthode pour l'ajout de repas
    
    public void Associer_Repas_Recette(int id_repas, int id_recette ) {
        boolean success = requete.associerRepas(id_repas, id_recette);
        if (success) {
            System.out.println("Repas asoocier à la recette avec succès !");
        } else {
            System.out.println("Échec de l'association.");
        }
    }
    
    
    //--------------------------------------------------------------------------------------------------------------------
    
    
    
    
    
    
    // Méthode pour la modification de Repas
    
    // Méthode pour obtenir les ids des recettes sélectionnés pour un repas spécifique
    
    public ArrayList<Integer> lister_Id_Recette_Un_Repas(int idRepas) {
        ArrayList<ArrayList<Object>> lignes = requete.lister_Recette_unRepas(idRepas);
        ArrayList<Integer> les_id = new ArrayList<>();

        for (ArrayList<Object> ligne : lignes) {
            try {
                int id = Integer.parseInt(ligne.get(0).toString());
                les_id.add(id);
            } catch (NumberFormatException e) {
                System.err.println("ID recette non valide pour le repas " + idRepas + ": " + ligne.get(0));
            }
        }

        return les_id;
    }
    
    
    // Méthode pour lister les recettes d'un repas avec les ingrédients associés
    
    public DefaultTableModel Lister_Recette_Repas_Avec_Selection(int idRepas) {
        // Étape 1 : Récupérer toutes les recettes 
        ArrayList<ArrayList<Object>> liste_recette = requete.listerToutIngredientRecette();

        // Étape 2 : Récupérer les ID des recettes sélectionnées pour ce repas
        ArrayList<Integer> idsRecettesSelectionnees = lister_Id_Recette_Un_Repas(idRepas);

        // Étape 3 : Créer les colonnes
        String[] model = {"Sélectionner", "Recette", "Ingrédients(1 personne)"};

        ArrayList<Repas_Recette_Item> items = new ArrayList<>();

        for (ArrayList<Object> ligne : liste_recette) {
            try {
                int id = Integer.parseInt(ligne.get(0).toString());
                String nom = ligne.get(1).toString();
                String ingredients = ligne.get(2).toString();

                Repas_Recette_Item item = new Repas_Recette_Item(id, nom, ingredients);

                // Coche si cette recette est liée au repas
                if (idsRecettesSelectionnees.contains(id)) {
                    item.setSelected(true);
                }

                items.add(item);
            } catch (NumberFormatException e) {
                System.err.println("Erreur ID recette non numérique : " + ligne.get(0));
            }
        }

        // Étape 4 : Construire les données du tableau
        Object[][] data = new Object[items.size()][3];
        for (int i = 0; i < items.size(); i++) {
            Repas_Recette_Item item = items.get(i);
            data[i][0] = item.isSelected();         // Checkbox
            data[i][1] = item.getRecetteNom();      // Nom recette
            data[i][2] = item.getIngredient();      // Ingrédients groupés
        }

        return new DefaultTableModel(data, model) {
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return (columnIndex == 0) ? Boolean.class : String.class;
            }

            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 0; // seule la checkbox est éditable
            }
        };
    }
    
    public void Modifier_Repas_Recette(int id_repas, int id_recette ) {
        boolean success = requete.associerRepas(id_repas, id_recette);
        if (success) {
            System.out.println("Repas asoocier à la recette avec succès !");
        } else {
            System.out.println("Échec de l'association.");
        }
    }
    
    
    
    

    //--------------------------------------------------------------------------------------------------------------------
    
    // Méthode commune à l'ajout et la modification de repas
    
    // Méthode permettant de lister toutes les recettes existantes dans un tableau
    
    public DefaultTableModel Lister_Recette_Repas() {
        // Récupérer les ingrédients pour la recette avec l'ID fourni
        ArrayList<ArrayList<Object>> liste_recette = requete.listerToutIngredientRecette();
        // Noms des colonnes du tableau
        String[] model = {"Sélectionner", "Recette", "Ingrédients(1 personne)"};
       
        // Créer une liste d'objets RecetteRepasItem
        ArrayList<Repas_Recette_Item> items = new ArrayList<>();
        
        for (ArrayList<Object> ligne : liste_recette) {
            try {
                int id = Integer.parseInt(ligne.get(0).toString());
                String nom = ligne.get(1).toString();
                String ingredients = ligne.get(2).toString();

                Repas_Recette_Item item = new Repas_Recette_Item(id, nom, ingredients);
                items.add(item);
            } catch (NumberFormatException e) {
                System.err.println("Erreur ID recette non numérique : " + ligne.get(0));
            }
        }
    
        // Création du tableau de données pour JTable
        Object[][] data = new Object[items.size()][3];
        for (int i = 0; i < items.size(); i++) {
            Repas_Recette_Item item = items.get(i);
            data[i][0] = item.isSelected();         // Checkbox
            data[i][1] = item.getRecetteNom();      // Nom recette
            data[i][2] = item.getIngredient();     // Ingrédients groupés
        }

        // Création du modèle de tableau avec la checkbox
        return new DefaultTableModel(data, model) {
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return (columnIndex == 0) ? Boolean.class : String.class;
            }
        };     
    }
    
    // Méthode pour récupérer les ids des recettes sélectionnées dans un tableau pour les disposées dans une liste
    
    public List<Repas_Recette_Item> Recup_Id_Recette(){
        ArrayList<ArrayList<Object>> listerecette= requete.listerToutIngredientRecette();
        List<Repas_Recette_Item> items = new ArrayList();
        
        for (ArrayList<Object> ligne : listerecette){
            try {
                int id = Integer.parseInt(ligne.get(0).toString());
                String nom = ligne.get(1).toString();
                String ingredients = ligne.get(2).toString();
                
                items.add(new Repas_Recette_Item(id, nom, ingredients));
            }catch (NumberFormatException e) {
            System.err.println("Erreur ID recette non numérique : " + ligne.get(0));
            }
        }
        return items;
        
    }

 
    //Méthode pour afficher les recettes sélectionnées d'un tableau dans une liste
    
    public List<Integer> Maj_Selection_Recette(JTable tableModel, DefaultListModel<String> listModel) {
        // On vide la JList avant de la remplir à nouveau
        listModel.clear();

        // On créer une liste pour récupérer les id des recettes qui seront sélectionné.
        List<Integer> idRecettesSelectionnees = new ArrayList<>();
        
        List<Repas_Recette_Item> toutesLesRecettes = Recup_Id_Recette(); // Récupère les objets complets (avec ID)

        // Parcours de chaque ligne de la JTable 'Table_Recette' présent dans mon event
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            Boolean isSelected = (Boolean) tableModel.getValueAt(i, 0); // Case à cocher (colonne 0)
            if (isSelected != null && isSelected) {
               // Si la case est cochée, récupérer l'ID de la recette (colonne 1 : Nom de la recette)
               String nomRecette = tableModel.getValueAt(i, 1).toString(); // Nom affiché
               listModel.addElement(nomRecette);
               System.out.println("Recette ajoutée : " + nomRecette);  // Vérification

                for (Repas_Recette_Item item : toutesLesRecettes) {
                    if (item.getRecetteNom().equals(nomRecette)) {
                        idRecettesSelectionnees.add(item.getId());
                        break;          
                    }
                }
            }
        }
        
            return idRecettesSelectionnees;
    }
    
    
    
    // Méthode pour récupérer l'id d'un repas en fonction d'un id d'utilisateur, d'une date de repas et d'un type de repas
    
    public Integer Get_Id_Repas(int id_utilisateur, Date date_repas, int id_type) {
        ArrayList<ArrayList<Object>> resultat = requete.lister_unRepas(id_utilisateur, date_repas, id_type);

        // Vérifie que le résultat n'est pas vide
        if (resultat != null && !resultat.isEmpty() && !resultat.get(0).isEmpty()) {
            return (Integer) resultat.get(0).get(0); // Récupère la première valeur : l'ID
        }

        // Si aucun repas ne correspond, retourne null ou -1 selon ce que tu préfères
        return null;
    }

    
    
}

