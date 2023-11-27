package DAO;

import java.sql.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author walid
 */
public class Singleton {
    private static Connection conn;
    static{
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/top_ink?serverTimezone=UTC", "root", "");   
    }
    catch(Exception e){
            System.out.println(e);
        }
    }
    public Connection getConnection(){
        return conn;
    }
}
