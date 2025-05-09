/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author amagl
 */
public class Repas_Item {
    public int id;
    public String date_repas;
    public int personne;
    public int id_utilisateur;
    public int id_type;
    
    
    //Constructeur
    public Repas_Item(int id, String date_repas, int personne, int id_utilisateur, int id_type){
        this.id = id;
        this.date_repas = date_repas;
        this.personne = personne;
        this.id_utilisateur = id_utilisateur;
        this.id_type = id_type;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getDateRepas(){
        return date_repas;
    }
    
    public void setDateRepas(String date_repas){
        this.date_repas = date_repas;
    }
    
    public int getPersonne() {
        return personne;
    }

    public void setPersonne(int personne) {
        this.personne = personne;
    }
    
    public int getId_Utilisateur() {
        return id_utilisateur;
    }

    public void setId_Utilisateur(int id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }
    
    public int getId_Type() {
        return id_type;
    }

    public void setId_Type(int id_type) {
        this.id_type = id_type;
    }
    
}
