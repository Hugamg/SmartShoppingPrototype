/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bdd.Requete_bdd;
import entity.Ingredient_Item;
import entity.Type_Ingredient_Item;
import entity.Type_Repas_Item;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import main.MainFrame;

/**
 *
 * @author amagl
 */
public class Paged_accueil_Controller {
    private MainFrame mainJFrame;
    private Requete_bdd requete;
    private int id;
    
    
    
    
    public Paged_accueil_Controller(Requete_bdd requete2){
        this.requete= requete2;
    }
    
    
    // Méthode pour lister les types de repas dans la JCombobox
    public DefaultComboBoxModel<Type_Ingredient_Item> ListerTypeIngredient(){
        DefaultComboBoxModel<Type_Ingredient_Item> model = new DefaultComboBoxModel<>();
        // Récupération des résultats SQL (la requête est déjà dans ton modèle)
        ArrayList<ArrayList<Object>> listeTypeRepas = requete.lister_Type_Ingredient();

        for (ArrayList<Object> ligne : listeTypeRepas) {
            id = Integer.parseInt(ligne.get(0).toString());// Colonne ID
            String nom = ligne.get(1).toString(); // Colonne nom

            Type_Ingredient_Item item = new Type_Ingredient_Item(id, nom);
            model.addElement(item);
        }
        return model;
    }
    
    // Méthode pour obtenir le modèle de table pour les ingrédients d'une recette donnée
    public DefaultTableModel Lister_Tout_Ingredient(int id_utilisateur, String dateDebut, String dateFin, int id_type) {
        // Récupérer les ingrédients pour la recette avec l'ID fourni
        ArrayList<ArrayList<Object>> liste_ingredient = requete.listerToutIngredient(id_utilisateur, dateDebut, dateFin, id_type);
        // Noms des colonnes du tableau
        String[] model = {"Sélectionner", "Nom Ingrédients", "Quantité(s)"};
       
        // Créer une liste d'objets RecetteRepasItem
        ArrayList<Ingredient_Item> items = new ArrayList<>();
        
        for (ArrayList<Object> ligne : liste_ingredient) {
            try {
                int id = Integer.parseInt(ligne.get(0).toString());
                String nom_ingredient= ligne.get(1).toString();
                String quantite = ligne.get(2).toString();

                Ingredient_Item item = new Ingredient_Item(id, nom_ingredient, quantite);
                items.add(item);
            } catch (NumberFormatException e) {
                System.err.println("Erreur ID recette non numérique : " + ligne.get(0));
            }
        }
        
        // Création du tableau de données pour JTable
        Object[][] data = new Object[items.size()][3];
        for (int i = 0; i < items.size(); i++) {
            Ingredient_Item item = items.get(i);
            data[i][0] = item.isSelected();         // Checkbox
            data[i][1] = item.getIngredientNom();      // Nom recette
            data[i][2] = item.getQuantite();     // Ingrédients groupés
        }

        // Création du modèle de tableau avec la checkbox
        return new DefaultTableModel(data, model) {
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return (columnIndex == 0) ? Boolean.class : String.class;
            }
            
            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 0; // Seule la colonne checkbox est modifiable
            }

        };     
    }
    
}
