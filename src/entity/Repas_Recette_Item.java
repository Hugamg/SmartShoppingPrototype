/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author amagl
 */
public class Repas_Recette_Item {
    public int id;
    public String recettenom;
    public String ingredient;
    public boolean isSelected;
    
    
    //Constructeur
    public Repas_Recette_Item(int id, String recettenom, String ingredient){
        this.id = id;
        this.recettenom = recettenom;
        this.ingredient = ingredient;
        this.isSelected = false;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getRecetteNom(){
        return recettenom;
    }
    
    public void setRecetteNom(String recettenom){
        this.recettenom = recettenom;
    }
    
    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }
    
    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean isSelected) {
        this.isSelected = isSelected;
    }
        
    
}
