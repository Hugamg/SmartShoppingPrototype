package bdd;

import java.sql.*;
import java.util.ArrayList;

public class Requete_bdd extends BDD{
    private BDD bdd = new BDD();
    // Requête utilisateur
    
    public Requete_bdd() {
    bdd.Connexion();
    }
    
    public Requete_bdd(BDD bdd) {
        this.bdd = bdd;
    }
        //Méthode Utilisateur
    
        // Méthode d'insertion d'utilisateur
        public boolean insertionUtilisateur(String identifiant, String nom, String prenom, String mdp) {
            String requete = "INSERT INTO utilisateur (identifiant, nom, prenom, mdp) VALUES (?, ?, ?, ?)"; 
            // Les valeurs "?" corresponde aux valeurs qui seront insérer dans les colonnes indiqués
            return executeUpdate(requete);
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
        public ArrayList<ArrayList<Object>> listerRecette() {
            String requete = "SELECT nom, id FROM recette";
            return executeQuery(requete);
        }
        
        // Méthode de supression de recette
        public boolean suppressionRecette(int recetteId) {
            String requete = "DELETE FROM recette WHERE id = ?";
            return executeUpdate(requete, recetteId);
        }
        
    //Requête Type_
        // Méthode de listage de tout les type de repas 
        public ArrayList<ArrayList<Object>> lister_Type_Repas() {
            String requete = "SELECT id, nom FROM type_repas";
            return executeQuery(requete);
        }


    // Requête Ingrédient

        // Méthode d'affichage de tous les ingrédients d'une recette
        public ArrayList<ArrayList<Object>> listerIngredientRecette(int recetteId) {
            String requete = "SELECT r.nom, i.nom, rc.quantite " +
                     "FROM recette_ingredient AS rc " +
                     "INNER JOIN recette AS r ON rc.id_recette = r.id " +
                     "INNER JOIN ingredient AS i ON rc.id_ingredient = i.id " +
                     "INNER JOIN calorie AS c ON i.id_calorie = c.id " +
                     "WHERE rc.id_recette = ?";
            return executeQuery(requete, recetteId);
        }
        
        // Méthode d'affichages de toutes les recettes  
        public ArrayList<ArrayList<Object>> listerToutIngredientRecette() {
            String requete = "SELECT r.nom AS nom_recette, GROUP_CONCAT(i.nom SEPARATOR ', ') AS ingredients " +
                 "FROM recette AS r " +
                 "INNER JOIN recette_ingredient AS rc ON rc.id_recette = r.id " +
                 "INNER JOIN ingredient AS i ON rc.id_ingredient = i.id " +
                 "GROUP BY r.id, r.nom";

            return executeQuery(requete);
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
        
    // Requête Repas_recettes
        
        // Méthode d'ajout d'un repas 
        public boolean associerRepas(Date date, String nom, String type, int personne) {
            String requete = "INSERT INTO repas_recette(id_repas, id_recette) VALUES (?, ?)" 
                    ;
            
            return executeUpdate(requete, date, nom, type, personne);
        }
}


