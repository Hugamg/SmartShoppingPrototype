/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author amagl
 */
public class Connexion_Item {
    private int identifiant;
    private String mdp;
    
    
    
    public Connexion_Item (int identifiant, String motdepasse){
        this.identifiant= identifiant;
        this.mdp= motdepasse;
    }
    
     
    public int getIdentifiant(){
        return identifiant;
    }
    
    public void setIdentifiant(int identifiant){
        this.identifiant= identifiant;
    }
    
    public String getMdp(){
        return mdp;
    }
    
    public void setMdp(String mdp){
        this.mdp= mdp;
    }
    
}
