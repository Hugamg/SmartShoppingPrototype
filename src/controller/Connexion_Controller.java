/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bdd.Requete_bdd;
import java.util.ArrayList;

/**
 *
 * @author amagl
 */
public class Connexion_Controller {
    private Requete_bdd requete;
    int id_utilisateur;
    
    
    public Connexion_Controller(Requete_bdd requete2){
        this.requete= requete2;
        this.id_utilisateur= 0;
    }
    
   
    // Méthode de vérification de connexion avec un identifiant entré et un mot de passe
    public boolean Verifier_Connexion(String identifiant, String mdp){
       
        ArrayList<ArrayList<Object>> id = requete.connexionAuService(identifiant, mdp);
        
        // Si aucun id n'est retourné,si il est vide ou inférieur 
        if (id != null && !id.isEmpty() && id.get(0).size() > 0){
            
            this.id_utilisateur = (Integer) id.get(0).get(0); 
            System.out.println("Résultat de executeQuery : " + id);

            
            return true;
            
            
        }
        System.out.println("Résultat de executeQuery : " + id);

        return false;
        
    }
    
    // Méthode pour obtenir l'ID de l'utilisateur connecté
    public int Get_Id_Utilisateur() {
        return id_utilisateur;
    }

}
