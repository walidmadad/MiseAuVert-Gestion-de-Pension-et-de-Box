/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modele;

/**
 *
 * @author walid
 */
public class Modele_imprimante {  
    private String reference;
    private String modele;
    private String marque;
    private int id;

    public Modele_imprimante(){
        
    }
    public Modele_imprimante(String unReference, String unModele, String unMarque, int unId){
        this.reference = unReference;
        this.modele = unModele;
        this.marque = unMarque;
        this.id = unId;
    }
    public String getReference(){
        System.out.println(reference);
        return this.reference;
    }
    public String getModele(){
        return this.modele;
    }
    public String getMarque(){
        return this.marque;
    }
    public int getID(){
        return this.id;
    }
    public void setReference(String unReference){
        this.reference = unReference;
    }
    public void setModele(String unModele){
        this.modele = unModele;
    }
    public void setMarque(String unMarque){
        this.marque = unMarque;
    }
}
