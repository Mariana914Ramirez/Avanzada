/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Categoria;
import entity.Usuarios;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author jonav
 */
public class CategoriaDAO {
    private EntityManagerFactory emf;
    
    public CategoriaDAO()
    {
        emf = Persistence.createEntityManagerFactory("proyectoAvanzadaPU");
    }
    

    public void insertarCategoria(String categoria)
    {
        EntityManager em = emf.createEntityManager();
        
        String sql = "INSERT INTO Categoria (categoria) VALUES (?);";
        
        Query query = em.createNativeQuery(sql);
        em.getTransaction().begin();
        query.setParameter(1, categoria);
        
        
        query.executeUpdate();
        
        em.getTransaction().commit();
        
    }
    
    
    
    
    
    public boolean validarCategoria(String categoria)
    {
        Categoria c;
        EntityManager em = emf.createEntityManager();
        
        String sql = "SELECT c FROM Categoria c WHERE c.categoria = :categoria";
        
        Query query = em.createQuery(sql);
        query.setParameter("categoria", categoria);
        
        try{
            c=(Categoria) query.getSingleResult();
        }
        catch(NoResultException e){
            c=null;
        }
        
        if(c == null)
        {
            insertarCategoria(categoria);
            return true;
        }
        return false;
    }
}
