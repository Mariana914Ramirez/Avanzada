/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.CategoriaDAO;
import dao.UsuarioDAO;
import entity.Categoria;
import entity.Usuarios;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author jonav
 */
@ManagedBean(name = "Categoria")
public class CategoriaController implements Serializable{
    private String categoria;
    
    public String agregaCategoria()
    {
        CategoriaDAO c = new CategoriaDAO();
        boolean ca = c.validarCategoria(categoria);
        
        if(ca == true)
        {
            return "index";
        }
        return "error";
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
    
    
    
    

    
}

