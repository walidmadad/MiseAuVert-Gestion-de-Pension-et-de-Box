/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;
import DAO.Singleton;
import Vue.EcranGeneral;
import java.sql.*;

/**
 *
 * @author walid
 */
public class Utilisateur {
    Singleton conn = new Singleton();
    Connection connection = conn.getConnexion();
    private String user;
    private String password;
    
    public Utilisateur(String user, String password){
        this.user = user;
        this.password = password;
        
    }
    public void connexionUtilisateur(){
        try{
            String mdp = null;
             String sql = "SELECT mot_de_passe FROM utilisateur WHERE utilisateur = ?";
             PreparedStatement ps = connection.prepareStatement(sql);
             ps.setString(1, user);
             ResultSet result = ps.executeQuery();
             if(result.next()){
                 mdp = result.getString("mot_de_passe");
                 if(mdp.equals(this.password)){
                     EcranGeneral frm2 = new EcranGeneral();
                     frm2.setVisible(true);
                 }else{
                     Vue.PageConnexion pg = new Vue.PageConnexion();
                     pg.erreur();
                 }
             }
             else{
                 Vue.PageConnexion pg = new Vue.PageConnexion();
                     pg.erreur();
             }
             
        }catch(SQLException e){
           e.printStackTrace();
        }
        
    }
}
