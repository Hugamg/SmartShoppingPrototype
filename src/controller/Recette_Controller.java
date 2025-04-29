/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import main.MainFrame;
import bdd.*;
import entity.Recette_Item;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author h.amaglio
 */
public class Recette_Controller {
    private MainFrame mainJFrame;
    private Requete_bdd requete;
   
    
    public Recette_Controller(Requete_bdd requete2){
        this.requete= requete2;
    }
    
    
    public DefaultListModel <Recette_Item> Lister_recette_liste(){
        // Définir un nouveau modèle avec deux colonnes : "Nom" et "ID"
        DefaultListModel<Recette_Item> model = new DefaultListModel<>(); // Créer un nouveau modèle de liste
        model.setSize(0); // On vide le tableau avant d’ajouter les nouvelles lignes. Ici on indique que le modèle ne possède aucune ligne (0)
        
        
        // Méthode d'affichages de toutes les recettes  
        ArrayList<ArrayList<Object>> listeRecette = requete.listerRecette(); // On créer une liste qui comportera une liste de plusieurs liste d'object
        /* - 1er ArrayList : Définition de la liste 
        - <ArrayList<Object>> : On insère les différentes sous liste de Lister recette du genre ([Pain au chocolat, 3]
        - On appelle la liste "listeRecette"
        - On lui donne les information de la requête listerRecette
        */ 
         for (ArrayList<Object> ligne : listeRecette) { // ici on va reboubler sur chaque ligne qui va être renvoyé par notre liste de liste d'objet
            String nom = ligne.get(0).toString(); //On insère les données de la première colonne (ici des nom) pour chaque ligne
            int id = Integer.parseInt(ligne.get(1).toString()); //On insère les données de la deuxième colonne (ici des id) pour chaque ligne que l'ont retourne sous format de string
            
            // Créer un objet Recette_Item pour chaque recette
            Recette_Item item = new Recette_Item(nom, id);
            model.addElement(item);
            
        }
        return model;    
    }
    
    // Méthode pour récupérer un Recette_Item à partir de l'index
    public Recette_Item getRecetteItemFromList(DefaultListModel<Recette_Item> model, int index) {
        if (index >= 0 && index < model.size()) {
            return model.getElementAt(index); // Retourner l'objet Recette_Item
        }
        return null;
    }
    
    // Méthode pour obtenir le modèle de table pour les ingrédients d'une recette donnée
    public DefaultTableModel ListerIngredientsRecette(int recetteId) {
        // Récupérer les ingrédients pour la recette avec l'ID fourni
        ArrayList<ArrayList<Object>> ingredients = requete.listerIngredientRecette(recetteId);

        // Noms des colonnes du tableau
        String[] model = {"Nom Ingrédient", "Quantité", "Calorie"};

        // Tableau de données pour les ingrédients
        Object[][] data = new Object[ingredients.size()][3];  // 3 colonnes : Nom, Quantité, Calorie

        // Remplissage du tableau avec les données
        for (int i = 0; i < ingredients.size(); i++) {
            ArrayList<Object> ingredient = ingredients.get(i);
            data[i][0] = ingredient.get(0);  // Nom de l'ingrédient
            data[i][1] = ingredient.get(1);  // Quantité
            data[i][2] = ingredient.get(2);  // Calorie
        }

        // Retourne le modèle de table avec les données et les noms de colonnes
        return new DefaultTableModel(data, model);
    }
   
    
    
    
    
    
    
    
    
}
