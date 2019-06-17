/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import dao.UsuarioDAO;
import entity.Usuarios;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author BLUE_LIGHT
 */
@ManagedBean(name = "Usuario")
@SessionScoped
public class UsuarioController {
    private String correo;
    private String contrasena;
    
    public String validaLogin()
    {
        UsuarioDAO u = new UsuarioDAO();
        Usuarios us = u.validarUsuario(correo, contrasena);
        
        if(us != null)
        {
            correo = us.getCorreo();
            return "principal";
        }
        return "index";
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
    
    
    
}
