/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Usuarios;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author BLUE_LIGHT
 */
public class UsuarioDAO {
    private EntityManagerFactory emf;
    
    public UsuarioDAO()
    {
        emf = Persistence.createEntityManagerFactory("proyectoAvanzadaPU");
    }
    
    
    public Usuarios validarUsuario(String correo, String contrasena)
    {
        Usuarios u;
        EntityManager em = emf.createEntityManager();
        
        String sql = "SELECT u FROM Usuarios u WHERE u.correo = :correo AND u.contrasena = :contrasena";
        
        Query query = em.createQuery(sql);
        query.setParameter("correo", correo);
        query.setParameter("contrasena", contrasena);
        
        try{
            u=(Usuarios) query.getSingleResult();
        }
        catch(NoResultException e){
            u=null;
        }
        return u;
    }
    
    
    
    
    public Usuarios agregarUsuario(String correo, String contrasena, String nombre)
    {
        Usuarios u;
        EntityManager em = emf.createEntityManager();
        
        String sql = "INSERT INTO Usuarios (correo, contrasena, nombre, tipo_usuario) VALUES (?, ?, ?, ?);";
        
        Query query = em.createNativeQuery(sql);
        em.getTransaction().begin();
        query.setParameter(1, correo);
        query.setParameter(2, contrasena);
        query.setParameter(3, nombre);
        query.setParameter(4, 2);
        
        
        query.executeUpdate();
        
        em.getTransaction().commit();
        
        u = validarUsuario(correo, contrasena); 
        return u;
    }
}
