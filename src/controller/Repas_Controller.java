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
}
