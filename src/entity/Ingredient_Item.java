/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author amagl
 */
public class Ingredient_Item {
    public int id;
    public String ingredientnom;
    public String quantite;
    public boolean isSelected;
    
    
    
    //Constructeur
    public Ingredient_Item(int id, String ingredientnom, String quantite){
        this.id = id;
        this.ingredientnom = ingredientnom;
        this.quantite = quantite;
        this.isSelected = false;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getIngredientNom(){
        return ingredientnom;
    }
    
    public void setIngredientNom(String ingredientnom){
        this.ingredientnom = ingredientnom;
    }
    
    public String getQuantite() {
        return quantite;
    }

    public void setQuantite(String quantite) {
        this.quantite = quantite;
    }
    
    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean isSelected) {
        this.isSelected = isSelected;
    }
        
    
}
