/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author amagl
 */
public class Recette_Item {
    private String nom;
    private int id;

    
    public Recette_Item (String nom, int id){
        this.nom= nom;
        this.id= id;
        
    }
    
    // Getters
    public String getNom() {
        return nom;
    }

    public int getId() {
        return id;
    }

    // ToString (facultatif, pour un affichage plus lisible)
    @Override
    public String toString() {
        return nom; // Afficher uniquement le nom dans la liste
    }

}
