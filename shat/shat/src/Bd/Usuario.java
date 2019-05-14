/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author jonav
 */
public class Usuario {
    
     private Connection con;
    public Usuario() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
               con = DriverManager.getConnection("jdbc:mysql://localhost/elquesea","root","");
            } catch (SQLException ex) {
                System.out.println("Error en la conexion");
            }
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Error");
        }
    }
    public void InsertarUsuario(String nombreusuario, String contrasena, String nom, int uno)
    {
        try {
            PreparedStatement sql = con.prepareStatement("INSERT INTO usuario (username, password, nombre, estado) VALUES ( ?, ?, ?, ?)");
            sql.setString(1, nombreusuario);
            sql.setString(2, contrasena);
            sql.setString(3, nom);
            sql.setInt(4, uno);
            sql.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
