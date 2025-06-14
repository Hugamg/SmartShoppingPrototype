
package bdd;

import java.sql.*;
import java.util.ArrayList;

public class Requete_bdd extends BDD{
    // Requête utilisateur
    
    public Requete_bdd() {
       
    }
    
    
    //--------------------------------------------------------------------------------------------------------------
        //Méthode Utilisateur
    
        // Méthode d'insertion d'utilisateur
    
        public boolean insertionUtilisateur(String identifiant, String nom, String prenom, String mdp) {
            String requete = "INSERT INTO utilisateur (identifiant, nom, prenom, mdp) VALUES (?, ?, ?, ?)";
            
            // Les valeurs "?" corresponde aux valeurs qui seront insérer dans les colonnes indiqués
            return executeUpdate(requete, identifiant, nom, prenom, mdp);
        }
        
        // Méthode de supression d'utilisateur
        public boolean suppressionUtilisateur(int userId) {
            String requete = "DELETE FROM Utilisateur WHERE id = ?";
            
            return executeUpdate(requete, userId);
        }

        public ArrayList<ArrayList<Object>> connexionAuService(String identifiant, String mdp){
            String requete = "SELECT id FROM utilisateur WHERE identifiant = ? AND mdp = ? ;";

            return executeQuery(requete,identifiant,mdp);
        }
        
        
        
    //--------------------------------------------------------------------------------------------------------------
        
        
    // Requête Recettes

        // Méthode d'affichages de toutes les recettes  
        public ArrayList<ArrayList<Object>> listerRecette() {
            String requete = "SELECT nom, id FROM recette";
            
            return executeQuery(requete);
        }
        
        
        
        
    //--------------------------------------------------------------------------------------------------------------
        
        
    //Requête Type_Repas
        
        // Méthode de listagayLie de tout les type de repas 
        public ArrayList<ArrayList<Object>> listerTypeRepas() {
            String requete = "SELECT id, nom FROM type_repas";
            
            return executeQuery(requete);
        }
        
        // Méthode d'affichage d'un date d'un repas
        public ArrayList<ArrayList<Object >> listerTypeUnRepas(int id_repas) {
            String requete = "SELECT type_repas.id, type_repas.nom FROM repas  "
                            + "INNER JOIN type_repas ON repas.id_type = type_repas.id WHERE repas.id = ?;";
            
            return executeQuery(requete, id_repas);
        }
        
   
        
        
    //--------------------------------------------------------------------------------------------------------------
         
         //Requête Type_Ingredient
        
        // Méthode de listagayLie de tout les type de repas 
        public ArrayList<ArrayList<Object>> listerTypeIngredient() {
            String requete = "SELECT id, nom FROM type_ingredient";
            
            return executeQuery(requete);
        }
   
    //--------------------------------------------------------------------------------------------------------------
        
        
        
        
    // Requête Ingrédient
        
        // Méthode d'affichage de tous les ingrédients d'une recette
        public ArrayList<ArrayList<Object>> listerToutIngredient(int id_utilisateur, String dateDebut, String dateFin, int id_type) {
            String requete = "SELECT i.id AS id_ingredient, i.nom AS nom_ingredient, ty.id AS type_ingredient, "
                            + "SUM(ri.quantite * r.personne) AS quantite_totale "
                            + "FROM repas r "
                            + "JOIN repas_recette rr ON rr.id_repas = r.id "
                            + "JOIN recette rec ON rec.id = rr.id_recette "
                            + "JOIN recette_ingredient ri ON ri.id_recette = rec.id "
                            + "JOIN ingredient i ON i.id = ri.id_ingredient "
                            + "JOIN type_ingredient ty ON i.id_type_ingredient = ty.id "
                            + "WHERE r.id_utilisateur = ? "
                            + "AND r.date_repas BETWEEN ? AND ? "
                            + "AND ty.id = ? "
                            + "GROUP BY i.id, i.nom, ty.id "
                            + "ORDER BY i.nom"; 
            
            return executeQuery(requete, id_utilisateur, dateDebut, dateFin, id_type);
        }
        
        // Méthode d'affichage de tous les ingrédients d'une recette
        public ArrayList<ArrayList<Object>> listerIngredientRecette(int recetteId) {
            String requete = "SELECT i.nom, rc.quantite, c.nom " +
                            "FROM recette_ingredient AS rc " +
                            "INNER JOIN recette AS r ON rc.id_recette = r.id " +
                            "INNER JOIN ingredient AS i ON rc.id_ingredient = i.id " +
                            "INNER JOIN calorie AS c ON i.id_calorie = c.id " +
                            "WHERE rc.id_recette = ?";
            
            return executeQuery(requete, recetteId);
        }
        
        
        
        // Méthode d'affichages de toutes les ingrédients d'une recette 
        public ArrayList<ArrayList<Object>> listerToutIngredientRecette() {
            String requete = "SELECT r.id AS recette_id, r.nom AS nom_recette, GROUP_CONCAT(i.nom SEPARATOR ', ') AS ingredients " +
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

        
    //--------------------------------------------------------------------------------------------------------------


    // Requête Repas 
        
        
        //Méthode pour lister tous les repas
        public ArrayList<ArrayList<Object>> listerRepas(int id_utilisateur, String dateDebut, String datefin) {
            String requete = "SELECT r.id, r.date_repas, t.nom, r.personne, GROUP_CONCAT(rec.nom SEPARATOR ', ') " +
                            "FROM repas_recette AS r2 " +
                            "INNER JOIN repas AS r ON r2.id_repas = r.id " +
                            "INNER JOIN recette AS rec ON r2.id_recette = rec.id " +
                            "INNER JOIN type_repas AS t ON r.id_type = t.id " +
                            "WHERE r.id_utilisateur = ? AND r.date_repas BETWEEN ? AND ? " + 
                            "GROUP BY r.date_repas, t.nom, r.personne;";
                    
            
            return executeQuery(requete, id_utilisateur, dateDebut, datefin);
        }

        //Méthode d'affichage d'un repas spécifique 
        public ArrayList<ArrayList<Object>> listerUnRepas(int id_utilisateur, Date date_repas, int id_type) {
            String requete = "SELECT id FROM repas WHERE id_utilisateur = ? AND date_repas = ? AND id_type = ?";
            
            return executeQuery(requete, id_utilisateur, date_repas, id_type);
        }
       
        // Méthode d'affichage d'un date d'un repas
        public ArrayList<ArrayList<Object >> listerDateRepasUtilisateur(int id_utilisateur) {
            String requete = "SELECT date_repas FROM repas WHERE id_utilisateur = ?;";
            
            return executeQuery(requete, id_utilisateur);
        }
        
        // Méthode d'affichage d'un date d'un repas
        public ArrayList<ArrayList<Object >> listerDateRepasUnRepas(int id_repas) {
            String requete = "SELECT date_repas FROM repas WHERE id = ?;";
            
            return executeQuery(requete, id_repas);
        }
        
        
        // Méthode d'affichage d'un date d'un repas
        public ArrayList<ArrayList<Object >> listerPersonneUnRepas(int id_repas) {
            String requete = "SELECT personne FROM repas WHERE id = ?;";
            
            return executeQuery(requete, id_repas);
        }
        
        // Méthode d'affichage d'un date d'un repas
        public ArrayList<ArrayList<Object >> listerRecetteUnRepas(int id_repas) {
            String requete = "SELECT recette.id, recette.nom FROM repas_recette INNER JOIN recette ON repas_recette.id_recette = recette.id " +
                             "INNER JOIN repas ON repas_recette.id_repas = repas.id " +
                             "WHERE repas.id = ?;";
            return executeQuery(requete, id_repas);
        }
        
        
        // Méthode d'ajout de repas 
        public boolean ajouterRepas(Date date_repas, int personne, int id_utilisateur, int id_type) {
            String requete = "INSERT INTO repas (date_repas, personne, id_utilisateur, id_type) VALUES (?, ?, ?, ?)";
            
            return executeUpdate(requete, date_repas, personne, id_utilisateur, id_type);
        }
    
        // Méthode de supression de repas 
        public boolean supprimerRepas(int repas_id) {
            String requete = "DELETE FROM Repas WHERE repas.id = ?";
            
            return executeUpdate(requete, repas_id);
        }
        
        //Méthode de modification de repas 
        public boolean modifierRepas(Date date_repas, int personne, int id_utilisateur, int id_type, int repas_id) {
            String requete = "UPDATE repas SET date_repas = ?, personne = ?, id_type = ? WHERE id_utilisateur = ? AND repas.id = ?";
            
            return executeUpdate(requete, date_repas, personne, id_utilisateur, id_type, repas_id);
        }
        
        
    //--------------------------------------------------------------------------------------------------------------
        
        
    // Requête Repas_recettes
        
        // Méthode d'ajout d'un repas 
        public boolean associerRepas(int id_repas,int id_recette) {
            String requete = "INSERT INTO repas_recette(id_repas, id_recette) VALUES (?, ?);";
            
            return executeUpdate(requete, id_repas, id_recette );
        }
        
        // Méthode d'ajout d'un repas 
        public boolean modifierRepas(int id_repas,int id_recette) {
            String requete = "UPDATE repas_recette SET id_recette = ? WHERE id_repas = ?";
            
            return executeUpdate(requete, id_repas, id_recette );
        }
}


