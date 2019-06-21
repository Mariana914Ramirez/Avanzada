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
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;


/**
 *
 * @author BLUE_LIGHT
 */
@ManagedBean(name = "usuarioController")
@ApplicationScoped
public class UsuarioController  implements Serializable{
    private String correo;
    private String contrasena;
    private String nombre;
    private int id_usuario = 0;
    
    public String validaLogin()
    {
        UsuarioDAO u = new UsuarioDAO();
        Usuarios us = u.validarUsuario(correo, contrasena);
        
        if(us != null)
        {
            FacesContext.getCurrentInstance().getExternalContext().getApplicationMap().put("usuario", us);
            id_usuario = us.getIdUsuario();
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
    
    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
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
