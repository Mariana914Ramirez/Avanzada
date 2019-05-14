/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shat.vistas;

import Bd.Usuario;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;



/**
 *
 * @author BLUE_LIGHT
 */
public class Registro extends JFrame implements ActionListener{
    
    private JButton Cancelar;
    private JButton Ingresar;
    private JLabel titulo;
    private JTextField username;
    private JTextField password;
    private JTextField nombre;

    
    public Registro()
    {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Shat");
        this.getContentPane().setBackground(new Color(42,56,59));
        
        
        Ingresar=new JButton("Registrar");
        Ingresar.setBackground(new Color(86,244,66));
        Ingresar.setFont(new Font("Consolas", Font.BOLD, 20));
        Ingresar.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        Ingresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { 
                
                String nombreusuario = username.getText();
                String contrasena = password.getText();
                String nom = nombre.getText();
                int uno = 1;
                
                Usuario user = new Usuario();
                user.InsertarUsuario(nombreusuario, contrasena, nom, uno);
                
            }
        });
        
        titulo=new JLabel("Registro", JLabel.CENTER);
        titulo.setFont(new Font("Consolas", Font.BOLD, 20));
        titulo.setForeground(Color.white);
        
        username=new JTextField("Username");
        username.setFont(new Font("Consolas", Font.BOLD, 20));
        username.setSize(150, 100);
        username.setLocation(0, 150);
        this.setLayout(null);
        
        nombre=new JTextField("Nombre");
        nombre.setFont(new Font("Consolas", Font.BOLD, 20));
        nombre.setSize(150, 100);
        nombre.setLocation(0, 150);
        this.setLayout(null);
        
        password=new JTextField("Password");
        password.setFont(new Font("Consolas", Font.BOLD, 20));
        password.setSize(150, 100);
        password.setLocation(0, 150);
        this.setLayout(null);
        
        
        
        GroupLayout datos=new GroupLayout(this.getContentPane());
        
        datos.setHorizontalGroup(
                datos.createParallelGroup()
                    .addComponent(titulo, 80, 400, 1200)
                    .addComponent(username, 80, 80, 1200)
                    .addComponent(password, 80, 80, 1200)
                    .addComponent(nombre, 80, 80, 1200)
                    .addComponent(Ingresar, 80, 80, 1200)
                                                           
        );
        
        
        datos.setVerticalGroup(
                datos.createSequentialGroup()
                    .addComponent(titulo, 10, 40, 80)
                    .addComponent(username, 10, 40, 80)
                    .addComponent(password, 10, 40, 80)
                    .addComponent(nombre, 10, 40, 80)
                    .addComponent(Ingresar, 10, 40, 80)
                                                           
        );
        datos.setAutoCreateContainerGaps(true);
        datos.setAutoCreateGaps(true);
        setLayout(datos);
        pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
