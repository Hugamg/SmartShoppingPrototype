/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import main.MainFrame;
import bdd.*;
import java.util.HashMap;


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
    
    public DefaultListModel Lister_recette_liste(){
        // Définir un nouveau modèle avec deux colonnes : "Nom" et "ID"
        DefaultListModel<String> model = new DefaultListModel<>(); // Créer un nouveau modèle de liste
        model.setSize(0); // On vide le tableau avant d’ajouter les nouvelles lignes. Ici on indique que le modèle ne possède aucune ligne (0)
        
        
        // Méthode d'affichages de toutes les recettes  
        ArrayList<ArrayList<Object>> listeRecette = requete.listerRecette(); // On créer une liste qui comportera une liste de plusieurs liste d'object
        /* - 1er ArrayList : Définition de la liste 
        - <ArrayList<Object>> : On insère les différentes sous liste de Lister recette du genre ([Pain au chocolat, 3]
        - On appelle la liste "listeRecette"
        - On lui donne les information de la requête listerRecette
        */ 
        
        int index= 0;
        
         for (ArrayList<Object> ligne : listeRecette) { // ici on va reboubler sur chaque ligne qui va être renvoyé par notre liste de liste d'objet
            String nom = ligne.get(0).toString(); //On insère les données de la première colonne (ici des nom) pour chaque ligne
            int id = ligne.get(1).toString().; //On insère les données de la deuxième colonne (ici des id) pour chaque ligne que l'ont retourne sous format de string
        
            
            model.addElement(nom); // On ajoute à la liste seulement la colonne nom de notre ArrayList
            

            System.out.println(listeRecette);
        }
         
        return model; 
        
    }
}
