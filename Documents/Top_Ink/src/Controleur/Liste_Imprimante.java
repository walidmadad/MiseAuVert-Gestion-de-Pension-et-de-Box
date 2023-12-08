/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;
import java.sql.*;
import DAO.Singleton;
import javax.swing.DefaultListModel;
/**
 *
 * @author walid
 */
public class Liste_Imprimante {
    Singleton conn = new Singleton();
    Connection connection = conn.getConnexion();
    
    public DefaultListModel<String> AfficherImprimantes(){
        DefaultListModel<String> list = new DefaultListModel<String>();
        try{
            String sql = "SELECT reference FROM modele_imprimante";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
           
            while (resultSet.next()) {
                String nom = resultSet.getString("reference");
                list.addElement(nom);
            }

            resultSet.close();
            statement.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
