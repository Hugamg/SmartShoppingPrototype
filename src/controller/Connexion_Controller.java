/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bdd.Requete_bdd;
import entity.Repas_Recette_Item;
import java.util.ArrayList;

/**
 *
 * @author amagl
 */
public class Connexion_Controller {
    private Requete_bdd requete;
    int userId ;
    
    
    public Connexion_Controller(Requete_bdd requete2){
        this.requete= requete2;
        this.userId= -1;
    }
    
    // Méthode pour obtenir l'ID de l'utilisateur connecté
    public int getUserId() {
        return userId;
    }
    
    
    
    public boolean verifierConnexion(String identifiant, String mdp){
        
        // Créer une liste d'objets RecetteRepasItem
        ArrayList<ArrayList<Object>> id = requete.connexion_Au_Service(identifiant, mdp);
        
        
        if (id != null && !id.isEmpty() && id.get(0).size() > 0){
            
            this.userId = (Integer) id.get(0).get(0); 
            System.out.println("Résultat de executeQuery : " + id);

            
            return true;
            
            
        }
        System.out.println("Résultat de executeQuery : " + id);

        return false;
        
    }
   
    

}
