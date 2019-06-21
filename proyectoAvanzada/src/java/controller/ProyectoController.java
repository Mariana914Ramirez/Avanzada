/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

/**
 *
 * @author jonav
 */
@ManagedBean (name="proyectoController")
@ApplicationScoped
public class ProyectoController implements Serializable{
    
    @ManagedProperty(value="#{usuarioController}")
    private UsuarioController usuarioController;
    
    private String correo;
    private String contrasena;
    private String nombre;
    private int id_usuario;
    
    private String tituloProyecto;

    public void ejecutar() {
      try {
            id_usuario = usuarioController.getId_usuario();
            System.out.println(id_usuario);
            nombre = usuarioController.getNombre();
            System.out.println(nombre);
            //FacesContext.getCurrentInstance().getExternalContext().redirect("formularioProyecto.xhtml");
        } catch (Exception e) {
          System.out.println("Estoy en el catch");
        }
    }



    
    
    public UsuarioController getUsuarioController() {
        return usuarioController;
    }

    public void setUsuarioController(UsuarioController usuarioController) {
        this.usuarioController = usuarioController;
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

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    
    
    
}
