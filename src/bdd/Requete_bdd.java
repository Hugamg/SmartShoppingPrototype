package bdd;

import java.sql.*;
import java.util.ArrayList;

public class Requete_bdd extends BDD{

    // Requête utilisateur
    
        // Méthode d'insertion d'utilisateur
        public boolean insertionUtilisateur(String nom, String prenom, String email, String password) {
            String requete = "INSERT INTO Utilisateur (nom, prenom, email, password) VALUES (?, ?, ?, ?)"; 
            // Les valeurs "?" corresponde aux valeurs qui seront insérer dans les colonnes indiqués
            return executeUpdate(requete, nom, prenom, email, password);
        }
        
        // Méthode de supression d'utilisateur
        public boolean suppressionUtilisateur(int userId) {
            String requete = "DELETE FROM Utilisateur WHERE id = ?";
            return executeUpdate(requete, userId);
        }
        
        // Méthode de modification du mot de passe de l'utilisateur
        public boolean modificationpassword_Utilisateur(String password) {
            String requete = "UPDATE Utilisateur SET password = ? WHERE id = ?";
            return executeUpdate(requete,password);
        }
        





    // Requête Recettes

        // Méthode d'affichages de toutes les recettes  
        public ArrayList<ArrayList<Object>> listerRecettes() {
            String requete = "SELECT nom FROM Recette";
            return executeQuery(requete);
        }
        




    // Requête Ingrédient

        // Méthode d'affichage de tous les ingrédients d'une recette
        public ArrayList<ArrayList<Object>> listerIngredientRecette(int recetteId) {
            String requete = "SELECT i.id_Ingredient, i.nom, i.quantite FROM Ingredient AS i " +
                             "INNER JOIN Composer AS c ON i.id_Ingredient = c.id_Ingredient " +
                             "WHERE c.id_Recette = ?";
            return executeQuery(requete, recetteId);
        }

        // Méthode d'affichage de tous les ingrédients d'un repas
        public ArrayList<ArrayList<Object>> listeIngredientRepas(int repasid){
            String requete= "SELECT i.id_Ingredient, i.nom, i.quantite FROM Ingredient AS i " +
                            "INNER JOIN Repas" +
                            "LEFT JOIN Recette" +
                            "WHERE id_Repas = ? AND id_Recette = id_Repas; ";
            return executeQuery(requete, repasid);
        }




    // Requête Repas 
        
        // Méthode d'ajout de repas 
        public boolean ajouterRepas(Date date, String nom, String type, int personne) {
            String requete = "INSERT INTO Repas (date, nom, type, personne) VALUES (?, ?, ?, ?)";
            return executeUpdate(requete, date, nom, type, personne);
        }
        
        //Méthode de listage de tous les repas
        public ArrayList<ArrayList<Object>> listerRepas() {
            String requete = "SELECT id, date_repas, nom, type FROM repas";
            return executeQuery(requete);
        }

        //Méthode d'affichage d'un repas spécifique 
        public ArrayList<ArrayList<Object>> lister_selectRepas() {
            String requete = "SELECT id_Repas, date, nom, type, recette FROM Repas";
            return executeQuery(requete);
        }
    
        
        // Méthode de supression de repas 
        public boolean supprimerRepas(int repasId) {
            String requete = "DELETE FROM Repas WHERE id_Repas = ?";
            return executeUpdate(requete, repasId);
        }
        
        //Méthode de modification de repas 
        public boolean modifierRepas(int repasId, Date date, String nom, String type, int personne) {
            String requete = "UPDATE Repas SET date = ?, nom = ?, type = ?, personne = ? WHERE id_Repas = ?";
            return executeUpdate(requete, date, nom, type, personne, repasId);
        }



        

    // Requête Ustensiles

        //Lister tout les ustensiles d'une recette sélectionnée
        public boolean lister_selectUstensiles(int ustensile) {
            String requete= "SELECT id_Ustensile, type FROM Ustensile \n"+
                            "INNER JOIN Recette WHERE id_Recette = ?"; 
            return executeUpdate(requete);
        }

}


