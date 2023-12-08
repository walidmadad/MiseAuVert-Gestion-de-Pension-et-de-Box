/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modele;

/**
 *
 * @author walid
 */
public class Salle {
    private String designation;
    private String batiment;

    public Salle(String unDesignation, String unBatiment){
        this.designation = unDesignation;
        this.batiment = unBatiment;
    }
    public String getDesignation(){
        return this.designation;
    }
    public String getBatiment(){
        return this.batiment;
    }
}
