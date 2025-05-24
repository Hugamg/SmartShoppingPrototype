/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bdd.Requete_bdd;
import entity.Recette_Item;
import entity.Repas_Item;
import entity.Repas_Recette_Item;
import entity.Type_Repas_Item;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import main.MainFrame;

/**
 *
 * @author amagl
 */
public class Repas_Controller {
    private MainFrame mainJFrame;
    private Requete_bdd requete;
    private int id;
    private static int repasId;
    
    public Repas_Controller(Requete_bdd requete2){
        this.requete= requete2;
        this.repasId= 0;
    }
    
    public int getId_Repas(){
        return repasId;
    }
    
    public void setId_Repas(int id) {
    this.repasId = id;
}
    
    
    // Méthode pour lister les types de repas dans la JCombobox
    public DefaultComboBoxModel<Type_Repas_Item> ListerTypeRepas(){
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
    
    // Méthode pour lister les types de repas dans la JCombobox
    public DefaultComboBoxModel<Type_Repas_Item> ListerunTypeRepas(){
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
    
  
    public boolean ListerUnRepas(int id_utilisateur, java.sql.Date date_repas, int id_type){
       
        ArrayList<ArrayList<Object>> id = requete.lister_unRepas(id_utilisateur, date_repas, id_type);
        
        // Si aucun id n'est retourné,si il est vide, et inférieeur 
        if (id != null && !id.isEmpty() && id.get(0).size() > 0){
            
            this.id = (Integer) id.get(0).get(0); 
            System.out.println("Résultat de executeQuery : " + id);

            
            return true;
            
            
        }
        System.out.println("Résultat de executeQuery : " + id);

        return false;
        
    }
   
    // Méthode d'insertion d'un nouveau Repas
    public void insererNouveauRepas(java.sql.Date date, int personne, int id_utilisateur, int id_type) {
        boolean success = requete.ajouterRepas(date, personne, id_utilisateur, id_type);
        if (success) {
            System.out.println("Repas ajouté avec succès !");
        } else {
            System.out.println("Échec de l'ajout du repas.");
        }
    }
    
    // Méthode pour lister les types de repas dans la JCombobox
    public DefaultComboBoxModel ListerDateRepas(int id_utilisateur){
        DefaultComboBoxModel model = new DefaultComboBoxModel<>();
        // Récupération des résultats SQL
        ArrayList<ArrayList<Object>> listeDateRepas = requete.lister_Date_Repas_Utilisateur(id_utilisateur);

        for (ArrayList<Object> ligne : listeDateRepas) {
            String date = ligne.get(0).toString(); // Colonne nom

            model.addElement(date);
        }
        return model;
    }
    
    // Méthode pour lister les types de repas dans la JCombobox
    public String ListerDateUnRepas(int id_repas){
        JTextField model = new JTextField();
        // Récupération des résultats SQL 
        ArrayList<ArrayList<Object>> listeDateRepas = requete.lister_Date_Repas_unRepas(id_repas);
        
        if(!listeDateRepas.isEmpty()){
            Object date = listeDateRepas.get(0).get(0);
            // On vérifie que l'on reçois une date 
            if(date instanceof java.sql.Date || date instanceof java.util.Date){
                java.util.Date ma_date = (java.util.Date) date;
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                
                return sdf.format(ma_date);
            } else {
            // Si c'est déjà une chaîne de caractères
            return date.toString();
            }    
        }
        return "";
    }

}
