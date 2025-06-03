/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bdd.Requete_bdd;
import entity.Type_Repas_Item;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author amagl
 */
public class Repas_Controller {
    private Requete_bdd requete;
    private int id;
    
    
    
    public Repas_Controller(Requete_bdd requete2){
        this.requete= requete2;
    }
    
    // Méthode pour obtenir les informations de toutes les repas d'un utilisateur
    
    public DefaultTableModel Lister_Repas_Utilisateur(int id_utilisateur, String date_debut, String date_fin ) {
        // Récupérer les ingrédients pour la recette avec l'ID fourni
        ArrayList<ArrayList<Object>> liste_repas = requete.listerRepas(id_utilisateur, date_debut, date_fin);
        // Noms des colonnes du tableau
        String[] model = {"ID", "Date", "Type", "Personnes", "Recettes"};
       
        Object[][] data = new Object[liste_repas.size()][5]; 

        // Remplissage du tableau avec les données
        for (int i = 0; i < liste_repas.size(); i++) {
            ArrayList<Object> repas = liste_repas.get(i);
            data[i][0] = repas.get(0);  // ID du repas 
            data[i][1] = repas.get(0);  // Date du repas 
            data[i][2] = repas.get(1);  // Type de repas
            data[i][3] = repas.get(2);  // Nombres de personnes
            data[i][4] = repas.get(3);  // Recettes du repas 
        }
        
        // Retourne le modèle de table avec les données et les noms de colonnes
        return new DefaultTableModel(data, model) {
        // Empêche l'édition directe des cellules
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        
        };
    }
    
    
    // Méthode pour lister tous les types de repas dans une JCombobox
    
    public DefaultComboBoxModel<Type_Repas_Item> Lister_Type_Repas(){
        DefaultComboBoxModel<Type_Repas_Item> model = new DefaultComboBoxModel<>();
        // Récupération des résultats SQL (la requête est déjà dans ton modèle)
        ArrayList<ArrayList<Object>> listeTypeRepas = requete.lister_Type_Repas();

        for (ArrayList<Object> ligne : listeTypeRepas) {
            id = Integer.parseInt(ligne.get(0).toString());// Colonne ID
            String nom = ligne.get(1).toString(); // Colonne nom

            Type_Repas_Item item = new Type_Repas_Item(id, nom);
            model.addElement(item);
        }
        return model;
    }
    
    
    
    // Méthode pour obtenir un type de repas pour un repas spécifique dans la JCombobox
    
    public Type_Repas_Item Lister_Un_Type_Repas(int id_repas){
        ArrayList<ArrayList<Object>> resultats = requete.lister_Type_unRepas(id_repas);
        if (!resultats.isEmpty()) {
            ArrayList<Object> ligne = resultats.get(0);
            int id = Integer.parseInt(ligne.get(0).toString());
            String nom = ligne.get(1).toString();
            return new Type_Repas_Item(id, nom);
        }
        return null;
    }

    
    // Méthode pour lister tous les types de repas dans une JCombobox en mettant en avant le type de repas d'un repas spécifique
    
    public void Initialiser_ComboBox_Avec_Selection(JComboBox<Type_Repas_Item> comboBox, int id_repas) {
    // Étape 1 : charger tous les types dans la combo
        DefaultComboBoxModel<Type_Repas_Item> modelTous = Lister_Type_Repas();
        comboBox.setModel(modelTous);

        // Étape 2 : récupérer l'élément à sélectionner
        Type_Repas_Item typeSelectionne = Lister_Un_Type_Repas(id_repas);

        for (int i = 0; i < modelTous.getSize(); i++) {
            Type_Repas_Item item = modelTous.getElementAt(i);
            if (item.getId() == typeSelectionne.getId()) { // comparaison sur l'ID
                comboBox.setSelectedIndex(i);
                break;
            }
        }
    }
    
  
   
    // Méthode d'insertion d'un nouveau Repas
    
    public void Inserer_Nouveau_Repas(java.sql.Date date, int personne, int id_utilisateur, int id_type) {
        boolean success = requete.ajouterRepas(date, personne, id_utilisateur, id_type);
        if (success) {
            System.out.println("Repas ajouté avec succès !");
        } else {
            System.out.println("Échec de l'ajout du repas.");
        }
    }
    
    // Méthode d'insertion d'un nouveau Repas
    
    public void Modifier_Un_Repas(java.sql.Date date, int personne, int id_utilisateur, int id_type, int id_repas) {
        boolean success = requete.modifierRepas(date, personne, id_utilisateur, id_type, id_repas);
        if (success) {
            System.out.println("Repas ajouté avec succès !");
        } else {
            System.out.println("Échec de l'ajout du repas.");
        }
    }
    
    // Méthode pour lister toutes les dates des repas d'un utilisateur dans une JCombobox
    
    public DefaultComboBoxModel Lister_Date_Repas(int id_utilisateur){
        DefaultComboBoxModel model = new DefaultComboBoxModel<>();
        // Récupération des résultats SQL
        ArrayList<ArrayList<Object>> listeDateRepas = requete.lister_Date_Repas_Utilisateur(id_utilisateur);

        for (ArrayList<Object> ligne : listeDateRepas) {
            String date = ligne.get(0).toString(); // Colonne nom

            model.addElement(date);
        }
        return model;
    }
    
    // Méthode pour lister la date d'un repas dans la JTextField
    
    public String Lister_Date_Un_Repas(int id_repas){
        JTextField model = new JTextField();
        // Récupération des résultats SQL 
        ArrayList<ArrayList<Object>> listeDateRepas = requete.lister_Date_Repas_unRepas(id_repas);
        
        if(!listeDateRepas.isEmpty()){
            Object date = listeDateRepas.get(0).get(0);
            // On vérifie que l'on reçois une date 
            if(date instanceof java.sql.Date || date instanceof java.util.Date){
                java.util.Date ma_date = (java.util.Date) date;
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                
                return sdf.format(ma_date);
            } else {
            // Si c'est déjà une chaîne de caractères
            return date.toString();
            }    
        }
        return "";
    }
    
    // Méthode pour lister les personnes d'un repas dans la JTextField
    
    public String Lister_Personne_Un_Repas(int id_repas){
        JTextField model = new JTextField();
        // Récupération des résultats SQL 
        ArrayList<ArrayList<Object>> listePersonneRepas = requete.lister_Personne_unRepas(id_repas);
        
        if(!listePersonneRepas.isEmpty()){
            Object personne = listePersonneRepas.get(0).get(0);
            // On vérifie que l'on reçois une date 
            if(personne != null ){
                String nb_personne = personne.toString();
                
                return nb_personne; 
            }
        }
        return "";
    }
    
}
