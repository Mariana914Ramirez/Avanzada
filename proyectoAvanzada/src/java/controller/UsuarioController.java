/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.UsuarioDAO;
import entity.Usuarios;
import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author BLUE_LIGHT
 */
@ManagedBean(name = "Usuario")
@SessionScoped
public class UsuarioController  implements Serializable{
    private String correo;
    private String contrasena;
    private String nombre;
    
    public String validaLogin()
    {
        UsuarioDAO u = new UsuarioDAO();
        Usuarios us = u.validarUsuario(correo, contrasena);
        
        if(us != null)
        {
            System.out.println(us);
            int id_usuario = us.getIdUsuario();
            System.out.println(id_usuario);
            FacesContext.getCurrentInstance().getExternalContext().getApplicationMap().put("id_usuario", id_usuario);
            correo = us.getCorreo();
            nombre = us.getNombre();
            return "index";
        }
        else
        {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Aviso", "Valores incorrectos"));
        }
        return "login";
    }
    
    
    public String validaUsuario()
    {
        UsuarioDAO u = new UsuarioDAO();
        Usuarios us = u.agregarUsuario(correo, contrasena, nombre);
        
        if(us != null)
        {
            correo = us.getCorreo();
            return "login";
        }
        return "error";
    }
    
    
    public String agregaAdmin()
    {
        UsuarioDAO u = new UsuarioDAO();
        Usuarios us = u.agregarAdministrador(correo, contrasena, nombre);
        
        if(us != null)
        {
            correo = us.getCorreo();
            return "index";
        }
        return "error";
    }
    
    
    public int conseguirId()
    {
        int id = 0;
        try {
             id = (int) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("id_usuario");
             System.out.println(id);
             return id;
        } catch (Exception e) {
        }
     return id;
    }
    

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
