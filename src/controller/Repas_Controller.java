/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import main.MainFrame;
import bdd.Requete_bdd;
import entity.Repas_Recette_Item;


import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author amagl
 */
public class Repas_Controller {
    private MainFrame mainJFrame;
    private Requete_bdd requete;

    
    public Repas_Controller(Requete_bdd requete2){
        this.requete= requete2;
    }
    
    // Méthode pour obtenir le modèle de table pour les ingrédients d'une recette donnée
    public DefaultTableModel ListerRecetteRepas() {
        // Récupérer les ingrédients pour la recette avec l'ID fourni
        ArrayList<ArrayList<Object>> liste_recette = requete.listerToutIngredientRecette();
        // Noms des colonnes du tableau
        String[] model = {"Sélectionner", "Recette", "Ingrédients(1 personne)"};
        
        // Créer une liste d'objets RecetteRepasItem
        ArrayList<Repas_Recette_Item> items = new ArrayList<>();
   
        for (int i= 0 ; i < liste_recette.size(); i++){
            
            ArrayList<Object> recette = liste_recette.get(i);
        // Créer un objet RecetteRepasItem pour chaque ligne
        int id = (Integer) recette.get(0);  // ID de la recette
        String nom = (String) recette.get(1);  // Nom de la recette
        String ingredient = (String) recette.get(2);  // Ingrédient
        
        // Créer un nouvel objet RecetteRepasItem
        Repas_Recette_Item item = new Repas_Recette_Item(id, nom, ingredient);
        items.add(item);
        }
        
        // Tableau de données pour les ingrédients
        Object[][] data = new Object[items.size()][3];  // 3 colonnes : Sélectionner, Recette, Ingrédient

        // Remplissage du tableau avec les données
        for (int i = 0; i < items.size(); i++) {
            Repas_Recette_Item item = items.get(i);

            // Initialisation de la case à cocher (false par défaut)
            data[i][0] = item.isSelected();  // La première colonne est la case à cocher
            data[i][1] = item.getRecetteNom();  // Nom de la recette
            data[i][2] = item.getIngredient();  // Ingrédient associé
        }
        
        // Retourne le modèle de table avec les données et les noms de colonnes
        return new DefaultTableModel(data, model) {
            // Permet de rendre la première colonne éditable (case à cocher)
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                if (columnIndex == 0) {
                    return Boolean.class;  // La première colonne est une case à cocher
                }
                return super.getColumnClass(columnIndex);
            }
        };
    }
}
